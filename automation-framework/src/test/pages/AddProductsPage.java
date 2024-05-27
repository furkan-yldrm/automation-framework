package test.pages;

import framework.base.BasePage;
import framework.controls.elements.Button;
import framework.controls.elements.HyperLink;
import framework.controls.elements.TextBox;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddProductsPage extends BasePage {
    @FindBy(how = How.ID, using = "UrunEkle")
    public TextBox txtUrunEkle;

    @FindBy(how = How.ID, using = "MarkaEkle")
    public TextBox txtMarkaEkle;

    //Kategori dropdown daha sonra ayarlanacak!!
    @FindBy(how = How.ID, using = "FiyatEkle")
    public TextBox txtFiyatEkle;

    @FindBy(how = How.NAME, using = "Description")
    public TextBox txtAciklama;


    //Resim ekleme alanı daha sonra ayarlanacak!!

}
