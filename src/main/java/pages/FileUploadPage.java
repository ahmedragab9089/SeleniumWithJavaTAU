package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By submitButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickChooseFile(){
        driver.findElement(inputField);
    }
    public void uploadFile(String path){
        driver.findElement(inputField).sendKeys(path);
    }
    public void clickSubmit(){
        driver.findElement(submitButton).click();
    }
    public String readFileNameAfterUpload(){
        return driver.findElement(uploadedFiles).getText();
    }
}
