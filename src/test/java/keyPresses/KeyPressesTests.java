package keyPresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertTrue;

public class KeyPressesTests extends BaseTests {
    @Test
    public void testBackspace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPressesPage();
        keyPressesPage.fillInputField("A" + Keys.BACK_SPACE);
        assertTrue(keyPressesPage.getResultText().contains("BACK_SPACE"),"You clicked a different button");
    }
}
