package test.steps;

import framework.base.Base;
import framework.utilities.CucumberUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import test.pages.HomePage;
import test.pages.LoginPage;
import test.pages.ProductsPage;

public class FilterByBrandSteps extends Base {

    @Given("opened")
    public void opened() throws Throwable{
        CurrentPage = GetInstance(HomePage.class);
    }

    @Then("loginn")
    public void loginn() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @When("Email and Password")
    public void emailAndPassword(DataTable table) throws Throwable{
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).Login(CucumberUtil.GetCellValue("Email")
                ,CucumberUtil.GetCellValue("Password"));
        Thread.sleep(3000);
    }

    @Then("Click the login buton")
    public void clickTheLoginButon() throws Throwable {
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @Then("Go to Urunler")
    public void goToUrunler() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickUrunler();
        Thread.sleep(3000);
    }

    @Then("Filter")
    public void filter() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickFilter();
        Thread.sleep(3000);
    }

    @Then("Choose Samsung")
    public void chooseSamsung() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickBrand();
        Thread.sleep(3000);
    }

}
