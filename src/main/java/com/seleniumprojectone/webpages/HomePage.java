package com.seleniumprojectone.webpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
    private static final Logger logger = LogManager.getLogger(HomePage.class);
    WebElement howCanWeHelpYou;
    WebDriver driver;
    WebDriverWait driverWait;
    String iphone = "iPhone 11 128 GB";

    By passageBtn = By.xpath("//a[@href=\"/pasaj?place=menu\"]");
    By basketBtn = By.xpath("//a[@class=\"o-p-header__my-basket\"]");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver,10);
    }

    public void clickSearchBtn(){
        howCanWeHelpYou = driver.findElement(By.xpath("//input[@name=\"qx\" and contains(@placeholder,\"Size\")]"));
        driver.findElement(By.xpath("//a[contains(@class,\"js-search\")]/i")).click();

        logger.info("Clicked to Search Button");

        driverWait.until(ExpectedConditions.visibilityOf(howCanWeHelpYou));

    }

    public void setTextToSearchFieldAndPressEnter(){
        logger.info("typing " + iphone);

        howCanWeHelpYou.sendKeys(iphone);
        howCanWeHelpYou.sendKeys(Keys.ENTER);

        driverWait.until(ExpectedConditions.stalenessOf(howCanWeHelpYou));
    }

    public void clickPassageBtn(){
        logger.info("Clicking passage button");
        driver.findElement(passageBtn).click();
        driverWait.until(ExpectedConditions.urlContains("pasaj?place=menu"));
    }
}
