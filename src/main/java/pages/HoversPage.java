package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage extends AbstractPage{
    private final By figureBox =By.className("figure");
    private WebElement caption;

    public HoversPage(WebDriver driver){
        super(driver);
    }

    /**
     *
     * @param index starts from 1
     */
    public void hoverOnUser(int index){
        WebElement figure=driver.findElements(figureBox).get(index-1);
        Actions actions=new Actions(driver);
        actions.moveToElement(figure).perform();
        caption=figure.findElement(By.className("figcaption"));
    }
    public boolean captionIsDisplayed(){
        return caption.isDisplayed();
    }
    public String getTitle(){
        return caption.findElement(By.tagName("h5")).getText();
    }
    public String getLinkText(){
        return caption.findElement(By.tagName("a")).getText();
    }
    public String getLink(){
        return caption.findElement(By.tagName("a")).getAttribute("href");
    }

}
