package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAuthenticationPage extends AbstractPage{
    private final By usernameField=By.id("username");
    private final By passwordField=By.id("password");
    private final By submitButton=By.cssSelector("[type=\"submit\"]");

    public FormAuthenticationPage(WebDriver driver){
        super(driver);
    }
    public void fillDate(String username,String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage login(){
        driver.findElement(submitButton).click();
        return new SecureAreaPage(driver);
    }


}
