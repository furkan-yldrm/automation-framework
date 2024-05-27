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

    /*@FindBy(how = How.NAME, using = "UserName")
    public TextBox txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public TextBox txtPassword;

    @FindBy(how = How.CSS, using = "[class*='btn-default']")
    public WebElement btnLogin;*/

    @FindBy(how = How.ID, using = "Email")
    public TextBox txtEmail;

    @FindBy(how = How.ID, using = "Password")
    public TextBox txtPassword;

    @FindBy(how = How.ID, using = "Login1")
    public Button btnLogin;

    public void Login(String email, String password) {
        txtEmail.EnterText(email);
        txtPassword.EnterText(password);
    }

    public HomePage ClickLogin() {
        btnLogin.performSubmit();
        return GetInstance(HomePage.class);
    }

}
