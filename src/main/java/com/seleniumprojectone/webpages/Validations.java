package com.seleniumprojectone.webpages;

import org.testng.Assert;

public class Validations extends ElementService {
    public void verifyElementTextEqualsText(String actualText, String expectedText) {
        Assert.assertEquals(actualText, expectedText);
    }
    public void verifyActualValueisHigher(String actualValue, String expectedValue){
        Assert.assertTrue(Double.parseDouble(actualValue.replace(".", "").replace(',', '.')) > Double.parseDouble(expectedValue), "not higher");
    }
}
