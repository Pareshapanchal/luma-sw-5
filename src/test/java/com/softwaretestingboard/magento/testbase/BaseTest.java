package com.softwaretestingboard.magento.testbase;

import com.softwaretestingboard.magento.propertyreader.PropertyReader;
import com.softwaretestingboard.magento.utilities.Utitlity;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utitlity {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod(alwaysRun = true)
    public void setUp(){ selectBrowser(browser); }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){ closeBrowser(); }
}
