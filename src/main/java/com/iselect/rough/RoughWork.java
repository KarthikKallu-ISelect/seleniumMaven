package com.iselect.rough;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.iselect.base.BaseClass;
import com.iselect.utils.CustomUtils;

public class RoughWork extends BaseClass{

	String slf_loginEle = "//input[@name='username']";
	String slf_loginPwd = "//input[@name='pw']";
	String slf_loginBtn = "//input[@name='Login']";
	String NavigationMenuDropDown = "//button[@title='Show Navigation Menu']";
	String AccountsBtn = "//span[text()='Accounts']";
	String NewAccountBtn = "//div[@id='brandBand_1']//a[@title='New']";
	String PersonAccount = "//span[text()='Person Account']";
	String NextBtn = "//span[text()='Next']";
	String LastName = "//label[text()='Last Name']/following-sibling::div/input";
	String EmailSelectDropDown = "//span[@title='Email']";
	String EmailInput = "//label[text()='Email']/following-sibling::div/input";
	String preferredContactMethod = "(//force-record-picklist//div/input)[1]";
	String personalMobilePhone = "//input[@name='PersonHomePhone']";
	String saveEdit = "//button[@name='SaveEdit']";
	String Opp = "//span[@title='Opportunities']";
	String NewBtnOnOppPage = "//div[@aria-label='Opportunities|Opportunities|List View']//div[@title='New']";
	String GIButton = "//span[text()='General Insurance']";
	String NeedAnalysisBtn = "//span[@title='Needs Analysis']";
	String leadTypeDropDown = "//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:yourNeedId:0')]";
	String vechileInsured = "//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:yourNeedId:1')]";
	String newBtn = "//div[@aria-label='Needs Analysis|Needs Analysis|List View']//div[@title='New']";
	String state = "//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:pickval4')]";
	String carFinance = "//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:financeId:0:j_id')]";
	String useOfCar = "//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:financeId:1:j_id')]";
	String ageRest = "//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:financeId:4:j_id')]";

	@Test
	public void GeneralInsurance() {
		driver.get("https://test.salesforce.com/");
		new CustomUtils(driver, extentlog).type("karthikkallu@iselect.com.au",
				driver.findElement(By.xpath(slf_loginEle)), "test");
		// driver.findElement(By.xpath(slf_loginEle)).sendKeys("karthikkallu@iselect.com.au");
		// driver.findElement(By.xpath(slf_loginPwd)).sendKeys("Abcd@123");
		driver.findElement(By.xpath(slf_loginBtn)).click();
		List<WebElement> eles = driver.findElements(By.xpath("//button[starts-with(@title,'Close iselect test')]"));
		for (WebElement ele : eles) {
			try {
				ele.click();
			} catch (Exception e) {
				jse.executeScript("arguments[0].click();", ele);
			}
		}
		driver.findElement(By.xpath(NavigationMenuDropDown)).click();
		driver.findElement(By.xpath(AccountsBtn)).click();
		driver.findElement(By.xpath(NewAccountBtn)).click();
		driver.findElement(By.xpath(PersonAccount)).click();
		driver.findElement(By.xpath(NextBtn)).click();
		driver.findElement(By.xpath(LastName)).sendKeys("iselect test");
		driver.findElement(By.xpath(personalMobilePhone)).sendKeys("0400000000");
		driver.findElement(By.xpath(preferredContactMethod)).click();
		driver.findElement(By.xpath(EmailSelectDropDown)).click();
		driver.findElement(By.xpath(EmailInput)).sendKeys("karthiknani767@gmail.com");
		driver.findElement(By.xpath(saveEdit)).click();
		driver.findElement(By.xpath("//div[text()='Person Account']")).isDisplayed();
		try {
			driver.findElement(By.xpath(Opp)).click();
		} catch (Exception e) {
			jse.executeScript("arguments[0].click();", driver.findElement(By.xpath(Opp)));

		}
		driver.findElement(By.xpath(NewBtnOnOppPage)).click();
		try {
			driver.findElement(By.xpath(GIButton)).click();
		} catch (Exception e) {
			jse.executeScript("arguments[0].click();", driver.findElement(By.xpath(GIButton)));

		}
		driver.findElement(By.xpath(NextBtn)).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(NeedAnalysisBtn))));
		try {
			driver.findElement(By.xpath(NeedAnalysisBtn)).click();
		} catch (Exception e) {
			jse.executeScript("arguments[0].click();", driver.findElement(By.xpath(NeedAnalysisBtn)));

		}
		driver.findElement(By.xpath(newBtn)).click();

		driver.switchTo().frame(1);

		Select leadType = new Select(driver.findElement(By.xpath(leadTypeDropDown)));
		leadType.selectByValue("I have bought a new car");

		Select vechile = new Select(driver.findElement(By.xpath(vechileInsured)));
		vechile.selectByValue("No, I am just buying the car");

		Select stateSelect = new Select(driver.findElement(By.xpath(state)));
		stateSelect.selectByValue("QLD");

		driver.findElement(By.id("needAnalysisPageId:needAnalysisformId:pickval5")).sendKeys("DOB33");
		driver.findElement(By.xpath("//input[@value='Search']")).click();

		Select Lease = new Select(driver.findElement(By.xpath(carFinance)));
		Lease.selectByValue("Lease");

		Select useOfCarSelect = new Select(driver.findElement(By.xpath(useOfCar)));
		useOfCarSelect.selectByValue("Private and not driving to/from work or school");

		Select ageRestrictionSelect = new Select(driver.findElement(By.xpath(ageRest)));
		ageRestrictionSelect.selectByValue("Don't Care - Everybody");

		driver.findElement(By.name("needAnalysisPageId:needAnalysisformId:financeId:5:j_id268")).sendKeys("12,000");

		driver.findElement(By.name("needAnalysisPageId:needAnalysisformId:policyId:0:j_id395")).sendKeys("12/12/2021");

		List<WebElement> radioBtns = driver
				.findElements(By.xpath("//input[starts-with(@id,'needAnalysisPageId:needAnalysisformId:j_id373')]"));
		for (WebElement ele : radioBtns)
			ele.click();

		driver.findElement(By.id("postcodemailing")).sendKeys("QLD ");
		driver.findElement(By.xpath("//div[text()='SCOTTVILLE, 4804 QLD']")).click();
		driver.findElement(By.id("needAnalysisPageId:needAnalysisformId:unitNumberMailingId")).sendKeys("1");
		driver.findElement(By.id("needAnalysisPageId:needAnalysisformId:houseNbr1MailingId")).sendKeys("45");
		driver.findElement(By.id("needAnalysisPageId:needAnalysisformId:streetNameAndTypeId")).sendKeys("test street");
		Select streetSelect = new Select(driver
				.findElement(By.xpath("//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:j_id3')]")));
		streetSelect.selectByValue("Street");
		driver.findElement(
				By.xpath("//input[starts-with(@name,'needAnalysisPageId:needAnalysisformId:regulardriverId:0:j_id')]"))
				.sendKeys("09/09/1997");
		driver.findElement(By.xpath(
				"//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:regulardriverId')]//span[text()='Male']"))
				.click();
		driver.findElement(By.xpath(
				"//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:regulardriverId')]//span[text()='Yes']"))
				.click();
		driver.findElement(By.xpath(
				"//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:regulardriverId')]//input[@type='number']"))
				.sendKeys("2");

		Select yesSelect = new Select(driver.findElement(By.xpath(
				"//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:regulardriverId')]//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:regulardriverId:4')]")));
		yesSelect.selectByValue("Yes");

		Select claimsSelect = new Select(driver.findElement(By.xpath(
				"//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:regulardriverId')]//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:regulardriverId:5')]")));
		claimsSelect.selectByValue("None");

		Select comprehensive = new Select(driver.findElement(By.xpath(
				"//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:regulardriverId')]//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:regulardriverId:7')]")));
		comprehensive.selectByValue("Yes");

		Select comprehensiveReg = new Select(driver.findElement(By.xpath(
				"//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:regulardriverId')]//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:regulardriverId:8')]")));
		comprehensiveReg.selectByValue("5");

		Select fullLicense = new Select(driver.findElement(By.xpath(
				"//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:regulardriverId')]//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:regulardriverId:9')]")));
		fullLicense.selectByValue("Full Licence");

		Select fullTime = new Select(driver.findElement(By.xpath(
				"//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:regulardriverId')]//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:regulardriverId:10')]")));
		fullTime.selectByValue("Full Time");

		Select ncd = new Select(driver.findElement(By.xpath(
				"//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:regulardriverId')]//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:regulardriverId:11')]")));
		ncd.selectByValue("6 (None)");

		driver.findElement(By.xpath(
				"//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:youngestdriverId')]//span[text()='No']"))
				.click();

		Select obj = new Select(driver.findElement(
				By.xpath("//select[starts-with(@name,'needAnalysisPageId:needAnalysisformId:otherId:0')]")));
		obj.selectByValue("Alarm");

		driver.findElement(
				By.xpath("(//span[starts-with(@id,'needAnalysisPageId:needAnalysisformId:otherId')]//label)[2]"))
				.click();

		driver.findElement(By.xpath("(//button[text()='View Recommendation'])[2]")).click();

		driver.findElement(By.xpath("//a[text()='Next']")).click();

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@title='Recommendations']")));
		} catch (Exception e) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@title='Recommendations']")));
		}

		driver.findElement(By.cssSelector("input[value='Apply Now']")).click();

		driver.switchTo().defaultContent();

		WebElement editbtn = driver.findElement(By.xpath(
				"//button[@title='Edit Scripting has been read to customer']//span[@class='inline-edit-trigger-icon slds-button__icon slds-button__icon_hint']"));

		wait.until(ExpectedConditions.visibilityOf(editbtn));

		jse.executeScript("arguments[0].click();", editbtn);

		jse.executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//force-record-layout-row//input[@name='CustomerConsent__c']")));

		driver.findElement(By.xpath("//force-form-footer//button[@name='SaveEdit']")).click();

		WebElement ele = driver
				.findElement(By.xpath("//records-lwc-record-layout//button[@name='SBQQ__QuoteLine__c.Accept']"));
		wait.until(ExpectedConditions.visibilityOf(ele));

		jse.executeScript("arguments[0].click();", ele);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NeedAnalysisBtn)));

		try {
			driver.findElement(By.xpath("//span[@title='Products']")).click();
		} catch (Exception e) {
			jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[@title='Products']")));
		}

		driver.findElement(By.xpath("(//a[starts-with(@data-recordid,'00k')])")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@title='Product']")));
		String editRef = "document.querySelector(\"button[title='Edit Reference #']\").click()";
		jse.executeScript(editRef);

		driver.findElement(By.xpath("//span[text()='Reference #']//parent::label//following-sibling::input"))
				.sendKeys("123456");

		String anually = "document.querySelector(\"a[title='Annually']\").click()";
		jse.executeScript(anually);

		String roadsideAssist = "document.querySelector(\"a[title='Roadside Assist Virgin']\").click()";
		jse.executeScript(roadsideAssist);

		try {
			driver.findElement(By.xpath("//button[@title='Save']")).click();
		} catch (Exception e) {
			jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@title='Save']")));
		}

		if (driver.findElement(By.xpath("//span[text()='Opportunity Information']")).isDisplayed())
			try {
				driver.findElement(By.xpath("//span[text()='Mark Stage as Complete']")).click();
			} catch (Exception e) {
				jse.executeScript("arguments[0].click();",
						driver.findElement(By.xpath("//span[text()='Mark Stage as Complete']")));
			}
		Select completed = new Select(
				driver.findElement(By.xpath("//span[text()='Stage']/parent::label/parent::div//select")));
		completed.selectByValue("Completed");
		driver.findElement(By.xpath("//div[starts-with(@class,'modal-footer')]//span[text()='Save']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[@data-tab-name='Completed']")).isDisplayed());

	}

	@Test
	public void testHomeAndContents() {
		String currentUrl = null;
		driver.get("https://test.salesforce.com/");
		driver.findElement(By.xpath(slf_loginEle)).sendKeys("karthikkallu@iselect.com.au");
		driver.findElement(By.xpath(slf_loginPwd)).sendKeys("Abcd@123");
		driver.findElement(By.xpath(slf_loginBtn)).click();
		List<WebElement> eles = driver.findElements(By.xpath("//button[starts-with(@title,'Close iselect test')]"));
		for (WebElement ele : eles) {
			ele.click();
		}
		driver.findElement(By.xpath(NavigationMenuDropDown)).click();
		driver.findElement(By.xpath(AccountsBtn)).click();
		driver.findElement(By.xpath(NewAccountBtn)).click();
		driver.findElement(By.xpath(PersonAccount)).click();
		driver.findElement(By.xpath(NextBtn)).click();
		driver.findElement(By.xpath(LastName)).sendKeys("iselect test");
		driver.findElement(By.xpath(personalMobilePhone)).sendKeys("0400000000");
		driver.findElement(By.xpath(preferredContactMethod)).click();
		driver.findElement(By.xpath(EmailSelectDropDown)).click();
		driver.findElement(By.xpath(EmailInput)).sendKeys("karthiknani767@gmail.com");
		driver.findElement(By.xpath(saveEdit)).click();
		driver.findElement(By.xpath("//div[text()='Person Account']")).isDisplayed();
		driver.navigate().refresh();
		try {
			driver.findElement(By.xpath(Opp)).click();
		} catch (Exception e) {
			jse.executeScript("arguments[0].click();", driver.findElement(By.xpath(Opp)));
		}
		driver.findElement(By.xpath(NewBtnOnOppPage)).click();
		try {
			driver.findElement(By.xpath("//div[text()='Home & Contents vertical']")).click();
		} catch (Exception e) {
			jse.executeScript("arguments[0].click();",
					driver.findElement(By.xpath("//div[text()='Home & Contents vertical']")));
		}
		driver.findElement(By.xpath(NextBtn)).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(NeedAnalysisBtn))));
		if (driver.findElement(By.xpath("//span[text()='Opportunity Information']")).isDisplayed())
			currentUrl = driver.getCurrentUrl();
		try {
			driver.findElement(By.xpath(NeedAnalysisBtn)).click();
		} catch (Exception e) {
			jse.executeScript("arguments[0].click();", driver.findElement(By.xpath(NeedAnalysisBtn)));
		}
		driver.findElement(By.xpath(newBtn)).click();
		driver.switchTo().frame(1);
		String addressToType = "UNIT 3000 668 BOURKE STREET, MELBOURNE VIC 3000     ";
		WebElement address = driver.findElement(By.id("insured_address"));
		for (int i = 0; i < addressToType.length(); i++) {
			address.sendKeys(addressToType.charAt(i) + "");
			try {
				Thread.sleep(90);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		driver.findElement(By.xpath("//li[text()='UNIT 3000 668 BOURKE STREET, MELBOURNE VIC 3000']")).click();
		driver.findElement(By.xpath("//span[text()='Looking for new cover']")).click();
		driver.findElement(By.xpath("//span[text()='Home Owner']")).click();
		driver.findElement(By.xpath("//label[@for='mortgage_property_false']")).click();
		driver.findElement(By.xpath("//label[@for='occupancy_details_owner_occupied']")).click();
		driver.findElement(By.xpath("//div[@id='move_in_container']//input")).sendKeys("2012");
		driver.findElement(By.xpath("//label[@for='cover_type_home_and_contents']")).click();
		driver.findElement(By.xpath("//div[@id='policy_start_date_container']//input")).sendKeys("30/12/2021");
		driver.findElement(By.xpath("//label[@for='strata_body_corporate_false']")).click();
		driver.findElement(By.xpath("//label[@for='property_type_freestanding']")).click();
		Select concrete = new Select(driver.findElement(By.xpath("//div[@id='wall_construction_container']//select")));
		concrete.selectByValue("concrete_cement");
		Select cement = new Select(driver.findElement(By.xpath("//div[@id='roof_construction_container']//select")));
		cement.selectByValue("cement_tiles");
		driver.findElement(
				By.xpath("//div[@id='year_of_construction_container']//label[@for='year_of_construction_after_2011']"))
				.click();
		driver.findElement(By.xpath("//div[@id='home_built_container']//input")).sendKeys("2013");
		Select hour = new Select(driver.findElement(By.xpath("//div[@id='security_features_container']//select")));
		hour.selectByValue("24_hour_monitored");
		driver.findElement(By.xpath("//label[@for='business_activity_false']")).click();
		driver.findElement(By.xpath("//div[@id='building_sum_insured_container']//input")).sendKeys("200,000.00");
		driver.findElement(By.xpath("//div[@id='contents_sum_insured_container']//input")).sendKeys("40,000.00");
		driver.findElement(By.xpath("//label[@for='specified_contents_false']")).click();
		driver.findElement(By.xpath("//label[@for='awayhome_specified_contents_false']")).click();

		driver.findElement(By.xpath("//label[text()='policy_holder_dob']/parent::div//input")).sendKeys("03/11/1990");
		driver.findElement(By.xpath("//label[@for='residents_policyholder_false']")).click();
		driver.findElement(By.xpath("//label[@for='retired_home_false']")).click();
		driver.findElement(By.xpath("//label[@for='previous_incidents_false']")).click();
		driver.findElement(By.xpath("//button[@title='View recommendations']")).click();

		Boolean value = driver.findElement(By.xpath("//h1[@title='Home & Contents']")).isDisplayed();
		System.out.println("is title displayed? " + value);

		driver.findElement(By.xpath("(//button[@title='Apply'])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Policy Number']/following-sibling::input")).sendKeys("123456");
		driver.findElement(By.xpath("//label[text()='Amount']/following-sibling::input")).sendKeys("450");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Assert.assertTrue(driver.findElement(By.xpath(
				"//table//tbody//tr//td//b[contains(text(),'Thank you for purchasing insurance through iSelect')]"))
				.isDisplayed());

		try {
			driver.get(currentUrl);
		} catch (Exception e) {

		}
		if (driver.findElement(By.xpath("//span[text()='Opportunity Information']")).isDisplayed())
			try {
				driver.findElement(By.xpath("//span[text()='Mark Stage as Complete']")).click();
			} catch (Exception e) {
				jse.executeScript("arguments[0].click();",
						driver.findElement(By.xpath("//span[text()='Mark Stage as Complete']")));
			}
		Select completed = new Select(
				driver.findElement(By.xpath("//span[text()='Stage']/parent::label/parent::div//select")));
		completed.selectByValue("Completed");
		driver.findElement(By.xpath("//div[starts-with(@class,'modal-footer')]//span[text()='Save']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[@data-tab-name='Completed']")).isDisplayed());

	}

	@Test
	public void compareHomePage() {

		driver.get("https://wwwuat.iselect.com.au/");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section#megamenu")));

		try {
			Shutterbug.shootPage(driver, Capture.FULL).equalsWithDiff(
					"C:\\Users\\karthikreddy.kallu\\Desktop\\screenshots\\expectedImage.png",
					"C:\\Users\\karthikreddy.kallu\\Desktop\\screenshots\\actualImage.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Shutterbug.shootPage(driver, Capture.FULL, true).save("C:\\Users\\karthikreddy.kallu\\Desktop\\screenshots\\");
		try {
			Shutterbug.shootPage(driver, Capture.FULL, true).equalsWithDiff("", "");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save("C:\\Users\\karthikreddy.kallu\\Downloads\\");
		try {
			Shutterbug.shootPage(driver).equals("C:\\Users\\karthikreddy.kallu\\Downloads\\ActualImage.png", 0.1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void compareHealthPage() {

		driver.get("https://wwwuat.iselect.com.au/health-insurance/");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postcode-select")));

		try {
			Shutterbug.shootElement(driver, driver.findElement(By.id("postcode-select"))).equalsWithDiff(
					"C:\\Users\\karthikreddy.kallu\\Desktop\\Health\\expected.png",
					"C:\\Users\\karthikreddy.kallu\\Desktop\\Health\\actualImage.png");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public String getImageName() {
		try (DirectoryStream<Path> stream = Files
				.newDirectoryStream(Paths.get("C:\\Users\\karthikreddy.kallu\\Desktop\\screenshots\\actual\\"))) {
			for (Path file : stream) {
				return "C:\\Users\\karthikreddy.kallu\\Desktop\\screenshots\\actual\\" + file.getFileName() + "";
			}
		} catch (IOException | DirectoryIteratorException ex) {
			System.err.println(ex);
		}
		return null;

	}

	@Test
	public void verifyLinksInHealthPage() {

		driver.get("https://wwwuat.iselect.com.au");
		WebElement element = driver.findElement(By.cssSelector("section#megamenu"));
		Assert.assertTrue(element.isDisplayed());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		File source = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		String ActualPath = "C:\\Users\\karthikreddy.kallu\\Desktop\\Health\\actual.png";
		String ExpectedPath = "C:\\Users\\karthikreddy.kallu\\Desktop\\Health\\";

		try {
			FileHandler.copy(source, new File(ActualPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Shutterbug.shootElement(driver, element).equalsWithDiff(ActualPath, ExpectedPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void clickOnhealthbtn() {
		driver.get("https://wwwuat.iselect.com.au");

	}

	@Test
	public void getDisabledDays() {
		driver.get("https://wwwuat.iselect.com.au/moving-house/your-moving-details");
		driver.findElement(By.name("addresField")).sendKeys("1 ALVIS RD, CROYDON PARK SA 5008");
		driver.findElement(By.xpath("//span[text()='1 ALVIS RD, CROYDON PARK SA 5008']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary date-picker-btn']")).click();

		List<WebElement> ele = driver.findElements(By.xpath("//tbody//tr//td//button[@disabled='disabled']//span"));
		for (WebElement e : ele) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			e.getAttribute("disabled");
			if (!driver.findElement(By.xpath("//strong[contains(text(),'2022')]")).isDisplayed()) {
				driver.findElement(By.xpath("//button[contains(@class,'right')]")).click();
			} else if (!driver.findElement(By.xpath("//strong[contains(text(),'2023')]")).isDisplayed()) {
				driver.close();
			} else if (driver.findElement(By.xpath("//strong[contains(text(),'2022')]")).isDisplayed()) {
				e.getAttribute("disabled");
			}

		}
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(dataProvider = "getData")
	public void readData(String fname,String lname)
	{
		System.out.println(fname+" "+lname);
	}
    @DataProvider(name="getData")
	public Iterator<Object[]> getData()
	{
		ArrayList<Object[]> testdata = null;
		try {
			testdata = com.iselect.utils.DataProvider.getExcelData("firstNames.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testdata.iterator();
		
	}
}
