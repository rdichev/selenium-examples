package pages;

import enumeration.LeftPanelItemsEnum;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.subpages.elements.CheckBoxPage;
import pages.subpages.elements.TextBoxPage;

public class LeftPanelPage extends BasePage {
    WebDriver driver;

    By leftPanel = By.cssSelector("div.left-pannel");

    public LeftPanelPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLeftPanelDisplayed() {
        return driver.findElement(leftPanel).isDisplayed();
    }

    public void selectItem(LeftPanelItemsEnum item) {
        driver.findElement(By.xpath("//span[text()='" + item.getItemName() + "']")).click();
    }

    public TextBoxPage goToTextBoxPage() {
        selectItem(LeftPanelItemsEnum.TEXT_BOX);
        return new TextBoxPage(driver);
    }

    public CheckBoxPage goToCheckBoxPage() {
        selectItem(LeftPanelItemsEnum.CHECK_BOX);
        return new CheckBoxPage(driver);
    }
}
