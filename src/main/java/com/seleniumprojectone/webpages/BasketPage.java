package com.seleniumprojectone.webpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketPage {
    private static final Logger logger = LogManager.getLogger(BasketPage.class);
    WebDriver driver;
    WebDriverWait driverWait;

    By youHaveNothingInYourBasket = By.xpath("//div[@class=\"m-info-card m-info-card--big\"]/h3");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver,10);
    }

    public void verifyIfYourBasketIsEmpty(){
        logger.info("Checking if your basket is empty");
        if(driver.findElement(youHaveNothingInYourBasket).getText().equals("Sepetinizde ürün bulunmamaktadır.")){
            logger.info("Texts are matching.");
        }
        else {
            logger.error("Texts don't match, there is a problem!!!");
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
