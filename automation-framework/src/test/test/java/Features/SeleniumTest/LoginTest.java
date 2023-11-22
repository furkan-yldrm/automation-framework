package test.java.Features.SeleniumTest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver _driver = null;
    @Before
    public void Initialize(){
        System.setProperty("webdriver.firefox.marionette","C:\\Users\\furka\\OneDrive\\drivers\\geckodriver.exe");
        _driver = new FirefoxDriver();
        _driver.navigate().to("https://www.saucedemo.com/");

    }
    @Test
    public void LoginTest(){
        _driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);
        _driver.findElement(By.name("user-name")).sendKeys("standard_user");
        _driver.findElement(By.name("password")).sendKeys("secret_sauce");
        _driver.findElement(By.name("login-button")).submit();

    }
}
