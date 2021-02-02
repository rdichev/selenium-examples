package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStoreApplicationPage {
    WebDriver driver;

    By header = By.xpath("//div[@class='main-header' and text()='Book Store']");

    BookStoreApplicationPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isBookStoreApplicationPageDisplayed() {
        return driver.findElement(header).isDisplayed();
    }

}
