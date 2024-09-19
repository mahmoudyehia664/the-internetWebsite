package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage extends AbstractPage{
    private final By emailField =By.id("email");
    private final By submitButton=By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        super(driver);
    }

    public EmailSentPage retrievePassword(String email){
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(submitButton).click();
        return new EmailSentPage(driver);
    }


}
