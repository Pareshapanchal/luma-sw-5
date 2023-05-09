package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utitlity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class GearPage extends Utitlity {
    @CacheLookup
    @FindBy(xpath = "//a[@id ='ui-id-6']")
    WebElement gear;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-25']")
    WebElement bags;
    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle ;
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Overnight Duffle')]")
    WebElement overnightDuffleText;
    @CacheLookup
    @FindBy(xpath="//input[@id='qty']")
    WebElement quantity ;
    @CacheLookup
    @FindBy(id= "qty")
    WebElement changeQty ;
    @CacheLookup
    @FindBy(xpath="//button[@id='product-addtocart-button']")
    WebElement addToCartButton ;
    @CacheLookup
    @FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement overnightDuffleAddedText ;
    @CacheLookup
    @FindBy(xpath="//a[@class='action showcart']")
    WebElement shoppingCartButton;
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='View and Edit Cart']")
    WebElement viewAndEditButton ;
    @CacheLookup
    @FindBy(xpath="//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productOvernightDuffleText ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]")
    WebElement productQuantity ;
    @CacheLookup
    @FindBy(xpath="//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPrice ;
    @CacheLookup
    @FindBy(xpath= "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart ;
    @CacheLookup
    @FindBy(xpath="//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement subTotalText ;
    public void mouseHoverOnGearMenu(){
        Reporter.log("Mouse hover on Gear Menu");
        CustomListeners.test.log(Status.PASS,"Mouse hover on Gear menu");
        mouseHoverOnElement(gear);
    }
    public void clickOnBags(){
        Reporter.log("Click on Bags");
        CustomListeners.test.log(Status.PASS,"Click on Bags");
        clickOnElement(bags);    }
    public void clickOnOvernightduffle(){
        Reporter.log("Click on Overnight Duffle");
        CustomListeners.test.log(Status.PASS,"Click on Overnight Duffle");

        clickOnElement(overnightDuffle);
    }
    public String getActualOvernightDuffleText(){
        Reporter.log("Get text OvernightDuffle");
        CustomListeners.test.log(Status.PASS,"Get text OvernightDuffle");

        return getTextFromElement(overnightDuffleText);
    }
    public void changeQuantity(String qty){
        Reporter.log("Change Quantity");
        CustomListeners.test.log(Status.PASS,"Change Quantity");
        clickOnElement(changeQty);
        clearTheBox(changeQty);
        sendTextToElement(changeQty,qty);
    }
    public void clickOnAddToCartButton(){
        Reporter.log("Click on AddToCart Button");
        CustomListeners.test.log(Status.PASS,"Click on AddToCart Button");
        clickOnElement(addToCartButton);
    }
    public String getOvernightDuffleAddedMessage(){
        Reporter.log("Get OvernightDuffle added message");
        CustomListeners.test.log(Status.PASS,"Get OvernightDuffle added message");
        return getTextFromElement(overnightDuffleAddedText);
    }
    public void clickOnShoppingCart(){
        Reporter.log("Click on ShoppingCart");
        CustomListeners.test.log(Status.PASS,"Click on ShoppingCart");
        mouseHoverOnElementAndClick(shoppingCartButton);
        clickOnElement(viewAndEditButton);
    }
    public String getProductNameOvernightDuffleText(){
        Reporter.log("Get OvernightDuffle text");
        CustomListeners.test.log(Status.PASS,"Get OvernightDuffle text");
        return getTextFromElement(productOvernightDuffleText);
    }
    public String getProductQuantity(){
        Reporter.log("Get product quantity");
        CustomListeners.test.log(Status.PASS,"Get product quantity");
        return productQuantity.getAttribute("value");

    }
    public String getProductPrice(){
        Reporter.log("Get Product Price");
        CustomListeners.test.log(Status.PASS,"Get Product Price");
        return getTextFromElement(productPrice);
    }
    public void changeProductQuantity(String qty){
        Reporter.log("Change Product quantity");
        CustomListeners.test.log(Status.PASS,"Change Product quantity");
        clearTheBox(productQuantity);
        sendTextToElement(productQuantity,qty);
    }
    public void clickOnUpdateShoppingCartButton(){
        Reporter.log("Click on Update Shopping Cart button");
        CustomListeners.test.log(Status.PASS,"Click on Update Shopping Cart button");
        clickOnElement(updateShoppingCart);
    }
    public String getSubTotalText()
    {   Reporter.log("Get Sub Total");
        CustomListeners.test.log(Status.PASS,"Get Sub total");
        return getTextFromElement(subTotalText);
    }
    public void addProductToShoppingCartAndVerifyProductDetials()throws InterruptedException{
        // * Mouse Hover on Gear Menu
        mouseHoverOnGearMenu();
        // * Click on Bags
        clickOnBags();
        // * Click on Product Name ‘Overnight Duffle’
        clickOnOvernightduffle();
        // * Verify the text ‘Overnight Duffle’
        String expectedOvernightDuffleText ="Overnight Duffle";
        String actualMessage  = getActualOvernightDuffleText();
        Assert.assertEquals(actualMessage,expectedOvernightDuffleText,"not match");
        // * Change Qty 3
        changeQuantity("3");
        // * Click on ‘Add to Cart’ Button.
        clickOnAddToCartButton();
        // * Verify the text‘You added Overnight Duffle to your shopping cart.’
        String expectedProductAddedMessage ="You added Overnight Duffle to your shopping cart.";
        String actualProductAddedMessage = getOvernightDuffleAddedMessage();
        Assert.assertEquals(actualProductAddedMessage,expectedProductAddedMessage,"not match");
        // * Click on ‘shopping cart’ Link into message
        clickOnShoppingCart();
        // * Verify the product name ‘Cronus Yoga Pant’
        Thread.sleep(2000);
        String expectedProductName ="Overnight Duffle";
        String actualProductName = getProductNameOvernightDuffleText();
        Assert.assertEquals(actualProductName,expectedProductName,"not match");
        // Verify the Qty is ‘3’
        String expectedQty ="3";

        String actualQty =getProductQuantity();
        Assert.assertEquals(actualQty,expectedQty,"not match");
        Thread.sleep(2000);
        // * Verify the product price ‘$135.00’
        String expectedProductPrice = "$135.00";
        String actualProductPrice = getProductPrice();
        Assert.assertEquals(actualProductPrice,expectedProductPrice,"not match");
        Thread.sleep(2000);
        // * Change Qty to ‘5’
        changeProductQuantity("5");
        // * Click on ‘Update Shopping Cart’ button
        clickOnUpdateShoppingCartButton();
        // * Verify the product price ‘$225.00’
        String expectedTotal ="$225.00";
        String actualTotal = getSubTotalText();
        Assert.assertEquals(actualTotal,expectedTotal,"Not match");
    }

}
