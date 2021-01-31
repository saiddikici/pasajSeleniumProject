package com.seleniumprojectone.webpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassageAppleMacbookPage extends BasePage{
    private static final Logger logger = LogManager.getLogger(PassagePage.class);
    WebDriver driver;

    private final By appleMacBookProTouchBarBtn = By.xpath("(//span[@class=\"m-p-pc__title\" and contains(text(),\"Apple MacBook Pro Touch Bar\") and ./parent::div/following-sibling::*/div/span])[1]");
    private final By defaultPrice = By.xpath("//span[@class=\"a-price-val\"]");

    public PassageAppleMacbookPage(WebDriver driver) {
        this.driver = driver;
        init(driver);
    }

    public PassageAppleMacbookPage clickAppleMacBookProTouchBarThirteenInch(){
        logger.info("Clicking Apple MacBook Pro Touch Bar 13 inç");
        actions.clickElement(appleMacBookProTouchBarBtn);
        return this;
    }

    public void verifyDefaultPrice(){
        logger.info("Checking if the price higher than 1000$");
        validations.verifyActualValueisHigher(actions.getTextOfElement(defaultPrice), "1000" );
    }
}
