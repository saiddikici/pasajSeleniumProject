package com.seleniumprojectone;

import org.testng.annotations.Test;

public class PasajTests extends TestBase{

    @Test
    public void scenarioOne(){
        homePage.clickSearchBtn();
        homePage.setTextToSearchFieldAndPressEnter();
        try {Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        searchResults.clickDevicesTab();
        searchResults.verifyDeviceNameMatches();
    }

    @Test
    public void scenarioTwo(){
        homePage.clickPassageBtn();
        try {Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        passagePage.clickBasketBtn();
        try {Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        basketPage.verifyIfYourBasketIsEmpty();
    }

    @Test
    public void scenarioThree(){
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
