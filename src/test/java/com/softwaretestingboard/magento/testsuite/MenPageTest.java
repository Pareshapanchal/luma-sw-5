package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenPageTest extends BaseTest {
    MenPage menPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        menPage = new MenPage();
    }
    @Test(groups = {"sanity","regression"})
    //1.userShouldAddProductSuccessFullyToShoppinCart()
    public void userShouldAddProductSuccessFullyToShoppinCart()throws InterruptedException{
     menPage.addProductToShoppingCart();
     Thread.sleep(2000);
     menPage.verifyProductDetails();
    }
}
