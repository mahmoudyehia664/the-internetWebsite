package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ContextMenuPage extends AbstractPage{
    private final By box =By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        super(driver);
    }

    public void RightClickContextArea(){
        new Actions(driver).moveToElement(driver.findElement(box)).contextClick().perform();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_acceptAlert(){
        driver.switchTo().alert().accept();
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
