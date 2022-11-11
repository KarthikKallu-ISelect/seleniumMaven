package com.iselect.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.iselect.utils.CustomUtils;

public class BlogPage {

	WebDriver driver;
	ExtentTest testlog;
	CustomUtils cutils;
	GlobalHomePage gpage;

	public BlogPage(WebDriver driver, ExtentTest testlog) {
		this.driver = driver;
		this.testlog = testlog;
		cutils = new CustomUtils(driver, testlog);
		PageFactory.initElements(driver, this);
	}

	public String verifyBlogTitle() {

		testlog.log(Status.INFO, "verify blog title :" + driver.getTitle());
		return driver.getTitle();
	}

	@FindBy(xpath = "//div[@class='container']//h3")
	WebElement headerVerification;

	public String verifyHeaderText() {
		testlog.log(Status.INFO,
				"verify blog header :" + "Find the advice and inspiration you need to get life right.");
		return headerVerification.getText();
	}

	@FindBy(xpath = "//article[@class='post-feature-article-tile']//a[text()='The Psychology of Saving']")
	WebElement sycologyOfSaving;

	@FindBy(xpath = "//h1[contains(text(),'Born to save: how your genes influence your saving')]")
	WebElement bornToSave;

	public Boolean verifyPsychologyOfSavingLinkText() {
		testlog.log(Status.INFO, "verify The Psychology of Saving link text");
		sycologyOfSaving.click();
		return bornToSave.isDisplayed();
	}

	@FindBy(xpath = "//article[@class='post-feature-article-tile']//a[contains(text(),'How to avoid under-insuring your home')]")
	WebElement underInsuringYourHome;

	@FindBy(xpath = "//h1[text()='How to avoid under-insuring your home']")
	WebElement underInsuringYourHomePageHeader;

	public Boolean verifyunderInsuringYourHomeLinkText() {
		testlog.log(Status.INFO, "click on \"How to avoid under-insuring your home\" link text");
		underInsuringYourHome.click();
		return underInsuringYourHomePageHeader.isDisplayed();
	}

	@FindBy(xpath = "//article[@class='post-feature-article-tile']//a[contains(text(),'Private health insurance premiums to rise by 3.95%')]")
	WebElement privateHealthInsPremiums;
	@FindBy(xpath = "//h1[contains(text(),'Private health insurance premiums to rise by 3.95%')]")
	WebElement privateHealthInsPremiumsHeader;

	public Boolean verifyPrivateHealthInsPremiumsLinkText() {
		testlog.log(Status.INFO, "click on Private health insurance premiums to rise by 3.95% link text");
		privateHealthInsPremiums.click();
		return privateHealthInsPremiumsHeader.isDisplayed();
	}

	@FindBy(xpath = "//article[@class='post-feature-article-tile']//a[contains(text(),'Private health insurance premiums predicted to ris')]")
	WebElement privateHealthInsPremiumsPredictedToRise;

	@FindBy(xpath = "//h1[contains(text(),'Private health insurance premiums predicted to ris')]")
	WebElement privateHealthInsPremiumsPredictedToRiseHeader;

	public Boolean verifyprivateHealthInsPremiumsPredictedToRiseLinkText() {
		testlog.log(Status.INFO, "click on Private health insurance premiums to rise by 3.9% link text");
		privateHealthInsPremiumsPredictedToRise.click();
		return privateHealthInsPremiumsPredictedToRiseHeader.isDisplayed();
	}

	@FindBy(xpath = "//h2[normalize-space()='Discover Life Topics']")
	WebElement discoverLifeTopicsText;

	public Boolean verifyDiscoverLifeTopicsText() {
		testlog.log(Status.INFO, "verify Discover Life Topics text");
		return discoverLifeTopicsText.isDisplayed();
	}

	@FindBy(xpath = "//span[normalize-space()='Starting Out']")
	WebElement startingOutLinkText;
	@FindBy(xpath = "//h1[normalize-space()='Starting Out']")
	WebElement startingOutPageHeader;

	public Boolean verifyStartingOutLinkText() {
		testlog.log(Status.INFO, "click Starting Out Link text");
		startingOutLinkText.click();
		return startingOutPageHeader.isDisplayed();
	}

	@FindBy(xpath = "//span[normalize-space()='Settling Down']")
	WebElement SettlingDownLinkText;
	@FindBy(xpath = "//h1[normalize-space()='Settling Down']")
	WebElement SettlingDownHeader;

	public Boolean verifySettlingDownLinkText() {
		testlog.log(Status.INFO, "click Settling Down LinkText");
		SettlingDownLinkText.click();
		return SettlingDownHeader.isDisplayed();
	}

	@FindBy(xpath = "//span[normalize-space()='Embracing Retirement']")
	WebElement EmbracingRetirement;

	@FindBy(xpath = "//h1[normalize-space()='Embracing Retirement']")
	WebElement EmbracingRetirementHeader;

	public Boolean verifyEmbracingRetirementLinkText() {
		testlog.log(Status.INFO, "click Embracing Retirement LinkText");
		EmbracingRetirement.click();
		return EmbracingRetirementHeader.isDisplayed();
	}

	@FindBy(xpath = "//span[normalize-space()='Understanding Insurance']")
	WebElement UnderstandingInsuranceBtn;
	@FindBy(xpath = "//h1[normalize-space()='Understanding Insurance']")
	WebElement UnderstandingInsurancetxt;

	public Boolean verifyUnderstandingInsuranceLinkText() {
		testlog.log(Status.INFO, "click Understanding Insurance LinkText");
		UnderstandingInsuranceBtn.click();
		return UnderstandingInsurancetxt.isDisplayed();
	}

	@FindBy(xpath = "//span[normalize-space()='Organising Utilities']")
	WebElement OrganisingUtilitiesBtn;
	@FindBy(xpath = "//h1[normalize-space()='Organising Utilities']")
	WebElement OrganisingUtilitiesTxt;
	
	public Boolean verifyOrganisingUtilitiesLinkText() {
		testlog.log(Status.INFO, "click Organising Utilities LinkText");
		OrganisingUtilitiesBtn.click();
		return OrganisingUtilitiesTxt.isDisplayed();
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Sorting Finances']")
	WebElement SortingFinancesBtn;
	@FindBy(xpath = "//h1[normalize-space()='Sorting Finances']")
	WebElement SortingFinancesTxt;
	public Boolean verifySortingFinancesLinkText() {
		testlog.log(Status.INFO, "click Sorting Finances LinkText");
		SortingFinancesBtn.click();
		return SortingFinancesTxt.isDisplayed();
	}
	
	
	@FindBy(xpath = "//h2[normalize-space()='See what else is new']")
	WebElement SeeWhatElseIsNew;
	public Boolean verifySeeWhatElseIsNewText() {
		testlog.log(Status.INFO, "verify text \"see what else is new\" ");
		return SeeWhatElseIsNew.isDisplayed();
	}
	
    @FindBy(xpath = "//a[contains(text(),'Key Findings From APRA’s June Quarter Health Insur')]")
    WebElement KeyFindings;
    @FindBy(xpath = "//h1[contains(text(),'Key Findings From APRA’s June Quarter Health Insur')]")
    WebElement KeyFindingsHeader;
    public Boolean verifyKeyFindingsLinkText() {
		testlog.log(Status.INFO, "verify text \"Key Findings From APRA’s June Quarter Health Insur\" ");
		 KeyFindings.click();
		 return KeyFindingsHeader.isDisplayed();
	}
    
    @FindBy(xpath="//a[@class='view-more']")
    WebElement viewMoreBtn;
    @FindBy(xpath = "//article[@class='post-article-tile loaded-article']//a[text()='How to avoid under-insuring your home']")
    WebElement underInsureTxt;
    public Boolean viewMoreButton() {
		testlog.log(Status.INFO, "click on view more button ");
		 viewMoreBtn.click();
		 return underInsureTxt.isDisplayed();
	}
    
    
    @FindBy(xpath="//a[@title='iSelect on Facebook']")
    WebElement fblink;
    public String fbButton() {
		 cutils.click(fblink, "click on facebook button ");
		 cutils.getChildWindow();
		 return driver.getTitle();
	}
    
    @FindBy(xpath="//a[@title='iSelect on Twitter']")
    WebElement twitterlink;
    public String twitterButton() {
		 cutils.click(twitterlink, "click on twitter button ");
		 cutils.getChildWindow();
		 return driver.findElement(By.xpath("//span[text()='iSelect']")).getText();
	}
    
    @FindBy(xpath="//a[@title='iSelect on YouTube']")
    WebElement youtubelink;
    public String youtubeButton() {
		 cutils.click(youtubelink, "click on youtube button ");
		 cutils.getChildWindow();
		 return driver.findElement(By.xpath("//span[text()='iSelect']")).getText();
	}
    
    @FindBy(xpath="//a[@title='iSelect on LinkedIn']")
    WebElement linkedInlink;
    public Boolean linkedInButton() {
		 cutils.click(linkedInlink, "click on linkedin button ");
		 cutils.getChildWindow();
		 return driver.findElement(By.cssSelector("button#join-form-submit")).isDisplayed();
	}
    
    @FindBy(xpath="//h2[normalize-space()='Get on the list']")
    WebElement getOnTheList;
    public Boolean getOnTheListText() {
		 return getOnTheList.isDisplayed();
	}
    
    @FindBy(id="star5")
    WebElement star;
    
    @FindBy(name="feedback")
    WebElement feedbacktext;
    
    @FindBy(xpath="//h4[text()='Generic feedback']")
    WebElement genericFeedback;
    
    @FindBy(linkText = "Feedback")
    WebElement feedbackBtn;
    
    @FindBy(xpath="//button[text()='Submit']")
    WebElement submitBtn;
    public void testFeedBackFunctionality() {
    	cutils.waitForElementVisible(feedbackBtn,30);
    	feedbackBtn.click();
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.switchTo().frame(4);
		cutils.waitForElementVisible(genericFeedback,30);
		genericFeedback.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		star.click();
		Select feedback=new Select(driver.findElement(By.name("select_your_feedback")));
		feedback.selectByVisibleText("Ease of use");
		feedbacktext.sendKeys("nice website");
		submitBtn.click();
	}
}
