package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlistners.CustomListners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement size;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement color;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    public void mouseHoverOnCronusYogaPant() {
        CustomListners.test.log(Status.PASS,"Mouse hover on cronus pant"+cronusYogaPant);
        mouseHoverToElement(cronusYogaPant);
    }
    public void clickOnSize() {
        CustomListners.test.log(Status.PASS,"Click on Size"+size);
        clickOnElement(size);
    }
    public void clickOnColor() {
        CustomListners.test.log(Status.PASS,"Click on color"+color);
        clickOnElement(color);
    }
    public void clickOnAddToCart() {
        CustomListners.test.log(Status.PASS,"Click on Add to Cart"+addToCart);
        clickOnElement(addToCart);
    }
    public String getTextAfterAddToCart() {
        CustomListners.test.log(Status.PASS,"Get text from Add to Cart"+addToCartText);
        return getTextFromElement(addToCartText);
    }
    public void clickOnShoppingCart() {
        CustomListners.test.log(Status.PASS,"Click on shopping Cart"+shoppingCart);
        clickOnElement(shoppingCart);
    }
}
