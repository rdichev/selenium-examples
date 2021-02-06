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

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ElementsPage goToElementsPage() {
        click(elements, driver);
        return new ElementsPage(driver);
    }

    public FormsPage goToFormsPage() {
        click(forms, driver);
        return new FormsPage(driver);
    }

    public WidgetsPage goToWidgetPage() {
        click(widgets, driver);
        return new WidgetsPage(driver);
    }

    public AlertsFramesWindowsPage goToAlertsFramesWindowsPage() {
        click(alertsFramesWindows, driver);
        return new AlertsFramesWindowsPage(driver);
    }

    public InteractionsPage goToInteractionsPage() {
        click(interactions, driver);
        return new InteractionsPage(driver);
    }

    public BookStoreApplicationPage goToBookStoreApplicationPage() {
        click(bookStoreApplication, driver);
        return new BookStoreApplicationPage(driver);
    }
}
