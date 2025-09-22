package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownPage {
    private WebDriver driver;
    private By dropdownMenu = By.id("dropdown");


    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
}
