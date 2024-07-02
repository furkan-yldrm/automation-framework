package test.steps;

import framework.base.Base;
import framework.utilities.CucumberUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.pages.CartPage;
import test.pages.HomePage;
import test.pages.LoginPage;

import javax.xml.crypto.Data;

public class CreateOrderSteps extends Base {

    @Given("Siteye git")
    public void siteyeGit() throws Throwable{
        CurrentPage = GetInstance(HomePage.class);
    }

    @Then("Hesabina gir")
    public void hesabinaGir() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
        Thread.sleep(2000);
    }

    @When("Kullanici bilgilerini gir")
    public void kullaniciBilgileriniGir(DataTable table) throws Throwable{
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(LoginPage.class).Login(CucumberUtil.GetCellValue("Email")
                ,CucumberUtil.GetCellValue("Password"));
        Thread.sleep(2000);
    }

    @Then("Giris yap")
    public void girisYap() throws Throwable{
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Thread.sleep(2000);
    }

    @Then("Urunler sayfasina git")
    public void urunlerSayfasinaGit() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickUrunler();
        Thread.sleep(2000);
    }

    @Then("Sepete ekle")
    public void sepeteEkle() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).AddCart();
        Thread.sleep(2000);
    }

    @Then("Sepete git")
    public void sepeteGit() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).GoToCart();
        Thread.sleep(3000);
    }

    @Then("Miktari arttir")
    public void miktariArttir() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).Quantity();
        Thread.sleep(2000);
        CurrentPage = CurrentPage.As(HomePage.class).Quantity();
        Thread.sleep(2000);
        CurrentPage = CurrentPage.As(HomePage.class).Quantity();
        Thread.sleep(2000);
        CurrentPage = CurrentPage.As(HomePage.class).QuantityDec();
        Thread.sleep(2000);
    }

    @Then("Adresi gir")
    public void adresiGir(DataTable table) throws Throwable{
        CucumberUtil.ConvertDataTableToDict(table);
        CurrentPage.As(HomePage.class).CreateAddress(CucumberUtil.GetCellValue("Address"));
        Thread.sleep(2000);
    }

    @Then("Odeme yontemi sec")
    public void odemeYontemiSec() throws Throwable{
        CurrentPage = CurrentPage.As(HomePage.class).ClickPayment();
        Thread.sleep(2000);
        CurrentPage = CurrentPage.As(HomePage.class).ClickCreditCard();
        Thread.sleep(2000);
    }

    @Then("Sepeti Onayla")
    public void sepetiOnayla() throws Throwable {
        CurrentPage = CurrentPage.As(HomePage.class).ClicktoCartConfirm();
        Thread.sleep(2000);
    }

    @Then("Onayla")
    public void onayla() throws Throwable {
        CurrentPage = CurrentPage.As(HomePage.class).ClicktoOrderConfirm();
        Thread.sleep(2000);
    }



}
