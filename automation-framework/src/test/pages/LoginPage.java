package test.pages;

import framework.base.BasePage;
import framework.controls.elements.Button;
import framework.controls.elements.ButtonBase;
import framework.controls.elements.TextBox;
import framework.controls.elements.TextBoxBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(how = How.NAME, using = "UserName")
    public TextBox txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public TextBox txtPassword;

    @FindBy(how = How.CSS, using = "[class*='btn-default']")
    public Button btnLogin;

    public void Login(String userName, String password) {
        txtUserName.EnterText(userName);
        txtPassword.EnterText(password);
    }

    public HomePage ClickLogin() {
        btnLogin.performSubmit();
        return GetInstance(HomePage.class);
    }

}
