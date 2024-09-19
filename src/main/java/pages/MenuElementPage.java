package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuElementPage extends AbstractPage{
    private final By menuElements =By.cssSelector("ul li");

    public MenuElementPage(WebDriver driver){
        super(driver);
    }

    public int menuElementsNumber(){
        return driver.findElements(menuElements).size();
    }


}
