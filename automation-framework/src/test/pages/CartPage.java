package test.pages;

import framework.base.BasePage;
import framework.controls.elements.Button;
import framework.controls.elements.HyperLink;
import framework.controls.elements.TextBox;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage {

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

    public CartPage Quantity(){
        btnQuantityInc.performClick();
        return GetInstance(CartPage.class);
    }

    public CartPage QuantityDec(){
        btnQuantityDec.performClick();
        return GetInstance(CartPage.class);
    }

    public void CreateAddress(String address){
        txtAdres.EnterText(address);
    }

    public CartPage ClickPayment(){
        btnPayment.performClick();
        return GetInstance(CartPage.class);
    }

    public CartPage ClickCreditCard(){
        btnCreditCard.performClick();
        return GetInstance(CartPage.class);
    }

    public CartPage ClicktoCartConfirm(){
        btnCartOnayla.performClick();
        return GetInstance(CartPage.class);
    }

    public CartPage ClicktoOrderConfirm(){
        btnCartOnay.performClick();
        return GetInstance(CartPage.class);
    }
}
