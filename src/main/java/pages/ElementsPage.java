package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePage{
    WebDriver driver;

    By header = By.xpath("//div[@class='main-header' and text()='Elements']");

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementsPageDisplayed() {
        return driver.findElement(header).isDisplayed();
    }
}
