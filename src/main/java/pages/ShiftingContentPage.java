package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ShiftingContentPage extends AbstractPage{
    private final By menuElement =By.xpath("(//div[@class='example']/a)[1]");

    public ShiftingContentPage(WebDriver driver){
        super(driver);
    }

    public MenuElementPage openMenuElementPage(){
        driver.findElement(menuElement).click();
        return new MenuElementPage(driver);
    }


}
