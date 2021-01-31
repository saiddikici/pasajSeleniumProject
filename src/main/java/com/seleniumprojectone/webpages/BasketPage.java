package com.seleniumprojectone.webpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage{
    private static final Logger logger = LogManager.getLogger(BasketPage.class);
    WebDriver driver;

    private final By youHaveNothingInYourBasket = By.xpath("//div[@class=\"m-info-card m-info-card--big\"]/h3");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
        init(driver);
    }

    public void verifyIfYourBasketIsEmpty(){
        logger.info("Checking if your basket is empty");
        validations.verifyElementTextEqualsText(actions.getTextOfElement(youHaveNothingInYourBasket),"Sepetinizde ürün bulunmamaktadır." );
    }
}
