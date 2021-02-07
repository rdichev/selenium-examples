package pages.subpages.elements;

import component.Checkbox;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CheckBoxPage extends BasePage {
    WebDriver driver;

    By homeCheckbox = By.xpath("//*[@id='tree-node']/ol/li/span/label/span[1]"); //Change it
    By result = By.cssSelector("span.text-success");

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkHomeCheckBox() {
        Checkbox.check(homeCheckbox, driver);
    }

    public String getResult() {
        List<WebElement> results = driver.findElements(result);
        String resultText = "";

        for (WebElement res: results) {
            resultText = resultText + " " + res.getText();
        }
        return resultText;
    }
}
