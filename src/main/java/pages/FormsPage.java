package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsPage extends BasePage{
    WebDriver driver;

    By header = By.xpath("//div[@class='main-header' and text()='Forms']");

    FormsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isFormsPageDisplayed() {
        return driver.findElement(header).isDisplayed();
    }
}
