package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void triggerAlert(){
        AlertsPage alertsPage = homePage.clickAlertsPage();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResultText(),"You successfully clicked an alert");
    }
}
