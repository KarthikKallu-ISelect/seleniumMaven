package com.iselect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;

public class HomeAndContentsYourDetails {

     WebDriver driver;
	ExtentTest testlog;

	public HomeAndContentsYourDetails(WebDriver driver, ExtentTest testlog) {
		this.driver = driver;
		this.testlog = testlog;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	WebElement header;

	@FindBy(name = "addressLookup")
	WebElement addressLookup;

	@FindBy(xpath = "//a[@title='3 CARSON PLACE, MELBOURNE VIC 3000']")
	WebElement addressClick;

	@FindBy(xpath = "(//address-question//button[text()=' Ok '])[1]")
	WebElement okBtn;

	@FindBy(xpath = "(//input[@id='question$move_in']//following::button[text()=' Ok '])[1]")
	WebElement okBtnAtMoveInYear;

	@FindBy(xpath = "(//span[text()=' Active 24 hour Back to Base Monitored Alarm ']//following::button[text()=' Ok '])[1]")
	WebElement okBtnAtSecurityFeature;

	@FindBy(xpath = "(//input[@id='question$policy_start_date']/following::button)[1]")
	WebElement okBtnAtPolicyStartDate;

	@FindBy(xpath = "//span[text()=' Looking for new cover ']")
	WebElement lookingForNewCover;

	@FindBy(xpath = "//span[text()=' Home Owner ']")
	WebElement homeOwner;

	@FindBy(xpath = "(//button[@id='question$mortgage_property$option$']//span[text()=' No '])[2]")
	WebElement mortgageNo;

	@FindBy(xpath = "//span[text()=' Owner Occupied ']")
	WebElement ownerOccupied;

	@FindBy(xpath = "(//input[@id='question$move_in'])[1]")
	WebElement moveInYear;

	@FindBy(xpath = "(//span[text()=' Home and Contents '])[2]")
	WebElement HandCButton;

	@FindBy(xpath = "//input[@id='question$policy_start_date']")
	WebElement policyStartDate;

	@FindBy(xpath = "//button[@id='question$strata_body_corporate$option$']//span[text()=' Yes ']")
	WebElement questionstrata_body_corporateoptionYes;

	@FindBy(xpath = "(//span[text()=' Freestanding House '])[2]")
	WebElement freeStandingHouseOption;

	@FindBy(xpath = "(//span[text()=' Concrete/Cement '])")
	WebElement concreteOrCement;

	@FindBy(xpath = "(//span[text()=' Cement Tiles '])")
	WebElement cementTiles;

	@FindBy(xpath = "//button[@id='question$floor_construction$option$']//span[text()=' Concrete ']")
	WebElement concrete;

	@FindBy(xpath = "//button[@id='question$above_ground$option$']//span[text()=' No ']")
	WebElement aboveGroundFloorNo;

	@FindBy(xpath = "//span[text()=' 2000 - 2010 ']")
	WebElement yearBuiltIn;

	@FindBy(xpath = "//span[text()=' Active 24 hour Back to Base Monitored Alarm ']")
	WebElement activeAlarm;

	@FindBy(xpath = "//button[@id='question$business_activity$option$' and @uib-btn-radio=\"'false'\"]")
	WebElement businessConductedNo;

	@FindBy(xpath = "(//input[@id='question$building_sum_insured'])[2]")
	WebElement totalCostToRebuildHome;

	@FindBy(xpath = "//input[@id='question$contents_sum_insured']")
	WebElement contentSumInsured;

	@FindBy(xpath = "(//input[@id='question$contents_sum_insured']//following::button[text()=' Ok '])[1]")
	WebElement okButtonAfterContentSumInsured;

	@FindBy(xpath = "(//input[@id='question$building_sum_insured']//following::button[text()=' Ok '])[2]")
	WebElement okButtonAfterTotalCostToRebuildHome;

	@FindBy(xpath = "//button[@id='question$specified_contents$option$' and  @uib-btn-radio=\"'false'\"]")
	WebElement extraCoverForContentsNo;

	@FindBy(xpath = "//button[@id='question$awayhome_specified_contents$option$' and  @uib-btn-radio=\"'false'\"]")
	WebElement extraCoverForOptionalItemsNo;

	@FindBy(xpath = "//input[@id='question$policy_holder_dob']")
	WebElement policyHolderDob;

	@FindBy(xpath = "(//input[@id='question$policy_holder_dob']//following::button[text()='Ok'])[1]")
	WebElement OkBtnAfterPolicyHolderDob;

	@FindBy(xpath = "//button[@id='question$residents_policyholder$option$' and  @uib-btn-radio=\"'false'\"]")
	WebElement residentsOlderThanPolicyHolder;

	@FindBy(xpath = "//button[@id='question$retired_home$option$' and  @uib-btn-radio=\"'false'\"]")
	WebElement anyOneInTheHomeRetiredNo;

	@FindBy(xpath = "//button[@id='question$previous_incidents$option$' and  @uib-btn-radio=\"'false'\"]")
	WebElement pastFiveYearsAnyTheftNo;

	@FindBy(xpath = "//input[@id='checkUnderstand']")
	WebElement checkUnderstand;

	@FindBy(xpath = "//button[text()='VIEW RESULTS']")
	WebElement viewResultsBtn;

	@FindBy(name = "userFirstName")
	WebElement userFirstName;

	@FindBy(name = "userLastName")
	WebElement userLastName;

	@FindBy(name = "userMobileInputId")
	WebElement userMobileInputId;

	@FindBy(name = "userEmail")
	WebElement userEmail;

	@FindBy(id = "capture_btn")
	WebElement submit;

}
