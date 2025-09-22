package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //General method to click the links
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropdownPage(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }


}
