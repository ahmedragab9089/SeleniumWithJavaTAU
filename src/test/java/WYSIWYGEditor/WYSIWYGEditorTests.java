package WYSIWYGEditor;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

import static org.testng.Assert.*;

public class WYSIWYGEditorTests extends BaseTests {
    @Test
    public void testWYSIWYGEditor() throws InterruptedException {
        String text = "Hello World";
        WYSIWYGEditorPage wysiwygEditorPage = homePage.clickWYSIWYGEditorPage();
        wysiwygEditorPage.clearTextArea();
        Thread.sleep(3000);
        wysiwygEditorPage.fillTextArea(text);
        Thread.sleep(3000);
        assertEquals(wysiwygEditorPage.getTextFromEditorArea(), text, "Incorrect text added");
    }
}
