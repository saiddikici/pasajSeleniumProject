package com.seleniumprojectone;

import com.seleniumprojectone.util.DriverHelper;
import com.seleniumprojectone.webpages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestBase {

    public static WebDriver webDriver;
    final String driverPath = "src/test/resources/chromedriver.exe";

    @BeforeSuite
    public void beforeSuite() {
        DriverHelper.setDriverPath("webdriver.chrome.driver", driverPath);
    }

    @BeforeMethod
    public void beforeMethod() {
        webDriver = DriverHelper.getDriver();
        webDriver.get("https://www.turkcell.com.tr/");
    }

    @AfterMethod
    public void afterMethod() {
        webDriver.quit();
    }

}
