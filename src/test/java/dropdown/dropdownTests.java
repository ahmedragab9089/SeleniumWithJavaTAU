package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.*;

public class dropdownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        DropdownPage dropdownPage = homePage.clickDropdownPage();
        dropdownPage.selectFromDropdown("Option 1");
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains("Option 1"), "Option is not selected");

    }
}
