package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

    public void check(By by, WebDriver driver) {
        WebElement option = driver.findElement(by);
        if (option.isSelected()) {
            option.click();
        }
    }

}
