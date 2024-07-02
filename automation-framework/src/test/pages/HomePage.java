package test.pages;

import framework.base.BasePage;
import framework.controls.elements.Button;
import framework.controls.elements.HyperLink;
import framework.controls.elements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
public class HomePage extends BasePage   {

    @FindBy(how = How.LINK_TEXT, using = "Home")
    public HyperLink lnkHome;

    @FindBy(how = How.LINK_TEXT, using = "Ürünler")
    public HyperLink lnkUrunler;

    @FindBy(how = How.ID, using = "CartSign")
    public HyperLink LnkCart;
    @FindBy(how = How.ID, using = "SharedRegister")
    public Button btnRegister;
    @FindBy(how = How.ID, using = "SharedLogin")
    public Button btnLogin;

    @FindBy(how = How.ID, using = "HomeDetay")
    public Button HomeDetay;

    @FindBy(how = How.XPATH, using = "//a[@class='nav-link dropdown-toggle text-dark']")
    public WebElement lnkUserName;


    @FindBy(how = How.ID, using = "HomeAddCart")
    public WebElement btnHomeAddCart;

    @FindBy(how = How.ID, using = "Brand")
    public static Button Brand;

    @FindBy(how = How.XPATH, using = "//option[@value='Samsung']")
    public static Button Samsung;

    @FindBy(how = How.ID, using = "StoreAddCart2")
    public  Button AddCart;

    @FindBy(how = How.ID, using = "Category")
    public  Button Category;

    @FindBy(how = How.XPATH, using = "//option[@value='Computers']")
    public  Button Bilgisayar;

    @FindBy(how = How.ID, using = "Sort")
    public  Button Sort;

    @FindBy(how = How.XPATH, using = "//option[@value='price_asc']")
    public  Button SortByAsc;

    @FindBy(how = How.XPATH, using = "//option[@value='price_desc']")
    public  Button SortByDesc;

    @FindBy(how = How.NAME, using = "search")
    public TextBox txtSearch;

    @FindBy(how = How.ID, using = "StoreSearch")
    public  Button SearchButton;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-outline-secondary btn-sm']")
    public Button btnQuantityDec;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-outline-secondary btn-sm'][2]")
    public Button btnQuantityInc;

    @FindBy(how = How.ID, using = "CartAdres")
    public TextBox txtAdres;

    @FindBy(how = How.ID, using = "PaymentMethod")
    public static Button btnPayment;

    @FindBy(how = How.XPATH, using = "//option[@value='credit_card']")
    public static Button btnCreditCard;

    @FindBy(how = How.XPATH, using = "//option[@value='cash']")
    public static Button btnCash;

    @FindBy(how = How.ID, using = "CartOnayla")
    public  Button btnCartOnayla;

    @FindBy(how = How.ID, using = "CartOnay")
    public  Button btnCartOnay;


    public LoginPage ClickLogin() {
        //lnkLogin.ClickLink();
        btnLogin.performClick();
        return GetInstance(LoginPage.class);
    }
  /*  public RegisterPage ClickRegister() {
        //lnkLogin.ClickLink();
        btnRegister.performClick();
        return GetInstance(RegisterPage.class);
    }*/

    public HomePage ClickUrunler() {
        //lnkLogin.ClickLink();
        lnkUrunler.ClickLink();
        return GetInstance(HomePage.class);
    }
    public HomePage ClickDetay() {
        //lnkLogin.ClickLink();
        HomeDetay.performClick();
        return GetInstance(HomePage.class);
    }


    public boolean IsLogin() {
        //return lnkLogin.isDisplayed();
        return btnLogin.isDisplayed();
    }

    //Filtre işlemleri
    public HomePage ClickFilter(){
        Brand.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage ClickBrand(){
        Samsung.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage ClickCategory(){
        Category.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage ClickPC(){
        Bilgisayar.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage ClickNewest(){
        Sort.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage ClickAsc(){
        SortByAsc.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage ClickDesc(){
        SortByDesc.performClick();
        return GetInstance(HomePage.class);
    }

    public void Search(String searchValue) {
        txtSearch.EnterText(searchValue);
    }

    public HomePage SearchBy(){
        SearchButton.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage AddCart(){
        AddCart.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage GoToCart(){
        LnkCart.ClickLink();
        return GetInstance(HomePage.class);
    }

    public HomePage Quantity(){
        btnQuantityInc.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage QuantityDec(){
        btnQuantityDec.performClick();
        return GetInstance(HomePage.class);
    }

    public void CreateAddress(String address){
        txtAdres.EnterText(address);
    }

    public HomePage ClickPayment(){
        btnPayment.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage ClickCreditCard(){
        btnCreditCard.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage ClicktoCartConfirm(){
        btnCartOnayla.performClick();
        return GetInstance(HomePage.class);
    }

    public HomePage ClicktoOrderConfirm(){
        btnCartOnay.performClick();
        return GetInstance(HomePage.class);
    }

    public String GetLoggedInUser() {
        return lnkUserName.getText();
    }

}
