package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.*;

public class AlertsTests extends BaseTests {
    @Test
    public void triggerAlert(){
        AlertsPage alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.Alert_ClickToAccept();
        assertEquals(alertsPage.getResultText(),"You successfully clicked an alert");
    }
    @Test
    public void testGetTextFromAlertAndDismiss(){
        AlertsPage alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerConfirm();
        assertEquals(alertsPage.Alert_GetConfirmText(), "I am a JS Confirm", "Incorrect comfirm message");
        alertsPage.Alert_ClickToDismiss();
    }

    @Test
    public void testPromptAlert(){
        String text = "Test prompt";
        AlertsPage alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerPrompt();
        alertsPage.enterTextInPromptField(text);
        alertsPage.Alert_ClickToAccept();
        assertTrue(alertsPage.getResultText().contains(text), "Incorrect text added");
        System.out.println(alertsPage.getResultText());

    }




}
