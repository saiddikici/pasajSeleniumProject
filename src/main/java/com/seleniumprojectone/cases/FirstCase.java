package com.seleniumprojectone.cases;

import com.seleniumprojectone.webpages.HomePage;
import com.seleniumprojectone.webpages.SearchResults;
import org.openqa.selenium.WebDriver;

public class FirstCase {
    WebDriver webDriver;
    HomePage homePage;
    SearchResults searchResults;

    public FirstCase(WebDriver webDriver) {
        this.webDriver = webDriver;
        homePage = new HomePage(webDriver);
        searchResults = new SearchResults(webDriver);
    }
    public void execute(){
        webDriver.get("https://www.turkcell.com.tr/");
        homePage.clickSearchBtn();
        homePage.setTextToSearchFieldAndPressEnter();
        try {Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        searchResults.clickDevicesTab();
        searchResults.verifyDeviceNameMatches();
    }

}
