package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdownMenu = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropdown(String option){
        Select select = new Select(driver.findElement(dropdownMenu));
        select.selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        Select select = new Select(driver.findElement(dropdownMenu));
        List<WebElement> selectedElements = select.getAllSelectedOptions();
        return  selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
}
