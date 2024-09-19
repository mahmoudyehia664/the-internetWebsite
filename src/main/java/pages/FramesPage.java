package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends AbstractPage{
    private final By nestedFramesLink = By.xpath("(//ul/li/a)[1]");

    public FramesPage(WebDriver driver){
        super(driver);
    }

    public NestedFramesPage openNestedFramesPage(){
        driver.findElement(nestedFramesLink).click();
        return new NestedFramesPage(driver);
    }
}
