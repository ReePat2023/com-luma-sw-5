package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlistners.CustomListners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    By shoppingCart = By.xpath("//span[@class='base']");
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement color;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffleText;
    @CacheLookup
    @FindBy(css = ".input-text.qty")
    WebElement qtyText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPrice;
    @CacheLookup
    @FindBy(css = ".input-text.qty" )
    WebElement qty;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatedProductPrice;


    public String getShoppingCart() {
        CustomListners.test.log(Status.PASS,"Shopping Cart text is displayed on page");
        Reporter.log("Shopping Cart text is displayed on page");
        return getTextFromElement(shoppingCart);
    }
    public String getCronusYogaPantText() {
        CustomListners.test.log(Status.PASS,"Cronus Yoga Pant  text is displayed on page");
        Reporter.log("Cronus Yoga Pant text is displayed on page");
        return getTextFromElement(cronusYogaPant);
    }
    public String getSizeText() {
        CustomListners.test.log(Status.PASS," Size displayed on page " + size.toString());
        Reporter.log("Size displayed on page " + size.toString());
        return getTextFromElement(size);
    }
    public String getColorText() {
        CustomListners.test.log(Status.PASS," Color displayed on page " + color.toString());
        Reporter.log("Color displayed on page " + color.toString());
        return getTextFromElement(color);
    }

    public String getOverNightDuffeleText() {
        CustomListners.test.log(Status.PASS," Text displayed on page " + overNightDuffleText.toString());
        Reporter.log("Text displayed on page " + overNightDuffleText.toString());
        return getTextFromElement(overNightDuffleText);
    }
    public String getQty() {
        CustomListners.test.log(Status.PASS," Quantity displayed on page " + qtyText.toString());
        Reporter.log("Quantity displayed on page " + qtyText.toString());
        String q = qtyText.getAttribute("value");
        return q;
    }
    public String getProductPrice() {
        CustomListners.test.log(Status.PASS," Price displayed on page " + productPrice.toString());
        Reporter.log("Price displayed on page " + productPrice.toString());
        return getTextFromElement(productPrice);
    }
    public void changeQtyOfOverNightDuffle(String newQty) {
        qty.clear();
        CustomListners.test.log(Status.PASS," Quantity displayed on page " + newQty.toString());
        Reporter.log("Quantity displayed on page " + newQty.toString());
        sendTextToElement(qty,newQty);
    }
    public void clickOnUpdateShoppingCart() {
        CustomListners.test.log(Status.PASS,"Click on Shopping Cart");
        Reporter.log("Click on Shopping Cart");
        clickOnElement(updateShoppingCart);
    }
    public String getUpdatedProductPrice() {
        CustomListners.test.log(Status.PASS,"Updated Price displayed on Page " + updatedProductPrice.toString());
        Reporter.log("Updated Price displayed on Page " + updatedProductPrice.toString());
        return getTextFromElement(updatedProductPrice);
    }
}
