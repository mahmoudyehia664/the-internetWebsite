package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LargeDeepDOMPage extends AbstractPage{
    private final By table = By.id("large-table");

    public LargeDeepDOMPage(WebDriver driver){
        super(driver);
    }

    public void scrollToTable(){
//        Actions actions=new Actions(driver);
//        actions.scrollToElement(driver.findElement(table)).perform();
        WebElement tab=driver.findElement(table);
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",tab);
    }
}
