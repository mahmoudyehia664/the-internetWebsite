package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage extends AbstractPage{
    private final By textArea =By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        super(driver);
    }

    public int getNumberOfTextArea(){
        return driver.findElements(textArea).size();
    }

    /**
     *Scrolls until specified number of paragraphs appear
     * @param index start-1
     */
    public void scrollToWantedTextArea(int index){
        js=(JavascriptExecutor) driver;
        while (getNumberOfTextArea()<index){
            js.executeScript("scrollTo(0,document.body.scrollHeight)");
        }
    }


}
