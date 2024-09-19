package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage extends AbstractPage{
    private final By jsAlertButton =By.xpath("(//button)[1]");
    private final By jsConfirmButton =By.xpath("(//button)[2]");
    private final By jsPromptButton =By.xpath("(//button)[3]");
    private final By result =By.id("result");

    public JavaScriptAlertsPage(WebDriver driver){
        super(driver);
    }

    public void clickJsAlert(){
        driver.findElement(jsAlertButton).click();
    }
    public void clickJsConfirm(){
        driver.findElement(jsConfirmButton).click();
    }
    public void clickJsPrompt(){
        driver.findElement(jsPromptButton).click();
    }
    public void alert_acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void alert_cancelAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_sendTextToAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }
}
