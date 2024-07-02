package test.pages;

import framework.base.BasePage;
import framework.controls.elements.Button;
import framework.controls.elements.HyperLink;
import framework.controls.elements.TextBox;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductsPage extends BasePage {
    @FindBy(how = How.ID, using = "StoreDetay")
    public Button btnStoreDetay;

    @FindBy(how = How.ID, using = "Brand")
    public Button Brand;

    @FindBy(how = How.XPATH, using = "//option[@value='Samsung']")
    public static Button Samsung;

    @FindBy(how = How.ID, using = "Category")
    public static Button Category;

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

    @FindBy(how = How.ID, using = "StoreAddCart2")
    public  Button AddToCart;

    @FindBy(how = How.ID, using = "CartSign")
    public HyperLink LnkCart;


    public ProductsPage ClickFilter(){
        Brand.performClick();
        return GetInstance(ProductsPage.class);
    }

    public ProductsPage ClickBrand(){
        Samsung.performClick();
        return GetInstance(ProductsPage.class);
    }


    public ProductsPage ClickCategory(){
        Category.performClick();
        return GetInstance(ProductsPage.class);
    }

    public ProductsPage ClickPC(){
        Bilgisayar.performClick();
        return GetInstance(ProductsPage.class);
    }

    public ProductsPage ClickNewest(){
        Sort.performClick();
        return GetInstance(ProductsPage.class);
    }

    public ProductsPage ClickAsc(){
        SortByAsc.performClick();
        return GetInstance(ProductsPage.class);
    }

    public ProductsPage ClickDesc(){
        SortByDesc.performClick();
        return GetInstance(ProductsPage.class);
    }

    public void Search(String searchValue) {
        txtSearch.EnterText(searchValue);
    }

    public ProductsPage SearchBy(){
        SearchButton.performClick();
        return GetInstance(ProductsPage.class);
    }

    public ProductsPage AddToCart(){
        AddToCart.performClick();
        return GetInstance(ProductsPage.class);
    }

    public ProductsPage GoToCart(){
        LnkCart.ClickLink();
        return GetInstance(ProductsPage.class);
    }
    /*
    public static BasePage adminViaDropDown(int index) {
        Select drop = new Select(Brand);
        drop.selectByIndex(index);
        return null;
    }*/

}
