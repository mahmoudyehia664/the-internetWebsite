package hover;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTest {
    @Test
    public void testHoverPage(){
        try {
            var hoversPage=(HoversPage)homePage.openPage("Hovers");
            hoversPage.hoverOnUser(3);
            assertTrue(hoversPage.captionIsDisplayed(),"There is a problem in hover");
            assertEquals(hoversPage.getTitle(),"name: user3");
            assertTrue(hoversPage.getLink().endsWith("/users/3"));
        } catch (Exception e) {
            System.out.println("There is no page for this link text");
        }

    }
}
