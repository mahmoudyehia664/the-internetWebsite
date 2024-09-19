package pages;

import org.openqa.selenium.*;

public class KeyPressesPage extends AbstractPage{
    private final By inputKeyField =By.id("target");
    private final By result =By.id("result");



    public KeyPressesPage(WebDriver driver){
        super(driver);
    }

    public void sendKey(String key){
        driver.findElement(inputKeyField).sendKeys(key);
    }
    /*public void sendPI() throws AWTException {
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        new Actions(driver).keyDown(Keys.chord(Keys.NUMPAD2, Keys.NUMPAD2, Keys.NUMPAD7)).perform();
        robot.keyRelease(KeyEvent.VK_ALT);
    }*/
    public String getResult(){
        return driver.findElement(result).getText();
    }
}
