package com.seleniumprojectone;

import com.seleniumprojectone.webpages.*;
import org.testng.annotations.Test;

public class PasajTests extends TestBase{

    @Test
    public void scenarioOne(){
        HomePage homePage = new HomePage(webDriver);
        SearchResults searchResults = homePage.clickSearchBtn().setTextToSearchFieldAndPressEnter();
        searchResults.clickDevicesTab().verifyDeviceNameMatches();
    }

    @Test
    public void scenarioTwo(){
        HomePage homePage = new HomePage(webDriver);
        PassagePage passagePage = homePage.clickPassageBtn();
        BasketPage basketPage = passagePage.clickBasketBtn();
        basketPage.verifyIfYourBasketIsEmpty();
    }

    @Test
    public void scenarioThree(){
        HomePage homePage = new HomePage(webDriver);
        PassagePage passagePage = homePage.clickPassageBtn();
        PassageAppleMacbookPage passageAppleMacbookPage = passagePage.scrollToTheEndOfPage().clickAppleMacbookBtn();
        passageAppleMacbookPage.clickAppleMacBookProTouchBarThirteenInch().verifyDefaultPrice();
    }
}
