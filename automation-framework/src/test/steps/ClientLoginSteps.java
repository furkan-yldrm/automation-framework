package test.steps;

import framework.base.Base;
import framework.utilities.CucumberUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import test.pages.HomePage;
import test.pages.LoginPage;

import javax.xml.crypto.Data;

public class ClientLoginSteps extends Base {

    @And("Assert url opened")
    public void assertUrlOpened() throws Throwable {

        CurrentPage = GetInstance(HomePage.class);
       //Assert.assertTrue("Page is not loaded", CurrentPage.As(HomePage.class).IsLogin());
    }
    @Then("Click the login")
    public void clickTheLogin() throws Throwable {
        //Login page'e götürür
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(3000);
    }
    @When("Enter Client Email and Password")
    public void enterClientEmailAndPassword(DataTable table) throws Throwable{
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).Login(CucumberUtil.GetCellValue("Email")
                ,CucumberUtil.GetCellValue("Password"));
        Thread.sleep(3000);
    }

    @Then("Click the login button")
    public void clickTheLoginButton() throws Throwable {
        //Home page'e  götürür
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }


    @Then("See the username")
    public void seeTheUsername() throws Throwable{
        Assert.assertEquals(null, null,
                CurrentPage.As(HomePage.class).GetLoggedInUser());
    }
}



