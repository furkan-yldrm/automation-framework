package test.steps;

import framework.base.Base;
import framework.utilities.CucumberUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pages.HomePage;
import test.pages.LoginPage;

import javax.xml.crypto.Data;

public class ClientLoginFailedSteps extends Base {
    @Given("Go site")
    public void goSite() throws Throwable{
        CurrentPage = GetInstance(HomePage.class);
    }

    @Then("Click  Giris")
    public void clickGiris() throws Throwable{

        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @When("Enter wrong  Email or Password")
    public void enterWrongEmailOrPassword(DataTable table) throws Throwable{

        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).Login(CucumberUtil.GetCellValue("Email")
                ,CucumberUtil.GetCellValue("Password"));
        Thread.sleep(3000);
    }
    @Then("Try to Login")
    public void tryToLogin() throws Throwable{
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }
    @Then("See the error")
    public void seeTheError() throws Throwable{
    }

}
