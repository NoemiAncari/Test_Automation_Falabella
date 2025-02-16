package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver webDriver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");
    }

    /*@AfterMethod
    public void tearDown(){
        if(webDriver != null)
            webDriver.quit();
    }*/
}
