package com.iselect.tests;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.iselect.utils.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlRedirectsTest {

	WebDriver driver;
	
	@Test(dataProvider = "getActualAndExpectedUrls")
	public void verifyRedirectedUrl(String actualUrl,String expUrl)
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(actualUrl);
		Assert.assertEquals(driver.getCurrentUrl(), actualUrl);
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
	

	@org.testng.annotations.DataProvider(name="getActualAndExpectedUrls")
	public Iterator<Object[]> getTestData() throws FileNotFoundException {
		ArrayList<Object[]> data = DataProvider.getLinks("data.xlsx","data");
		return data.iterator();
	}
	
}
