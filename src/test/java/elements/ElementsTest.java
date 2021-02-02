package elements;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;

public class ElementsTest extends BaseTest {

    @Test
    public void shouldNavigateToElementsPage() {
        HomePage homePage = new HomePage(driver);

        ElementsPage elementsPage = homePage.goToElementsPage();
        assert elementsPage.isElementsPageDisplayed();
    }

}
