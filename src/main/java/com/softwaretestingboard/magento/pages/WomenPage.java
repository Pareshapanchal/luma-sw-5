package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utitlity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utitlity {
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement women;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id ='ui-id-11']")
    WebElement jackets;
    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement sortBy;
    @CacheLookup
    @FindBys(@FindBy( xpath ="//ol[@class='products list items product-items']/li/div/div/strong/a"))
    List<WebElement> listOfProductsName;
    @CacheLookup
    @FindBys(@FindBy( xpath ="//ol[@class='products list items product-items']/li/div/div/div/span/span/span/span"))
    List<WebElement> listOfProductsPrice;

    public void mousehoverOnWomenMenu() {
        Reporter.log("Mouse Hover On Women in the top Menu" );
        CustomListeners.test.log(Status.PASS,"Mouse hover on Women in the top Menu");
        mouseHoverOnElement(women);
    }
    public void mouseHoverOnTops() {
        Reporter.log("Mouse hover on the Tops" );
        CustomListeners.test.log(Status.PASS,"Mouse hover on the Tops");
        mouseHoverOnElement(tops);
    }
    public void clickOnJackets() {
        Reporter.log("Mouse hover on Jackets" );
        CustomListeners.test.log(Status.PASS,"Mouse hover on Jackets");
        clickOnElement(jackets);
    }
    public List<String> getExpectedProductsSortedByProductName() {
        Reporter.log("Get list of products" );
        CustomListeners.test.log(Status.PASS,"Get list of products");
        List<String> list = getTheListOfElementFromTheList(listOfProductsName);
        Collections.sort(list);
        return list;
    }

    public List<String> getActualProductsSortedByProductName() {
        Reporter.log("get actual products in sorted order" );
        CustomListeners.test.log(Status.PASS,"get actual products in sorted order");
        List<String> list = getTheListOfElementFromTheList(listOfProductsName);
        return list;
    }
    public List<Double> getActualProductsSortedByProductPrice(){
        List<Double> actualpricelist = new ArrayList<Double>();
        for(int i=0; i<listOfProductsPrice.size(); i++){
            String s = listOfProductsPrice.get(i).getText().substring(1);
            double price = Double.parseDouble(s);
            actualpricelist.add(price);

        }
        return actualpricelist;

    }
    public List<Double> getExpectedProductsSortedByProductPrice(){
        List<Double> expectedpricelist = new ArrayList<Double>();
        for(int i=0; i<listOfProductsPrice.size(); i++){
            String s = listOfProductsPrice.get(i).getText().substring(1);
            double price = Double.parseDouble(s);
            expectedpricelist.add(price);

        }
       Collections.sort(expectedpricelist);
          return expectedpricelist;
    }

    public void sortProductsFromSortbyDropDown(String text) {
        Reporter.log("get actual products in sorted order" );
        CustomListeners.test.log(Status.PASS,"get actual products in sorted order");

        selectByVisibleTextFromDropDown(sortBy, text);
    }
}