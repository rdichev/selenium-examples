package pages.subpages.forms;

import component.Checkbox;
import component.RadioButton;
import enumeration.GenderEnum;
import enumeration.HobbiesEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class PracticeFormPage extends BasePage {

    WebDriver driver;

    By firstNameInputField = By.id("firstName");
    By lastNameInputField = By.id("lastName");
    By userEmailInputField = By.id("userEmail");
    By genderWrapper = By.id("genterWrapper");
    By maleRadioButton = By.id("gender-radio-1");
    By femaleRadioButton = By.id("gender-radio-2");
    By otherRadioButton = By.id("gender-radio-3");
    By dateOfBirthInputField = By.id("dateOfBirthInput");
    By subjectsInputField = By.id("subjectsInput");
    By sportsCheckbox = By.id("hobbies-checkbox-1");
    By readingCheckbox = By.id("hobbies-checkbox-2");
    By musicCheckbox = By.id("hobbies-checkbox-3");
    By uploadPicture = By.id("uploadPicture");
    By currentAddressTextArea = By.id("currentAddress");
    By selectStateInputField = By.id("react-select-3-input");
    By selectCityInputField = By.id("react-select-4-input");

    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) {
        enterText(firstNameInputField, firstName, driver);
    }

    public void enterLastName(String lastName) {
        enterText(lastNameInputField, lastName, driver);
    }

    public void enterUserEmail(String userEmail) {
        enterText(userEmailInputField, userEmail, driver);
    }

    public void selectGender(GenderEnum gender) throws Exception {
        switch (gender) {
            case MALE:
                RadioButton.select(maleRadioButton, driver);
                break;
            case FEMALE:
                RadioButton.select(femaleRadioButton, driver);
                break;
            case OTHER:
                RadioButton.select(otherRadioButton, driver);
                break;
            default:
                throw new Exception("No such gender!");
        }
    }

    public void enterDateOfBirth(String dateOfBirth) {
        enterText(dateOfBirthInputField, dateOfBirth, driver);
    }

    public void enterSubject(String subject) {
        enterText(subjectsInputField, subject, driver);
    }

    public void selectHobby(HobbiesEnum hobby) throws Exception {
        switch (hobby) {
            case SPORTS:
                Checkbox.check(sportsCheckbox, driver);
                break;
            case READING:
                Checkbox.check(readingCheckbox, driver);
                break;
            case MUSIC:
                Checkbox.check(musicCheckbox, driver);
                break;
            default:
                throw new Exception("No such hobby");
        }
    }

    public void clickUploadImageButton() {
        click(uploadPicture, driver);
    }

    public void enterCurrentAddress(String currentAddress) {
        enterText(currentAddressTextArea, currentAddress, driver);
    }

    public void enterState(String state) {
        enterText(selectStateInputField, state, driver);
    }

    public void enterCity(String city) {
        enterText(selectCityInputField, city, driver);
    }
}
