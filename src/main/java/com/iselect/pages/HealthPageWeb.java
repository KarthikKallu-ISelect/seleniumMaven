package com.iselect.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.iselect.utils.CustomUtils;

public class HealthPageWeb {

	WebDriver driver;
	ExtentTest testlog;
	CustomUtils cutils;
	GlobalHomePage gpage;

	public HealthPageWeb(WebDriver driver, ExtentTest testlog) {
		this.driver = driver;
		this.testlog = testlog;
		cutils = new CustomUtils(driver, testlog);
		PageFactory.initElements(driver, this);
	}

	public void navigate(String url) {
		testlog.log(Status.INFO, "navigated to https://wwwuat.iselect.com.au/health-insurance/");
		driver.get(url);
	}

	By postcode = By.name("postcode");
	By membershipSelect = By.cssSelector("div.select-input-toggle");
	By partnerDob = By.xpath("//input[@class='user-dob partner-age']");
	By disclaimer = By.id("aplDisclaimer");
	By continueBtn = By.cssSelector("input[value='Continue']");
	By adultDependentNo = By.id("sf2_healthClientSession_adultDependantfalse");
	By userDob = By.xpath("//input[@class='user-dob main-age']");
	By healthConcern = By.xpath("(//p[text()='I just want to compare options'])[2]");
	By currentlyNotCovered = By.xpath("//p[text()='Currently not covered']");
	By compareHealthInsurance = By.xpath("//a[text()='Compare Health Insurance ']");

	public void clickOnSelectDropdown() {
		driver.findElement(membershipSelect).click();

	}

	public void clickOnMembership(String val) {
		new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='" + val + "']")));
		driver.findElement(By.xpath("//span[text()='" + val + "']")).click();
	}

	public void enterPostCode(String val) {
		driver.findElement(postcode).sendKeys(val);
		new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("suggestBoxElement")));
		driver.findElement(By.id("pcId0")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	public void clickOnCurrentlyNotCovered() {
		driver.findElement(currentlyNotCovered).click();
	}

	public void clickOnHealthConcernOption() {
		driver.findElement(healthConcern).click();
	}

	public void clickOnAdultDependentNo() {
		driver.findElement(adultDependentNo).click();
	}

	public void clickOnContinueBtn() {
		driver.findElement(continueBtn).click();
	}

	public void clickOnAppDisclaimer() {
		driver.findElement(disclaimer).click();
	}

	public void enterUserDob(String dob) {
		driver.findElement(userDob).sendKeys(dob);
	}

	public void enterPartnerDob(String dob) {
		driver.findElement(partnerDob).sendKeys(dob);
	}

	public void selectRebateTier(String membership, int tier) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		switch (membership) {
		case "Single Male":
			if (tier == 1) {
				By tier1 = By.xpath("//label[@for='rebate-m-or-f-over-70-1']//p[contains(text(),'$90,000 and under')]");
				js.executeScript("arguments[0].scrollIntoView();", driver.findElement(tier1));
				driver.findElement(tier1).click();
			} else if (tier == 2)
				driver.findElement(
						By.xpath("//label[@for='rebate-m-or-f-over-70-2']//span[@class='rebate-qs-discretion']"))
						.click();
			else if (tier == 3)
				driver.findElement(
						By.xpath("//label[@for='rebate-m-or-f-over-70-3']//p[contains(text(),'$105,001 to $140,000')]"))
						.click();
			else if (tier == 4)
				driver.findElement(
						By.xpath("//label[@for='rebate-m-or-f-over-70-4']//p[contains(text(),'$140,001 and over')]"))
						.click();
			break;
		case "Single Female":
			break;
		case "Couple":
			break;
		case "Family":
			break;
		case "Single Parent Family":
			break;
		}
	}
}
