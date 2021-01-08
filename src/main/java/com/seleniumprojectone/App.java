package com.seleniumprojectone;

import com.seleniumprojectone.cases.FirstCase;
import com.seleniumprojectone.cases.SecondCase;
import com.seleniumprojectone.cases.ThirdCase;
import com.seleniumprojectone.util.DriverHelper;
import org.openqa.selenium.WebDriver;


public class App 
{
    public static void main(String[] args){
        DriverHelper driverHelper = new DriverHelper();
        WebDriver webDriver;

        //First Case
        webDriver = driverHelper.getDriver();
        FirstCase firstCase = new FirstCase(webDriver);
        firstCase.execute();
        webDriver.quit();


        //Second Case
        webDriver = driverHelper.getDriver();
        SecondCase secondCase = new SecondCase(webDriver);
        secondCase.execute();
        webDriver.quit();

        //Third Case
        webDriver = driverHelper.getDriver();
        ThirdCase thirdCase = new ThirdCase(webDriver);
        thirdCase.execute();
        webDriver.quit();
    }

}
