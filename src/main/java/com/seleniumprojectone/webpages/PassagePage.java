package com.seleniumprojectone.webpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PassagePage extends BasePage{
    private static final Logger logger = LogManager.getLogger(PassagePage.class);
    WebDriver driver;
    JavascriptExecutor javascriptExecutor;

    private final By basketBtn = By.xpath("//a[@class=\"o-p-header__my-basket\"]");
    private final By appleMacbookBtn = By.xpath("//a[@href=\"/cihazlar/tabletler/bilgisayarlar-apple?place=footer\"]");

    public PassagePage(WebDriver driver) {
        this.driver = driver;
        init(driver);
    }

    public BasketPage clickBasketBtn(){
        logger.info("Clicking basket button");
        actions.clickElement(basketBtn);
        return new BasketPage(driver);
    }

    public PassagePage scrollToTheEndOfPage(){
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
        return this;
    }

    public PassageAppleMacbookPage clickAppleMacbookBtn(){
        logger.info("Clicking Apple Macbook Button");
        actions.clickElement(appleMacbookBtn);
        return new PassageAppleMacbookPage(driver);
    }
}
