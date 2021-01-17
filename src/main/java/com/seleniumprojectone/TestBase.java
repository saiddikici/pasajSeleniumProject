package com.seleniumprojectone;

import com.seleniumprojectone.util.DriverHelper;
import com.seleniumprojectone.webpages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestBase {

    public static WebDriver webDriver;
    public static HomePage homePage;
    public static BasketPage basketPage;
    public static PassageAppleMacbookPage passageAppleMacbookPage;
    public static PassagePage passagePage;
    public static SearchResults searchResults;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
        DriverHelper.setDriverPath();
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");

        webDriver = DriverHelper.getDriver();
        webDriver.get("https://www.turkcell.com.tr/");

        homePage = new HomePage(webDriver);
        basketPage = new BasketPage(webDriver);
        passagePage = new PassagePage(webDriver);
        passageAppleMacbookPage = new PassageAppleMacbookPage(webDriver);
        searchResults = new SearchResults(webDriver);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
        webDriver.quit();
    }

}
