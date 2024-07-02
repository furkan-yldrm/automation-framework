package framework.base;

import framework.controls.api.ControlFactory;
import org.openqa.selenium.support.PageFactory;

public class Base {
    public static BasePage CurrentPage;
    public <TPage extends BasePage> TPage GetInstance(Class<TPage> page){

        Object obj = ControlFactory.initElements(DriverContext.Driver, page);
        return page.cast(obj);
    }
}
