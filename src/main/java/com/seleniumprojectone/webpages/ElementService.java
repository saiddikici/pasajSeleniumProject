package com.seleniumprojectone.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementService {
    private final int DEFAULT_WAIT = 10;
    public WebDriverWait wait = new WebDriverWait(BasePage.driver, DEFAULT_WAIT);

    public WebElement getElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
