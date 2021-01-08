package com.seleniumprojectone.webpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassageAppleMacbookPage {
    private static final Logger logger = LogManager.getLogger(PassagePage.class);
    WebDriver driver;
    WebDriverWait driverWait;
    String price;
    Double doublePrice;

    By appleMacBookProTouchBarBtn = By.xpath("//a[@href=\"/pasaj/bilgisayar-tablet/bilgisayarlar/macbook/apple-macbook-pro-touch-bar-13-inc-10-nesil-intel-core-i5-2-0-ghz-16-gb-ram-1-tb-ssd\"]");
    By defaultPrice = By.xpath("//span[@class=\"a-price-val\"]");
    By sixMonthsPrice = By.xpath("//a[@data-period=\"6\"]");
    By nineMonthsPrice = By.xpath("//a[@data-period=\"9\"]");

    public PassageAppleMacbookPage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver,10);
    }

    public void clickAppleMacBookProTouchBarThirteenInch(){
        logger.info("Clicking Apple MacBook Pro Touch Bar 13 inç");
        driver.findElement(appleMacBookProTouchBarBtn).click();
        driverWait.until(ExpectedConditions.urlContains("macbook"));
    }

    public void verifyDefaultPrice(){
        logger.info("Checking if the price higher than 1000$");
        price = driver.findElement(defaultPrice).getText();
        doublePrice = Double.valueOf(price.replace(".", "").replace(',', '.'));
        if(doublePrice > 1000){
            logger.info("Price is higher than 1000$");
        }
        else {
            logger.warn("Price is not higher than 1000$");
        }
    }

    public void verifySixMonthsHigherThanNineMonths(){
        logger.info("Calculating...");
        if(
                Double.valueOf(driver.findElement(sixMonthsPrice).getAttribute("data-price").replace(".", "").replace(',', '.')) >
                Double.valueOf(driver.findElement(nineMonthsPrice).getAttribute("data-price").replace(".", "").replace(',', '.'))
        ){
            logger.info("Six months price is higher than nine months price.");
        }else {
            logger.info("Six months price is not higher than nine months price.");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        By by;
    }
}
