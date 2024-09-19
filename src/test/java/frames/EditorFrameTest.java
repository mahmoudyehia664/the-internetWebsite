package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EditorFrameTest extends BaseTest {
    @Test
    public void testEditorFrame(){
        try {
            var editorPage=(WYSIWYGEditorPage)homePage.openPage("WYSIWYG Editor");
            editorPage.clearEditor();
            editorPage.sendTextToEditor("Hello");
            editorPage.increaseIndent();
            editorPage.sendTextToEditor(" world");
            assertEquals(editorPage.getEditorText(),"Hello world","Incorrect text in editor");
        } catch (Exception e) {
            assertTrue(false,"There is an exception happen\n"+ e);
            System.out.println("There is no page for this link text");
        }

    }
}
