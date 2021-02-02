package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    WebDriver driver;

    By elements = By.xpath("//h5[text()='Elements']");
    By forms = By.xpath("//h5[text()='Forms']");
    By widgets = By.xpath("//h5[text()='Widgets']");
    By alertsFramesWindows = By.xpath("//h5[text()='Alerts, Frame & Windows']");
    By interactions = By.xpath("//h5[text()='Interactions']");
    By bookStoreApplication = By.xpath("//h5[text()='Book Store Application']");


    HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ElementsPage goToElementsPage() {
        driver.findElement(elements).click();
        return new ElementsPage(driver);
    }

}
