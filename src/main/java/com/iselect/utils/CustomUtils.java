package com.iselect.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CustomUtils {

	WebDriver driver;
	ExtentTest test;
	int actionSpeedInSeconds = 3;

	public CustomUtils(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public void type(String keysToSend, WebElement element, String message) {
		test.log(Status.INFO, message);
		for (char c : keysToSend.toCharArray()) {
			try {
				element.sendKeys(Character.toString(c));
			} catch (Exception e) {
				test.log(Status.WARNING, e.getLocalizedMessage());
				System.out.println("sendKeys failed due to : " + e);
			}
			try {
				Thread.sleep(70);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void waitForElementVisible(WebElement element, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		try {
			System.out.println(element);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (WebDriverException e) {
			// do nothing, don't want to log this
		}

		if (element == null) {
			Assert.assertFalse(true, "WebElement not found within " + sec + " seconds. Failing test!" + " of element: "
					+ element + "\nCurrent page: " + driver.getCurrentUrl());
		}
	}

	public void waitForElementToBeClickable(WebElement element, int sec) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		try {
			System.out.println(element);
			wait.until(ExpectedConditions.elementToBeClickable(element));

		} catch (WebDriverException e) {
			// do nothing, don't want to log this
		}

		// if element wasn't found -> fail test
		if (element == null) {
			Assert.assertFalse(true, "WebElement not found within " + sec + " seconds. Failing test!" + " of element: "
					+ element + "\nCurrent page: " + driver.getCurrentUrl());
		}

	}

	public void refreshPage() {

		String currentURL = getCurrentURL();
		driver.navigate().to(currentURL);
	}

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public void click(WebElement element, String message) {
		try {
			Thread.sleep(actionSpeedInSeconds);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			test.log(Status.INFO, message);
			element.click();
		} catch (Exception e) {
			test.log(Status.WARNING, e.getLocalizedMessage());
			System.out.println("click failed due to : " + e);
		}
	}

	public void moveToElement(WebElement element, String message) {
		try {
			test.log(Status.INFO, message);
			new Actions(driver).moveToElement(element).perform();
		} catch (Exception e) {
			test.log(Status.WARNING, e.getLocalizedMessage());
			System.out.println("mouse hover failed due to : " + e);
		}
	}

	public void doubleClick(WebElement element, String message) {
		try {
			test.log(Status.INFO, message);
			new Actions(driver).doubleClick(element);
		} catch (Exception e) {
			test.log(Status.WARNING, e.getLocalizedMessage());
			System.out.println("double click failed due to : " + e);
		}
	}

	public String randonStringGenerator() {

		int length = 5;
		boolean useLetters = true;
		boolean useNumbers = false;
		String generatedString = "iSelect" + RandomStringUtils.random(length, useLetters, useNumbers);
		return generatedString;
	}
	
	public static String stringGenerator() {

		int length = 5;
		boolean useLetters = true;
		boolean useNumbers = false;
		String generatedString = "iSelect" + RandomStringUtils.random(length, useLetters, useNumbers);
		return generatedString;
	}

	public String takeScreenshot(WebDriver driver) throws IOException {
		// UUID uuid = UUID.randomUUID();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator
				+ "TestProof_Screenshot_" + getDateAndTime() + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);

		return dest;
	}

	public static String getDateAndTime() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E_yyyy-MM-dd_hh_mm_ss_a_zzz");
		return ft.format(dNow).toString();
	}

	public WebDriver getChildWindow() {
		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {
			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				return driver.switchTo().window(child_window);
			}
		}
		return driver;
	}
	
	
	public  void jsclick(WebElement element)
	{
		 JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("arguments[0].click();", element);
	}
	
	public  void jsexecute(String script)
	{
		 JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript(script);
	}
	
	

}
