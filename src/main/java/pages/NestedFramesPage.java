package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage extends AbstractPage{
    private final By frameTop=By.cssSelector("[name='frame-top']");
    private final By frameBottom=By.cssSelector("[name='frame-bottom']");
    private final By frameLeft=By.cssSelector("[name='frame-left']");
    private final By frameMiddle=By.cssSelector("[name='frame-middle']");
    private final By frameRight=By.cssSelector("[name='frame-right']");
    private final By text=By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        super(driver);
    }
    private void openFrame(By frame){
        driver.switchTo().frame(driver.findElement(frame));
    }
    private void returnToParentFrame(){
        driver.switchTo().parentFrame();
    }
    public String checkBottomFrameText(){
        openFrame(frameBottom);
        String string=driver.findElement(text).getText();
        returnToParentFrame();
        return string;
    }
    public String checkLeftFrameText(){
        openFrame(frameTop);
        openFrame(frameLeft);
        String string=driver.findElement(text).getText();
        returnToParentFrame();
        returnToParentFrame();
        return string;
    }

}
