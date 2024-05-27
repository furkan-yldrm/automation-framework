package test.pages;

import framework.base.BasePage;
import framework.controls.elements.Button;
import framework.controls.elements.HyperLink;
import framework.controls.elements.TextBox;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductListPage extends BasePage {
    @FindBy(how = How.ID, using = "AddProducts")
    public Button btnAddProduct;

    @FindBy(how = How.ID, using = "DuzenleProduct")
    public Button btnEditProduct;

    @FindBy(how = How.ID, using = "SilProduct")
    public HyperLink btnDeleteProduct;

    @FindBy(how = How.ID, using = "SearchProduct")
    public TextBox txtSearchProduct;
    @FindBy(how = How.ID, using = "SearchButton")
    public Button btnSearchProduct;
}
