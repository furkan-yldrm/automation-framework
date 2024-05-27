package test.pages;

import framework.base.BasePage;
import framework.controls.elements.Button;
import framework.controls.elements.TextBox;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage extends BasePage {

    @FindBy(how = How.ID, using = "KayitAd")
    public TextBox txtKayitAd;

    @FindBy(how = How.ID, using = "KayitSoyad")
    public TextBox txtKayitSoyad;

    @FindBy(how = How.ID, using = "KayitEmail")
    public TextBox txtKayitEmail;

    @FindBy(how = How.ID, using = "KayitTel")
    public TextBox txtKayitTel;

    @FindBy(how = How.ID, using = "KayitAdres")
    public TextBox txtKayitAdres;

    @FindBy(how = How.ID, using = "KayitPass")
    public TextBox txtKayitPass;
    @FindBy(how = How.ID, using = "KayitOnayPass")
    public TextBox txtKayitOnayPass;

    @FindBy(how = How.ID, using = "KayitButton")
    public Button btnKayit;

    @FindBy(how = How.ID, using = "KayitIptal")
    public Button btnKayitIptal;

    public void Register(String ad, String soyad, String email, String telefon, String adres,
                      String sifre, String sifreOnay) {
        txtKayitAd.EnterText(ad);
        txtKayitSoyad.EnterText(ad);
        txtKayitEmail.EnterText(ad);
        txtKayitTel.EnterText(ad);
        txtKayitAdres.EnterText(ad);
        txtKayitPass.EnterText(ad);
        txtKayitOnayPass.EnterText(ad);
    }

    public HomePage ClickRegister() {
        btnKayit.performSubmit();
        return GetInstance(HomePage.class);
    }

    public HomePage CancelRegister() {
        btnKayitIptal.performSubmit();
        return GetInstance(HomePage.class);
    }
}
