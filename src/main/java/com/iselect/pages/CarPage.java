package com.iselect.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.iselect.utils.CustomUtils;
import com.iselect.utils.ScrollUtil;

public class CarPage {

	WebDriver driver;
	ExtentTest testlog;
	CustomUtils cutils;
	GlobalHomePage gpage;

	public CarPage(WebDriver driver, ExtentTest testlog) {
		this.driver = driver;
		this.testlog = testlog;
		cutils = new CustomUtils(driver, testlog);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='menu-link sub-menu-link'][normalize-space()='Financial Services Guide']")
	WebElement fsg;

	@FindBy(xpath = "//h1")
	WebElement header;

	public String verifyCarInsfinancialServicesGuide() {
		fsg.click();
		new CustomUtils(driver, testlog).getChildWindow();
		return header.getText();
	}

	@FindBy(xpath = "//a[normalize-space()='Participating insurers']")
	WebElement participatingInsurers;
	@FindBy(xpath = "//li[contains(text(),'Auto & General Insurance Company Limited (AFSL 285')]")
	WebElement AutoAndGI;

	public String verifyParticipatingInsurersLink() {
		participatingInsurers.click();
		return AutoAndGI.getText();
	}

	@FindBy(xpath = "//a[normalize-space()='Become Our Partner']")
	WebElement becomeOurPartner;

	public String verifyBecomeOurPartnerLink() {
		becomeOurPartner.click();
		return header.getText();
	}

	@FindBy(xpath = "//h2[contains(text(),'Partner Awards')]")
	WebElement partnerAwards;
	@FindBy(xpath = "//a[@href='/partner_awards/']")
	WebElement carPartnerOfYear;

	public Boolean verifyPartnerAwardsLink() {
		new CustomUtils(driver,testlog).waitForElementVisible(carPartnerOfYear,30);
		//carPartnerOfYear.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.querySelector(\"a[href='/partner_awards/']\").click();");
		return partnerAwards.isDisplayed();
	}
	
	@FindBy(xpath = "//p[contains(text(),'Unfortunately there is no \"best\" car insurance, as')]")
	WebElement textver;
	public Boolean collapseButtons()
	{
		 List<WebElement> eles = driver.findElements(By.xpath("//h4[@class='faq-panel-title']"));
		for(WebElement ele : eles)
		{
			ele.click();
		}
		new CustomUtils(driver,testlog).waitForElementVisible(textver,30);
		return textver.isDisplayed();
	}
	
	@FindBy(xpath="//h2[normalize-space()='Your car insurance questions, answered']")
	WebElement yourCarInsuranceQuestionsAnswered;
	public Boolean yourCarInsuranceQuestionsAnsweredTxt()
	{
		return yourCarInsuranceQuestionsAnswered.isDisplayed();
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='You might be interested in...']")
	WebElement youMightBeInterestedInTxt;
	public Boolean youMightBeInterestedInTxt()
	{
		return youMightBeInterestedInTxt.isDisplayed();
	}
	
	@FindBy(xpath="//a[@title='Read more about Types of Car Insurance ']//span")
	WebElement readMoreAboutTypesOfCarInsurance;
	
	public String verifyReadMoreAboutTypesOfCarInsurance()
	{
		readMoreAboutTypesOfCarInsurance.click();
		return header.getText();
	}
	@FindBy(xpath="//a[@title='Read more about Saving Money on Car Insurance']//span")
	WebElement readMoreAboutSavingMoneyOnCarInsurance;
	public String verifyReadMoreAboutSavingMoneyOnCarInsurance()
	{
		readMoreAboutSavingMoneyOnCarInsurance.click();
		return header.getText();
	}
	
	@FindBy(xpath="//a[@title='Read more about Tips for First Time Drivers']//span")
	WebElement readMoreAboutTipsForFirstTimeDrivers;
	public String verifyReadMoreAboutTipsForFirstTimeDrivers()
	{
		readMoreAboutTipsForFirstTimeDrivers.click();
		return header.getText();
	}
	
	

	@FindBy(xpath="//a[@title='Read more about Do I need car insurance?']//span")
	WebElement readMoreAboutDoIneedCarIns;
	public String verifyReadMoreAboutDoINeedCarInsurance()
	{
		readMoreAboutDoIneedCarIns.click();
		return header.getText();
	}
	
	

	@FindBy(xpath="//a[@title='Read more about Comprehensive Car Insurance  ']//span")
	WebElement readMoreAboutComprehensiveCarIns;
	public String verifyReadMoreAboutComprehensiveCarInsurance()
	{
		readMoreAboutComprehensiveCarIns.click();
		return header.getText();
	}
	
	
	@FindBy(xpath="//h2[text()='Learn more about the optional extras offered by some of our providers']")
	WebElement learnMoreAboutOptionalExtrasOffered;
	public Boolean verifylearnMoreAboutOptionalExtrasOfferedText()
	{
		return learnMoreAboutOptionalExtrasOffered.isDisplayed();
	}
	
	@FindBy(xpath="//a[@class='sticky-header-search-scroll']")
	WebElement compareCarInsScroll;
	@FindBy(xpath="//h2[text()='Easily compare car insurance quotes*']")
	WebElement easilyCompareCarInsQuotes;
	public Boolean verifyCompareCarInsuranceScrollButton()
	{
		ScrollUtil.Scroll(driver,driver.findElement(By.xpath("//h3[text()='Freedom to nominate your choice of repairer']")));
		compareCarInsScroll.click();
		return easilyCompareCarInsQuotes.isDisplayed();
	}
	
	
	@FindBy(xpath="//h2[text()='Average car insurance premiums in Australia']")
	WebElement averageCarInsTxt;
	public Boolean verifyAverageCarInsuranceTxt()
	{
		return averageCarInsTxt.isDisplayed();
	}
	
	
	@FindBy(xpath="//h2[text()='What is car insurance?']")
	WebElement whatIsCarInsurance;
	public Boolean verifyWhatIsCarInsuranceTxt()
	{
		return whatIsCarInsurance.isDisplayed();
	}
	
	@FindBy(xpath="//h2[text()='What does car insurance cover?']")
	WebElement whatDoesCarInsuranceCover;
	public Boolean verifyWhatDoesCarInsuranceCover()
	{
		return whatDoesCarInsuranceCover.isDisplayed();
	}
	
	@FindBy(xpath="//h1[contains(text(),'Compare')]")
	WebElement CompareHeader;
	public String verifyCompareCarInsuranceheader()
	{
		return CompareHeader.getText();
	}
	
	
	@FindBy(xpath="//h2[text()='Car insurance, simplified']")
	WebElement CompareCarInsTxt;
	public String verifyCarInsuranceSimplifiedTxt()
	{
		return CompareCarInsTxt.getText();
	}
	
	
	@FindBy(xpath="//h3[text()='Easily compare, select and save on car insurance policies']")
	WebElement easilyCompareSelectSaveTxt;
	public String verifyEasilyCompareSelectSaveTxt()
	{
		return easilyCompareSelectSaveTxt.getText();
	}
	
	
	@FindBy(xpath="//h2[contains(text(),'How you can compare car insurance quotes with iSel')]")
	WebElement compareCarInsuranceQuotesWithIselect;
	public String verifyCompareCarInsuranceQuotesWithIselectTxt()
	{
		return compareCarInsuranceQuotesWithIselect.getText();
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Get Started']")
	WebElement getStartedBtn;
	public Boolean getStartedBtn()
	{
	 getStartedBtn.click();
	 return driver.findElement(By.xpath("//h2[normalize-space()='Easily compare car insurance quotes*']")).isDisplayed();
	}
	
	@FindBy(xpath="//a[contains(text(),'See our partners')]")
	WebElement seeOurPartnersTxt;
	public String seeOursPartnersBtn()
	{
		seeOurPartnersTxt.click();
	 return header.getText();
	}
	
	
	@FindBy(xpath="//h2[text()='How users rated our service']")
	WebElement howUsersRatedOurService;
	
	@FindBy(xpath="//h2[text()='Car insurance explained, with Canna Campbell.']")
	WebElement carInsuranceExplained;
	
	public Boolean howUsersRatedOurServiceTxt()
	{
	  if(howUsersRatedOurService.isDisplayed() && carInsuranceExplained.isDisplayed())
		  return true;
	  return false;
	}
	
	
	@FindBy(xpath="//a[contains(@href,'comprehensive-insurance') and text()='Read more']")
	WebElement comprehensiveCarInsReadMore;
	@FindBy(xpath="//a[contains(@href,'third-party-property') and text()='Read more']")
	WebElement thirdPartyPropertyDamageReadMore;
	@FindBy(xpath="//a[contains(@href,'ctp-insurance') and text()='Read more']")
	WebElement ctpInsuranceReadMore;
	@FindBy(xpath="//a[contains(@href,'third-party-fire') and text()='Read more']")
	WebElement thirdPartyFireReadMore;
	
	public String verifyComprehensiveCarInsReadMore()
	{
		comprehensiveCarInsReadMore.click();
		return header.getText();
	}
	public String verifyThirdPartyPropertyDamageReadMore()
	{
		thirdPartyPropertyDamageReadMore.click();
		return header.getText();
	}
	
	public String verifyCtpInsuranceReadMore()
	{
		ctpInsuranceReadMore.click();
		return header.getText();
	}
	public String verifyThirdPartyFireReadMore()
	{
		thirdPartyFireReadMore.click();
		return header.getText();
	}
}
