package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends AbstractPage{
    private final By fileUploadButton = By.id("file-upload");
    private final By submit = By.id("file-submit");
    private final By successMessage=By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        super(driver);
    }

    public void sendFilePath(String path){
        driver.findElement(fileUploadButton).sendKeys(path);
    }
    public void uploadFile(){
        driver.findElement(submit).click();
    }
    public String getText(){
        return driver.findElement(successMessage).getText();
    }
}
