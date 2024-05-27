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
public class AdminLoginSteps extends Base {
    @And("Assert the url opened")
    public void assertTheUrlOpened() throws Throwable{
        CurrentPage = GetInstance(HomePage.class);
    }

    @Then("Click the Giris")
    public void clickTheGiris() throws Throwable{
        //Navigate to loginPage
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(3000);
    }

    @When("Enter Admin Email and Password")
    public void enterAdminEmailAndPassword(DataTable table) throws Throwable {
        /*  List<List<String>> table = data.asLists();
        CurrentPage.As(LoginPage.class).Login(table.get(1).get(0).toString(), table.get(1).get(1).toString());*/

        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).Login(CucumberUtil.GetCellValue("Email")
                ,CucumberUtil.GetCellValue("Password"));
        Thread.sleep(3000);
    }
    @Then("Click to the GirisYap")
    public void clickToTheGirisYap() throws Throwable{
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(3000);
    }
    @Then("See the userName")
    public void seeTheUserName() throws Throwable{
        Assert.assertEquals(null, null,
                CurrentPage.As(HomePage.class).GetLoggedInUser());
    }


}
