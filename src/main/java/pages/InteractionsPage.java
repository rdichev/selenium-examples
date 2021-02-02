package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InteractionsPage extends BasePage{
    WebDriver driver;

    By header = By.xpath("//div[@class='main-header' and text()='Interactions']");

    public InteractionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isInteractionsPageDisplayed() {
        return driver.findElement(header).isDisplayed();
    }
}
