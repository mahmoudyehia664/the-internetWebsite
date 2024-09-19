package uploadfile;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertTrue;


public class UploadFileTest extends BaseTest {
    @Test
    public void uploadFile(){
        try {
            var fileUploadPage=(FileUploadPage)homePage.openPage("File Upload");
            String path="D:\\mahmoud\\iti_testing\\TrainingTestAutomation\\the-internetWebsite\\src\\main\\java\\pages\\SecureAreaPage.java";
            fileUploadPage.sendFilePath(path);
            fileUploadPage.uploadFile();
            assertTrue(path.endsWith(fileUploadPage.getText()),"Incorrect file upload");
        } catch (Exception e) {
            System.out.println("There is no page for this link text");
        }
    }
}
