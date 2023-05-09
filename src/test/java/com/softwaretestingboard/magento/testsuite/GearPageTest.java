package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class GearPageTest extends BaseTest {
    GearPage gearPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        gearPage = new GearPage();
    }
    @Test(groups = {"sanity","regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart()throws InterruptedException{
        gearPage.addProductToShoppingCartAndVerifyProductDetials();
    }
}
