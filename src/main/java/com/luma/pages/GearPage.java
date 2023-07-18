package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlistners.CustomListners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle;

    public void clickOnOvernightDuffle() {
        CustomListners.test.log(Status.PASS,"Click on Overnight Duffle"+overnightDuffle);
        clickOnElement(overnightDuffle);
    }
}
