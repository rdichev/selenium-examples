package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsFramesWindowsPage extends BasePage{
    WebDriver driver;

    By header = By.xpath("//div[@class='main-header' and text()='Alerts, Frame & Windows']");

    public AlertsFramesWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAlertsFramesWindowsPagePageDisplayed() {
        return driver.findElement(header).isDisplayed();
    }
}
