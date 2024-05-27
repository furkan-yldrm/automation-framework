package test.pages;

import framework.base.BasePage;
import framework.controls.elements.Button;
import framework.controls.elements.HyperLink;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage   {

    @FindBy(how = How.LINK_TEXT, using = "Home")
    public HyperLink lnkHome;

    @FindBy(how = How.LINK_TEXT, using = "Ürünler")
    public HyperLink lnkUrunler;

    @FindBy(how = How.ID, using = "CartSign")
    public HyperLink LnkCart;
    @FindBy(how = How.ID, using = "SharedRegister")
    public HyperLink btnRegister;
    @FindBy(how = How.ID, using = "SharedLogin")
    public HyperLink btnLogin;

    @FindBy(how = How.XPATH, using = "//a[@class='nav-link dropdown-toggle text-dark']")
    public WebElement lnkUserName;


    public LoginPage ClickLogin() {
        //lnkLogin.ClickLink();
        btnLogin.ClickLink();
        return GetInstance(LoginPage.class);
    }
    public RegisterPage ClickRegister() {
        //lnkLogin.ClickLink();
        btnRegister.ClickLink();
        return GetInstance(RegisterPage.class);
    }

    public boolean IsLogin() {
        //return lnkLogin.isDisplayed();
        return btnLogin.isDisplayed();
    }

    public String GetLoggedInUser() {
        return lnkUserName.getText();
    }
}
