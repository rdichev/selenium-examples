import manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = DriverManager.createDriver();

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
