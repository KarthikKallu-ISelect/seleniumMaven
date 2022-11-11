package com.iselect.pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.iselect.utils.CustomUtils;
import com.iselect.utils.ScrollUtil;

public class GlobalHomePage {

	WebDriver driver;
	ExtentTest testlog;
	CustomUtils cutils;

	public GlobalHomePage(WebDriver driver, ExtentTest testlog) {
		this.driver = driver;
		this.testlog = testlog;
		cutils = new CustomUtils(driver, testlog);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Read more about LHC Loading']//span[text()='Read more']")
	WebElement LHCLoadingTileReadMore;

	@FindBy(xpath = "//a[normalize-space()='Compare Business Insurance']")
	WebElement compareBusinessInsurance;

	@FindBy(xpath = "//a[normalize-space()='Public Liability insurance in Queensland']")
	WebElement publicLiabilityInsuranceQLD;

	@FindBy(xpath = "//a[normalize-space()='Public Liability insurance in South Australia']")
	WebElement publicLiabilityInsuranceSA;

	@FindBy(xpath = "//a[normalize-space()='Public Liability insurance in New South Wales']")
	WebElement publicLiabilityInsuranceNSW;

	@FindBy(xpath = "//a[normalize-space()='Public Liability insurance in Western Australia']")
	WebElement publicLiabilityInsuranceWA;

	@FindBy(xpath = "//a[normalize-space()='Personal Accident Insurance']")
	WebElement PersonalAccidentInsurance;

	@FindBy(xpath = "//a[normalize-space()='Cyber Liability Insurance']")
	WebElement cyberLiabilityInsuranceSA;

	@FindBy(xpath = "//a[normalize-space()='Professional Indemnity Insurance']")
	WebElement ProfessionalIndemnityInsurance;

	@FindBy(xpath = "//a[normalize-space()='Public Liability Insurance']")
	WebElement publicLiabilityInsurance;

	@FindBy(xpath = "//a[normalize-space()='Insurance For Tradies']")
	WebElement InsuranceForTradies;

	@FindBy(xpath = "//a[normalize-space()='Compare Travel Insurance']")
	WebElement compareTravelInsurance;

	@FindBy(xpath = "//a[normalize-space()='Finding the best travel insurance']")
	WebElement findingbesttravelinsurance;

	@FindBy(xpath = "//a[normalize-space()='Annual Travel Insurance']")
	WebElement annualTravelInsurance;

	@FindBy(xpath = "//a[normalize-space()='International Travel Insurance']")
	WebElement internationalTravelInsurance;

	@FindBy(xpath = "//a[normalize-space()='Domestic Travel Insurance']")
	WebElement domesticTravelInsurance;

	@FindBy(xpath = "//a[normalize-space()='Cruise Travel Insurance']")
	WebElement cruiseTravelInsurance;

	@FindBy(xpath = "//a[normalize-space()='Compare Pet Insurance']")
	WebElement comparePetInsurance;

	@FindBy(xpath = "//a[normalize-space()='What is Pet Insurance?']")
	WebElement whatIsPetInsurance;

	@FindBy(xpath = "//a[normalize-space()='The cost of owning a pet']")
	WebElement costOfOwingAPet;

	@FindBy(xpath = "//a[normalize-space()='Get the right vet for your pet']")
	WebElement getTheRightVetForPet;

	@FindBy(xpath = "//a[normalize-space()='Reviewing Pet Insurance']")
	WebElement reviewingPetIns;

	@FindBy(xpath = "//a[normalize-space()='Cat Insurance']")
	WebElement catInsurance;

	@FindBy(xpath = "//a[normalize-space()='Dog Insurance']")
	WebElement dogInsurance;

	@FindBy(xpath = "//a[normalize-space()='Compare Overseas Visitors Cover']")
	WebElement compareOverseasVisitorCover;

	@FindBy(xpath = "//a[normalize-space()='Choosing the right cover']")
	WebElement choosingRightCover;

	@FindBy(xpath = "//a[normalize-space()='Visa requirements']")
	WebElement visaReq;

	@FindBy(xpath = "//a[normalize-space()='Benefits of having OVC']")
	WebElement OVCBenefits;

	@FindBy(xpath = "//a[normalize-space()='Policy details']")
	WebElement policydetails;

	@FindBy(xpath = "//a[normalize-space()='How to purchase OVC']")
	WebElement howToPurchaseOVC;

	@FindBy(xpath = "//label[text()='Compare Options']/parent::div/parent::div//a[text()='Overseas Visitors Cover']")
	WebElement overseasVisitorCoverInCompareOptions;

	@FindBy(xpath = "//a[normalize-space()='Overseas Student Health Cover']")
	WebElement OverseasStudentHealthCover;

	@FindBy(xpath = "//a[normalize-space()='Australian Bridging Visa explained']")
	WebElement ausisBridgingVisa;

	@FindBy(xpath = "//a[normalize-space()='Permanent Residency explained']")
	WebElement permanentResidencyExplained;

	@FindBy(xpath = "//a[normalize-space()='Reciprocal Health Care Agreements']")
	WebElement reciprocalHealthCareAgreements;

	@FindBy(xpath = "//a[normalize-space()='411 Exchange Visa']")
	WebElement ExchangeVisa411;

	@FindBy(xpath = "//a[normalize-space()='417 Working Holiday Visa']")
	WebElement WorkingHolidayVisa417;

	@FindBy(xpath = "//a[normalize-space()='416 Special Program Visa']")
	WebElement specialProgramVisa416;

	@FindBy(xpath = "//a[normalize-space()='405 Investor Retirement Visa']")
	WebElement InvestorRetirementVisa405;

	@FindBy(xpath = "//a[normalize-space()='Switching electricity providers']")
	WebElement switchingElecProviders;

	@FindBy(xpath = "//a[normalize-space()='Save electricity']")
	WebElement saveElec;

	@FindBy(xpath = "//a[normalize-space()='Electricity providers']")
	WebElement elecProviders;

	@FindBy(xpath = "//a[normalize-space()='Australian energy quotes']")
	WebElement ausisEnergyQuotes;

	@FindBy(xpath = "//a[normalize-space()='Solar energy']")
	WebElement solarEnergy;

	@FindBy(xpath = "//a[normalize-space()='Wind energy']")
	WebElement windEnergy;

	@FindBy(xpath = "//a[normalize-space()='Hydroelectricity']")
	WebElement hydroelec;

	@FindBy(xpath = "//a[normalize-space()='Energy Comparison']")
	WebElement energyComp;

	@FindBy(xpath = "//a[normalize-space()='Energy Comparison SA']")
	WebElement energyCompSA;

	@FindBy(xpath = "//a[normalize-space()='Energy Comparison QLD']")
	WebElement energyCompQLD;

	@FindBy(xpath = "//a[normalize-space()='Energy Comparison NSW']")
	WebElement energyCompNSW;

	@FindBy(xpath = "//a[normalize-space()='Energy Comparison VIC']")
	WebElement energyComparisonVIC;

	@FindBy(xpath = "//a[normalize-space()='Easy ways to reduce your electricity bill']")
	WebElement easyWaysToReduceElecBill;

	@FindBy(xpath = "//a[normalize-space()='Find a cheaper energy plan']")
	WebElement findCheapEnergyPlan;

	@FindBy(xpath = "//a[normalize-space()='Find the best energy plan']")
	WebElement findbestEnergyPlan;

	@FindBy(xpath = "//a[normalize-space()='Energy saving tips']")
	WebElement energySavingTips;

	@FindBy(xpath = "//a[normalize-space()='Renewable Energy']")
	WebElement renewableEnergy;

	@FindBy(xpath = "//a[normalize-space()='Energy Comparison ACT']")
	WebElement energyComparisonACT;

	@FindBy(xpath = "//a[text()='View Energy Fact Sheets']")
	WebElement viewEnergyFactSheets;

	@FindBy(xpath = "//a[@title='Applicable for NSW, ACT, SA & SE Qld. Energy plans only']")
	WebElement viewbasicPlanInfo;

	@FindBy(xpath = "//a[normalize-space()='Benefits of solar energy']")
	WebElement benefitsOfSolarEnergy;

	@FindBy(xpath = "//a[normalize-space()='Compare Electricity & Gas']")
	WebElement compareElecAndGas;

	@FindBy(xpath = "//a[normalize-space()='How to handle a high electricity bill']")
	WebElement howToHandleHighElecBill;

	@FindBy(xpath = "//a[normalize-space()='How do energy discounts work?']")
	WebElement howDoEnergyDiscWork;

	@FindBy(xpath = "//a[normalize-space()='Waiting periods']")
	WebElement waitingperiods;

	@FindBy(xpath = "//a[text()='Comprehensive vs Third Party']")
	WebElement ComprehensivevsThirdParty;

	@FindBy(xpath = "//a[text()='Compulsory Third Party (CTP)']")
	WebElement compulsoryThirdParty;

	@FindBy(xpath = "//a[text()='Seniors Car Insurance']")
	WebElement seniorsCarInsurance;

	@FindBy(xpath = "//a[text()='Comprehensive Car Insurance']")
	WebElement ComprehensiveCarInsurance;

	@FindBy(xpath = "//a[text()='Car Insurance SA']")
	WebElement CarInsuranceSA;

	@FindBy(xpath = "//a[text()='Car Insurance QLD']")
	WebElement CarInsuranceQLD;

	@FindBy(xpath = "//a[text()='Car Insurance NSW']")
	WebElement NSWCarInsurance;

	@FindBy(xpath = "//a[text()='Car Insurance Victoria']")
	WebElement VicCarInsurance;

	@FindBy(xpath = "//a[text()='Tips for first time drivers']")
	WebElement Tipsforfirsttimedrivers;

	@FindBy(xpath = "//a[text()='Tips for buying Car Insurance']")
	WebElement tipsForBuyingcarIns;

	@FindBy(xpath = "//a[text()='Making a claim after an accident']")
	WebElement Makingclaimafteraccident;

	@FindBy(xpath = "//a[text()='Car Insurance glossary']")
	WebElement CarInsuranceglossary;

	@FindBy(xpath = "//a[text()='Agreed vs market value car insurance']")
	WebElement Agreedvsmarketvaluecarinsurance;

	@FindBy(xpath = "//a[text()='Finding the best car insurance']")
	WebElement Findingthebestcarinsurance;

	@FindBy(xpath = "//a[text()='Find Home & Contents']")
	WebElement findHomeAndContentsBtn;

	@FindBy(xpath = "//a[text()='What is Home and Contents Insurance']")
	WebElement whatIsHomeAndContentsBtn;

	@FindBy(xpath = "//a[text()='Insurance for renters']")
	WebElement insuranceForRentersBtn;

	@FindBy(xpath = "//a[text()='Home Owner’s guide to Insurance']")
	WebElement homeOwnersGuideToInsurance;

	@FindBy(xpath = "//a[text()='Contents insurance']")
	WebElement Contentsinsurance;

	@FindBy(xpath = "//a[text()='Landlord insurance']")
	WebElement Landlordinsurance;

	@FindBy(xpath = "//a[text()='Claiming home and contents insurance']")
	WebElement ClaimingHomeAndContentsInsurance;

	@FindBy(xpath = "//a[text()='Make your next house move quick']")
	WebElement Makeyournexthousemovequick;

	@FindBy(xpath = "//a[text()='Moving in with your partner']")
	WebElement MovingInWithYourPartner;

	@FindBy(xpath = "//a[text()='Home and Contents FAQs']")
	WebElement HomeAndContentsFAQs;

	@FindBy(xpath = "//a[text()='Do I need Car Insurance?']")
	WebElement DoIneedCarInsurance;

	@FindBy(xpath = "//a[text()='Car Insurance Tasmania']")
	WebElement TasmaniaCarInsurance;

	@FindBy(xpath = "//a[text()='Car Insurance ACT']")
	WebElement ActCarInsurance;

	@FindBy(xpath = "//a[text()='Compare Car Insurance']")
	WebElement compareCarinsuranceBtn;

	@FindBy(xpath = "(//div[@id='globalnav']//a[text()='I am moving'])[1]")
	WebElement movingHouseInCar;

	@FindBy(xpath = "(//div[@id='globalnav']//a[text()='I am moving'])[2]")
	WebElement movingHouseInHomeAndContents;

	@FindBy(xpath = "//a[text()='Types of Car Insurance']")
	WebElement typesOfCarInsurance;

	@FindBy(xpath = "//a[text()='Switching Car Insurance']")
	WebElement switchingCarInsurance;

	@FindBy(xpath = "//a[text()='Saving on Car Insurance']")
	WebElement savingOnCarInsurance;

	@FindBy(xpath = "//a[text()='Comprehensive Explained']")
	WebElement ComprehensiveExplained;

	@FindBy(xpath = "//a[@title='Read more about Health Funds ']//span[text()='Read more']")
	WebElement healthFundsReadMore;

	// test
	@FindBy(xpath = "//a[@title='Read more about Finding Suitable Health Insurance ']//span[text()='Read more']")
	WebElement findingSuitableHealthInsReadMore;

	@FindBy(xpath = "//a[@title='Read more about Private Hospital Cover Tiers']//span[text()='Read more']")
	WebElement privateHospitalReadMore;

	@FindBy(xpath = "//a[@title='Read more about Ambulance Cover']//span[text()='Read more']")
	WebElement AmbulanceLoadingTileReadMore;

	@FindBy(xpath = "(//span[text()='Health Insurance'])[2]")
	WebElement healthInsButtonInHealth;

	@FindBy(xpath = "//span[text()='INDUSTRY INSIGHTS']")
	WebElement industryInsights;

	@FindBy(xpath = "//h1")
	WebElement header;

	@FindBy(xpath = "//h2")
	WebElement headerTwo;

	@FindBy(xpath = "//a[@href='/customer-scheduler/' and text()='Schedule a call']")
	WebElement scheduleACallBtnInHeath;

	@FindBy(xpath = "//a[text()='Business Loans']/parent::li//div//a[text()='Schedule a call']")
	WebElement scheduleACallBtnInBusinessLoans;

	@FindBy(xpath = "//a[contains(@href,'chattel-mortgage')]")
	WebElement ChattelMortgage;

	@FindBy(xpath = "//a[text()='Equipment Finance']")
	WebElement equipmentFinance;

	@FindBy(xpath = "//a[contains(text(),'Business Overdraft')]")
	WebElement BusinessOverdraft;

	@FindBy(xpath = "//a[@href='/life/income-protection-insurance/' and text()='Compare Income Protection']")
	WebElement compareIncomeProt;

	@FindBy(xpath = "//a[text()='Best Income Protection Cover']")
	WebElement bestIncomeProtCover;

	@FindBy(xpath = "//a[text()='Is Income Protection Tax Deductible?']")
	WebElement isIncomeProtTaxDeductable;

	@FindBy(xpath = "//a[text()='Protection Income Through Superannuation']")
	WebElement protIncomeThroughSuperAnnuation;

	@FindBy(xpath = "//a[text()='What is Income Protection?']")
	WebElement whatIsIncomeProt;

	@FindBy(xpath = "//a[text()='Income vs Mortgage Protection']")
	WebElement incomeVsMortgageProt;

	@FindBy(xpath = "//a[text()='MLC Income Protection']")
	WebElement MLCincomeProt;

	@FindBy(xpath = "//a[text()='TAL Income Protection']")
	WebElement TALincomeProt;

	@FindBy(xpath = "//a[text()='CommInsure Income Protection']")
	WebElement commInsureincomeProt;

	@FindBy(xpath = "//a[text()='Unsecured Business Loans']")
	WebElement UnsecuredBusinessLoans;

	@FindBy(xpath = "//a[contains(text(),'Secured Business Loans')]")
	WebElement securedBusinessLoans;

	@FindBy(xpath = "//a[contains(@href,'lendi') and text()='Schedule a call']")
	WebElement scheduleACallBtnInHomeLoans;

	@FindBy(xpath = "//a[text()='Home loan calculator']")
	WebElement homeLoanCalc;

	@FindBy(xpath = "//a[text()='Stamp duty calculator']")
	WebElement stampDutyCalc;

	@FindBy(xpath = "//a[text()='Borrowing power calculator']")
	WebElement BorrowingPowerCalc;

	@FindBy(xpath = "//a[text()='Extra repayments calculator']")
	WebElement extraRepCalc;

	@FindBy(xpath = "//a[text()='All home loan calculators']")
	WebElement allHomeLoansCalc;

	@FindBy(xpath = "//a[text()='Interest only home loans']")
	WebElement interestOnlyHomeLoans;

	@FindBy(xpath = "//a[text()='Fixed rate home loans']")
	WebElement fixedRateHomeLoan;

	@FindBy(xpath = "//a[text()='Variable rate home loans']")
	WebElement varRateHomeLoans;

	@FindBy(xpath = "//a[text()='Refinance home loans']")
	WebElement refHomeLoans;

	@FindBy(xpath = "//a[text()='Stamp duty']")
	WebElement stampDuty;

	@FindBy(xpath = "//a[text()='Fixed vs variable interest']")
	WebElement Fixedvsvariableinterest;

	@FindBy(xpath = "//a[text()='Lenders mortgage insurance']")
	WebElement Lendersmortgageinsurance;

	@FindBy(xpath = "//a[text()='Property investment']")
	WebElement Propertyinvestment;

	@FindBy(xpath = "//a[text()='First home buyers']")
	WebElement Firsthomebuyers;

	@FindBy(xpath = "//a[text()='How much can I borrow?']")
	WebElement HowmuchcanIborrow;

	@FindBy(xpath = "//a[text()='Should I use a mortgage broker?']")
	WebElement ShouldIusemortgagebroker;

	@FindBy(xpath = "//a[text()='Home loan application checklist']")
	WebElement Homeloanapplicationchecklist;

	@FindBy(xpath = "//a[text()='10 tips for financially savvy renovators']")
	WebElement tentipsforfinanciallysavvyrenovators;

	@FindBy(xpath = "//a[text()='10 mortgage repayment tips']")
	WebElement tenmortgagerepaymenttips;

	@FindBy(xpath = "//a[text()='Debt consolidation by refinancing']")
	WebElement Debtconsolidationbyrefinancing;

	@FindBy(xpath = "//a[text()='How interest rates affect your home loan']")
	WebElement Howinterestratesaffecthomeloan;

	@FindBy(css = "a[href='/business-loans/']")
	WebElement compareBusinessLoansBtn;

	@FindBy(xpath = "//h1[text()='Need help with health insurance? Schedule a call with a trained consultant.']")
	WebElement needHelpWithHealthInsurance;

	@FindBy(xpath = "//a[text()='Medicare Levy Surcharge']")
	WebElement medicareLevySurcharge;

	@FindBy(xpath = "//a[text()='Lifetime Health Cover Loading']")
	WebElement lifetimeHealthCoverLoading;

	@FindBy(xpath = "//a[text()='Tax Implications']")
	WebElement taxImplications;

	@FindBy(xpath = "//a[text()='Australian Government rebate']")
	WebElement ausisGovtRebate;

	@FindBy(xpath = "//a[text()='Ambulance Cover']")
	WebElement ambulanceCover;

	@FindBy(xpath = "//a[text()='Hospital Waiting Periods']")
	WebElement hospitalWaitingPeriod;

	@FindBy(xpath = "//a[text()='Switching Health Insurance']")
	WebElement switchingHealthInsurance;

	@FindBy(xpath = "//a[text()='Hospital Cover']")
	WebElement hospitalCover;

	@FindBy(xpath = "//a[text()='Extras Cover']")
	WebElement extrasCover;

	@FindBy(xpath = "//a[text()='Singles Cover']")
	WebElement singlesCover;

	@FindBy(xpath = "//a[text()='Couples Cover']")
	WebElement couplesCover;

	@FindBy(xpath = "//a[text()='Pregnancy and Newborn Cover']")
	WebElement pregnancyAndNewBornCoverBtn;

	@FindBy(xpath = "//div[@class='menu menu-level-4']//li//a[text()='Health Insurance claims process']")
	WebElement HealthInsuranceclaimsprocessBtnInHealth;

	@FindBy(xpath = "//a[text()='Family Cover']")
	WebElement familyCover;

	@FindBy(xpath = "//a[text()='Dental Cover']")
	WebElement dentalCover;

	@FindBy(xpath = "//div//a[text()='Get connected at your new home']")
	WebElement getConnectedAtYourNewHomeBtn;

	@FindBy(xpath = "//h3[text()='Moving home?']")
	WebElement movingHomeText;

	@FindBy(xpath = "//div[text()='ISelect were able to find me a cheaper and just as suitable health insurance from the one that they found me the previous year. So obviously...']")
	WebElement trustPilotreviewOne;

	@FindBy(xpath = "//div[text()='Great service for those who do not have the time to research the available Energy plans. Their knowledge of the intricate details can help you save...']")
	WebElement trustPilotreviewTwo;

	@FindBy(xpath = "//div[text()='Thank you iselect. We could not fault you in any way. In one hour we had changed two policies that you found for us that where...']")
	WebElement trustPilotreviewThree;

	@FindBy(xpath = "//div[text()='The team made it very easy for us to evaluate and make a selection in three areas - Health Insurance, Motor Vehicle Insurance & Energy Retailer....']")
	WebElement trustPilotreviewFour;

	@FindBy(xpath = "//h2[text()='Our helpful resources and guides']")
	WebElement ourHelpFulResourceTxt;

	@FindBy(xpath = "//span[text()='LIFE MOMENTS']")
	WebElement lifeMoments;

	@FindBy(xpath = "//h2[text()='Be prepared for every moment']")
	WebElement bePreparedForEveryMoment;

	@FindBy(xpath = "//h2[text()='Compare. Select. Save']")
	WebElement compareSelectSaveTxt;

	@FindBy(xpath = "//span[text()='HOW IT WORKS']")
	WebElement howItWorksTxt;

	@FindBy(xpath = "//h2[text()='Save time and effort by comparing with iSelect*']")
	WebElement saveTimeAndEffortTxt;

	@FindBy(xpath = "//h2[text()='What our customers are saying about us']")
	WebElement whatOurCustSayingAbtUs;

	@FindBy(xpath = "//h2[text()='Our consultants are here to help']")
	WebElement OurconsultantsAreHereToHelp;

	@FindBy(xpath = "//span[text()='TALK TO A LOCAL']")
	WebElement talkToLocal;

	@FindBy(xpath = "//span[text()='Helping australians get sorted']")
	WebElement helpingAusisGetSortedTxt;

	@FindBy(xpath = "//div[@data-testid='typewriter-wrapper']/span[@class='typer']")
	WebElement typer;

	@FindBy(xpath = "//span[text()='Insurance']/parent::section")
	WebElement InsuranceHoverBtn;

	@FindBy(xpath = "//div[@id='globalnav']//a[text()='Health']")
	WebElement healthBtn;

	@FindBy(xpath = "//h1[text()='Compare Health Insurance']")
	WebElement compareHealthInsuranceText;

	@FindBy(xpath = "//a[text()='Compare Health Insurance']")
	WebElement compareHealthInsuranceButtonInHealth;

	@FindBy(xpath = "//a[text()='Compare Life Insurance']")
	WebElement compareLifeInsuranceButtonInLife;

	@FindBy(xpath = "//div[@id='globalnav']//a[text()='Life']")
	WebElement lifeInsurance;

	@FindBy(xpath = "//a[text()='What is Life Insurance']")
	WebElement WhatIslifeInsurance;

	@FindBy(xpath = "//a[text()='Why Life Insurance']")
	WebElement whylifeInsurance;

	@FindBy(xpath = "//a[text()='Types of Life Insurance']")
	WebElement lifeinsurancetypes;

	@FindBy(xpath = "//a[text()='Life Insurance Calculator']")
	WebElement lifeinsuranceCalc;

	@FindBy(xpath = "//a[text()='Income Protection Calculator']")
	WebElement incomeProtCalc;

	@FindBy(xpath = "//a[text()='Life Insurance FAQs']")
	WebElement lifeinsuranceFAQS;

	@FindBy(xpath = "//a[text()='How to purchase Life Insurance']")
	WebElement howToPurchaseLifeInsurance;

	@FindBy(xpath = "//a[text()='TPD Insurance']")
	WebElement tpdInsuranceBtn;

	@FindBy(xpath = "//a[text()='Trauma Insurance']")
	WebElement TraumaInsuranceBtn;

	@FindBy(xpath = "//a[text()='Key Person Insurance']")
	WebElement KeyPersonInsuranceBtn;

	@FindBy(xpath = "//a[text()='Make the most of your freedom years']")
	WebElement makeMostOfFreedomYears;

	@FindBy(xpath = "//a[text()='Life Insurance vs Income Protection']")
	WebElement lifeInsVsIncomeProt;

	@FindBy(xpath = "//a[text()='Life Insurance glossary']")
	WebElement lifeInsGlossary;

	@FindBy(xpath = "//a[text()='Health Insurance glossary']")
	WebElement HealthInsGlossary;

	@FindBy(xpath = "//a[text()='Finding a suitable Life Insurance policy']")
	WebElement findingASuitableLifeInsurancePolicy;

	@FindBy(xpath = "//a[text()='Finding the right Health Insurance']")
	WebElement findingARightHealthInsurance;

	@FindBy(xpath = "//h2//strong[text()='Do your research. What policy would best suit your individual situation? ']")
	WebElement doYourResearch;

	@FindBy(xpath = "//a[text()='Compare Home Loans']")
	WebElement compareHomeLoansBtn;

	@FindBy(xpath = "//h1[text()='Easily compare life insurance quotes']")
	WebElement lifeInsuranceText;

	@FindBy(xpath = "//div[@id='globalnav']//a[text()='Car']")
	WebElement carBtn;

	@FindBy(xpath = "//h2[text()='Easily compare car insurance quotes*']")
	WebElement carInsuranceText;

	@FindBy(xpath = "//div[@id='globalnav']//a[text()='Home & Contents']")
	WebElement homeAndContentsBtn;

	@FindBy(xpath = "//span[text()='Home & Contents Insurance']")
	WebElement homeAndContentsInsuranceBtnInInsurance;

	@FindBy(xpath = "//button[text()='Get started']")
	WebElement getStartedBtn;

	@FindBy(xpath = "//h1[text()='Compare Home and Contents Insurance']")
	WebElement homeAndContentstext;

	@FindBy(xpath = "//div[@id='globalnav']//a[text()='Business Insurance']")
	WebElement businessInsuranceBtn;

	@FindBy(xpath = "//span[text()='Business Insurance']")
	WebElement businessInsuranceBtnInInsurance;

	@FindBy(xpath = "//h1[text()='Compare Business Insurance']")
	WebElement businessInsurancetext;

	@FindBy(xpath = "//li[@name='5_-1']//a[text()='Travel']")
	WebElement travelBtn;

	@FindBy(xpath = "//a[normalize-space()='Travel']")
	WebElement travelInsuranceBtnInInsurance;

	@FindBy(xpath = "//section[@id='megamenu']//a//span[text()='Travel Insurance']")
	WebElement travelInsuranceInMegamenu;

	@FindBy(xpath = "//h1[text()='Compare Travel Insurance']")
	WebElement compareTravelInsText;

	@FindBy(xpath = "//a[normalize-space()='Pet']")
	WebElement petInsuranceBtn;

	@FindBy(xpath = "(//span[text()='Pet Insurance'])")
	WebElement petInsuranceBtnInInsurance;

	@FindBy(xpath = "(//span[text()='Overseas Visitor Cover'])")
	WebElement overseasVisitorCoverBtnInInsurance;

	@FindBy(xpath = "//button[text()='Utilities']")
	WebElement utilitiesBtn;

	@FindBy(xpath = "//button[text()='Finance']")
	WebElement financeBtn;

	@FindBy(xpath = "//span[text()='Car Loans']")
	WebElement carLoansBtnInFinance;

	@FindBy(id = "//span[text()='Business Loans']")
	WebElement businessLoanBtnInFinance;

	@FindBy(xpath = "//h1[text()='Compare Pet Insurance ']")
	WebElement comparePetInsurText;

	@FindBy(xpath = "(//a[normalize-space()='Overseas Visitors Cover'])[1]")
	WebElement overseasVisitorCoverBtn;

	@FindBy(xpath = "//h1[text()='Overseas Visitors Health Insurance']")
	WebElement overseasVisitorCoverText;

	@FindBy(xpath = "//div[@id='globalnav']//span[text()='Utilities']")
	WebElement utilitiesHover;

	@FindBy(xpath = "//div[@id='globalnav']//a[text()='Electricity & Gas']")
	WebElement elecAndGasBtn;

	@FindBy(xpath = "(//span[text()='Electricity & Gas'])[2]")
	WebElement elecAndGasBtnInUtilities;

	@FindBy(xpath = "//h1[text()='Compare Electricity & Gas']")
	WebElement compareElecAndGastxt;

	@FindBy(xpath = "//li[@name='1_-1']//a[text()='Internet']")
	WebElement internetBtn;

	@FindBy(xpath = "//a[normalize-space()='Compare Broadband']")
	WebElement compareBroadband;

	@FindBy(xpath = "//a[normalize-space()='Compare Broadband']/parent::div//a[text()='I am moving']")
	WebElement IamMovingBtnInUtilitiesInternet;

	@FindBy(xpath = "(//span[text()='Internet'])[2]")
	WebElement internetBtnInUtilities;

	@FindBy(xpath = "//a[normalize-space()='Internet']")
	WebElement internetBtnInInternetPage;

	@FindBy(xpath = "(//span[text()='Mobile Plans'])")
	WebElement mobileplansBtnInUtilities;

	@FindBy(xpath = "(//span[text()='Moving House'])")
	WebElement MovingHouseBtnInUtilities;

	@FindBy(xpath = "(//span[text()='Home Loans'])[2]")
	WebElement homeLoansBtnInFinance;

	@FindBy(xpath = "//span[text()='Personal Loans']")
	WebElement personalLoansBtnInFinance;

	@FindBy(xpath = "//h1[text()='Internet Plans']")
	WebElement internetPlanstxt;

	@FindBy(xpath = "//li[@name='2_-1']//a[text()='Mobile Plans']")
	WebElement mobilePlansBtn;

	@FindBy(xpath = "//h1[text()='Mobile Plans']")
	WebElement mobilePlansTxt;

	@FindBy(xpath = "//span[text()='Finance']/parent::section")
	WebElement financeHover;

	@FindBy(xpath = "//li[@name='0_-1']//a[text()='Home Loans']")
	WebElement homeLoansBtn;

	@FindBy(xpath = "//h1[text()='Compare Australian Home Loans']")
	WebElement ausisHomeLoansText;

	@FindBy(xpath = "//li[@name='1_-1']//a[text()='Car Loans']")
	WebElement carLoansBtn;

	@FindBy(xpath = "//h1[text()='Compare Car Loans*']")
	WebElement carLoansTxt;

	@FindBy(xpath = "//li[@name='2_-1']//a[text()='Personal Loans']")
	WebElement personalLoansBtn;

	@FindBy(xpath = "//h1[text()='Compare Personal Loans*']")
	WebElement personalLoansTxt;

	@FindBy(xpath = "//div[@id='globalnav']//a[text()='Business Loans']")
	WebElement businessLoansBtn;

	@FindBy(xpath = "//h2[text()='Find a business loan for your business from over 80 leading lenders across Australia, powered by Valiant.']")
	WebElement businessLoansTxt;

	@FindBy(xpath = "//li[@name='4_-1']//a[text()='Credit Cards']")
	WebElement creditCardsBtn;

	@FindBy(xpath = "//a[text()='Direct Life Insurance']")
	WebElement directLifeInsurance;

	@FindBy(xpath = "//a[text()='Why time seems to fly as we get older']")
	WebElement whyTimeSeemsToFly;

	@FindBy(xpath = "//span[text()='Credit Cards']")
	WebElement creditCardsBtnInFinance;

	@FindBy(xpath = "//h1[text()='Compare Credit Cards*']")
	WebElement creditcardstxt;

	@FindBy(xpath = "//li[@name='5_-1']//a[text()='Income Protection']")
	WebElement incomeProtectionBtn;

	@FindBy(xpath = "(//span[text()='Income Protection'])[2]")
	WebElement incomeProtectionBtnInInsurance;

	@FindBy(xpath = "//h1[text()='Easily compare income protection quotes']")
	WebElement incomeProtectionTxt;

	@FindBy(xpath = "//a[text()='Moving house?']")
	WebElement movingHouseBtn;

	@FindBy(xpath = "//h1[text()='Moving House?']")
	WebElement movingHouseTxt;

	@FindBy(xpath = "(//section[@id='megamenu']//span[text()='Health Insurance'])[1]")
	WebElement healthInsuranceBtnPopular;

	@FindBy(xpath = "(//section[@id='megamenu']//span[text()='Car Insurance'])[1]")
	WebElement carInsuranceBtnPopular;

	@FindBy(xpath = "(//section[@id='megamenu']//span[text()='Car Insurance'])[2]")
	WebElement carInsuranceBtnInInsurance;

	@FindBy(xpath = "(//section[@id='megamenu']//span[text()='Electricity & Gas'])[1]")
	WebElement energyBtnPopular;

	@FindBy(xpath = "(//section[@id='megamenu']//span[text()='Internet'])[1]")
	WebElement internetBtnPopular;

	@FindBy(xpath = "(//section[@id='megamenu']//span[text()='Home Loans'])[1]")
	WebElement homeLoansBtnPopular;

	@FindBy(xpath = "//h1[text()='Compare Australian Home Loans']")
	WebElement compareHomeLoanstxt;

	@FindBy(xpath = "(//section[@id='megamenu']//span[text()='Life Insurance'])[1]")
	WebElement lifeInsuranceBtnPopular;

	@FindBy(xpath = "(//section[@id='megamenu']//span[text()='Life Insurance'])[2]")
	WebElement lifeInsuranceBtnInInsurance;

	@FindBy(xpath = "(//section[@id='megamenu']//span[text()='Income Protection'])[1]")
	WebElement incomeProtectionBtnPopular;

	@FindBy(xpath = "//button[text()='Insurance']")
	WebElement InsuranceBtn;

	@FindBy(xpath = "//a[@aria-label='Visit Facebook' or @title='iSelect on Facebook']")
	WebElement fblinkhomepage;

	@FindBy(xpath = "//a[@aria-label='Visit Twitter' or @title='iSelect on Twitter']")
	WebElement twitterlinkhomepage;

	@FindBy(xpath = "//a[@aria-label='Visit You Tube' or @title='iSelect on YouTube']")
	WebElement youtubelinkhomepage;

	@FindBy(xpath = "//a[@aria-label='Visit Linked In' or @title='iSelect on LinkedIn']")
	WebElement linkedInlinkhomepage;

	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	WebElement termsAndConditions;

	@FindBy(xpath = "//a[text()='Privacy Policy']")
	WebElement privacyPolicy;

	@FindBy(xpath = "//a[text()='Disclaimer']")
	WebElement disclaimer;

	@FindBy(xpath = "//a[text()='Contact Us']")
	WebElement contactUs;

	@FindBy(xpath = "//a[text()='How iSelect Works']")
	WebElement howIselectworks;

	@FindBy(xpath = "//a[text()='Our Company']")
	WebElement ourCompany;

	@FindBy(xpath = "//a[text()='Careers']")
	WebElement careers;

	@FindBy(xpath = "//a[text()='Media Centre']")
	WebElement mediacentre;

	@FindBy(xpath = "//a[text()='Investor Centre']")
	WebElement investorcentre;

	@FindBy(xpath = "//a[text()='Become Our Partner']")
	WebElement becomeOurPartnerLink;

	/********** utilities internet locators ******************/

	@FindBy(xpath = "//a[normalize-space()='NBN']")
	WebElement nbnlink;

	@FindBy(xpath = "//a[normalize-space()='Internet Speed']")
	WebElement internetspeed;

	@FindBy(xpath = "//a[normalize-space()='Mobile Broadband']")
	WebElement mobileBroadband;

	@FindBy(xpath = "//a[normalize-space()='ADSL2+']")
	WebElement adsl;

	@FindBy(xpath = "//a[normalize-space()='Cheap Internet']")
	WebElement cheapInternet;

	@FindBy(xpath = "//a[normalize-space()='Wireless Internet']")
	WebElement wirelessinternet;

	@FindBy(xpath = "//a[normalize-space()='Naked DSL']")
	WebElement nakeddsl;

	@FindBy(xpath = "//a[normalize-space()='NBN Plans']")
	WebElement nbnPlans;

	@FindBy(xpath = "//a[normalize-space()='Internet Providers']")
	WebElement internetproviders;

	@FindBy(xpath = "//a[normalize-space()='Internet Plans']")
	WebElement internetPlans;

	@FindBy(xpath = "//a[normalize-space()='Moving house? Make it easy']")
	WebElement movingHouseMakeItEasy;

	@FindBy(xpath = "//a[normalize-space()='Connecting to the NBN']")
	WebElement connectingNBN;

	@FindBy(xpath = "//a[normalize-space()='Choosing the right broadband plan']")
	WebElement choosingRightBroadbandPlan;

	@FindBy(xpath = "//a[normalize-space()='Choosing the right NBN plan']")
	WebElement choosingRightNBNPlan;

	@FindBy(xpath = "//a[normalize-space()='Cable Internet Plans']")
	WebElement cableInternetPlans;

	@FindBy(xpath = "//a[normalize-space()='Wireless Internet Plans']")
	WebElement wirelessInternetPlans;

	@FindBy(xpath = "//a[normalize-space()='Broadband Plans']")
	WebElement broadbandPlans;

	@FindBy(xpath = "//a[normalize-space()='Internet Deals']")
	WebElement internetdeals;

	@FindBy(xpath = "//a[normalize-space()='How to get high speed internet']")
	WebElement howtogetHighSpeedInternet;

	@FindBy(xpath = "//a[normalize-space()='What is ADSL and ADSL2+?']")
	WebElement whatIsADSLAndADSLPlus;

	@FindBy(xpath = "//a[normalize-space()='Internet glossary']")
	WebElement internetGlossary;

	/***** utilities internet locators done ********/

	/********** mobile plans locators ***********/
	@FindBy(xpath = "//a[normalize-space()='Compare Mobile Plans']")
	WebElement compareMobilePlans;

	@FindBy(xpath = "//a[normalize-space()='Operating systems']")
	WebElement os;

	@FindBy(xpath = "//a[normalize-space()='How much data?']")
	WebElement howmuchdata;

	@FindBy(xpath = "//a[normalize-space()='Providers']")
	WebElement providers;

	@FindBy(xpath = "//a[normalize-space()='Mobile phone tips']")
	WebElement mobileTips;

	@FindBy(xpath = "//a[normalize-space()='Understanding mobile phone jargon']")
	WebElement mobileJargons;

	@FindBy(xpath = "//a[normalize-space()='3G vs 4G']")
	WebElement threeGVsFourG;

	@FindBy(xpath = "//a[normalize-space()='Phone and Internet Bundles']")
	WebElement phoneAndInternetBundles;

	/********** mobile plans locators done ***********/

	/******* bottom menu locators **********/
	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Health'])[1]")
	WebElement healthBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Income Protection'])[1]")
	WebElement incomeProtectionBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Travel'])[1]")
	WebElement travelBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Pet'])[1]")
	WebElement petBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Car'])[1]")
	WebElement carBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Overseas Visitor Cover'])[1]")
	WebElement overseasVisitorCoverBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Business'])[1]")
	WebElement businessBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Life'])[1]")
	WebElement lifeBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Home & Contents'])[1]")
	WebElement homeAndContentsBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Electricity & Gas'])[1]")
	WebElement elecAndGasBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Internet'])[1]")
	WebElement internetBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Mobile Plans'])[1]")
	WebElement mobilePlansBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Moving House'])[1]")
	WebElement movingHouseBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Credit Cards'])[1]")
	WebElement creditCardsBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Personal Loans'])[1]")
	WebElement personalLoansBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Car Loans'])[1]")
	WebElement carLoansBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Business Loans'])[1]")
	WebElement businessLoansBottomMenu;

	@FindBy(xpath = "(//div[@id='bottommenu']//a[text()='Home Loans'])[1]")
	WebElement homeLoansBottomMenu;

	/******* bottom menu locators done **********/

	public Boolean verifyHealthInsuranceButton() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "click on health button");
		healthBtn.click();
		testlog.log(Status.INFO, "verify that we should land on health insurance page");
		return compareHealthInsuranceText.isDisplayed();
	}

	public Boolean verifyLifeInsuranceButton() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "click on life insurance button");
		lifeInsurance.click();
		testlog.log(Status.INFO, "verify life insurance text is displayed");
		return lifeInsuranceText.isDisplayed();
	}

	public Boolean verifyCarInsuranceButton() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "click on car button");
		carBtn.click();
		testlog.log(Status.INFO, "verify car insurance text is displayed");
		return carInsuranceText.isDisplayed();
	}

	
	public CarPage carInsuranceLanding() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "click on car button");
		carBtn.click();
		testlog.log(Status.INFO, "verify car insurance text is displayed");
		return new CarPage(driver,testlog);
	}

	public Boolean verifyHomeAndContentsInsuranceButton() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "click on home and contents button");
		homeAndContentsBtn.click();
		testlog.log(Status.INFO, "verify homeAndContents insurance text is displayed");
		return homeAndContentstext.isDisplayed();
	}

	public Boolean verifyBusinessInsuranceButton() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		businessInsuranceBtn.click();
		testlog.log(Status.INFO, "verify businessInsurance insurance text is displayed");
		return businessInsurancetext.isDisplayed();
	}

	public Boolean verifyTravelInsuranceButton() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "click on travel button");
		travelBtn.click();
		testlog.log(Status.INFO, "verify compare travel insurance text is displayed");
		return compareTravelInsText.isDisplayed();
	}

	public Boolean verifyPetInsuranceButton() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "click on pet button");
		petInsuranceBtn.click();
		testlog.log(Status.INFO, "verify compare pet insurance text is displayed");
		return comparePetInsurText.isDisplayed();
	}

	public Boolean verifyOverseasCoverInsuranceButton() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "click on overseas visitor cover insurance button");
		overseasVisitorCoverBtn.click();
		testlog.log(Status.INFO, "verify overseasVisitorCover insurance text is displayed");
		return overseasVisitorCoverText.isDisplayed();
	}

	public Boolean verifyElecAndGasButton() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on electricity and gas button");
		elecAndGasBtn.click();
		testlog.log(Status.INFO, "verify compare electricity and gas text displayed");
		return compareElecAndGastxt.isDisplayed();
	}

	public Boolean verifyInternetButton() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "verify compare internet plans text displayed");
		return internetPlanstxt.isDisplayed();
	}

	public Boolean verifyMobilePlansButton() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on mobile plans button");
		mobilePlansBtn.click();
		testlog.log(Status.INFO, "verify compare mobile plans text displayed");
		return mobilePlansTxt.isDisplayed();
	}

	public Boolean verifyHomeLoansFinanceButton() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "click on home loans finance button");
		homeLoansBtn.click();
		testlog.log(Status.INFO, "verify austrila home loans finance text");
		return ausisHomeLoansText.isDisplayed();
	}

	public Boolean verifyCarLoansFinanceButton() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "click on car loans button");
		carLoansBtn.click();
		testlog.log(Status.INFO, "verify car loans finance text");
		return carLoansTxt.isDisplayed();
	}

	public Boolean verifyPersonalLoansFinanceButton() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "click on personal loans button");
		personalLoansBtn.click();
		testlog.log(Status.INFO, "verify personal loans finance text");
		return personalLoansTxt.isDisplayed();
	}

	public Boolean verifyBusinessLoansFinanceButton() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "click on business loans button");
		businessLoansBtn.click();
		testlog.log(Status.INFO, "verify business loans finance text");
		return businessLoansTxt.isDisplayed();
	}

	public Boolean verifyCreditCardsInFinanceButton() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "click on credit cards button");
		creditCardsBtn.click();
		testlog.log(Status.INFO, "credit cards landing page should display");
		return creditcardstxt.isDisplayed();
	}

	public Boolean verifyIncomeProtectionInFinanceButton() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "click on incomeProtection button");
		incomeProtectionBtn.click();
		testlog.log(Status.INFO, "incomeProtection text should display");
		return incomeProtectionTxt.isDisplayed();
	}

	public Boolean verifyMovingHouseInFinanceButton() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "click on moving house button");
		movingHouseBtn.click();
		testlog.log(Status.INFO, "verify moving house page displayed");
		return movingHouseTxt.isDisplayed();
	}

	public Boolean verifyHeadersOnMainPage() {
		if (compareSelectSaveTxt.isDisplayed() && typer.isDisplayed() && helpingAusisGetSortedTxt.isDisplayed()
				&& whatOurCustSayingAbtUs.isDisplayed() && OurconsultantsAreHereToHelp.isDisplayed()
				&& talkToLocal.isDisplayed() && saveTimeAndEffortTxt.isDisplayed() && howItWorksTxt.isDisplayed()
				&& lifeMoments.isDisplayed() && bePreparedForEveryMoment.isDisplayed() && industryInsights.isDisplayed()
				&& ourHelpFulResourceTxt.isDisplayed() && movingHomeText.isDisplayed()) {
			testlog.log(Status.INFO, " Compare Select Save Text displayed ");
			testlog.log(Status.INFO, "typer animation displayed");
			testlog.log(Status.INFO, "helping Ausitrilia Get Sorted Text displayed");
			testlog.log(Status.INFO, "What our customers are saying about us Text displayed");
			testlog.log(Status.INFO, " our consultants are here to help text displayed");
			testlog.log(Status.INFO, "talk to local text displayed");
			testlog.log(Status.INFO, "save time and effort Text displayed");
			testlog.log(Status.INFO, "how it works Text displayed");
			testlog.log(Status.INFO, "life moments Text displayed");
			testlog.log(Status.INFO, "be prepared for every moments Text displayed");
			testlog.log(Status.INFO, "industry insights Text displayed");
			testlog.log(Status.INFO, "our helpful resources Text displayed");
			return true;
		}
		return false;

	}

	public Boolean verifyTrustPilotReviews() {

		Boolean statusOne = false;
		Boolean statusTwo = false;
		Boolean statusThree = false;
		Boolean statusFour = false;
		new ScrollUtil().scroll(driver, driver.findElement(By
				.xpath("(//img[starts-with(@src,'/fs-static/media/Quote')]/parent::div//following-sibling::div)[1]")));
		if (new WebDriverWait(driver,Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(trustPilotreviewOne)).isDisplayed()) {
			statusOne = true;
			testlog.log(Status.INFO, "trust pilot review one displayed");
		}
		if (new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(trustPilotreviewTwo)).isDisplayed()) {
			statusTwo = true;
			testlog.log(Status.INFO, "trust pilot review two displayed");
		}
		if (new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(trustPilotreviewThree)).isDisplayed()) {
			statusThree = true;
			testlog.log(Status.INFO, "trust pilot review three displayed");
		}
		if (new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOf(trustPilotreviewFour)).isDisplayed()) {
			statusFour = true;
			testlog.log(Status.INFO, "trust pilot review four displayed");
		}

		if (statusOne && statusTwo && statusThree && statusFour)
			return true;
		else
			return false;
	}

	public Boolean verifyGetConnectedAtYourNewHomeBtn() {
		if (getConnectedAtYourNewHomeBtn.isDisplayed()) {
			testlog.log(Status.INFO, "click on getConnectedAtYourNewHomeBtn");
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", getConnectedAtYourNewHomeBtn);
		}
		testlog.log(Status.INFO, " moving house? text displayed");
		Boolean status = movingHouseTxt.isDisplayed();

		return status;
	}

	public Boolean clickHealthInsuranceBtnInPopularAndVerifyHealthLandingPage() {
		testlog.log(Status.INFO, "click health insurance button ");
		healthInsuranceBtnPopular.click();
		testlog.log(Status.INFO, "verify health insurance landing page ");
		return compareHealthInsuranceText.isDisplayed();

	}

	public Boolean clickCarInsuranceBtnInPopularAndVerifyCarLandingPage() {
		testlog.log(Status.INFO, "click car insurance button ");
		carInsuranceBtnPopular.click();
		testlog.log(Status.INFO, "verify car insurance landing page ");
		return carInsuranceText.isDisplayed();

	}

	public Boolean clickElecAndGasBtnInPopularAndVerifyEnergyLandingPage() {
		testlog.log(Status.INFO, "click elec and gas button ");
		energyBtnPopular.click();
		testlog.log(Status.INFO, "verify energy landing page ");
		return compareElecAndGastxt.isDisplayed();

	}

	public Boolean clickInternetBtnInPopularAndVerifyInternetPlansLandingPage() {
		testlog.log(Status.INFO, "click internet button ");
		internetBtnPopular.click();
		testlog.log(Status.INFO, "verify internet landing page ");
		return internetPlanstxt.isDisplayed();

	}

	public Boolean clickHomeLoansBtnInPopularAndVerifyHomeLoansLandingPage() {
		testlog.log(Status.INFO, "click home loans button ");
		homeLoansBtnPopular.click();
		testlog.log(Status.INFO, "verify home loans landing page ");
		return compareHomeLoanstxt.isDisplayed();

	}

	public Boolean clickLifeInsuranceBtnInPopularAndVerifyLifeInsuranceLandingPage() {
		testlog.log(Status.INFO, "click life insurance button ");
		lifeInsuranceBtnPopular.click();
		testlog.log(Status.INFO, "verify life insurance landing page ");
		return lifeInsuranceText.isDisplayed();

	}

	public Boolean clickIncomeProtectionBtnInPopularAndVerifyIncomeProtectionLandingPage() {
		testlog.log(Status.INFO, "click income protection button ");
		incomeProtectionBtnPopular.click();
		testlog.log(Status.INFO, "verify income protection landing page ");
		return incomeProtectionTxt.isDisplayed();

	}

	public Boolean clickInsuranceBtnThenHealthInsuranceBtn() {
		testlog.log(Status.INFO, "click on Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click health insurance btn ");
		healthInsButtonInHealth.click();
		return compareHealthInsuranceText.isDisplayed();
	}
	
	public HealthPage clickHealthInsuranceBtn() {
		testlog.log(Status.INFO, "click on Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click health insurance btn ");
		healthInsButtonInHealth.click();
		return new HealthPage(driver,testlog);
	}

	public Boolean clickInsuranceBtnThenCarInsuranceBtn() {
		testlog.log(Status.INFO, "click Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click car insurance btn ");
		carInsuranceBtnInInsurance.click();
		return carInsuranceText.isDisplayed();
	}

	public Boolean clickInsuranceBtnThenLifeInsuranceBtn() {
		testlog.log(Status.INFO, "click Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click life insurance btn ");
		lifeInsuranceBtnInInsurance.click();
		return lifeInsuranceText.isDisplayed();
	}
	
	
	public LifePage clickLifeInsuranceBtn() {
		testlog.log(Status.INFO, "click Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click life insurance btn ");
		lifeInsuranceBtnInInsurance.click();
		return new LifePage(driver,testlog);
	}

	public Boolean clickInsuranceBtnThenHomeAndContentsInsuranceBtn() {
		testlog.log(Status.INFO, "click Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click H&C insurance btn ");
		homeAndContentsInsuranceBtnInInsurance.click();
		return homeAndContentstext.isDisplayed();
	}

	public HomeAndContentsYourDetails clickHomeAndContentsInsuranceBtnThenGetStartedBtn() {
		testlog.log(Status.INFO, "click Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click H&C insurance btn ");
		homeAndContentsInsuranceBtnInInsurance.click();
		getStartedBtn.click();
		return new HomeAndContentsYourDetails(driver, testlog);
	}

	public Boolean clickInsuranceBtnThenBusinessInsuranceBtn() {
		testlog.log(Status.INFO, "click Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click business insurance btn ");
		businessInsuranceBtnInInsurance.click();
		return businessInsurancetext.isDisplayed();
	}

	public Boolean clickInsuranceBtnThenIncomeProtectionBtn() {
		testlog.log(Status.INFO, "click Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click IncomeProtection  btn ");
		incomeProtectionBtnInInsurance.click();
		return incomeProtectionTxt.isDisplayed();
	}

	public Boolean clickInsuranceBtnThenTravelInsuranceBtn() {
		testlog.log(Status.INFO, "click Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click travel insurance  btn ");
		travelInsuranceInMegamenu.click();
		return compareTravelInsText.isDisplayed();
	}

	public Boolean clickInsuranceBtnThenPetInsuranceBtn() {
		testlog.log(Status.INFO, "click Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click pet insurance  btn ");
		petInsuranceBtnInInsurance.click();
		return comparePetInsurText.isDisplayed();
	}

	public Boolean clickInsuranceBtnThenOverseasVisitorCoverInsuranceBtn() {
		testlog.log(Status.INFO, "click Insurance button ");
		InsuranceBtn.click();
		testlog.log(Status.INFO, "click overseas visitor cover   btn ");
		overseasVisitorCoverBtnInInsurance.click();
		return overseasVisitorCoverText.isDisplayed();
	}

	public Boolean clickUtilitiesBtnThenElecAndGasBtn() {
		testlog.log(Status.INFO, "click utilities button ");
		utilitiesBtn.click();
		testlog.log(Status.INFO, "click elec and gas btn ");
		elecAndGasBtnInUtilities.click();
		return compareElecAndGastxt.isDisplayed();
	}

	public Boolean clickUtilitiesBtnThenInternet() {
		testlog.log(Status.INFO, "click utilities button ");
		utilitiesBtn.click();
		testlog.log(Status.INFO, "click internet btn ");
		internetBtnInUtilities.click();
		return internetPlanstxt.isDisplayed();
	}

	public Boolean clickUtilitiesBtnThenMobilePlans() {
		testlog.log(Status.INFO, "click utilities button ");
		utilitiesBtn.click();
		testlog.log(Status.INFO, "click mobile plans btn ");
		mobileplansBtnInUtilities.click();
		return mobilePlansTxt.isDisplayed();
	}

	public Boolean clickUtilitiesBtnThenMovingHouse() {
		testlog.log(Status.INFO, "click utilities button ");
		utilitiesBtn.click();
		testlog.log(Status.INFO, "click moving house btn ");
		MovingHouseBtnInUtilities.click();
		return movingHouseTxt.isDisplayed();
	}

	//
	public Boolean clickFinanceBtnThenHomeLoans() {
		testlog.log(Status.INFO, "click finance button ");
		financeBtn.click();
		testlog.log(Status.INFO, "click home loans btn ");
		homeLoansBtnInFinance.click();
		return ausisHomeLoansText.isDisplayed();
	}

	public Boolean clickFinanceBtnThenCarLoans() {
		testlog.log(Status.INFO, "click finance button ");
		financeBtn.click();
		testlog.log(Status.INFO, "click car loans btn ");
		carLoansBtnInFinance.click();
		return carLoansTxt.isDisplayed();
	}

	public Boolean clickFinanceBtnThenPersonalLoans() {
		testlog.log(Status.INFO, "click finance btn  button");
		financeBtn.click();
		testlog.log(Status.INFO, "click personal loans btn ");
		personalLoansBtnInFinance.click();
		return personalLoansTxt.isDisplayed();
	}

	public Boolean clickFinanceBtnThenBusinessLoans() {
		testlog.log(Status.INFO, "click finance btn  button ");
		financeBtn.click();
		testlog.log(Status.INFO, "click BusinessLoans btn ");
		businessLoanBtnInFinance.click();
		return businessLoansTxt.isDisplayed();
	}

	public Boolean clickFinanceBtnThenCreditCards() {
		testlog.log(Status.INFO, "click finance btn  button ");
		financeBtn.click();
		testlog.log(Status.INFO, "click credit cards btn ");
		creditCardsBtnInFinance.click();
		return creditcardstxt.isDisplayed();
	}

	public Boolean clickCompareHealthInsurancebuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on compare health insurance button");
		compareHealthInsuranceButtonInHealth.click();
		return compareHealthInsuranceText.isDisplayed();
	}

	public Boolean clickScheduleACallbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on compare health insurance button");
		scheduleACallBtnInHeath.click();
		return needHelpWithHealthInsurance.isDisplayed();
	}

	public String clickMedicalLevySurchargebuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on MedicalLevySurcharge button");
		medicareLevySurcharge.click();
		return header.getText();
	}

	public String clickLifetimeHealthCoverLoadingbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on lifetimeHealthCoverLoading button");
		lifetimeHealthCoverLoading.click();
		return header.getText();
	}

	public String clicktaxImplicationsbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on tax implications button");
		taxImplications.click();
		return header.getText();
	}

	public String clickAusisGovtRebatebuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on AusisGovtRebate button");
		ausisGovtRebate.click();
		return header.getText();
	}

	public String clickAmbulanceCoverbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on AmbulanceCover button");
		ambulanceCover.click();
		return header.getText();
	}

	public String clickHospitalWaitingPeriodsbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on hospital WaitingPeriods button");
		hospitalWaitingPeriod.click();
		return header.getText();
	}

	public String clickSwitchingHealthInsurancebuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on Switching Health Insurance button");
		switchingHealthInsurance.click();
		return header.getText();
	}

	public String clickHospitalCoverbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on hospital cover button");
		hospitalCover.click();
		return header.getText();
	}

	public String clickExtrasCoverbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on extras cover button");
		extrasCover.click();
		return header.getText();
	}

	public String clickSinglesCoverbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on singles cover button");
		singlesCover.click();
		return header.getText();
	}

	public String clickCouplesCoverbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on couples cover button");
		couplesCover.click();
		return header.getText();
	}

	public String clickFamilyCoverbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on family cover button");
		familyCover.click();
		return header.getText();
	}

	public String clickDentalCoverbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on dental cover button");
		dentalCover.click();
		return header.getText();
	}

	public String clickDirectLifeInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life insurance button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on direct life insurance button");
		directLifeInsurance.click();
		return header.getText();
	}

	public String clickOnWhyTimeSeemsToFlyAsWeGetOlder() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life insurance button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on Why Time Seems To Fly As We Get Older button");
		whyTimeSeemsToFly.click();
		return header.getText();
	}

	public String clickOnLifeInsuranceGlossary() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life insurance button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on life insurance glossary");
		lifeInsGlossary.click();
		return header.getText();
	}

	public String clickOnHealthInsuranceGlossary() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health insurance button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on health insurance glossary");
		String script = "document.querySelector(\"a[href='/health-insurance/glossary/']\").click()";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script);
		return header.getText();
	}

	public String clickOnIsHealthInsuranceWorthHaving() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health insurance button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on health insurance worth having link");
		String script = "document.querySelector(\"a[href='/health-insurance/private-health-insurance-worth-having/']\").click()";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script);
		return header.getText();
	}

	public Boolean clickOnFindingRightHealthInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health insurance button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on finding right health insurance");
		String script = "document.querySelector(\"a[href='/health-insurance/find-health-insurance/']\").click()";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script);
		return doYourResearch.isDisplayed();
	}

	public String clickPregnancyAndNewBornCoverbuttonInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on PregnancyAndNewBorn cover button");
		pregnancyAndNewBornCoverBtn.click();
		return header.getText();
	}

	public String clickHealthInsuranceClaimsProcessBtnInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on HealthInsuranceClaimsProcess button");
		String clickResultJS = "document.querySelector(\"a[href^='/health-insurance/health-insurance-claims-process/']\").click()";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(clickResultJS);
		return header.getText();
	}

	public String clickBenefitsOfPrivatePatientBtnInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on benefits-of-being-private-patient button");
		String clickResultJS = "document.querySelector(\"a[href^='/health-insurance/benefits-of-being-private-patient/']\").click()";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(clickResultJS);
		return header.getText();
	}

	public String clickPregnancyAndHealthInsuranceBtnInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on PregnancyAndHealthInsurance button");
		String clickResultJS = "document.querySelector(\"a[href^='/health-insurance/health-insurance-waiting-periods-pregnancy/']\").click()";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(clickResultJS);
		return header.getText();
	}

	public String clickWhyHealthInsuranceBtnInHealth() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on health button");
		new Actions(driver).moveToElement(healthBtn).perform();
		testlog.log(Status.INFO, "click on why health insurance button");
		String clickResultJS = "document.querySelector(\"a[href^='/health-insurance/why-get-private-health-insurance/']\").click()";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(clickResultJS);
		return header.getText();
	}

	public String clickCompareLifeInsuranceBtnInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on compare life insurance button");
		compareLifeInsuranceButtonInLife.click();
		return header.getText();
	}

	public String clickWhatIsLifeInsuranceBtnInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on what is life insurance button");
		WhatIslifeInsurance.click();
		return header.getText();
	}

	public String clickWhyLifeInsuranceBtnInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on why life insurance button");
		whylifeInsurance.click();
		return header.getText();
	}

	public String clickTypesOfLifeInsuranceBtnInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on types of life insurance button");
		lifeinsurancetypes.click();
		return header.getText();
	}

	public String clickLifeInsuranceCalcInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on life insurance calculator button");
		lifeinsuranceCalc.click();
		return header.getText();
	}

	public String clickIncomeProtCalcInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on income protection calculator button");
		incomeProtCalc.click();
		return header.getText();
	}

	public String clickLifeInsuranceFAQsInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on life insurance FAQS button");
		lifeinsuranceFAQS.click();
		return header.getText();
	}

	public String clickHowToPurchaseLifeInsuranceBtnInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on HowToPurchaseLifeInsurance Btn");
		howToPurchaseLifeInsurance.click();
		return header.getText();
	}

	public String clickTPDInsuranceBtnInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on tpd Insurance Btn");
		tpdInsuranceBtn.click();
		return header.getText();
	}

	public String clickTraumaInsuranceBtnInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on trauma Insurance Btn");
		TraumaInsuranceBtn.click();
		return header.getText();
	}

	public String clickKeyPersonInsuranceBtnInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on key person Insurance Btn");
		KeyPersonInsuranceBtn.click();
		return header.getText();
	}

	public String clickMakeTheMostOfYourFreedomYearsBtnInLife() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on makeMostOfFreedomYears Insurance Btn");
		makeMostOfFreedomYears.click();
		return header.getText();
	}

	public String clickLifeInsuranceVsIncomeProtBtn() {

		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on LifeInsurance Vs IncomeProtection Insurance Btn");
		lifeInsVsIncomeProt.click();
		return header.getText();
	}

	public String clickfindASuitableLifeInsPolicy() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on life button");
		new Actions(driver).moveToElement(lifeInsurance).perform();
		testlog.log(Status.INFO, "click on findingASuitableLifeInsurancePolicy Btn");
		findingASuitableLifeInsurancePolicy.click();
		return header.getText();
	}

	// tc
	public String clickFinanceThenHomeLoansThenCompareHomeLoans() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on compare home loans Btn");
		compareHomeLoansBtn.click();
		return header.getText();
	}

	// tc
	public String clickFinanceThenHomeLoans() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on schedule a call Btn");
		scheduleACallBtnInHomeLoans.click();
		return header.getText();
	}

	// tc
	public String clickHomeLoanCalc() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on home loan calc Btn");
		homeLoanCalc.click();
		return header.getText();
	}

	// tc
	public String clickStampDutyCalc() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on StampDuty calc Btn");
		stampDutyCalc.click();
		return header.getText();
	}

	// tc
	public String clickBorrowingPowerCalc() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on BorrowingPower calc Btn");
		BorrowingPowerCalc.click();
		return header.getText();
	}

	// tc
	public String clickExtraRepayCalc() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on extra repay calc Btn");
		extraRepCalc.click();
		return header.getText();
	}

	// tc
	public String clickAllHomeLoanCalc() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on all home loan calc Btn");
		allHomeLoansCalc.click();
		return header.getText();
	}

	// tc
	public String clickStampDuty() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on stamp duty Btn");
		stampDuty.click();
		return header.getText();
	}

	// tc
	public String clickRefinanceHomeLoansbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on refinance home loans Btn");
		refHomeLoans.click();
		return header.getText();
	}

	// tc
	public String clickVariableRateHomeLoansbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on Variable Rate home loans Btn");
		varRateHomeLoans.click();
		return header.getText();
	}

	// tc
	public String clickFixedRateHomeLoansbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on fixedRate  home loans Btn");
		fixedRateHomeLoan.click();
		return header.getText();
	}

	// tc
	public String clickInterestOnlyHomeLoansbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on interest only  home loans Btn");
		interestOnlyHomeLoans.click();
		return header.getText();
	}

	// tc
	public String clickFixedVsVariableInterestbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on FixedVsVariable interest  Btn");
		Fixedvsvariableinterest.click();
		return header.getText();
	}

	// tc
	public String clickLendersMortagagebtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on LendersMortagage insurance Btn");
		Lendersmortgageinsurance.click();
		return header.getText();
	}

	// tc
	public String clickPropertyInvestmentbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on property investment insurance Btn");
		Propertyinvestment.click();
		return header.getText();
	}

	// tc
	public String clickFirstHomeBuyersbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on first Home buyers grant Btn");
		Firsthomebuyers.click();
		return header.getText();
	}

	// tc
	public String clickHowMuchCanIBorrowbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on how much can i borrow Btn");
		HowmuchcanIborrow.click();
		return header.getText();
	}

	// tc
	public String clickShouldIUseMortagageBrokerbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on ShouldIUseMortagageBroker Btn");
		ShouldIusemortgagebroker.click();
		return header.getText();
	}

	// tc
	public String clickOnHomeLoanAppCheckListbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on HomeLoanAppCheckList Btn");
		Homeloanapplicationchecklist.click();
		return header.getText();
	}

	// tc
	public String clickOnTenTipsForFinanciallySavyRenovatersbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on TenTipsForFinanciallySavyRenovaters Btn");
		tentipsforfinanciallysavvyrenovators.click();
		return header.getText();
	}

	// tc
	public String clickOnTenMortagageRepaybtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on Ten Mortagage rep Btn");
		tenmortgagerepaymenttips.click();
		return header.getText();
	}

	// tc
	public String clickOnDebtConsolidationbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on debt consolidation Btn");
		Debtconsolidationbyrefinancing.click();
		return header.getText();
	}

	// tc
	public String clickOnHowInterestRatesAffectYourHomeLoanbtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on home loans button");
		new Actions(driver).moveToElement(homeLoansBtn).perform();
		testlog.log(Status.INFO, "click on HowInterestRatesAffectYourHomeLoan Btn");
		Howinterestratesaffecthomeloan.click();
		return header.getText();
	}

	public String clickOnCompareBusinessLoansBtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on business loans button");
		new Actions(driver).moveToElement(businessLoansBtn).perform();
		testlog.log(Status.INFO, "click on compareBusinessLoansBtn Btn");
		cutils.waitForElementVisible(compareBusinessLoansBtn, 30);
		compareBusinessLoansBtn.click();
		return headerTwo.getText();

	}

	public String clickOnScheduleAcallBtnBusinessLoansBtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on business loans button");
		new Actions(driver).moveToElement(businessLoansBtn).perform();
		testlog.log(Status.INFO, "click on schedule a call Btn");
		scheduleACallBtnInBusinessLoans.click();
		return headerTwo.getText();

	}

	public String clickOnChattelMortgage() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on business loans button");
		new Actions(driver).moveToElement(businessLoansBtn).perform();
		testlog.log(Status.INFO, "click on Chattel Mortgage Btn");
		ChattelMortgage.click();
		return header.getText();

	}

	public String clickOnEquipmentLoansAndFinancing() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on business loans button");
		new Actions(driver).moveToElement(businessLoansBtn).perform();
		testlog.log(Status.INFO, "click on EquipmentFinance Btn");
		equipmentFinance.click();
		return header.getText();

	}

	public String clickOnSecuredBusinessLoans() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on business loans button");
		new Actions(driver).moveToElement(businessLoansBtn).perform();
		testlog.log(Status.INFO, "click on secured business loans Btn");
		securedBusinessLoans.click();
		return header.getText();

	}

	public String clickOnUnSecuredBusinessLoans() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on business loans button");
		new Actions(driver).moveToElement(businessLoansBtn).perform();
		testlog.log(Status.INFO, "click on Unsecured business loans Btn");
		UnsecuredBusinessLoans.click();
		return header.getText();

	}

	public String clickOnBusinessOverdraft() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on business loans button");
		new Actions(driver).moveToElement(businessLoansBtn).perform();
		testlog.log(Status.INFO, "click on business overdraft Btn");
		BusinessOverdraft.click();
		return header.getText();

	}

	public String clickOnCompareIncomeprotection() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on income protection button");
		new Actions(driver).moveToElement(incomeProtectionBtn).perform();
		testlog.log(Status.INFO, "click on compare income protection button");
		compareIncomeProt.click();
		return header.getText();

	}

	public String clickOnBestIncomeprotectionCover() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on income protection button");
		new Actions(driver).moveToElement(incomeProtectionBtn).perform();
		testlog.log(Status.INFO, "click on best income protection cover button");
		bestIncomeProtCover.click();
		return header.getText();

	}

	public String clickOnIncomeProtectionInsuranceTaxDeductibleBtn() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on income protection button");
		new Actions(driver).moveToElement(incomeProtectionBtn).perform();
		testlog.log(Status.INFO, "click on Income Protection Insurance Tax Deductible button");
		isIncomeProtTaxDeductable.click();
		return header.getText();

	}

	public String clickOnIncomeProtectionThroughSuperannuation() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on income protection button");
		new Actions(driver).moveToElement(incomeProtectionBtn).perform();
		testlog.log(Status.INFO, "click on IncomeProtectionThroughSuperannuation button");
		protIncomeThroughSuperAnnuation.click();
		return header.getText();
	}

	public String clickOnIncomeProtectionInsurancevsMortgageProtection() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on income protection button");
		new Actions(driver).moveToElement(incomeProtectionBtn).perform();
		testlog.log(Status.INFO, "click on IncomeProtectionInsurancevsMortgageProtection button");
		incomeVsMortgageProt.click();
		return header.getText();
	}

	public String clickOnMLCIncomeProtection() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on income protection button");
		new Actions(driver).moveToElement(incomeProtectionBtn).perform();
		testlog.log(Status.INFO, "click on MLC Income protection button");
		MLCincomeProt.click();
		return header.getText();
	}

	public String clickOnTALIncomeProtection() {
		testlog.log(Status.INFO, "mouse hover on finance button");
		new Actions(driver).moveToElement(financeHover).perform();
		testlog.log(Status.INFO, "mouse hover on income protection button");
		new Actions(driver).moveToElement(incomeProtectionBtn).perform();
		testlog.log(Status.INFO, "click on TAL Income protection button");
		TALincomeProt.click();
		return header.getText();
	}

	public String clickOnCommInsureIncomeProtection() {

		cutils.moveToElement(financeHover, "mouse hover on finance button");
		cutils.moveToElement(incomeProtectionBtn, "mouse hover on finance button");
		cutils.click(commInsureincomeProt, "clicked on commInsureincomeProt button");
		// System.out.println(utils.randonStringGenerator());
		return header.getText();
	}

	public String clickOnFacebook() {

		cutils.click(fblinkhomepage, "clicking on facebook icon");
		cutils.getChildWindow();
		return driver.getTitle();
	}

	public String clickOnTwitter() {

		cutils.click(twitterlinkhomepage, "clicking on twitter icon");
		cutils.getChildWindow();
		return driver.findElement(By.xpath("//span[text()='iSelect']")).getText();
	}

	public String clickOnYoutube() {

		cutils.click(youtubelinkhomepage, "clicking on youtube icon");
		cutils.getChildWindow();
		return driver.findElement(By.xpath("//yt-formatted-string[text()='iSelect']")).getText();
	}

	public Boolean clickOnLinkedIn() {

		cutils.click(linkedInlinkhomepage, "clicking on linked In icon");
		cutils.getChildWindow();
		return driver.findElement(By.cssSelector("button#join-form-submit")).isDisplayed();
	}

	public boolean clicktermsAndConditions() {
		cutils.click(termsAndConditions, "clicking on terms and confitions link");
		return driver.findElement(By.xpath("//h2[text()='Terms and conditions for the use of the iSelect website']"))
				.isDisplayed();
	}

	public boolean clickOnPrivacyPolicy() {
		cutils.click(privacyPolicy, "clicking on privacy policy link");
		return driver.findElement(By.xpath("//h2[text()=\"iSelect’s Privacy Policy\"]")).isDisplayed();
	}

	public boolean clickOnDisclaimer() {
		String text = "The information on iSelect’s website (Website) may change at any time without notice. Our participating providers supply the information on the Website (Website Information) and therefore there may be inaccuracies in the Website Information over which iSelect has no control. In addition, iSelect does not warrant or guarantee the timeliness, accuracy or completeness of the Website Information or the quality or accuracy of the results obtained from the use of the Website. To the maximum extent permitted by law, iSelect has no liability in relation to or arising out of the Website Information and any Website recommendations. You also accept our general Website Terms and Conditions (displayed on our Website) when using our Website for any purpose, and you acknowledge and agree that iSelect may use your personal information in accordance with the iSelect Privacy Policy (displayed on our Website).";
		cutils.click(disclaimer, "clicking on disclaimer link");
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Disclaimer ']")).isDisplayed());
		return driver.findElement(By.xpath("//p[text()='" + text + "']")).isDisplayed();
	}
	
	public boolean clickOnDisclaimerInLifeInsurance() {
		cutils.click(disclaimer, "clicking on disclaimer link");
		return driver.findElement(By.xpath("//h3[text()='iSelect Life Insurance – Disclaimer']")).isDisplayed();
	}

	public String clickOnContactUs() {
		cutils.click(contactUs, "clicking on contact us link");
		return header.getText();
	}

	public String clickOnHowISelectWorks() {
		cutils.click(howIselectworks, "clicking on how iselect works");
		return driver.findElement(By.xpath("//h3[text()='How iSelect works']")).getText();
	}

	public String clickOnOurCompany() {
		cutils.click(ourCompany, "clicking on how our companny works");
		return header.getText();
	}

	public String clickOnCareers() {
		cutils.click(careers, "clicking on careers");
		return header.getText();
	}

	public String clickOnMediaCenter() {
		cutils.click(mediacentre, "clicking on media center link");
		return header.getText();
	}

	public String clickOnInvestorCentreLink() {
		cutils.click(investorcentre, "clicking on investor center link");
		return header.getText();
	}

	public String clickOnBecomeOurPartner() {
		cutils.click(becomeOurPartnerLink, "Become our partner");
		return header.getText();
	}

	@FindBy(xpath = "//*[contains(text(),'Partner of the Year')]")
	WebElement partnerOfYear;

	@FindBy(xpath = "//h2[text()='iSelect 2019 Partner Awards']")
	WebElement awards;

	public Boolean verifyHealthInsurancePartnerOfyeartextLink() {
		testlog.log(Status.INFO, "verify Health Insurance Partner of the Year text");
		partnerOfYear.click();
		return awards.isDisplayed();
	}

	public Boolean verifyHealthInsurancePartnerOfyearImg() {
		testlog.log(Status.INFO, "verify Health Insurance Partner of the Year img");
		driver.findElement(By.xpath("//a[contains(@href,'partner_awards')]/child::img")).click();
		return awards.isDisplayed();
	}

	@FindBy(xpath = "//h3[text()='Switching electricity & gas']")
	WebElement switchingElecAndGas;

	public String clickSwitchingElecAndGasText() {
		testlog.log(Status.INFO, "verify Switching electricity & gas");
		switchingElecAndGas.click();
		return header.getText();
	}

	@FindBy(xpath = "//h3[text()='What is Life Insurance?']")
	WebElement whatIsLifeInsuranceTxt;

	public String clickWhatIsLifeInsuText() {
		testlog.log(Status.INFO, "verify What is Life Insurance?");
		whatIsLifeInsuranceTxt.click();
		return header.getText();
	}

	@FindBy(xpath = "//a[contains(@href,'energy') and text()='Read more']")
	WebElement readMoreLinkOfEnergy;

	public String clickReadMoreLinkEnergy() {
		testlog.log(Status.INFO, "click readmore link of energy");
		readMoreLinkOfEnergy.click();
		return header.getText();
	}

	@FindBy(xpath = "//a[contains(@href,'life') and text()='Read more']")
	WebElement readMoreLinkOfLife;

	public String clickReadMoreLinkLifeInsurance() {
		testlog.log(Status.INFO, "click readmore link of life");
		readMoreLinkOfLife.click();
		return header.getText();
	}

	public String clickLHCLoadingTileReadMoreInHealth() {
		testlog.log(Status.INFO, "click readmore link of LHCLoadingTile");
		LHCLoadingTileReadMore.click();
		return header.getText();
	}

	public String clickAmbulanceCoverTileReadMoreInHealth() {
		testlog.log(Status.INFO, "click readmore link of Ambulance Cover Tile");
		AmbulanceLoadingTileReadMore.click();
		return header.getText();
	}

	public String clickPrivateHospitalCoverTileReadMoreInHealth() {
		testlog.log(Status.INFO, "click readmore link of private hospital Cover Tile");
		privateHospitalReadMore.click();
		return header.getText();
	}

	public String clickHealthFundsReadMoreInHealth() {
		testlog.log(Status.INFO, "click readmore link of health funds Cover Tile");
		healthFundsReadMore.click();
		return header.getText();
	}

	public String clickFindingSuitableHealthInsTileInHealth() {
		testlog.log(Status.INFO, "click readmore link of finding suitable health ins Cover Tile");
		findingSuitableHealthInsReadMore.click();
		return header.getText();
	}

	public String clickCompareCarInsuranceBtn() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on compare car insurance btn");
		compareCarinsuranceBtn.click();
		return headerTwo.getText();
	}

	public String clickMovingHouseBtnInCarHover() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on moving house btn");
		movingHouseInCar.click();
		return header.getText();
	}

	public String clickMovingHouseBtnInHomeAndContentsHover() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on home&contents button");
		new Actions(driver).moveToElement(homeAndContentsBtn).perform();
		testlog.log(Status.INFO, "click on moving house btn");
		movingHouseInHomeAndContents.click();
		return header.getText();
	}

	public String clickTypesOfCarInsInCarHover() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on types of car insurance btn");
		typesOfCarInsurance.click();
		return header.getText();
	}

	public String clickSwitchingCarInsBtn() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on switching car ins btn");
		switchingCarInsurance.click();
		return header.getText();
	}

	public String clickSavingOnCarInsBtn() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on saving on car ins btn");
		savingOnCarInsurance.click();
		return header.getText();
	}

	public String clickOnComprehensiveExplained() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on ComprehensiveExplained btn");
		ComprehensiveExplained.click();
		return header.getText();
	}

	public String clickOnComprehensiveVsThirdParty() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on Comprehensive Vs ThirdParty btn");
		ComprehensivevsThirdParty.click();
		return header.getText();
	}

	public String clickOnCompulsoryThirdParty() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on CompulsoryThirdParty btn");
		compulsoryThirdParty.click();
		return header.getText();
	}

	public String clickOnSeniorsCarIns() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on seniors car insurance btn");
		seniorsCarInsurance.click();
		return header.getText();
	}

	public String clickOnComprehensiveCarInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on Comprehensive Car Insurance btn");
		ComprehensiveCarInsurance.click();
		return header.getText();
	}

	public String clickOnCarInsuranceVic() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on  Car Insurance VIC ");
		VicCarInsurance.click();
		return header.getText();
	}

	public String clickOnCarInsuranceNSW() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on  Car Insurance NSW ");
		NSWCarInsurance.click();
		return header.getText();
	}

	public String clickOnCarInsuranceQLD() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on  Car Insurance QLD ");
		CarInsuranceQLD.click();
		return header.getText();
	}

	public String clickOnCarInsuranceSA() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on  Car Insurance SA ");
		CarInsuranceSA.click();
		return header.getText();
	}

	public String clickOnCarInsuranceTasmania() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car  button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on  Car Insurance tasmania ");
		TasmaniaCarInsurance.click();
		return header.getText();
	}

	public String clickOnCarInsuranceACT() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on  Car Insurance ACT ");
		ActCarInsurance.click();
		return header.getText();
	}

	public String clickOnDoiNeedCarInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on  do i need car insurance link");
		DoIneedCarInsurance.click();
		return header.getText();
	}

	public String clickOnTipsForFirstTimeDrivers() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on tips for first time drivers");
		Tipsforfirsttimedrivers.click();
		return header.getText();
	}

	public String clickOnTipsForBuyingCarInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on tips for buying car insurance");
		tipsForBuyingcarIns.click();
		return header.getText();
	}

	public String clickOnMakingAClaimAfterCarAccident() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on making a claim after car accident");
		Makingclaimafteraccident.click();
		return header.getText();
	}

	public String clickOnCarInsuranceGlossary() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on car insurance glossary");
		CarInsuranceglossary.click();
		return header.getText();
	}

	public String clickOnAgreedvaluevsmarketvalueCarInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on agreed vs market value car insurance");
		Agreedvsmarketvaluecarinsurance.click();
		return header.getText();
	}

	public String clickOnFindingBestCarInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on car button");
		new Actions(driver).moveToElement(carBtn).perform();
		testlog.log(Status.INFO, "click on finding best car insurance");
		Findingthebestcarinsurance.click();
		return header.getText();
	}

	public String clickOnFindHomeAndContentsButton() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on home & contents button");
		new Actions(driver).moveToElement(homeAndContentsBtn).perform();
		testlog.log(Status.INFO, "click on find home & contents button");
		findHomeAndContentsBtn.click();
		return header.getText();
	}

	public String clickOnWhatIsHomeAndContentsInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on home & contents button");
		new Actions(driver).moveToElement(homeAndContentsBtn).perform();
		testlog.log(Status.INFO, "click on what is home & contents button");
		whatIsHomeAndContentsBtn.click();
		return header.getText();
	}

	public String clickOnInsuranceForRenters() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on home & contents button");
		new Actions(driver).moveToElement(homeAndContentsBtn).perform();
		testlog.log(Status.INFO, "click on insuranceForRenters button");
		insuranceForRentersBtn.click();
		return header.getText();
	}

	public String clickOnAHomeOwnersGuideToHomeAndContentsInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on home & contents button");
		new Actions(driver).moveToElement(homeAndContentsBtn).perform();
		testlog.log(Status.INFO, "click on HomeOwners Guide To HomeAndContents insurance button");
		homeOwnersGuideToInsurance.click();
		return header.getText();
	}

	public String clickOnHomeAndContentsInsuranceFAQS() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on home & contents button");
		new Actions(driver).moveToElement(homeAndContentsBtn).perform();
		testlog.log(Status.INFO, "click on HomeAndContents insurance FAQS");
		HomeAndContentsFAQs.click();
		return header.getText();
	}

	public String clickOnContentsInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on home & contents button");
		new Actions(driver).moveToElement(homeAndContentsBtn).perform();
		testlog.log(Status.INFO, "click on contents insurance ");
		Contentsinsurance.click();
		return header.getText();
	}

	public String clickOnLandlordInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on home & contents button");
		new Actions(driver).moveToElement(homeAndContentsBtn).perform();
		testlog.log(Status.INFO, "click on Landlord insurance ");
		Landlordinsurance.click();
		return header.getText();
	}

	public String clickOnMovingWithYourPartner() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on home & contents button");
		new Actions(driver).moveToElement(homeAndContentsBtn).perform();
		testlog.log(Status.INFO, "click on MovingInWithYourPartner ");
		MovingInWithYourPartner.click();
		return header.getText();
	}

	public String clickOnMakeYourNextHouseMoveQuick() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on home & contents button");
		new Actions(driver).moveToElement(homeAndContentsBtn).perform();
		testlog.log(Status.INFO, "click on Make Your Next House Move Quick ");
		Makeyournexthousemovequick.click();
		return header.getText();
	}

	public String clickOnClaimingHomeAndContents() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on home & contents button");
		new Actions(driver).moveToElement(homeAndContentsBtn).perform();
		testlog.log(Status.INFO, "click on ClaimingHomeAndContents ");
		ClaimingHomeAndContentsInsurance.click();
		return header.getText();
	}

	public String clickOnCompareBusinessInsuranceBtn() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on business insurance button");
		new Actions(driver).moveToElement(businessInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on CompareBusinessInsuranceBtn ");
		compareBusinessInsurance.click();
		return header.getText();
	}

	public String clickOnPublicLiabilityInsuranceBtnInQLD() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on business insurance button");
		new Actions(driver).moveToElement(businessInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on PublicLiabilityInsuranceBtnInQLD ");
		publicLiabilityInsuranceQLD.click();
		return header.getText();
	}

	public String clickOnPublicLiabilityInsuranceBtnInSA() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on business insurance button");
		new Actions(driver).moveToElement(businessInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on PublicLiabilityInsuranceBtnIn SA ");
		publicLiabilityInsuranceSA.click();
		return header.getText();
	}

	public String clickOnPublicLiabilityInsuranceBtnInNSW() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on business insurance button");
		new Actions(driver).moveToElement(businessInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on PublicLiabilityInsuranceBtnIn NSW");
		publicLiabilityInsuranceNSW.click();
		return header.getText();
	}

	public String clickOnPublicLiabilityInsuranceBtnInWA() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on business insurance button");
		new Actions(driver).moveToElement(businessInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on PublicLiabilityInsuranceBtnIn WA");
		publicLiabilityInsuranceWA.click();
		return header.getText();
	}

	public String clickOnPublicLiabilityInsuranceBtn() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on business insurance button");
		new Actions(driver).moveToElement(businessInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on PublicLiabilityInsuranceBtn");
		publicLiabilityInsurance.click();
		return header.getText();
	}

	public String clickOnProfessionalIdemnityInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on business insurance button");
		new Actions(driver).moveToElement(businessInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on ProfessionalIdemnityInsurance");
		ProfessionalIndemnityInsurance.click();
		return header.getText();
	}

	public String clickOnCyberLiabilityInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on business insurance button");
		new Actions(driver).moveToElement(businessInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on CyberLiabilityInsurance");
		cyberLiabilityInsuranceSA.click();
		return header.getText();
	}

	public String clickOnPersonalAccidentInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on business insurance button");
		new Actions(driver).moveToElement(businessInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on personal accident insurance");
		PersonalAccidentInsurance.click();
		return header.getText();
	}

	public String clickOnInsuranceForTradies() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on business insurance button");
		new Actions(driver).moveToElement(businessInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on insurance for tradies");
		InsuranceForTradies.click();
		return header.getText();
	}

	public String clickOnCompareTravelInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on travel insurance button");
		new Actions(driver).moveToElement(travelInsuranceBtnInInsurance).perform();
		testlog.log(Status.INFO, "click on compare travel insurance btn");
		compareTravelInsurance.click();
		return header.getText();
	}

	public String clickOnFindingBestTravelIns() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on travel insurance button");
		new Actions(driver).moveToElement(travelInsuranceBtnInInsurance).perform();
		testlog.log(Status.INFO, "click on finding best travel insurance btn");
		findingbesttravelinsurance.click();
		return header.getText();
	}

	public String clickOnAnnualTravelInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on travel insurance button");
		new Actions(driver).moveToElement(travelInsuranceBtnInInsurance).perform();
		testlog.log(Status.INFO, "click on annual travel insurance btn");
		annualTravelInsurance.click();
		return header.getText();
	}

	public String clickOnInternationalTravelInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on travel insurance button");
		new Actions(driver).moveToElement(travelInsuranceBtnInInsurance).perform();
		testlog.log(Status.INFO, "click on international travel insurance btn");
		internationalTravelInsurance.click();
		return header.getText();
	}

	public String clickOnDomesticTravelInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on travel insurance button");
		new Actions(driver).moveToElement(travelInsuranceBtnInInsurance).perform();
		testlog.log(Status.INFO, "click on domestic travel insurance btn");
		domesticTravelInsurance.click();
		return header.getText();
	}

	public String clickOnCruiseTravelInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on travel insurance button");
		new Actions(driver).moveToElement(travelInsuranceBtnInInsurance).perform();
		testlog.log(Status.INFO, "click on cruise travel insurance btn");
		cruiseTravelInsurance.click();
		return header.getText();
	}

	public String clickOnComparePetInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on pet button");
		new Actions(driver).moveToElement(petInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on compare pet insurance btn");
		comparePetInsurance.click();
		return header.getText();
	}

	public String whatIsPetInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on pet  button");
		new Actions(driver).moveToElement(petInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on what is pet insurance btn");
		whatIsPetInsurance.click();
		return headerTwo.getText();
	}

	public String whatIsCostOfOwingAPet() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on pet button");
		new Actions(driver).moveToElement(petInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on what is cost of owing a pet  btn");
		costOfOwingAPet.click();
		return header.getText();
	}

	public String getRightVetForYourPet() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on pet  button");
		new Actions(driver).moveToElement(petInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on get right vet for your pet  btn");
		getTheRightVetForPet.click();
		return header.getText();
	}

	public String clickOnReviewingPetInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on pet  button");
		new Actions(driver).moveToElement(petInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on ReviewingPetInsurance  btn");
		reviewingPetIns.click();
		return header.getText();
	}

	public String clickOnWhatIsCatInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on pet  button");
		new Actions(driver).moveToElement(petInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on what is cat  btn");
		catInsurance.click();
		return header.getText();
	}

	public String clickOnWhatIsDogInsurance() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on pet button");
		new Actions(driver).moveToElement(petInsuranceBtn).perform();
		testlog.log(Status.INFO, "click on what is dog  btn");
		dogInsurance.click();
		return header.getText();
	}

	public String clickOnCompareOverseasVisitorCover() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on what is dog  btn");
		compareOverseasVisitorCover.click();
		return header.getText();
	}

	public String clickOnChoosingRightCover() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on choosing right cover  btn");
		choosingRightCover.click();
		return header.getText();
	}

	public String clickOnOVCBenefits() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on having OVC benefits  btn");
		OVCBenefits.click();
		return header.getText();
	}

	public String clickOnVisaReqBtn() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on visa req btn");
		visaReq.click();
		return header.getText();
	}

	public String clickOnWaitingPeriodBtn() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on waiting period btn");
		waitingperiods.click();
		return header.getText();
	}

	public String clickOnPolicyDetailsBtn() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on policy details btn");
		policydetails.click();
		return header.getText();
	}

	public String clickOnHowToPurchaseOVC() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on how to purchase OVC btn");
		howToPurchaseOVC.click();
		return header.getText();
	}

	public String clickOnOVCInCompareOptions() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on OVC btn in compare options section");
		overseasVisitorCoverInCompareOptions.click();
		return header.getText();
	}

	public String clickOnOverseasStudentHealthCover() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on overseas student health cover ");
		OverseasStudentHealthCover.click();
		return header.getText();
	}

	public String clickOnAusisBridgingVisaExplained() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on ausis Bridging Visa Explained ");
		ausisBridgingVisa.click();
		return header.getText();
	}

	public String clickOnPermanentResidencyExplained() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on permanent residency Explained ");
		permanentResidencyExplained.click();
		return header.getText();
	}

	public String clickOnReciprocalHealthCareAgreements() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on reciprocal health care agreements");
		reciprocalHealthCareAgreements.click();
		return header.getText();
	}

	public String clickOn417WorkingHolidayVisa() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on 417 working holiday visa");
		WorkingHolidayVisa417.click();
		return header.getText();
	}

	public String clickOn411ExchangeVisa() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on 411 exchange visa");
		ExchangeVisa411.click();
		return header.getText();
	}

	public String clickOn416SpecialProgramVisa() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on 416 special program visa");
		specialProgramVisa416.click();
		return header.getText();
	}

	public String clickOn405InvestorRetirementVisa() {
		testlog.log(Status.INFO, "mouse hover on insurance button");
		new Actions(driver).moveToElement(InsuranceHoverBtn).perform();
		testlog.log(Status.INFO, "mouse hover on overseas visitor cover button");
		new Actions(driver).moveToElement(overseasVisitorCoverBtn).perform();
		testlog.log(Status.INFO, "click on 405 investor retirement visa");
		InvestorRetirementVisa405.click();
		return header.getText();
	}

	public String clickOnSwitchingElectricityProviders() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on switching electricity providers");
		switchingElecProviders.click();
		return header.getText();
	}

	public String clickOnSaveElectricity() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on save electricity");
		saveElec.click();
		return header.getText();
	}

	public String clickOnElectricityProviders() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on ElectricityProviders");
		elecProviders.click();
		return header.getText();
	}

	public String clickOnAusisEnergyQuotes() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on ausis energy quotes");
		ausisEnergyQuotes.click();
		return header.getText();
	}

	public String clickOnSolarEnergy() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on solar energy");
		solarEnergy.click();
		return header.getText();
	}

	public String clickOnWindEnergy() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on wind energy");
		windEnergy.click();
		return header.getText();
	}

	public String clickOnHydroElec() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on hydro elec");
		hydroelec.click();
		return header.getText();
	}

	public String clickOnEnergyComparison() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on energy comparison");
		energyComp.click();
		return header.getText();
	}

	public String clickOnEnergyComparisonVIC() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on energy comparison VIC");
		energyComparisonVIC.click();
		return header.getText();
	}

	public String clickOnEnergyComparisonQLD() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on energy comparison QLD");
		energyCompQLD.click();
		return header.getText();
	}

	public String clickOnEnergyComparisonSA() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on energy comparison SA");
		energyCompSA.click();
		return header.getText();
	}

	public String clickOnEnergyComparisonNSW() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on energy comparison NSW");
		energyCompNSW.click();
		return header.getText();
	}

	public String clickOnEnergyComparisonACT() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on energy comparison ACT");
		energyComparisonACT.click();
		return header.getText();
	}

	public String clickOnRenewableEnergy() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on renewable energy");
		renewableEnergy.click();
		return header.getText();
	}

	public String clickOnEnergySavingtips() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on energy saving tips");
		energySavingTips.click();
		return header.getText();
	}

	public String clickOnFindTheBestEnergyPlan() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on find the best energy plan");
		findbestEnergyPlan.click();
		return header.getText();
	}

	public String clickOnFindTheCheaperEnergyPlan() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on find the cheaper energy plan");
		findCheapEnergyPlan.click();
		return header.getText();
	}

	public String clickOnEasyWaysToreduceYourElecBill() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on easy ways to reduce your electricity bills");
		easyWaysToReduceElecBill.click();
		return header.getText();
	}

	public String clickOnHowDoEnergyDiscountsWork() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on how do energy discounts work");
		howDoEnergyDiscWork.click();
		return header.getText();
	}

	public String clickOnHowToHandleHighElecBill() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on how to handle high elec bills");
		howToHandleHighElecBill.click();
		return header.getText();
	}

	public String clickOnBenefitsOfSolarEnergy() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on benefits of solar energy");
		benefitsOfSolarEnergy.click();
		return header.getText();
	}

	public String clickOnViewBasicPlanInfo() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on view basic plan information");
		viewbasicPlanInfo.click();
		return driver.findElement(By.xpath("//h5")).getText();
	}

	public String clickOnViewEnergyFactsSheet() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on view  energy facts sheet");
		viewEnergyFactSheets.click();
		return driver.findElement(By.xpath("//h5")).getText();
	}

	public String clickOnCompareElecAndGasBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on electricity and gas hover");
		new Actions(driver).moveToElement(elecAndGasBtn).perform();
		testlog.log(Status.INFO, "click on compare electricity and gas btn");
		compareElecAndGas.click();
		return header.getText();
	}

	public String clickOnNBNBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on nbn button");
		nbnlink.click();
		return header.getText();
	}

	public String clickOnInternetSpeedBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on internet speed button");
		internetspeed.click();
		return header.getText();
	}

	public String clickOnmobileBroadbandBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on mobile broadband button");
		mobileBroadband.click();
		return header.getText();
	}

	public String clickOnADSLTwoPlusBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on ADSL2+ button");
		adsl.click();
		return header.getText();
	}

	public String clickOnCheapInternetBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on cheap internet button");
		cheapInternet.click();
		return header.getText();
	}

	public String clickOnWirelessInternetBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on wireless internet button");
		wirelessinternet.click();
		return header.getText();
	}

	public String clickOnNakedDSLBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on naked dsl button");
		nakeddsl.click();
		return header.getText();
	}

	public String clickOnNBNPlansBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on NBN plans button");
		nbnPlans.click();
		return header.getText();
	}

	public String clickOnInternetPlansBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on internet plans button");
		internetPlans.click();
		return header.getText();
	}

	public String clickOnInternetProvidersBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on internet providers button");
		internetproviders.click();
		return header.getText();
	}

	public String clickOnInternetDealsBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on internet deals button");
		internetdeals.click();
		return header.getText();
	}

	public String clickOnBroadbandPlansBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on broadband plans button");
		broadbandPlans.click();
		return header.getText();
	}

	public String clickOnWirelessInternetPlansBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on wireless internet plans button");
		wirelessInternetPlans.click();
		return header.getText();
	}

	public String clickOnCableInternetPlansBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on cable internet plans button");
		cableInternetPlans.click();
		return header.getText();
	}

	public String clickOnChoosingRightBroadbandPlan() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on choosing right broadband plans button");
		choosingRightBroadbandPlan.click();
		return header.getText();
	}

	public String clickOnChoosingRightNBNPlan() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on choosing right NBN plans button");
		choosingRightNBNPlan.click();
		return header.getText();
	}

	public String clickOnConnectingToNBNPlan() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on connecting to NBN plans button");
		connectingNBN.click();
		return header.getText();
	}

	public String clickOnMovingHouseMakeItEasyBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on movinghouse make it easy button");
		movingHouseMakeItEasy.click();
		return header.getText();
	}

	public String clickOnHowTogetHighSpeedInternetPlansBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on high speed internet plans button");
		howtogetHighSpeedInternet.click();
		return header.getText();
	}

	public String clickOnWhatIsADSLAndADSLTwoPlusBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on ADSL AND ADSL2+ button");
		whatIsADSLAndADSLPlus.click();
		return header.getText();
	}

	public String clickOnInternetGlossaryBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "click on internet button");
		internetBtn.click();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtnInInternetPage).perform();
		testlog.log(Status.INFO, "click on internet glossary button");
		internetGlossary.click();
		return header.getText();
	}

	public String clickOnCompareBroadbandBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtn).perform();
		compareBroadband.click();
		return header.getText();
	}

	public String clickOnMovingHouseBtnAvailableInInternet() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on internet button");
		new Actions(driver).moveToElement(internetBtn).perform();
		IamMovingBtnInUtilitiesInternet.click();
		return header.getText();
	}

	public String clickOnCompareMobilePlansButton() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on compare mobile plans button");
		new Actions(driver).moveToElement(mobilePlansBtn).perform();
		compareMobilePlans.click();
		return header.getText();
	}

	public String clickOnOSButton() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on compare mobile plans button");
		new Actions(driver).moveToElement(mobilePlansBtn).perform();
		os.click();
		return header.getText();
	}

	public String clickOnHowMuchDataButton() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on compare mobile plans button");
		new Actions(driver).moveToElement(mobilePlansBtn).perform();
		howmuchdata.click();
		return header.getText();
	}

	public String clickOnProvidersButton() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on compare mobile plans button");
		new Actions(driver).moveToElement(mobilePlansBtn).perform();
		providers.click();
		return header.getText();
	}

	public String clickOnPhoneAndInternetBundlesButton() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on compare mobile plans button");
		new Actions(driver).moveToElement(mobilePlansBtn).perform();
		phoneAndInternetBundles.click();
		return header.getText();
	}

	public String clickOn3gVs4gButton() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on compare mobile plans button");
		new Actions(driver).moveToElement(mobilePlansBtn).perform();
		threeGVsFourG.click();
		return header.getText();
	}

	public String clickOnMobileGargonsBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on compare mobile plans button");
		new Actions(driver).moveToElement(mobilePlansBtn).perform();
		mobileJargons.click();
		return header.getText();
	}

	public String clickOnMobilePhoneTipsBtn() {
		testlog.log(Status.INFO, "mouse hover on utilities button");
		new Actions(driver).moveToElement(utilitiesHover).perform();
		testlog.log(Status.INFO, "mouse hover on compare mobile plans button");
		new Actions(driver).moveToElement(mobilePlansBtn).perform();
		mobileTips.click();
		return header.getText();
	}

	public String clickOnHealthInBottomMenu() {
		testlog.log(Status.INFO, "click on health button in bottom menu in main page");
		healthBottomMenu.click();
		return header.getText();
	}

	public String clickOnIncomeProtInBottomMenu() {
		testlog.log(Status.INFO, "click on income protection button in bottom menu in main page");
		incomeProtectionBottomMenu.click();
		return header.getText();
	}

	public String clickOnCarInBottomMenu() {
		testlog.log(Status.INFO, "click on car button in bottom menu in main page");
		carBottomMenu.click();
		return headerTwo.getText();
	}

	public String clickOnTravelInBottomMenu() {
		testlog.log(Status.INFO, "click on Travel button in bottom menu in main page");
		travelBottomMenu.click();
		return header.getText();
	}

	public String clickOnBusinessInBottomMenu() {
		testlog.log(Status.INFO, "click on business button in bottom menu in main page");
		businessBottomMenu.click();
		return header.getText();
	}

	public String clickOnLifeInBottomMenu() {
		testlog.log(Status.INFO, "click on Life button in bottom menu in main page");
		lifeBottomMenu.click();
		return header.getText();
	}

	public String clickOnPetInBottomMenu() {
		testlog.log(Status.INFO, "click on pet button in bottom menu in main page");
		petBottomMenu.click();
		return header.getText();
	}

	public String clickOnHomeAndContentsInBottomMenu() {
		testlog.log(Status.INFO, "click on HomeAndContents button in bottom menu in main page");
		homeAndContentsBottomMenu.click();
		return header.getText();
	}

	public String clickOnOverseasVisitorCoverInBottomMenu() {
		testlog.log(Status.INFO, "click on overseas visitor cover button in bottom menu in main page");
		overseasVisitorCoverBottomMenu.click();
		return header.getText();
	}

	public String clickOnHomeLoansInBottomMenu() {
		testlog.log(Status.INFO, "click on Home Loans button in bottom menu in main page");
		homeLoansBottomMenu.click();
		return header.getText();
	}

	public String clickOnMovingHouseInBottomMenu() {
		testlog.log(Status.INFO, "click on moving house button in bottom menu in main page");
		movingHouseBottomMenu.click();
		return header.getText();
	}

	public String clickOnMobilePlansInBottomMenu() {
		testlog.log(Status.INFO, "click on mobile plans button in bottom menu in main page");
		mobilePlansBottomMenu.click();
		return header.getText();
	}

	public String clickOnInternetInBottomMenu() {
		testlog.log(Status.INFO, "click on internet button in bottom menu in main page");
		internetBottomMenu.click();
		return header.getText();
	}

	public String clickOnElecAndGasInBottomMenu() {
		testlog.log(Status.INFO, "click on elec and gas button in bottom menu in main page");
		elecAndGasBottomMenu.click();
		return header.getText();
	}

	public String clickOnCarLoansInBottomMenu() {
		testlog.log(Status.INFO, "click on Car Loans button in bottom menu in main page");
		carLoansBottomMenu.click();
		return header.getText();
	}

	public String clickOnPersonalLoansInBottomMenu() {
		testlog.log(Status.INFO, "click on Personal Loans button in bottom menu in main page");
		personalLoansBottomMenu.click();
		return header.getText();
	}

	public String clickOnBusinessLoansInBottomMenu() {
		testlog.log(Status.INFO, "click on Business Loans button in bottom menu in main page");
		businessLoansBottomMenu.click();
		return headerTwo.getText();
	}

	public String clickOnCreditCardsInBottomMenu() {
		testlog.log(Status.INFO, "click on  credit cards button in bottom menu in main page");
		creditCardsBottomMenu.click();
		return header.getText();
	}

	@FindBy(xpath = "//a[text()='View our blog']")
	WebElement viewOurBlog;

	public BlogPage clickOnViewOurBlogButton() {
		testlog.log(Status.INFO, "click on view our blog button in main page");
		viewOurBlog.click();
		return new BlogPage(driver, testlog);
	}

}
