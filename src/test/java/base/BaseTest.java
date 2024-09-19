package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;

import java.io.File;

import com.google.common.io.Files;


public class BaseTest {
    protected static HomePage homePage;
    protected static WebDriver driver;
    @BeforeSuite
    @Parameters({"browser"})
    public static void test(String browser, ITestContext context){
        context.setAttribute("browser", browser);
        switch (browser){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();
                break;
            case "Firefox":
                driver=new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        homePage=new HomePage(driver,"https://the-internet.herokuapp.com/");
    }
    @BeforeMethod
    public void getPage(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
        var camera=(TakesScreenshot)driver;
        File screenShot=camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenShot,new File("src/main/resources/screenshots/"+result.getName()+" in "+ result.getTestContext().getAttribute("browser")+" browser" +".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
