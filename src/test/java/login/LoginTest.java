package login;

import annotation.DataProviderIndex;
import base.BaseTest;
import data.Data;
import org.testng.annotations.Test;
import pages.FormAuthenticationPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test(dataProvider = "getData" ,dataProviderClass = Data.class)
    @DataProviderIndex(0)
    public void testSuccessfulLogin(String username,String password){
        try {
            var loginPage=(FormAuthenticationPage)homePage.openPage("Form Authentication");
            loginPage.fillDate(username,password);
            SecureAreaPage secure=loginPage.login();
            assertTrue(secure.getAlertText().contains("You logged into a secure area!"));
        } catch (Exception e) {
            System.out.println("There is no page for this link text");
        }

    }
}
