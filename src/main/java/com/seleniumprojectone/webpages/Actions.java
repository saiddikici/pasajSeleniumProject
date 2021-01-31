package com.seleniumprojectone.webpages;

import org.openqa.selenium.By;

public class Actions extends ElementService {
    public void clickElement(By by) {
        getElement(by).click();
    }

    public String getTextOfElement(By by) {
        String textOfElement = getElement(by).getText();
        return textOfElement;
    }

    public String getAttributeOfElement(By by, String attribute) {
        String attributeOfElement = getElement(by).getAttribute(attribute);
        return attributeOfElement;
    }
}
