package com.iselect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.iselect.utils.CustomUtils;

public class HealthPage {

	WebDriver driver;
	ExtentTest testlog;
	CustomUtils cutils;
	GlobalHomePage gpage;

	public HealthPage(WebDriver driver, ExtentTest testlog) {
		this.driver = driver;
		this.testlog = testlog;
		cutils = new CustomUtils(driver, testlog);
		PageFactory.initElements(driver, this);
	}

}
