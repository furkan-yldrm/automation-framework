package test.steps;

import framework.base.Base;
import framework.utilities.CucumberUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pages.HomePage;
import test.pages.LoginPage;

public class AdminLoginFailedSteps extends Base {
    @Given("Go url")
    public void goUrl() throws Throwable{
        CurrentPage = GetInstance(HomePage.class);
    }

    @Then("Click the GirisYap")
    public void clickTheGirisYap() throws Throwable {
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @When("Enter wrong Admin Email or Password")
    public void enterWrongAdminEmailOrPassword(DataTable table) throws Throwable {
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).Login(CucumberUtil.GetCellValue("Email")
                ,CucumberUtil.GetCellValue("Password"));
        Thread.sleep(3000);
    }
    @Then("Click giris")
    public void clickGiris() throws Throwable{
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }
    @Then("See the its not working")
    public void seeTheItsNotWorking() throws Throwable{
    }


}
