package shiftingcontent;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ShiftingContentPage;

import static org.testng.Assert.assertEquals;

public class MenuElementTest extends BaseTest {
    @Test
    public void numberOfElements(){
        try {
            var shiftingContentPage=(ShiftingContentPage)homePage.openPage("Shifting Content");
            var menuElementPage=shiftingContentPage.openMenuElementPage();
            assertEquals(menuElementPage.menuElementsNumber(),5,"Incorrect elements number");
        } catch (Exception e) {
            System.out.println("There is no page for this link text");
        }
    }
}
