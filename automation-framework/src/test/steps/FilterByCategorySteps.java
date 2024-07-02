package test.steps;

import framework.base.Base;
import framework.utilities.CucumberUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pages.HomePage;
import test.pages.LoginPage;

public class FilterByCategorySteps extends Base {


    @Given("Open")
    public void open() throws Throwable{
        CurrentPage = GetInstance(HomePage.class);
    }
    @Then("Loginnn")
    public void loginnn() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(3000);
    }


    @When("Email and Passwordd")
    public void emailAndPasswordd(DataTable table) throws Throwable{
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).Login(CucumberUtil.GetCellValue("Email")
                ,CucumberUtil.GetCellValue("Password"));
        Thread.sleep(3000);
    }

    @Then("Go Login")
    public void goLogin() throws Throwable{
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @Then("Urunler")
    public void urunler() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickUrunler();
        Thread.sleep(3000);
    }

    @Then("Filter by Category")
    public void filterByCategory() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickCategory();
        Thread.sleep(3000);
    }

    @Then("Choose Bilgisayar")
    public void chooseBilgisayar() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickPC();
        Thread.sleep(3000);
    }

}
