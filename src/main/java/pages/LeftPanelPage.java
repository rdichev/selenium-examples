package pages;

import org.jsoup.Connection.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftPanelPage extends BasePage{
    WebDriver driver;

    By leftPanel = By.cssSelector("div.left-pannel");

    public LeftPanelPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLeftPanelDisplayed() {
        return driver.findElement(leftPanel).isDisplayed();
    }
}
