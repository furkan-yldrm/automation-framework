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

    public LoginPage() {

    }
        @FindBy(how = How.NAME, using = "UserName")
        public WebElement txtUsername;

        @FindBy(how = How.NAME, using = "Password")
        public WebElement txtPassword;

        @FindBy(how = How.CSS, using = "[class*='btn-default']")
        public WebElement btnLogin;

        @FindBy(how = How.NAME, using = "UserName")
        public WebElement txtUsernameM;

        @FindBy(how = How.NAME, using = "Password")
        public WebElement txtPasswordM;

        @FindBy(how = How.CSS, using = "[class*='btn-default']")
        public WebElement btnLoginM;

    public void Login(String userName, String password){
            txtUsername.sendKeys(userName);
            txtPassword.sendKeys(password);
        }

        public void LoginM(String userName, String password){

        TextBox txtUser = new TextBoxBase(txtUsernameM);
        txtUser.EnterText(userName);

        TextBox txtPass = new TextBoxBase(txtPasswordM);
        txtPass.EnterText(password);

        }

    public HomePage ClickLogin(){

        Button btn = new ButtonBase(btnLoginM);
        btn.performSubmit();
       // btnLogin.submit();
        return GetInstance(HomePage.class);
        }

}
