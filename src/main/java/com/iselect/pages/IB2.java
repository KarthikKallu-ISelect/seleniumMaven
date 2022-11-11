package com.iselect.pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.iselect.utils.CustomUtils;

public class IB2 {

	WebDriver driver;
	ExtentTest testlog;
	CustomUtils cutils;
	GlobalHomePage gpage;

	public IB2(WebDriver driver, ExtentTest testlog) {
		this.driver = driver;
		this.testlog = testlog;
		cutils = new CustomUtils(driver, testlog);
		PageFactory.initElements(driver, this);
	}

	public void navigate(String url) {
		testlog.log(Status.INFO, "navigated to https://uatib2.iselect.com.au/ib2/pages/Login_prepare.action");
		driver.get(url);
	}

	By userNameLoc = By.xpath("//input[@id='loginForm_login']");
	By passwordLoc = By.xpath("//input[@id='loginForm_password']");
	By loginLoc = By.xpath("//input[@name='submit']");
	By createCustomerTab = By.xpath("//h2[text()='Create Customer']");
	By membershipTypeloc = By.xpath("//select[@id='membershipType']");
	By customerOrigin = By.xpath("//select[@id='customerOrigin']");
	By titleLoc = By.xpath("//select[@id='title']");
	By givenName = By.xpath("//input[@id='firstName']");
	By surName = By.xpath("//input[@id='surname']");
	By dob = By.xpath("//input[@id='dob']");
	By email = By.xpath("//input[@id='email']");
	By postcode = By.xpath("//input[@id='postalcodeInput']");
	By mobile = By.xpath("//input[@id='mobilePhone']");
	By createCustomerBtn = By.xpath("//input[@id='createSubmit']");
	By partnerTitle = By.xpath("//select[@id='partnerTitle']");
	By partnerName = By.xpath("//input[@id='partnerFirstName']");
	By partnerDobLoc = By.xpath("//input[@id='partnerDob']");
	By noOfDependents = By.xpath("//select[@id='numberOfDependents']");
	By dependentAges = By.xpath("//input[@id='depAge1']");
	By needAnalysisTab = By.xpath("//a[@id='needsAnalysis']");
	By otherChannel = By.xpath("//label[@for='Other-Channel']");
	By whyAreYouBuyingOrChangingHealthIns = By.xpath("//select[@name='whyBuyChange']");
	By medicareYes = By.xpath("//label[@for='hasMedicareCard-yes']");
	By aboveTier = By.xpath("//label[@for='aboveMin']");
	By belowTier = By.xpath("//label[@for='belowMin']");
	By tier1 = By.id("tier1_min_dispVal");
	By tier2 = By.id("tier2_min_dispVal");
	By tier3 = By.id("tier3_min_dispVal");
	By rebateClaimYes = By.xpath("//label[@for='rebateRequired-yes']");
	By policyTypeLoc = By.xpath("//select[@id='policyType']");
	By excessOnPolicy = By.id("excessOnPolicy");
	By extrasNotImportant = By.xpath("//table[@id='extras-preferences']//input[@value='1']");
	By showBronze = By.className("is-show-full");
	By hospitalPreferences = By.xpath("//table[@id='hospital-preferences']//input[@value='3']");
	By hospitalPreferenceImportant = By.xpath("//table[@id='hospital-preferences']//input[@value='5']");
	By bronzeImportant = By.id("bronzeMastarCollection5");
	By basicHospitalCover = By.id("basicHospitalCover5");
	By coveredByHealthFundYes = By.id("coveredByHealthFund-yes");
	By coveredByHealthFundNo = By.id("coveredByHealthFund-no");
	By partnerCoveredByHealthFundYes = By.id("partnerCoveredByHealthFund-yes");
	By partnerCoveredByHealthFundNo = By.id("partnerCoveredByHealthFund-no");
	By lhcLegislationExplained = By.id("lhcLegislationExplained");
	By partnerLhcLegislationExplained = By.id("partnerLhcLegislationExplained");
	By hospitalProductType = By.id("hospitalProductType");
	By extrasProductType = By.id("extrasProductType");
	By bothProductType = By.id("bothProductType");
	By currentHealthFund = By.id("currentHealthFund");
	By hadContinuosCoverYes = By.id("hadContinuousHealthCover-yes");
	By hadContinuosCoverNo = By.id("hadContinuousHealthCover-no");
	By partnerCurrentHealthFund = By.id("partnerCurrentHealthFund");
	By partnerHadContinuousHealthCoverYes = By.id("partnerHadContinuousHealthCover-yes");
	By partnerHadContinuousHealthCoverNo = By.id("partnerHadContinuousHealthCover-no");
	By continueBtn = By.id("continue");
	By partnerBothProductType = By.id("partnerBothProductType");
	By partnerHospitalProductType = By.id("partnerHospitalProductType");
	By partnerExtrasProductType = By.id("partnerExtrasProductType");

	public void createCustomer(String state, String postalCode, String MembershipType, String customerDob,
			String partnerDob, String tier, String policyType, String excess, String hospitalPreferenceType,
			String healthFundCovered, String PartnerhealthFundCovered, double output) {

		driver.findElement(userNameLoc).sendKeys("karthik.kallu");
		driver.findElement(passwordLoc).sendKeys("Prathyusha@123");
		driver.findElement(loginLoc).click();
		driver.findElement(createCustomerTab).click();
		Select membershiptype = new Select(driver.findElement(membershipTypeloc));
		membershiptype.selectByVisibleText(MembershipType);
		Select origin = new Select(driver.findElement(customerOrigin));
		origin.selectByVisibleText("Inbound call");
		Select title = new Select(driver.findElement(titleLoc));
		title.selectByVisibleText("Mr");
		String fname = CustomUtils.stringGenerator();
		System.out.println(fname);
		driver.findElement(givenName).sendKeys(fname);
		driver.findElement(surName).sendKeys(CustomUtils.stringGenerator());
		driver.findElement(dob).sendKeys(customerDob);
		WebElement inputField = driver.findElement(dob);
		inputField.sendKeys(Keys.TAB);
		driver.findElement(email).sendKeys("karthik.kallu@iselect.com.au");
		driver.findElement(postcode).sendKeys(postalCode);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
						"(//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']//li)[1]")))
				.click();
		if (MembershipType.equalsIgnoreCase("Single Parent Family")) {

		} else if (MembershipType.equalsIgnoreCase("Couple")) {
			new WebDriverWait(driver, Duration.ofSeconds(30))
					.until(ExpectedConditions.visibilityOfElementLocated(partnerTitle)).click();
			Select select = new Select(driver.findElement(partnerTitle));
			select.selectByVisibleText("Mrs");
			driver.findElement(partnerName).sendKeys(CustomUtils.stringGenerator());
			driver.findElement(partnerDobLoc).sendKeys(partnerDob);
			WebElement partnerdob = driver.findElement(partnerDobLoc);
			partnerdob.sendKeys(Keys.TAB);
		} else if (MembershipType.equalsIgnoreCase("Family")) {
			new WebDriverWait(driver, Duration.ofSeconds(30))
					.until(ExpectedConditions.visibilityOfElementLocated(partnerTitle)).click();
			Select select = new Select(driver.findElement(partnerTitle));
			select.selectByVisibleText("Mrs");
			driver.findElement(partnerName).sendKeys(CustomUtils.stringGenerator());
			driver.findElement(partnerDobLoc).sendKeys(partnerDob);
			WebElement partnerdob = driver.findElement(partnerDobLoc);
			partnerdob.sendKeys(Keys.TAB);
		}
		driver.findElement(mobile).sendKeys("00000000");
		driver.findElement(createCustomerBtn).click();
		new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(needAnalysisTab)).click();
		driver.findElement(otherChannel).click();
		new Select(driver.findElement(whyAreYouBuyingOrChangingHealthIns)).selectByValue("coverageCurrentFund");
		switch (MembershipType) {
		case "Family":
			driver.findElement(By.cssSelector("input#dependent-no")).click();
			break;
		case "Single Parent Family":
			driver.findElement(By.cssSelector("input#dependent-no")).click();
			break;
		}
		driver.findElement(medicareYes).click();
		if (tier.equalsIgnoreCase("1")) {
			driver.findElement(aboveTier).click();
			driver.findElement(tier1).click();
			driver.findElement(rebateClaimYes).click();

		} else if (tier.equalsIgnoreCase("2")) {
			driver.findElement(aboveTier).click();
			driver.findElement(tier2).click();
			driver.findElement(rebateClaimYes).click();

		} else if (tier.equalsIgnoreCase("3")) {
			driver.findElement(aboveTier).click();
			driver.findElement(tier3).click();
			driver.findElement(rebateClaimYes).click();

		} else {
			driver.findElement(belowTier).click();
			driver.findElement(rebateClaimYes).click();
		}

		new Select(driver.findElement(policyTypeLoc)).selectByValue(policyType);
		if (!excess.isEmpty())
			new Select(driver.findElement(excessOnPolicy)).selectByValue(excess);
		if (policyType.equalsIgnoreCase("extrasOnly")) {
			List<WebElement> extrasNotImportanteles = driver.findElements(extrasNotImportant);
			for (WebElement ele : extrasNotImportanteles) {
				ele.click();
			}
		}
		if (policyType.equalsIgnoreCase("hospitalOnly")) {
			driver.findElement(showBronze).click();
			List<WebElement> preferences = driver.findElements(hospitalPreferences);
			for (WebElement ele : preferences) {
				ele.click();
			}
			if (hospitalPreferenceType.equalsIgnoreCase("Gold")) {
				for (int i = 0; i <= 11; i++) {
					List<WebElement> gold = driver.findElements(hospitalPreferenceImportant);
					gold.get(i).click();
				}
			} else if (hospitalPreferenceType.equalsIgnoreCase("Silver")) {
				for (int i = 12; i <= 19; i++) {
					List<WebElement> silver = driver.findElements(hospitalPreferenceImportant);
					silver.get(i).click();
				}
			} else if (hospitalPreferenceType.equalsIgnoreCase("Bronze")) {
				driver.findElement(bronzeImportant).click();
			} else if (hospitalPreferenceType.equalsIgnoreCase("Basic")) {
				driver.findElement(basicHospitalCover).click();
			}
		}
		if (policyType.equalsIgnoreCase("both")) {
			driver.findElement(showBronze).click();
			List<WebElement> preferences = driver.findElements(hospitalPreferences);
			for (WebElement ele : preferences) {
				ele.click();
			}
			if (hospitalPreferenceType.equalsIgnoreCase("Gold")) {
				for (int i = 1; i <= 12; i++) {
					List<WebElement> gold = driver.findElements(hospitalPreferenceImportant);
					gold.get(i).click();
				}
			} else if (hospitalPreferenceType.equalsIgnoreCase("Silver")) {
				for (int i = 13; i <= 20; i++) {
					List<WebElement> silver = driver.findElements(hospitalPreferenceImportant);
					silver.get(i).click();
				}
			} else if (hospitalPreferenceType.equalsIgnoreCase("Bronze")) {
				driver.findElement(bronzeImportant).click();
			} else if (hospitalPreferenceType.equalsIgnoreCase("Basic")) {
				driver.findElement(basicHospitalCover).click();
			}

			List<WebElement> extrasNotImportanteles = driver.findElements(extrasNotImportant);
			for (WebElement ele : extrasNotImportanteles) {
				ele.click();
			}
		}
		switch (healthFundCovered) {
		case "healthfundyesContinouscoveryes":
			driver.findElement(coveredByHealthFundYes).click();
			new Select(driver.findElement(currentHealthFund)).selectByValue("AHMG");
			if (policyType.equalsIgnoreCase("hospitalOnly")) {
				driver.findElement(hospitalProductType).click();
				new Select(driver.findElement(By.id("currentPolicy"))).selectByValue("Other");
			}
			if (policyType.equalsIgnoreCase("extrasOnly")) {
				driver.findElement(extrasProductType).click();
				new Select(driver.findElement(By.id("extrasPolicy"))).selectByValue("Other");
			}
			if (policyType.equalsIgnoreCase("both")) {
				driver.findElement(bothProductType).click();
				// new Select(driver.findElement(By.id("extrasPolicy"))).selectByValue("Other");
				new Select(driver.findElement(By.id("currentPolicy"))).selectByValue("Other");
			}
			driver.findElement(hadContinuosCoverYes).click();
			break;
		case "healthfundyesContinouscoverno":
			driver.findElement(coveredByHealthFundYes).click();
			new Select(driver.findElement(currentHealthFund)).selectByValue("AHMG");
			if (policyType.equalsIgnoreCase("hospitalOnly")) {
				driver.findElement(hospitalProductType).click();
				new Select(driver.findElement(By.id("hospitalPolicy"))).selectByValue("Other");
			}
			if (policyType.equalsIgnoreCase("extrasOnly")) {
				driver.findElement(extrasProductType).click();
				new Select(driver.findElement(By.id("extrasPolicy"))).selectByValue("Other");
			}
			if (policyType.equalsIgnoreCase("both")) {
				driver.findElement(bothProductType).click();
				new Select(driver.findElement(By.id("currentPolicy"))).selectByValue("Other");
				// new Select(driver.findElement(By.id("extrasPolicy"))).selectByValue("Other");
			}
			driver.findElement(hadContinuosCoverNo).click();
			driver.findElement(lhcLegislationExplained).click();
			break;
		case "healthfundno":
			driver.findElement(coveredByHealthFundNo).click();
			driver.findElement(lhcLegislationExplained).click();
			break;
		}
		/*
		 * if(healthFundCovered.equalsIgnoreCase("healthfundyesContinouscoveryes")) {
		 * driver.findElement(coveredByHealthFundYes).click(); new
		 * Select(driver.findElement(currentHealthFund)).selectByValue("AHMG");
		 * if(policyType.equalsIgnoreCase("hospitalOnly")) {
		 * driver.findElement(hospitalProductType).click(); new
		 * Select(driver.findElement(By.id("currentPolicy"))).selectByValue("Other"); }
		 * if(policyType.equalsIgnoreCase("extrasOnly")) {
		 * driver.findElement(extrasProductType).click(); new
		 * Select(driver.findElement(By.id("extrasPolicy"))).selectByValue("Other"); }
		 * if(policyType.equalsIgnoreCase("both")) {
		 * driver.findElement(bothProductType).click(); //new
		 * Select(driver.findElement(By.id("extrasPolicy"))).selectByValue("Other"); new
		 * Select(driver.findElement(By.id("currentPolicy"))).selectByValue("Other"); }
		 * driver.findElement(hadContinuosCoverYes).click(); } else
		 * if(healthFundCovered.equalsIgnoreCase("healthfundyesContinouscoverno")) {
		 * driver.findElement(coveredByHealthFundYes).click(); new
		 * Select(driver.findElement(currentHealthFund)).selectByValue("AHMG");
		 * if(policyType.equalsIgnoreCase("hospitalOnly")) {
		 * driver.findElement(hospitalProductType).click(); new
		 * Select(driver.findElement(By.id("hospitalPolicy"))).selectByValue("Other"); }
		 * if(policyType.equalsIgnoreCase("extrasOnly")) {
		 * driver.findElement(extrasProductType).click(); new
		 * Select(driver.findElement(By.id("extrasPolicy"))).selectByValue("Other"); }
		 * if(policyType.equalsIgnoreCase("both")) {
		 * driver.findElement(bothProductType).click(); new
		 * Select(driver.findElement(By.id("currentPolicy"))).selectByValue("Other");
		 * //new
		 * Select(driver.findElement(By.id("extrasPolicy"))).selectByValue("Other"); }
		 * driver.findElement(hadContinuosCoverNo).click();
		 * driver.findElement(lhcLegislationExplained).click();
		 * 
		 * } else if(healthFundCovered.equalsIgnoreCase("healthfundno")) {
		 * driver.findElement(coveredByHealthFundNo).click();
		 * driver.findElement(lhcLegislationExplained).click(); }
		 * 
		 */
		/*
		 * if(PartnerhealthFundCovered.equalsIgnoreCase(
		 * "partnerhealthfundyesPartnercontinouscoveryes") &&
		 * membershipType.equalsIgnoreCase("couple") ||
		 * membershipType.equalsIgnoreCase("Family")) {
		 * driver.findElement(partnerCoveredByHealthFundYes).click(); new
		 * Select(driver.findElement(partnerCurrentHealthFund)).selectByValue("AHMG");
		 * if(policyType.equalsIgnoreCase("hospitalOnly")) {
		 * driver.findElement(partnerHospitalProductType).click(); new
		 * Select(driver.findElement(By.id("partnerHospitalPolicy"))).selectByValue(
		 * "Other"); } if(policyType.equalsIgnoreCase("extrasOnly")) {
		 * driver.findElement(partnerExtrasProductType).click(); new
		 * Select(driver.findElement(By.id("partnerExtrasPolicy"))).selectByValue(
		 * "Other"); } if(policyType.equalsIgnoreCase("both")) {
		 * driver.findElement(partnerBothProductType).click(); new
		 * Select(driver.findElement(By.id("partnerCurrentPolicy"))).selectByValue(
		 * "Other"); //new
		 * Select(driver.findElement(By.id("partnerExtrasPolicy"))).selectByValue(
		 * "Other");
		 * 
		 * } driver.findElement(partnerHadContinuousHealthCoverYes).click(); } else
		 * if(PartnerhealthFundCovered.equalsIgnoreCase(
		 * "partnerhealthfundyesPartnercontinouscoverno") &&
		 * membershipType.equalsIgnoreCase("couple") ||
		 * membershipType.equalsIgnoreCase("Family")) {
		 * driver.findElement(partnerCoveredByHealthFundYes).click(); new
		 * Select(driver.findElement(partnerCurrentHealthFund)).selectByValue("AHMG");
		 * if(policyType.equalsIgnoreCase("hospitalOnly")) {
		 * driver.findElement(partnerHospitalProductType).click(); new
		 * Select(driver.findElement(By.id("partnerHospitalPolicy"))).selectByValue(
		 * "Other"); } else if(policyType.equalsIgnoreCase("extrasOnly")) {
		 * driver.findElement(partnerExtrasProductType).click(); new
		 * Select(driver.findElement(By.id("partnerExtrasPolicy"))).selectByValue(
		 * "Other"); } else if(policyType.equalsIgnoreCase("both")) {
		 * driver.findElement(partnerBothProductType).click(); new
		 * Select(driver.findElement(By.id("partnerCurrentPolicy"))).selectByValue(
		 * "Other"); //new
		 * Select(driver.findElement(By.id("partnerExtrasPolicy"))).selectByValue(
		 * "Other");
		 * 
		 * } driver.findElement(partnerHadContinuousHealthCoverNo).click();
		 * driver.findElement(partnerLhcLegislationExplained).click(); } else
		 * if(PartnerhealthFundCovered.equalsIgnoreCase("partnerhealthfundno") &&
		 * membershipType.equalsIgnoreCase("couple") ||
		 * membershipType.equalsIgnoreCase("Family")) {
		 * driver.findElement(partnerCoveredByHealthFundNo).click();
		 * driver.findElement(partnerLhcLegislationExplained).click(); }
		 * 
		 */
		switch (PartnerhealthFundCovered) {
		case "partnerhealthfundyesPartnercontinouscoveryes":
			if (MembershipType.equalsIgnoreCase("couple") || MembershipType.equalsIgnoreCase("Family")) {
				driver.findElement(partnerCoveredByHealthFundYes).click();
				new Select(driver.findElement(partnerCurrentHealthFund)).selectByValue("AHMG");
				if (policyType.equalsIgnoreCase("hospitalOnly")) {
					driver.findElement(partnerHospitalProductType).click();
					new Select(driver.findElement(By.id("partnerHospitalPolicy"))).selectByValue("Other");
				}
				if (policyType.equalsIgnoreCase("extrasOnly")) {
					driver.findElement(partnerExtrasProductType).click();
					new Select(driver.findElement(By.id("partnerExtrasPolicy"))).selectByValue("Other");
				}
				if (policyType.equalsIgnoreCase("both")) {
					driver.findElement(partnerBothProductType).click();
					new Select(driver.findElement(By.id("partnerCurrentPolicy"))).selectByValue("Other");
					// new
					// Select(driver.findElement(By.id("partnerExtrasPolicy"))).selectByValue("Other");

				}
				driver.findElement(partnerHadContinuousHealthCoverYes).click();
			}
			break;
		case "partnerhealthfundyesPartnercontinouscoverno":
			if (MembershipType.equalsIgnoreCase("couple") || MembershipType.equalsIgnoreCase("Family")) {
				driver.findElement(partnerCoveredByHealthFundYes).click();
				new Select(driver.findElement(partnerCurrentHealthFund)).selectByValue("AHMG");
				if (policyType.equalsIgnoreCase("hospitalOnly")) {
					driver.findElement(partnerHospitalProductType).click();
					new Select(driver.findElement(By.id("partnerHospitalPolicy"))).selectByValue("Other");
				} else if (policyType.equalsIgnoreCase("extrasOnly")) {
					driver.findElement(partnerExtrasProductType).click();
					new Select(driver.findElement(By.id("partnerExtrasPolicy"))).selectByValue("Other");
				} else if (policyType.equalsIgnoreCase("both")) {
					driver.findElement(partnerBothProductType).click();
					new Select(driver.findElement(By.id("partnerCurrentPolicy"))).selectByValue("Other");
					// new
					// Select(driver.findElement(By.id("partnerExtrasPolicy"))).selectByValue("Other");

				}
				driver.findElement(partnerHadContinuousHealthCoverNo).click();
				driver.findElement(partnerLhcLegislationExplained).click();
			}
			break;
		case "partnerhealthfundno":
			if (MembershipType.equalsIgnoreCase("couple") || MembershipType.equalsIgnoreCase("Family")) {
				driver.findElement(partnerCoveredByHealthFundNo).click();
				driver.findElement(partnerLhcLegislationExplained).click();
			}
			break;
		}
		// String fundName = "Australian Unity";
		driver.findElement(continueBtn).click();
		WebElement recomm = driver.findElement(By.id("pageHeader"));
		new WebDriverWait(driver, Duration.ofSeconds(10000)).until(ExpectedConditions.visibilityOf(recomm));
		driver.findElement(By.id("directSelect")).click();
		try {
			Thread.sleep(3000);
			new CustomUtils(driver, testlog)
					.jsexecute("document.querySelector('.jquery-lightbox-button-close').click();");
		} catch (Exception e) {

		}
		new Select(driver.findElement(By.id("myForm_fundNames"))).selectByVisibleText("AU");
		driver.findElement(By.id("search")).click();
		String str = driver.findElement(By.id("results-paginator-page-count")).getText();
		String b = str.replaceAll("[^0-9]", "");
		int pageCount = Integer.parseInt(b);
		System.out.println(pageCount);
		while (pageCount > 0) {
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				double one = output;
				double One = (double) Math.round(one * 100) / 100;
				String val = "$" + One;
				double two = output - 0.01;
				double Second = (double) Math.round(two * 100) / 100;
				String secVal = "$" + Second;
				double three = output - 0.02;
				double Three = (double) Math.round(three * 100) / 100;
				String thirdVal = "$" + Three;
				double four = output + 0.01;
				double Four = (double) Math.round(four * 100) / 100;
				String fourVal = "$" + Four;
				double five = output + 0.02;
				double Five = (double) Math.round(five * 100) / 100;
				String fiveVal = "$" + Five;
				System.out.println("values :" + val + " second " + secVal + " third val " + thirdVal + " fourth val "
						+ fourVal + " fifth val " + fiveVal);
				By selector = By.xpath("//div[@id='dualprice-newprice']//span[text()='" + val + "' or text()='" + secVal
						+ "' or text()='" + thirdVal + "' or text()='" + fourVal + "' or text()='" + fiveVal + "']");
				System.out.println("locator created is :" + selector);
				WebElement ele = driver.findElement(selector);
				System.out.println("locator created is :" + ele);
				if (ele.isDisplayed()) {
					System.out.println("displayed");
					break;
				}
			} catch (Exception e) {
				try {
					driver.findElement(By.xpath("//img[@alt='Next']")).click();
				} catch (Exception e2) {

				}
			}
		}
		/*
		 * List<WebElement> vendors = driver .findElements(By.
		 * xpath("//input[@name='vendorStringList' and @type='checkbox']")); for
		 * (WebElement ele : vendors) { ele.click(); }
		 * driver.findElement(By.xpath("//input[@value='Australian Unity']")).click();
		 * driver.findElement(By.id("update-funds")).click();
		 * driver.findElement(By.id("paymentIntervalMonthly")).click(); String str =
		 * driver.findElement(By.id("results-paginator-page-count")).getText(); String b
		 * = str.replaceAll("[^0-9]", ""); int pageCount = Integer.parseInt(b);
		 * System.out.println(pageCount); for (int i=pageCount;i>=1;i--) {
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); try {
		 * double one = output; String val = "$"+one; double two = output-0.01; String
		 * secVal="$"+two; double three = output-0.02; String thirdVal = "$"+three;
		 * double four = output+0.01; String fourVal="$"+four; double five =
		 * output+0.02; String fiveVal = "$"+five;
		 * 
		 * if
		 * (driver.findElement(By.xpath("//div[@id='dualprice-newprice']//span[text()='"
		 * +val+"' or text()='"+secVal+"' or text()='"+thirdVal+"' or text()='"
		 * +fourVal+"' or text()='"+fiveVal+"']")) .isDisplayed()) {
		 * System.out.println("displayed"); } } catch (Exception e) { try {
		 * driver.findElement(By.xpath("//img[@alt='Next']")).click(); } catch(Exception
		 * e2) {
		 * 
		 * } } }
		 */

	}

}
