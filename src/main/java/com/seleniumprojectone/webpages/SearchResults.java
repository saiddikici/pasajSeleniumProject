package com.seleniumprojectone.webpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchResults extends BasePage {
    private static final Logger logger = LogManager.getLogger(SearchResults.class);
    WebDriver driver;

    String iphone = "iPhone 11 128 GB";

    private final By devicesTab = By.xpath("//a[@title=\"Cihazlar\"]");
    private final By deviceName = By.xpath("//*[@id=\"tabDevices\"]/div[1]/a/div[1]/span");

    public SearchResults(WebDriver driver) {
        this.driver = driver;
        init(driver);
    }

    public SearchResults clickDevicesTab() {
        logger.info("Clicking on devices tab");
        actions.clickElement(devicesTab);
        return this;
    }

    public void verifyDeviceNameMatches() {
        logger.info("checking for " + iphone + " if matches with result");
        validations.verifyElementTextEqualsText(actions.getAttributeOfElement(deviceName, "innerHTML"), iphone);
    }
}
