package test.steps;

import framework.base.BrowserType;
import framework.base.DriverContext;
import framework.base.FrameworkInitialize;
import framework.utilities.LogUtil;
import io.cucumber.java.Before;


import java.io.IOException;

public class TestStarter extends FrameworkInitialize {
    @Before
    public void  Initialize() throws IOException {

        LogUtil logUtil = new LogUtil();
        logUtil.CreateLogFile();
        logUtil.Write("Test Başlatıldı");

        InitBrowser(BrowserType.Firefox);
        logUtil.Write("Tarayıcı Tipi belirlendi");
        DriverContext.Browser.GoToUrl("http://eaapp.somee.com/");
        logUtil.Write("Hedef adrese gidildi");

       /* ExcelUtil
       try{
            ExcelUtil util = new ExcelUtil("C:\\Users\\furka\\OneDrive\\Belgeler\\GitHub\\automation-framework\\data.xlsx");
        }
        catch (Exception e){

        }*/
    }
}
