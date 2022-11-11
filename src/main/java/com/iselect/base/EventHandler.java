package com.iselect.base;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EventHandler implements WebDriverListener {

	public void beforeFindElement(WebDriver driver, By locator) {
		
	}

	public void beforeGet(WebDriver driver, String url) {
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	public void afterGet(WebDriver driver, String url) {
		// Dimension d=new Dimension(1366,7308);
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	public void afterAnyAlertCall(Alert alert, Method method, Object[] args, Object result) {
		alert.accept();
	}

	public void afterGetTitle(WebDriver driver, String result) {

	}

	public void afterFindElement(WebDriver driver, By locator, WebElement result) {

	}

	public void beforeClose(WebDriver driver) {

	}

	public void afterClose(WebDriver driver) {

	}

}
