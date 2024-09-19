package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends AbstractPage{
    private final By exampleOne=By.xpath("(//div[@class='example']/a)[1]");

    public DynamicLoadingPage(WebDriver driver){
        super(driver);
    }

    public DynamicLoadingOnePage openExampleOnePage(){
        driver.findElement(exampleOne).click();
        return new DynamicLoadingOnePage(driver);
    }

}
