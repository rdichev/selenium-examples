package elements;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.LeftPanelPage;
import pages.subpages.elements.CheckBoxPage;
import pages.subpages.elements.TextBoxPage;
import utils.FakerUtils;

public class ElementsTest extends BaseTest {

    @Test
    public void shouldNavigateToElementsPage() {
        HomePage homePage = new HomePage(startNewDriver());

        ElementsPage elementsPage = homePage.goToElementsPage();
        assert elementsPage.isElementsPageDisplayed();
    }

    @Test
    public void shouldNavigateToElementsPageAndSubmitTheForm() {
        HomePage homePage = new HomePage(startNewDriver());

        ElementsPage elementsPage = homePage.goToElementsPage();
        assert elementsPage.isElementsPageDisplayed();

        LeftPanelPage leftPanelPage = elementsPage.goToLeftPanelPage();
        TextBoxPage textBoxPage = leftPanelPage.goToTextBoxPage();

        FakerUtils fakerUtils = new FakerUtils();
        String userName = fakerUtils.getUserName();
        String userEmail = fakerUtils.getUserEmail();
        String currentAddress = fakerUtils.getCurrentAddress();
        String permanentAddress = fakerUtils.getPermanentAddress();

        textBoxPage.enterName(userName);
        textBoxPage.enterUserEmail(userEmail);
        textBoxPage.enterCurrentAddress(currentAddress);
        textBoxPage.enterPermanentAddress(permanentAddress);
        textBoxPage.submit();

        Assert.assertTrue(textBoxPage.getNameResultFieldText().contains(userName));
        Assert.assertTrue(textBoxPage.getEmailResultFieldText().contains(userEmail));
        Assert.assertTrue(textBoxPage.getCurrentAddressResultFieldText().contains(currentAddress));
        Assert.assertTrue(textBoxPage.getPermanentAddressResultFieldText().contains(permanentAddress));
    }

    @Test
    public void shouldCheckHomeCheckbox() {
        HomePage homePage = new HomePage(startNewDriver());

        ElementsPage elementsPage = homePage.goToElementsPage();
        assert elementsPage.isElementsPageDisplayed();

        LeftPanelPage leftPanelPage = elementsPage.goToLeftPanelPage();
        CheckBoxPage checkboxBoxPage = leftPanelPage.goToCheckBoxPage();

        checkboxBoxPage.checkHomeCheckBox();

        Assert.assertEquals(checkboxBoxPage.getResult(),
                " home desktop notes commands documents workspace react angular"
                        + " veu office public private classified general downloads wordFile excelFile");
    }

}
