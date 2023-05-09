package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
@Listeners(CustomListeners.class)
public class WomenPageTest extends BaseTest {
    WomenPage womenPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        womenPage = new WomenPage();
    }
    //1.verifyTheSortByProductNameFilter
    @Test(groups = {"sanity","regression"})
    public void verifyTheSortByProductNameFilter()throws InterruptedException {

        // Mouse Hover on Women Menu
        womenPage.mousehoverOnWomenMenu();
        // Mouse Hover on Tops
        womenPage.mouseHoverOnTops();
        // Click on Jackets
        womenPage.clickOnJackets();
        Thread.sleep(2000);
        //  Select Sort By filter “Product Name”
        womenPage.sortProductsFromSortbyDropDown("Product Name");
        //  Verify the products name display in alphabetical order
        List<String> expectedProductList = womenPage.getExpectedProductsSortedByProductName();
        List<String> actualProductList = womenPage.getActualProductsSortedByProductName();
        Assert.assertEquals(actualProductList,expectedProductList,"Products are not sorted by name");
    }
    @Test(groups = {"smoke","regression"})
    // 2. verifyTheSortByPriceFilter
    public void verifyTheSortByPriceFilter() throws InterruptedException{
        // * Mouse Hover on Women Men
        womenPage.mousehoverOnWomenMenu();
        // * Mouse Hover on Tops
        womenPage.mouseHoverOnTops();
        // * Click on Jackets
        womenPage.clickOnJackets();
        Thread.sleep(2000);
        // * Select Sort By filter “Price”
        womenPage.sortProductsFromSortbyDropDown("Price");
        // * Verify the products price display in Low to High
        //List<String> expectedProductList = womenPage.getExpectedProductsSorted();
        List<Double> actualProductlist = womenPage.getActualProductsSortedByProductPrice();
        System.out.println(actualProductlist);
        List<Double> expectedProductlist = womenPage.getExpectedProductsSortedByProductPrice();
        System.out.println(expectedProductlist);
        Assert.assertEquals(actualProductlist,expectedProductlist,"Products are not sorted By price");
    }
}
