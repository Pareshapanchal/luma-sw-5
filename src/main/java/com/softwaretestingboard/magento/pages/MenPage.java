package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utilities.Utitlity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class MenPage extends Utitlity {
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement men;
    @CacheLookup
    @FindBy(xpath= "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottom ;
    @CacheLookup
    @FindBy(xpath= "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants  ;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement size32;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement colourBlack ;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedShoppingCartText;
    @CacheLookup
    @FindBy(xpath="//a[@class='action showcart']")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath= "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath="//dd[contains(text(),'32')]")
    WebElement productSize ;
    @CacheLookup
    @FindBy(xpath= "//dd[contains(text(),'Black')]")
    WebElement productColour;
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='View and Edit Cart']")
    WebElement viewAndEditCart ;
    public void mouseHoverOnMenMenu(){

        Reporter.log("Mouse hover on Men from the top Menu " + men.getText());
        CustomListeners.test.log(Status.PASS,"Mouse hover on Men from the top Menu");
        mouseHoverOnElement(men);
    }
    public void mouseHoverOnBottoms()
    {
        Reporter.log("Mouse hover on Bottoms option " +bottom.getText());
        CustomListeners.test.log(Status.PASS,"Mouse hover on Bottoms option");
        mouseHoverOnElement(bottom);
    }
    public void clickOnPants(){
        Reporter.log("Click on Pants option" +pants.getText());
        CustomListeners.test.log(Status.PASS,"Click On Pants option");
        clickOnElement(pants);
    }
    public void mouseHoverOnCronusYogaPantAndClickOnSize32(){
        Reporter.log("Mouse hover on CronusYogaPant and click on Size32()"+cronusYogaPant.getText() +size32.getText());
        CustomListeners.test.log(Status.PASS,"Mouse hover on CronusYogaPant and click on Size32() ");

        mouseHoverOnElement(cronusYogaPant);
        mouseHoverOnElementAndClick(size32);
    }
    public void mouseHoverOnCronusYogaPantAndClickOnColourBlack(){
        Reporter.log("Mouse hover on CronusYogaPant and click on colour Black" +cronusYogaPant.getText()+colourBlack.getText());
        CustomListeners.test.log(Status.PASS,"Mouse hover on CronusYogaPant and click on colour Black");

        mouseHoverOnElement(cronusYogaPant);
        mouseHoverOnElementAndClick(colourBlack);
    }
    public void mouseHoverOnCronusYogaPantAndClickOnClickOnAddToCartButton(){
        Reporter.log("Mouse hover on CronusYogaPant and click on AddToCart button"+addToCart.getText());
        CustomListeners.test.log(Status.PASS,"Mouse hover on CronusYogaPant and click on AddToCart Button");

        mouseHoverOnElement(cronusYogaPant);
        mouseHoverOnElementAndClick(addToCart);
    }
    public String getActualYouAddedCronusYogaPantToYourShoppingCartMessage(){
        Reporter.log("Get Add CronusYogaPant added message "+addedShoppingCartText.getText());
        CustomListeners.test.log(Status.PASS,"Mouse hover on CronusYogaPant and click on AddToCart Button");

        return getTextFromElement(addedShoppingCartText);
    }
    public void clickOnShoppingCartLink(){
        Reporter.log("Click on Shopping Cart Link "+shoppingCartLink.getText());
        CustomListeners.test.log(Status.PASS,"Mouse hover on CronusYogaPant and click on AddToCart Button");

        mouseHoverOnElementAndClick(shoppingCartLink);
    }
    public String getShoppingCartText(){
        Reporter.log("Get Shopping Cart text "+shoppingCartText.getText());
        CustomListeners.test.log(Status.PASS,"Mouse hover on CronusYogaPant and click on AddToCart Button");

        return getTextFromElement(shoppingCartText);
    }
    public String getActualProductName(){
        Reporter.log("Get actual product name "+productName.getText());
        CustomListeners.test.log(Status.PASS,"Mouse hover on CronusYogaPant and click on AddToCart Button");

        return getTextFromElement(productName);
    }
    public String getActualProductSize(){
        Reporter.log("Get actual product size "+productSize.getText());
        CustomListeners.test.log(Status.PASS,"Mouse hover on CronusYogaPant and click on AddToCart Button");

        return getTextFromElement(productSize);
    }
    public String getActualProductColour(){
        Reporter.log("Get actual product colour "+productColour.getText());
        CustomListeners.test.log(Status.PASS,"Mouse hover on CronusYogaPant and click on AddToCart Button");

        return getTextFromElement(productColour);
    }
    public void clickOnViewAndEditCart(){
        Reporter.log("Click on ViewAndEdit cart "+ viewAndEditCart.getText());
        CustomListeners.test.log(Status.PASS,"Click on ViewAndEdit cart");

        mouseHoverOnElementAndClick(viewAndEditCart);
    }
    public void addProductToShoppingCart()throws InterruptedException{
           mouseHoverOnMenMenu();
           mouseHoverOnBottoms();
           Thread.sleep(2000);
           clickOnPants();
           mouseHoverOnCronusYogaPantAndClickOnSize32();
           mouseHoverOnCronusYogaPantAndClickOnColourBlack();
           mouseHoverOnCronusYogaPantAndClickOnClickOnAddToCartButton();
    }
    public void verifyProductDetails(){
        // * Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedCronusYogaPantAddedMessage ="You added Cronus Yoga Pant to your shopping cart.";
        String actualCronusYogaPantAddedMessage = getActualYouAddedCronusYogaPantToYourShoppingCartMessage();
        Assert.assertEquals(actualCronusYogaPantAddedMessage,expectedCronusYogaPantAddedMessage,"Not Match");
        // * Click on ‘shopping cart’ Link into message
        clickOnShoppingCartLink();
        // verify the text ‘Shopping Cart.’
        clickOnViewAndEditCart();
        String expectedShoppingCartText = "Shopping Cart";
        String actualShoppingCartText = getShoppingCartText();
        Assert.assertEquals(actualShoppingCartText,expectedShoppingCartText,"Not Match");
        // * Verify the product name ‘Cronus Yoga Pant’
        String expectedProductName ="Cronus Yoga Pant";
        String actualProductName =getActualProductName();
        Assert.assertEquals(actualProductName,expectedProductName,"Not Match");
        // * Verify the product size ‘32’
        String expectedProductSize="32";
        String actualProductSize = getActualProductSize();
        Assert.assertEquals(actualProductSize,expectedProductSize,"Not Match");
        // * Verify the product colour ‘Black’
        String expectedProductColour="Black";
        String actualProductColour = getActualProductColour();
        Assert.assertEquals(actualProductColour,expectedProductColour,"Not match");
    }

}
