package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlistners.CustomListners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomensJacketPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement productFilter;

    By productNameList1 = By.xpath("//strong[@class = 'product name product-item-name']");
    By productNameList2 = By.xpath("//strong[@class = 'product name product-item-name']");
    By productPriceList1 = By.xpath("//span[@class='price-container price-final_price tax weee']");
    By productPriceList2 = By.xpath("//span[@class='price-container price-final_price tax weee']");


    public ArrayList<String> getProductList1() {
        List<WebElement> beforeFilterProductList = driver.findElements(productNameList1);
        ArrayList<String> beforeFilterProductList1 = new ArrayList();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public void selectProductNameFilter(String filterName) {
        CustomListners.test.log(Status.PASS, "Select product name" + productFilter);
        selectByVisibleTextFromDropDown(productFilter, filterName);
    }

    public ArrayList<String> getProductList2() {
        List<WebElement> afterFilterProductList = driver.findElements(productNameList2);
        ArrayList<String> afterFilterProductList1 = new ArrayList();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }
        return afterFilterProductList1;
    }

    public ArrayList<String> getProductPriceList1() {
        List<WebElement> beforeFilterProductList = driver.findElements(productPriceList1);
        ArrayList<String> beforeFilterProductList1 = new ArrayList();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public ArrayList<String> getProductPriceList2() {
        List<WebElement> afterFilterProductList = driver.findElements(productPriceList2);
        ArrayList<String> afterFilterProductList1 = new ArrayList();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }
        return afterFilterProductList1;
    }
}
