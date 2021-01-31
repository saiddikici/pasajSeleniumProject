package com.seleniumprojectone.webpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
    private static final Logger logger = LogManager.getLogger(HomePage.class);
    WebDriver driver;
    String iphone = "iPhone 11 128 GB";

    private final By passageBtn = By.xpath("//a[@href=\"/pasaj?place=menu\"]");
    private final By searchBtn = By.xpath("//a[contains(@class,\"js-search\")]/i");
    private final By howCanWeHelpYou = By.xpath("//input[@name=\"qx\" and contains(@placeholder,\"Size\")]");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        init(driver);
    }


    public HomePage clickSearchBtn() {
        actions.clickElement(searchBtn);
        logger.info("Clicked to Search Button");
        return this;
    }

    public SearchResults setTextToSearchFieldAndPressEnter() {
        logger.info("typing " + iphone);
        actions.getElement(howCanWeHelpYou).sendKeys(iphone);
        actions.getElement(howCanWeHelpYou).sendKeys(Keys.ENTER);
        return new SearchResults(driver);
    }

    public PassagePage clickPassageBtn() {
        logger.info("Clicking passage button");
        actions.clickElement(passageBtn);
        return new PassagePage(driver);
    }
}
