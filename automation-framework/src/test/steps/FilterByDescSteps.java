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

public class FilterByDescSteps extends Base {

    @Given("URL Starts")
    public void urlStarts() {
        CurrentPage = GetInstance(HomePage.class);
    }

    @Then("Login to User")
    public void loginToUser() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @When("Eposta Sifre")
    public void epostaSifre(DataTable table) throws Throwable{
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).Login(CucumberUtil.GetCellValue("Email")
                ,CucumberUtil.GetCellValue("Password"));
                Thread.sleep(3000);
    }

    @Then("Logged into")
    public void loggedInto() throws Throwable{
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @Then("Go to the Products")
    public void goToTheProducts() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickUrunler();
        Thread.sleep(3000);
    }

    @Then("Filter by DESC")
    public void filterByDESC() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickNewest();
        Thread.sleep(3000);
    }

    @Then("Choose DESC")
    public void chooseDESC() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickDesc();
        Thread.sleep(3000);
    }
}
