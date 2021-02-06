package pages.subpages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LeftPanelPage;

public class TextBoxPage extends BasePage {
    WebDriver driver;

    By nameField = By.id("userName");
    By userEmailField = By.id("userEmail");
    By currentAddressTextArea = By.id("currentAddress");
    By permanentAddressTextArea = By.id("permanentAddress");
    By submitButton = By.id("submit");
    By nameResultField = By.cssSelector("p#name");
    By emailResultField = By.cssSelector("p#email");
    By currentAddressResultField = By.cssSelector("p#currentAddress");
    By permanentAddressResultField = By.cssSelector("p#permanentAddress");

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {
        enterText(nameField, name, driver);
    }

    public void enterUserEmail(String userEmail) {
        enterText(userEmailField, userEmail, driver);
    }

    public void enterCurrentAddress(String currentAddress) {
        enterText(currentAddressTextArea, currentAddress, driver);
    }

    public void enterPermanentAddress(String permanentAddress) {
        enterText(permanentAddressTextArea, permanentAddress, driver);
    }

    public void submit() {
        click(submitButton, driver);
    }

    public String getNameResultFieldText() {
        return getText(nameResultField, driver);
    }

    public String getEmailResultFieldText() {
        return getText(emailResultField, driver);
    }

    public String getCurrentAddressResultFieldText() {
        return getText(currentAddressResultField, driver);
    }

    public String getPermanentAddressResultFieldText() {
        return getText(permanentAddressResultField, driver);
    }

}
