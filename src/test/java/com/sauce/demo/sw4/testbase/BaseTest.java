package com.sauce.demo.sw4.testbase;

import com.sauce.demo.sw4.propertyreader.PropertyReader;
import com.sauce.demo.sw4.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setup(){

        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){

    }


}
