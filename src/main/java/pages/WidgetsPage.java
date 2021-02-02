package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WidgetsPage extends BasePage{
    WebDriver driver;

    By header = By.xpath("//div[@class='main-header' and text()='Widgets']");

    public WidgetsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isWidgetsPageDisplayed() {
        return driver.findElement(header).isDisplayed();
    }

}
