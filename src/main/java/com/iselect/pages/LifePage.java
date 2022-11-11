package com.iselect.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.iselect.utils.CustomUtils;
import com.iselect.utils.ScrollUtil;

public class LifePage {

	WebDriver driver;
	ExtentTest testlog;
	CustomUtils cutils;

	public LifePage(WebDriver driver, ExtentTest testlog) {
		this.driver = driver;
		this.testlog = testlog;
		cutils = new CustomUtils(driver, testlog);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[normalize-space()='Easily compare life insurance quotes']")
	WebElement h1;

	public Boolean verifyEasilyCompareLifeInsuranceText() {
		return h1.isDisplayed();
	}

	@FindBy(xpath = "//h2[contains(text(),'Save time and effort by comparing life insurance w')]")
	WebElement h2;

	public Boolean verifySaveTimeAndEffortHeaderText() {
		return h2.isDisplayed();
	}

	@FindBy(xpath = "//a[@class='start-select-link trackable-link']")
	WebElement startComparingBtn;
	@FindBy(xpath = "//h1[@class='quote-form__title']")
	WebElement formTitle;

	public String verifyStartComparingBtn() {
		startComparingBtn.click();
		return formTitle.getText();
	}

	@FindBy(xpath = "//div[contains(@class,'get-more-info')]//a[contains(@class,'trackable-link')][normalize-space()='Start comparing']")
	WebElement startComparingBtnAtBottomOfPage;

	public String verifyStartComparingBtnAtPageBottom() {
		startComparingBtnAtBottomOfPage.click();
		return formTitle.getText();
	}

	@FindBy(xpath = "//div[contains(text(),'Compare life insurance quotes from leading life insurers in Australia quickly and easily')]")
	WebElement CompareLifeInsuranceQuotesText;

	public String verifyCompareLifeInsuranceQuotesText() {
		return CompareLifeInsuranceQuotesText.getText();
	}

	@FindBy(xpath = "//h2[contains(text(),'Compare from Lifebroker’s range of leading life in')]")
	WebElement compareFromLifeBroker;
	public String verifyCompareFromLifeBrokerText() {
		return compareFromLifeBroker.getText();
	}
	
	
	@FindBy(xpath = "//h2[normalize-space()='What is life insurance?']")
	WebElement whatIsLifeInsurance;
	public String verifyWhatIsLifeInsuranceText() {
		return whatIsLifeInsurance.getText();
	}
	
	
	@FindBy(xpath = "//h2[normalize-space()='Easily compare with iSelect & Lifebroker']")
	WebElement easilyCompareWithIselectAndLifeBroker;
	public String verifyEasilyCompareWithIselectAndLifeBrokerText() {
		return easilyCompareWithIselectAndLifeBroker.getText();
	}
	
	
	@FindBy(xpath="//a[@class='sticky-header-search-scroll']")
	WebElement compareLifeInsScrollBtn;
	public Boolean verifyCompareLifeInsScrollBtn() {
		ScrollUtil.Scroll(driver,startComparingBtnAtBottomOfPage);
		compareLifeInsScrollBtn.click();
		return startComparingBtn.isDisplayed();
	}
	
	
	@FindBy(xpath="//h2[text()='Other types of life insurance ' and @class='desktop-only']")
	WebElement OtherTypesOfLifeInsurance;
	public String verifyOtherTypesOfLifeInsuranceText() {
		return OtherTypesOfLifeInsurance.getText();
	}
	
	@FindBy(xpath="//h2[normalize-space()='Your life insurance questions answered']")
	WebElement yourLifeInsuranceQuestionsAnswered;
	public String verifyYourLifeInsuranceQuestionsAnsweredText()
	{
		return yourLifeInsuranceQuestionsAnswered.getText();
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='You might be interested in...']")
	WebElement youMightBeInterestedIn;
	public String verifyYouMightBeInterestedInText()
	{
		return youMightBeInterestedIn.getText();
	}
	
	@FindBy(xpath="//a[text()='View all partners']")
	WebElement viewAllPartnersBtn;
	@FindBy(xpath="//h1")
	WebElement header;
	public String verifyViewAllPartnersBtn()
	{
		viewAllPartnersBtn.click();
		return header.getText();
	}
	
	@FindBy(xpath="//a[@href='https://www.iselect.com.au/life/trauma-insurance/'][normalize-space()='Read more']")
	WebElement traumaReadMore;
	public String verifyTraumaInsuranceReadMore()
	{
		traumaReadMore.click();
		return header.getText();
	}
	
	@FindBy(xpath="//a[@href='https://www.iselect.com.au/life/income-protection-insurance/'][normalize-space()='Read more']")
	WebElement incomeProtReadMore;

	public String verifyIncomeProtectionReadMore()
	{
		incomeProtReadMore.click();
		return header.getText();
	}
	
	@FindBy(xpath="//a[@href='https://www.iselect.com.au/life/tpd-insurance/'][normalize-space()='Read more']")
	WebElement tpdReadMore;
	public String verifyTPDReadMoreLink()
	{
		tpdReadMore.click();
		return header.getText();
	}
	
	
	@FindBy(xpath="//a[@title='Read more about What is Life Insurance?']//span[text()='Read more']")
	WebElement whatIsLifeInsReadMore;
	public String verifyWhatIsLifeInsReadMoreLink()
	{
		whatIsLifeInsReadMore.click();
		return header.getText();
	}
	
	@FindBy(xpath="//a[@title=\"Read more about What's trauma insurance\"]//span[text()='Read more']")
	WebElement whatIsTraumaInsReadMore;
	public String verifyWhatIsTraumaInsReadMoreLink()
	{
		whatIsTraumaInsReadMore.click();
		return header.getText();
	}
	
	
	@FindBy(xpath="//a[@title='Read more about The need to know on TPD']//span[text()='Read more']")
	WebElement readMoreAboutTPD;
	public String verifyReadMoreLinkOfTPD()
	{
		readMoreAboutTPD.click();
		return header.getText();
	}
	
	
	@FindBy(xpath="//a[@title=\"Read more about Worrying about getting old? You really shouldn't\"]//span[text()='Read more']")
	WebElement readMoreAboutGettingOlder;
	public String verifyReadMoreLinkOfWorryingAboutGettingOlder()
	{
		readMoreAboutGettingOlder.click();
		return header.getText();
	}
	
	@FindBy(xpath="//a[@title='Read more about Key person insurance']//span[text()='Read more']")
	WebElement keyPersonInsReadMore;
	public String verifyReadMoreLinkOfKeyPersonIns()
	{
		keyPersonInsReadMore.click();
		return header.getText();
	}
	
	public Boolean collapseButtons()
	{
		 List<WebElement> eles = driver.findElements(By.xpath("//h4[@class='faq-panel-title']"));
		for(WebElement ele : eles)
		{
			ele.click();
		}
		return driver.findElement(By.xpath("//p[contains(text(),'According to the Australian Tax Office (ATO), you ')]")).isDisplayed();
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Financial Services Guide']")
	WebElement financialServicesGuide;
	public String verifyLifeInsfinancialServicesGuide()
	{
		financialServicesGuide.click();
	    new CustomUtils(driver,testlog).getChildWindow();
	    return header.getText();
	}
}
