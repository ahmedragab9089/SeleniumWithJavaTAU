package hovers;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoverPage;

import static org.testng.Assert.*;

public class HoversTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        HoverPage hoversPage = homePage.clickHoversLink();
        var caption = hoversPage.hoverOverFigure(0);
        assertTrue(caption.isCaptionDisplayed(), "The caption is not displayes");
        assertEquals(caption.getTitle(),"name: user1", "The title is not correct");
        assertTrue(caption.getLink().contains("/users/1"), "The link is not correct");
        assertEquals(caption.getLinkText(), "View profile", "The link text is not correct");

    }
}
