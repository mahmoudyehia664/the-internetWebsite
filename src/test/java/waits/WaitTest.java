package waits;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.WYSIWYGEditorPage;

import static org.testng.Assert.assertEquals;

public class WaitTest extends BaseTest {
    @Test
    public void waitForTextVisibility(){
        try {
            var dynamicLoadingPage=(DynamicLoadingPage)homePage.openPage("Dynamic Loading");
            var dynamicLoadingOnePage=dynamicLoadingPage.openExampleOnePage();
            assertEquals(dynamicLoadingOnePage.getTextAfterWaiting(),"Hello World!","Incorrect text");


        } catch (Exception e) {
            assertEquals(1,2);
            e.printStackTrace();
            System.out.println("There is no page for this link text");
        }
    }
}
