package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //General method to click the links
    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    //Methods to click on the link
    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownPage() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoverPage clickHoversLink(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }
    public KeyPressesPage clickKeyPressesPage(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickAlertsPage(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public FileUploadPage clickFileUploadPage(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public WYSIWYGEditorPage clickWYSIWYGEditorPage(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }

}
