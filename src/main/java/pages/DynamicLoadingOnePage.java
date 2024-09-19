package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingOnePage extends AbstractPage{
    private final By startButton=By.cssSelector("#start button");
    private final By textAfterWait=By.cssSelector("#finish h4");


    public DynamicLoadingOnePage(WebDriver driver){
        super(driver);
    }

    private void clickStart(){
        driver.findElement(startButton).click();
    }
    public String getTextAfterWaiting(){
        clickStart();
     wait = new WebDriverWait(driver, Duration.ofSeconds(5));
     return wait.until(ExpectedConditions.visibilityOfElementLocated(textAfterWait)).getText();
    }


}
