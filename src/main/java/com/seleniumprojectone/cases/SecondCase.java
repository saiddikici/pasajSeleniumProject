package com.seleniumprojectone.cases;

import com.seleniumprojectone.webpages.BasketPage;
import com.seleniumprojectone.webpages.HomePage;
import com.seleniumprojectone.webpages.PassagePage;
import org.openqa.selenium.WebDriver;

public class SecondCase {
    WebDriver webDriver;
    HomePage homePage;
    PassagePage passagePage;
    BasketPage basketPage;

    public SecondCase(WebDriver webDriver) {
        this.webDriver = webDriver;
        homePage = new HomePage(webDriver);
        passagePage = new PassagePage(webDriver);
        basketPage = new BasketPage(webDriver);
    }
    public void execute(){
        webDriver.get("https://www.turkcell.com.tr/");
        homePage.clickPassageBtn();
        try {Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        passagePage.clickBasketBtn();
        try {Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        basketPage.verifyIfYourBasketIsEmpty();

    }
}
