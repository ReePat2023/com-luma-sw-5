package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlistners.CustomListners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OverNightDuffle extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    public String getOverNightDuffelText() {
        CustomListners.test.log(Status.PASS,"Over Night Duffle text"+overNightDuffleText);
        return getTextFromElement(overNightDuffleText);
    }
    public void changeQuantityTo3(String newQty) {
        CustomListners.test.log(Status.PASS,"Change Quantity"+qty);
        qty.clear();
        sendTextToElement(qty, newQty);
    }
    public void clickOnAddToCart() {
        CustomListners.test.log(Status.PASS,"click on add to cart"+addToCart);
        clickOnElement(addToCart);
    }
    public String getAddToCartText() {
        CustomListners.test.log(Status.PASS,"Add to cart text"+addToCart);
        return getTextFromElement(addToCartText);
    }
    public void clickOnShoppingCart() {
        CustomListners.test.log(Status.PASS,"Click on shopping cart"+shoppingCart);
        clickOnElement(shoppingCart);
    }
}
