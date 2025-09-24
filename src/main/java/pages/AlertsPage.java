package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultMessage = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
   //trriger alert methods
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void Alert_ClickToAccept(){
        driver.switchTo().alert().accept();
    }
    public String getResultText(){
        return driver.findElement(resultMessage).getText();
    }

    //trigger confirm methods
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void Alert_ClickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String Alert_GetConfirmText(){
        return driver.switchTo().alert().getText();
    }

    //Prompt methods
    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public void enterTextInPromptField(String text){
        driver.switchTo().alert().sendKeys(text);
    }








}
