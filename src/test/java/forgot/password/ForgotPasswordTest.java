package forgot.password;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTest {
    @Test
    public void forgotPasswordTest(){
            var forgotPasswordPage=(ForgotPasswordPage)homePage.openPage("Forgot Password");
            var emailSentPage=forgotPasswordPage.retrievePassword("mahTau@qaz.com");
            assertTrue(emailSentPage.checkMessageVisibility(),"There is a problem in retrieve email function");

    }
}
