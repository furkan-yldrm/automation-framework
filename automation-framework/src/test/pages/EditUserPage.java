package test.pages;

import framework.base.BasePage;
import framework.controls.elements.Button;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditUserPage extends BasePage {
    @FindBy(how = How.ID, using = "EditUser")
    public Button btnEditUser;

    @FindBy(how = How.ID, using = "UserBack")
    public Button btnUserBack;

    @FindBy(how = How.ID, using = "DeleteUser")
    public Button btnDeleteUser;

    @FindBy(how = How.CLASS_NAME, using = "button[@class='btn btn-primary']")
    public Button btnUserRole;
}
