package test.steps;

import framework.base.Base;
import framework.base.FrameworkInitialize;
import framework.utilities.CucumberUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import test.pages.HomePage;
import test.pages.LoginPage;
import test.pages.ProductsPage;

public class AddToCartSteps extends Base {

    @Given("Open site")
    public void openSite() throws Throwable{
        CurrentPage = GetInstance(HomePage.class);
    }

    @Then("Login account")
    public void loginAccount() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @When("User info")
    public void userInfo(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).Login(CucumberUtil.GetCellValue("Email")
                ,CucumberUtil.GetCellValue("Password"));
        Thread.sleep(3000);
    }

    @Then("Login Attempt")
    public void loginAttempt() throws Throwable{
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @Then("Urunler page")
    public void urunlerPage() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickUrunler();
        Thread.sleep(3000);
    }

    @Then("Add ToCart")
    public void addToCart() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).AddCart();
        Thread.sleep(3000);
    }

    @Then("Go to CartPage")
    public void goToCartPage() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).GoToCart();
        Thread.sleep(3000);
    }
}
