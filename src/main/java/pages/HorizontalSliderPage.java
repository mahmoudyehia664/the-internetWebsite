package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage extends AbstractPage{
    private final By slider =By.cssSelector("[type=\"range\"]");

    private final By value=By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        super(driver);
    }

    public void moveSlider(int steps){
            WebElement slid=driver.findElement(slider);
            for(int i=0;i<steps;i++){
                slid.sendKeys(Keys.ARROW_RIGHT);
            }
    }
    /*public void moveSlider(int steps){
        driver.findElement(slider).click();
        Actions actions=new Actions(driver);
        steps=steps-5;
        if (steps>0){
            for(int i=0;i<steps;i++){
                actions.keyDown(Keys.ARROW_RIGHT).perform();
            }
        } else if (steps < 0) {
            for(int i=0;i>steps;i--){
                actions.keyDown(Keys.ARROW_LEFT).perform();
            }
        }
    }*/
    public String getSliderValue(){
        return driver.findElement(value).getText();
    }


}
