package com.seleniumprojectone.webpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassagePage {
    private static final Logger logger = LogManager.getLogger(PassagePage.class);
    WebDriver driver;
    WebDriverWait driverWait;
    JavascriptExecutor javascriptExecutor;

    By basketBtn = By.xpath("//a[@class=\"o-p-header__my-basket\"]");
    By appleMacbookBtn = By.xpath("//a[@href=\"/cihazlar/tabletler/bilgisayarlar-apple?place=footer\"]");

    public PassagePage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver,10);
    }

    public void clickBasketBtn(){
        logger.info("Clicking basket button");
        driver.findElement(basketBtn).click();
        driverWait.until(ExpectedConditions.urlContains("siparisler"));
    }

    public void scrollToTheEndOfPage(){
        logger.info("Scrolling");
        javascriptExecutor = (JavascriptExecutor) driver;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickAppleMacbookBtn(){
        logger.info("Clicking Apple Macbook Button");
        driver.findElement(appleMacbookBtn).click();
        driverWait.until(ExpectedConditions.urlContains("bilgisayarlar-apple"));
    }
}
