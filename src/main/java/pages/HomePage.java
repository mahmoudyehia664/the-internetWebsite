package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver _driver,String homePageLink){
        super(_driver);
        driver.get(homePageLink);
    }
    public Object openPage(String linkText){
        driver.findElement(By.linkText(linkText)).click();
        linkText=linkText.replaceAll(" ","");
        try {
            return Class.forName("pages."+linkText+"Page").getDeclaredConstructor(WebDriver.class).newInstance(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public LargeDeepDOMPage openLargeDeepDOMPage(){
        driver.findElement(By.linkText("Large & Deep DOM")).click();
        return new LargeDeepDOMPage(driver);
    }

}
