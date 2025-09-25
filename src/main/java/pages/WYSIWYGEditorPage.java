package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorIFrameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.xpath("//button[@aria-label=\"Increase indent\"]");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    //switch to iframe
    private void switchToIFrame() {
        driver.switchTo().frame(editorIFrameId);
    }

    //exit iframe
    private void exitIFrame() {
        driver.switchTo().parentFrame();
    }


    //Interctions methods
    public void clearTextArea() {
        switchToIFrame();
        driver.findElement(textArea).clear();
        exitIFrame();
    }

    public void fillTextArea(String text) {
        switchToIFrame();
        driver.findElement(textArea).sendKeys(text);
        exitIFrame();
    }

    public void increaseIndent() {
        driver.findElement(increaseIndentButton).click();
    }
    public String getTextFromEditorArea(){
        switchToIFrame();
        String text = driver.findElement(textArea).getText();
        exitIFrame();
        return text;
    }
}
