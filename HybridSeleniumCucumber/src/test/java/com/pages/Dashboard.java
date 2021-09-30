package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.library;

public class Dashboard extends library{
	public Dashboard(WebDriver driver) {
		
    this.driver=driver;
    PageFactory.initElements(driver, this);


}

}
