package com.iselect.playwright.pageObjects;

import java.util.regex.Pattern;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.Page;

public class HealthInsurancePage {

	private final Page page;
	private final ExtentTest extentlog;

	public HealthInsurancePage(Page page, ExtentTest extentlog) {
		this.page = page;
		this.extentlog = extentlog;
	}

	public void navigate(String url) {
		extentlog.log(Status.INFO, "navigated to iselect.com");
		page.navigate(url);
	}

	String yourHealthInsuranceQuestionsAnswered = "//h2[normalize-space()='Your Health Insurance questions answered']";

	public Boolean verifyYourHealthInsuranceQuestionsAnswered() {

		extentlog.log(Status.INFO, "verify our Health Insurance questions answered text");
		return page.isVisible(yourHealthInsuranceQuestionsAnswered);

	}

	String healthInsCompMadeEasy = "//h2[normalize-space()='Health insurance comparison made easy']";
	String easilyCompareText = "//h3[contains(text(),'Easily compare, select and save on health insurance')]";

	public Boolean verifyTextsAndHeadersInHealthPage() {

		extentlog.log(Status.INFO, "verify Health insurance comparison made easy text");
		Boolean statusOne = page.isVisible(healthInsCompMadeEasy);

		extentlog.log(Status.INFO, "verify Easily compare, select and save on health insurance text");
		Boolean statusTwo = page.isVisible(easilyCompareText);

		page.keyboard().down("PageDown");

		extentlog.log(Status.INFO, "click on Compare Health Insurance scroll button");
		page.click("//a[@class='sticky-header-search-scroll']");

		page.waitForSelector("//span[normalize-space()='Just for me - female']");

		extentlog.log(Status.INFO, "verify Just for me - female text");
		Boolean statusThree = page.isVisible("//span[normalize-space()='Just for me - female']");

		extentlog.log(Status.INFO, "verify How you can compare health insurance with iSelect text");
		Boolean statusFour = page
				.isVisible("//h2[normalize-space()='How you can compare health insurance with iSelect']");

		if (statusOne && statusTwo && statusThree && statusFour)
			return true;
		return false;
	}

	public Boolean getStartedButton() {
		extentlog.log(Status.INFO, "click on Get Started button");
		page.click("//a[normalize-space()='Get Started']");
		extentlog.log(Status.INFO, "verify compare health insurance text");
		return page.isVisible("//h1[normalize-space()='Compare Health Insurance']");
	}

	public Boolean checkOutRangeOfHealthFundsTextAndViewAllOurPartnersText() {
		extentlog.log(Status.INFO, "verify Check out our range of private health funds* text");
		Boolean status = page.isVisible("//h2[normalize-space()='Check out our range of private health funds*']");
		extentlog.log(Status.INFO, "click on View all of our partners button");
		page.click("text=View all of our partners");
		extentlog.log(Status.INFO,
				"verify We compare and sell a wide range of brands across insurance, utilities and personal finance. text");
		ElementHandle statusTwo = page
				.waitForSelector("//h1[contains(text(),'We compare and sell a wide range of brands across ')]");
		if (status && statusTwo.isVisible())
			return true;
		return false;
	}

	public Boolean checkHealthInsurancePremiumTextAndHowUsersRatedOurServiceText() {
		extentlog.log(Status.INFO, "check How users rated our service text displayed");
		Boolean status = page.isVisible("//h2[normalize-space()='Check out our range of private health funds*']");
		extentlog.log(Status.INFO, "check Health Insurance premiums have increased text");
		ElementHandle statusTwo = page
				.waitForSelector("//h2[normalize-space()='Health Insurance premiums have increased']");
		extentlog.log(Status.INFO, "check Health insurance explained, with Canna Campbell. text");
		Boolean statusThree = page
				.isVisible("//h2[normalize-space()='Health insurance explained, with Canna Campbell.']");
		extentlog.log(Status.INFO, "check You might be interested in... text");
		Boolean statusFour = page
				.isVisible("//h2[normalize-space()='You might be interested in...']");
		if (status && statusTwo.isVisible() && statusThree && statusFour)
			return true;
		return false;
	}

	public Boolean verifyTrustpilotSection() {

		Frame frame = page.frameByUrl(Pattern.compile(".*widget.trustpilot.com.*"));
		extentlog.log(Status.INFO, "verify trust score great");
		Boolean statusTwo = frame.isVisible("//a[@id='trust-score']");
		extentlog.log(Status.INFO, "verify trustpilot logo");
		Boolean statusOne = frame.isVisible("id=tp-widget-logo");
		if (statusOne && statusTwo)
			return true;
		return false;

	}

	public Boolean verifyLearnMoreButton() {
		extentlog.log(Status.INFO, "click on learn more link");
		page.click("//a[contains(@class,'button-hollow')][normalize-space()='Learn more']");
		extentlog.log(Status.INFO, "verify iSelect Health Rate Rise Hub  text");
		ElementHandle text = page
				.waitForSelector("//h1[contains(normalize-space(),'iSelect Health Rate Rise Hub 2021')]");
		return text.isVisible();

	}

	public Boolean verifyScheduleAcallButton() {
		extentlog.log(Status.INFO, "click on schedule a call button");
		page.click("//a[normalize-space()='Schedule a call']");
		extentlog.log(Status.INFO,
				"verify Need help with health insurance? Schedule a call with a trained consultant. text");
		ElementHandle text = page.waitForSelector(
				"//h1[text()='Need help with health insurance? Schedule a call with a trained consultant.']");
		return text.isVisible();

	}
	
	public Boolean participatingHealthFunds() {
		extentlog.log(Status.INFO, "click on participating health funds button");
		page.click("//a[normalize-space()='Participating Health Funds']");
		extentlog.log(Status.INFO, "verify participating health funds text");
		ElementHandle text = page.waitForSelector(
				"//h2[normalize-space()='Participating Health Funds']");
		return text.isVisible();

	}
	
	
	public Boolean healthInsuranceWaitingPeriodsReadMoreLink() {
		extentlog.log(Status.INFO, "click on health insurance waiting period read more link");
		page.click("//a[@href='/health-insurance/no-waiting-period/'][normalize-space()='Read more']");
		extentlog.log(Status.INFO, "verify Health Insurance Waiting Periods landing page");
		ElementHandle text = page.waitForSelector(
				"//h1[normalize-space()='Health Insurance Waiting Periods']");
		return text.isVisible();

	}
	
	

}