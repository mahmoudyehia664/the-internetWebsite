package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptScrollTest extends BaseTest {
    @Test
    public void scrollToTable(){
        var largeDeepDomPage=homePage.openLargeDeepDOMPage();
        largeDeepDomPage.scrollToTable();
    }
}
