package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeyPressTest extends BaseTest {
    @Test
    public void testHoverPage(){
        try {
            var keyPressesPage=(KeyPressesPage)homePage.openPage("Key Presses");
            keyPressesPage.sendKey("R"+ Keys.BACK_SPACE);
            assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("There is no page for this link text");
        }
    }
}
