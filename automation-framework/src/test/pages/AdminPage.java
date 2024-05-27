package test.pages;

import framework.base.BasePage;
import framework.controls.elements.Button;
import framework.controls.elements.TextBox;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage extends BasePage {
    @FindBy(how = How.ID, using = "SharedLogin")
    public Button BtnLogin;

    //Dropdown kısmı daha sonra eklenecek!!

}
