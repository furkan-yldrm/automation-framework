package framework.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkInitialize extends Base{
    public void InitBrowser(BrowserType browserType){

        WebDriver driver = null;
        switch (browserType)
        {
            case Chrome:
            {
                driver = new ChromeDriver();
                DriverContext.setDriver(driver);
                break;
            }
            case Firefox:
            {
                System.setProperty("webdriver.firefox.marionette","C:\\Users\\furka\\OneDrive\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                DriverContext.setDriver(driver);
            }
        }
        DriverContext.setDriver(driver);
        DriverContext.Browser = new Browser(driver);

        JavascriptExecutor js = (JavascriptExecutor)driver;
    }
}
