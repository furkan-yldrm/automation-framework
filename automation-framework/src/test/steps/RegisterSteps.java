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
import test.pages.RegisterPage;

import javax.xml.crypto.Data;

public class RegisterSteps extends Base {
    @Given("Go to the url")
    public void goToTheUrl() throws Throwable{
        CurrentPage = GetInstance(HomePage.class);
    }

    @And("Click the Kayit")
    public void clickTheKayit() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickRegister();
        Thread.sleep(3000);
    }

    @When("Enter UserData")
    public void enterUserData(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(RegisterPage.class).Register(CucumberUtil.GetCellValue("KayitAd")
                ,CucumberUtil.GetCellValue("KayitSoyad"),CucumberUtil.GetCellValue("KayitEmail")
                ,CucumberUtil.GetCellValue("KayitTel"),CucumberUtil.GetCellValue("KayitAdres")
                ,CucumberUtil.GetCellValue("KayitPass"),CucumberUtil.GetCellValue("KayitOnayPass"));
        Thread.sleep(3000);
    }

    @Then("Click the KayitOl")
    public void clickTheKayitOl() throws Throwable{
        //Home page'e  götürür
        CurrentPage = CurrentPage.As(RegisterPage.class).ClickRegister();
        Thread.sleep(3000);
    }

    @Then("See its Successful")
    public void seeItsSuccessful() throws Throwable {
        Assert.assertEquals(null, null,
                CurrentPage.As(HomePage.class).GetLoggedInUser());
    }
}
