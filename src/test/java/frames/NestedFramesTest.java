package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FramesPage;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTest {
    @Test
    public void checkFramesText(){
        try {
            var framesPage=(FramesPage)homePage.openPage("Frames");
            var nestedFramesPage=framesPage.openNestedFramesPage();
            assertEquals(nestedFramesPage.checkLeftFrameText(),"LEFT","Left frame text incorrect");
            assertEquals(nestedFramesPage.checkBottomFrameText(),"BOTTOM","Bottom frame text incorrect");
        } catch (Exception e) {
            assertEquals(1,2);
            e.printStackTrace();
        }

    }
}
