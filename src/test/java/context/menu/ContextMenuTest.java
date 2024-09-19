package context.menu;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {
    @Test
    public void contextMenuTest(){
        try {
            var contextMenuPage=(ContextMenuPage)homePage.openPage("Context Menu");
            contextMenuPage.RightClickContextArea();
            assertEquals(contextMenuPage.alert_getText(),"You selected a context menu","Incorrect context menu select");
            contextMenuPage.alert_acceptAlert();
        } catch (Exception e) {
            System.out.println("There is no page for this link text");
        }
    }
}
