package com.seleniumprojectone.webpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchResults {
    private static final Logger logger = LogManager.getLogger(SearchResults.class);
    WebDriver driver;
    WebDriverWait driverWait;

    String iphone = "iPhone 11 128 GB";

    By devicesTab = By.xpath("//a[@title=\"Cihazlar\"]");
    By selectedDevicesTab = By.xpath("//a[@title=\"Cihazlar\"]/parent::div");

    public SearchResults(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver, 10);
    }

    public void clickDevicesTab(){
        logger.info("Clicking on devices tab");

        driver.findElement(devicesTab).click();

        driverWait.until(ExpectedConditions.attributeContains(selectedDevicesTab, "class", "m-tab__item--active"));
    }

    public void verifyDeviceNameMatches(){
        logger.info("checking for " + iphone + " if matches with result");
        if(driver.findElement(By.xpath("(//div[starts-with(@class,\"m-grid-col-3\")]/a/div/span)[1]")).getAttribute("innerHTML").equals(iphone)){
            logger.info("Success!");
        }
        else {
            logger.error("Fail!!!");
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
