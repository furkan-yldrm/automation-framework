package test.steps;

import framework.base.Base;
import framework.utilities.CucumberUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pages.HomePage;
import test.pages.LoginPage;

public class FilterByAscSteps extends Base {

    @Given("URL Started")
    public void urlStarted() {
        CurrentPage = GetInstance(HomePage.class);
    }

    @Then("Login to User Account")
    public void loginToUserAccount() throws Throwable {
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @When("Eposta ve Sifre")
        public void epostaVeSifre(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).Login(CucumberUtil.GetCellValue("Email")
                ,CucumberUtil.GetCellValue("Password"));
        Thread.sleep(3000);
    }

    @Then("Logged in")
    public void loggedIn() throws Throwable{
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @Then("Go to Products")
    public void goToProducts() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickUrunler();
        Thread.sleep(3000);
    }

    @Then("Filter by ASC")
    public void filterByASC() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickNewest();
        Thread.sleep(3000);
    }

    @Then("Choose ASC")
    public void chooseASC() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickAsc();
        Thread.sleep(3000);
    }
}
