package com.seleniumprojectone.util;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.Logger;

public class DriverHelper {
    private static final Logger logger = LogManager.getLogger(DriverHelper.class);

    public static void setDriverPath(String driverType, String driverPath){
        logger.info("Execution after setting ChromeDriver path in System Variables");
        System.setProperty(driverType, driverPath);
    }

    public static WebDriver getDriver(){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        return driver;
    }
}
