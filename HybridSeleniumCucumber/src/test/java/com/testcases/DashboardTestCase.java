package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.baseclasses.library;
import com.pages.Dashboard;
import com.reusablefunctions.SeleniumUtility;

public class DashboardTestCase extends library{
	@BeforeTest
    public void stratUp() {
		
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
       
    }
    @Test
    public void login() {
        LoginPage lpage=new LoginPage(driver);
        lpage.login("Admin", "admin123");
       
    }
    @Test
    public void clickdb() {
    	Dashboard db=new Dashboard(driver);
    	db.click();
    }
    @AfterClass
    public void close() throws IOException {
        SeleniumUtility sUti = new SeleniumUtility(driver);
        sUti.to_take_screenshot("src\\test\\resources\\screenshots\\orangeHRMLogin.png");
       
        quit();
       
    }
}
