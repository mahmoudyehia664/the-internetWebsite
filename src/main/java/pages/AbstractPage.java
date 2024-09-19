package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor js;

    public AbstractPage(WebDriver _driver){
        driver=_driver;
    }
    protected WebDriverWait getWait(){
        return new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    protected JavascriptExecutor getJs(){
        return (JavascriptExecutor)driver;
    }
}
