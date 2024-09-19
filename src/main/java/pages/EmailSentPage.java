package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage extends AbstractPage{
    private final By contentArea =By.xpath("//*[.='Your e-mail's been sent!']");

    public EmailSentPage(WebDriver driver){
        super(driver);
    }

    public boolean checkMessageVisibility(){
        try {
            driver.findElement(contentArea).isDisplayed();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
