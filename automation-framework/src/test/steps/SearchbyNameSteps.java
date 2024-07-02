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

public class SearchbyNameSteps extends Base {

    @Given("URL Start")
    public void urlStart() throws Throwable {
        CurrentPage = GetInstance(HomePage.class);
    }

    @Then("Login to Account")
    public void loginToAccount() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @When("E-posta and Sifre")
    public void ePostaAndSifre(DataTable table) throws  Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).Login(CucumberUtil.GetCellValue("Email")
                ,CucumberUtil.GetCellValue("Password"));
        Thread.sleep(3000);
    }

    @Then("Login Successfully")
    public void loginSuccessfully() throws Throwable{
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @Then("Products Page")
    public void productsPage() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickUrunler();
        Thread.sleep(3000);
    }

    @When("Fill Value")
    public void fillValue(DataTable table) throws Throwable{
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(HomePage.class).Search(CucumberUtil.GetCellValue("Search"));
        Thread.sleep(3000);
    }

    @Then("Search")
    public void search() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).SearchBy();
        Thread.sleep(3000);
    }
}
