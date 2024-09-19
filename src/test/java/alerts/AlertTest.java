package alerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {
    @Test
    public void jsAlertTest(){
        try {
            var alertsPage=(JavaScriptAlertsPage)homePage.openPage("JavaScript Alerts");
            alertsPage.clickJsAlert();
            alertsPage.alert_acceptAlert();
            assertEquals(alertsPage.getResult(),"You successfully clicked an alert","Incorrect message");
        } catch (Exception e) {
            System.out.println("There is no page for this link text");
        }
    }
    @Test
    public void jsConfirmTest(){
        try {
            var alertsPage=(JavaScriptAlertsPage)homePage.openPage("JavaScript Alerts");
            alertsPage.clickJsConfirm();
            alertsPage.alert_cancelAlert();
            assertEquals(alertsPage.getResult(),"You clicked: Cancel","Incorrect message");
        } catch (Exception e) {
            System.out.println("There is no page for this link text");
        }
    }
    @Test
    public void jsPromptTest(){
        try {
            var alertsPage=(JavaScriptAlertsPage)homePage.openPage("JavaScript Alerts");
            alertsPage.clickJsPrompt();
            String text="mahmoud";
            alertsPage.alert_sendTextToAlert(text);
            alertsPage.alert_acceptAlert();
            assertEquals(alertsPage.getResult(),"You entered: "+text,"Incorrect message");
        } catch (Exception e) {
            System.out.println("There is no page for this link text");
        }
    }
}
