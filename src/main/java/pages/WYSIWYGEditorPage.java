package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WYSIWYGEditorPage extends AbstractPage{
    private final By frame =By.id("mce_0_ifr");
//    private final By editorText =By.xpath("(//body[@id='tinymce']/p)[1]");
    private final By editorText =By.xpath("/html/body/p");
    private final By increaseIndent =By.cssSelector("[title='Increase indent']");

    public WYSIWYGEditorPage(WebDriver driver){
        super(driver);
    }

    private void goToFrame(){
        driver.switchTo().frame(0);
    }

    private void returnToParent() {
        driver.switchTo().parentFrame();
    }

    public String getEditorText(){
        goToFrame();
        String text=driver.findElement(editorText).getText();
        returnToParent();
        return text;
    }

    public void clearEditor(){
        goToFrame();
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement editor = wait.until(ExpectedConditions.elementToBeClickable(editorText));
        editor.click();
        editor.sendKeys(Keys.CONTROL + "a");
        editor.sendKeys(Keys.DELETE);
        returnToParent();
    }
    public void sendTextToEditor(String text) {
        goToFrame();
        driver.findElement(editorText).sendKeys(text);
        returnToParent();
    }
    public void increaseIndent(){
        driver.findElement(increaseIndent).click();
    }

}
