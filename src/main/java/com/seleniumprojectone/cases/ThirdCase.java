package com.seleniumprojectone.cases;

import com.seleniumprojectone.webpages.HomePage;
import com.seleniumprojectone.webpages.PassageAppleMacbookPage;
import com.seleniumprojectone.webpages.PassagePage;
import org.openqa.selenium.WebDriver;

public class ThirdCase {
    WebDriver webDriver;
    HomePage homePage;
    PassagePage passagePage;
    PassageAppleMacbookPage passageAppleMacbookPage;

    public ThirdCase(WebDriver webDriver) {
        this.webDriver = webDriver;
        homePage = new HomePage(webDriver);
        passagePage = new PassagePage(webDriver);
        passageAppleMacbookPage = new PassageAppleMacbookPage(webDriver);
    }

    public void execute(){
        webDriver.get("https://www.turkcell.com.tr/");
        homePage.clickPassageBtn();
        try {Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        passagePage.scrollToTheEndOfPage();
        passagePage.clickAppleMacbookBtn();
        try {Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        passageAppleMacbookPage.clickAppleMacBookProTouchBarThirteenInch();
        passageAppleMacbookPage.verifyDefaultPrice();
        passageAppleMacbookPage.verifySixMonthsHigherThanNineMonths();
    }
}
