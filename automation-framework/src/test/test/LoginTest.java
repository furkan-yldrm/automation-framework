package test.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
    private WebDriver _driver = null;
    @Before
    public void Initialize(){
        System.setProperty("webdriver.firefox.marionette","C:\\Users\\furka\\OneDrive\\drivers\\geckodriver.exe");
        _driver = new FirefoxDriver();
        _driver.navigate().to("https://testsitem.com.tr/");
    }
    @Test
    public void Login(){
      /*  _driver.findElement(By.name("UserName")).sendKeys("admin");
        _driver.findElement(By.name("Password")).sendKeys("password");
        _driver.findElement(By.name("Login")).submit();*/
        LoginPage page = new LoginPage(_driver);
        page.Login("admin","password");
    }
}
