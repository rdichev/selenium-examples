package base;

import manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.ConfigFileReader;

public class BaseTest {
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = DriverManager.createDriver();
        ConfigFileReader configFileReader = new ConfigFileReader();
        driver.navigate().to(configFileReader.getApplicationUrl());
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
