package javascript;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;

import static org.testng.Assert.assertEquals;

public class InfiniteJavaScriptScrollTest extends BaseTest {
    @Test
    public void scrollToTable(){
        try {
            var infiniteScrollPage=(InfiniteScrollPage)homePage.openPage("Infinite Scroll");
            infiniteScrollPage.scrollToWantedTextArea(5);
            assertEquals(infiniteScrollPage.getNumberOfTextArea(),5,"Incorrect scrolling");

        } catch (Exception e) {
            assertEquals(1,2);
            e.printStackTrace();
            System.out.println("There is no page for this link text");
        }
    }
}
