package fileUpload;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertTrue;

public class FileUploadTests extends BaseTests {
    @Test
    public void testUploadFile() throws InterruptedException {
        FileUploadPage fileUploadPage = homePage.clickFileUploadPage();
        fileUploadPage.clickChooseFile();
        fileUploadPage.uploadFile("C:\\Users\\arabdelbaky\\OneDrive - Ejada Systems Company\\Desktop\\TauAutomation\\SeleniumWithJavaTAU\\resources\\Brainstorming - User Flow 5.jpg");
        fileUploadPage.clickSubmit();
        Thread.sleep(10000);
        assertTrue(fileUploadPage.readFileNameAfterUpload().contains("Brain"), "The file is not uploaded");
    }
}
