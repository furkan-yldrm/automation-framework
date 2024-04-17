package test.steps;

import framework.base.Base;
import framework.utilities.CucumberUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.Current;
import org.junit.Assert;
import org.openqa.selenium.bidi.log.Log;
import test.pages.HomePage;
import test.pages.LoginPage;

import java.util.List;

public class LoginSteps extends Base {

    @And("Assert url opened")
    public void assertUrlOpened() throws Throwable {

        CurrentPage = GetInstance(HomePage.class);
       Assert.assertTrue("Page is not loaded", CurrentPage.As(HomePage.class).IsLogin());
    }
    @Then("Click the login")
    public void clickTheLogin() throws Throwable {
        //Login page'e götürür
        CurrentPage = CurrentPage.As(HomePage.class).clickLogin();
        Thread.sleep(3000);
    }
    @When("Enter UserName and Password")
    public void EnterUserNameAndPassword(DataTable table) throws Throwable {

        /*  List<List<String>> table = data.asLists();
        CurrentPage.As(LoginPage.class).Login(table.get(1).get(0).toString(), table.get(1).get(1).toString());*/

        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).LoginM(CucumberUtil.GetCellValue("UserName")
                ,CucumberUtil.GetCellValue("Password"));
        Thread.sleep(3000);
    }

    @Then("Click the login button")
    public void clickTheLoginButton() throws Throwable {
        //Home page'e  götürür
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @Then("See the username and hello")
    public void seeTheUsernameAndHello() throws Throwable{
        Assert.assertEquals("The user is not admin.", "Hello admin!",
                CurrentPage.As(HomePage.class).GetLoggedInUser());
    }
}
