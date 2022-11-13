package com.iselect.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.iselect.base.BaseClass;
import org.openqa.selenium.By;

public class GlobalHomePageTest extends BaseClass {

	@Test(groups = { "Smoke" })
	public void testHealthInsuranceButton() {

		Assert.assertTrue(gpage.verifyHealthInsuranceButton());
	}

	@Test(groups = { "Smoke" })
	public void testLifeInsuranceButton() {
                driver.get("https://www.saucedemo.com/"); // url navigation
		driver.manage().window().maximize(); // maximize window
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); // enter input
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click(); // click
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
	}
	/*

	@Test
	public void testCarInsuranceButton() {

		Assert.assertTrue(gpage.verifyCarInsuranceButton());
	}

	@Test
	public void testHomeAndContentsInsuranceButton() {

		Assert.assertTrue(gpage.verifyHomeAndContentsInsuranceButton());
	}

	@Test
	public void testBusinessInsuranceButton() {

		Assert.assertTrue(gpage.verifyBusinessInsuranceButton());
	}

	@Test
	public void testTravelInsuranceButton() {

		Assert.assertTrue(gpage.verifyTravelInsuranceButton());
	}

	@Test
	public void testPetInsuranceButton() {

		Assert.assertTrue(gpage.verifyPetInsuranceButton());
	}

	@Test
	public void testOverseasCoverInsuranceButton() {

		Assert.assertTrue(gpage.verifyOverseasCoverInsuranceButton());
	}

	@Test
	public void testElecAndGasUtilityBtn() {

		Assert.assertTrue(gpage.verifyElecAndGasButton());
	}

	@Test
	public void testInternetUtilityBtn() {

		Assert.assertTrue(gpage.verifyInternetButton());
	}

	@Test
	public void testMobilePlansUtilityBtn() {
		// test=reports.createTest("testMobilePlansUtilityBtn");

		Assert.assertTrue(gpage.verifyMobilePlansButton());
	}

	@Test
	public void testHomeLoansFinanceButton() {

		Assert.assertTrue(gpage.verifyHomeLoansFinanceButton());
	}

	@Test
	public void testCarLoansFinanceButtonHover() {

		Assert.assertTrue(gpage.verifyCarLoansFinanceButton());
	}

	@Test
	public void testPersonalLoansFinanceButtonHover() {

		Assert.assertTrue(gpage.verifyPersonalLoansFinanceButton());
	}

	@Test
	public void testBusinessLoansFinanceButtonHover() {

		Assert.assertTrue(gpage.verifyBusinessLoansFinanceButton());
	}

	@Test
	public void testCreditCardsBtnInFinanceButtonHover() {

		Assert.assertTrue(gpage.verifyCreditCardsInFinanceButton());
	}

	@Test
	public void testIncomeProtectionBtnInFinanceButtonHover() {

		Assert.assertTrue(gpage.verifyIncomeProtectionInFinanceButton());
	}

	@Test
	public void testMovingHouseBtnInFinanceButtonHover() {

		Assert.assertTrue(gpage.verifyMovingHouseInFinanceButton());
	}

	@Test
	public void testHeadersInMainPage() {

		Assert.assertTrue(gpage.verifyHeadersOnMainPage());
	}

	@Test
	public void testTrustPilotReviewsInMainPage() {

		Assert.assertTrue(gpage.verifyTrustPilotReviews());
	}

	@Test
	public void testGetConnectedAtYourNewHomeBtn() {

		Assert.assertTrue(gpage.verifyGetConnectedAtYourNewHomeBtn());
	}

	@Test
	public void testHealthInsuranceBtnInPopular() {

		Assert.assertTrue(gpage.clickHealthInsuranceBtnInPopularAndVerifyHealthLandingPage());
	}

	@Test
	public void testCarInsuranceBtnInPopular() {

		Assert.assertTrue(gpage.clickCarInsuranceBtnInPopularAndVerifyCarLandingPage());
	}

	@Test
	public void testElecAndGasBtnInPopular() {

		Assert.assertTrue(gpage.clickElecAndGasBtnInPopularAndVerifyEnergyLandingPage());
	}

	@Test
	public void testInternetBtnInPopular() {

		Assert.assertTrue(gpage.clickInternetBtnInPopularAndVerifyInternetPlansLandingPage());
	}

	@Test
	public void testHomeLoansBtnInPopular() {

		Assert.assertTrue(gpage.clickHomeLoansBtnInPopularAndVerifyHomeLoansLandingPage());
	}

	@Test
	public void testLifeInsuranceBtnInPopular() {

		Assert.assertTrue(gpage.clickLifeInsuranceBtnInPopularAndVerifyLifeInsuranceLandingPage());
	}

	@Test
	public void testIncomeProtectionBtnInPopular() {

		Assert.assertTrue(gpage.clickInternetBtnInPopularAndVerifyInternetPlansLandingPage());
	}

	@Test
	public void testInsuranceBtnThenHealthInsuranceBtnInit() {

		Assert.assertTrue(gpage.clickInsuranceBtnThenHealthInsuranceBtn());
	}

	@Test
	public void testInsuranceBtnThenCarInsuranceBtnInit() {

		Assert.assertTrue(gpage.clickInsuranceBtnThenCarInsuranceBtn());
	}

	@Test
	public void testInsuranceBtnThenLifeInsuranceBtnInit() {

		Assert.assertTrue(gpage.clickInsuranceBtnThenLifeInsuranceBtn());
	}

	@Test
	public void testInsuranceBtnThenHomeAndContentsInsuranceBtnInit() {

		Assert.assertTrue(gpage.clickInsuranceBtnThenHomeAndContentsInsuranceBtn());
	}

	@Test
	public void testInsuranceBtnThenBusinessInsuranceBtnInit() {

		Assert.assertTrue(gpage.clickInsuranceBtnThenBusinessInsuranceBtn());
	}

	@Test
	public void testInsuranceBtnThenIncomeProtectionBtnInit() {

		Assert.assertTrue(gpage.clickInsuranceBtnThenIncomeProtectionBtn());
	}

	@Test
	public void testInsuranceBtnThenTravelInsuranceBtnInit() {

		Assert.assertTrue(gpage.clickInsuranceBtnThenTravelInsuranceBtn());
	}

	@Test
	public void testInsuranceBtnThenPetInsuranceBtnInit() {

		Assert.assertTrue(gpage.clickInsuranceBtnThenPetInsuranceBtn());
	}

	@Test
	public void testInsuranceBtnThenOverseasVisitorCoverBtnInit() {

		Assert.assertTrue(gpage.clickInsuranceBtnThenOverseasVisitorCoverInsuranceBtn());
	}

	@Test
	public void testUtilitiesBtnThenElecAndGasBtnInit() {

		Assert.assertTrue(gpage.clickUtilitiesBtnThenElecAndGasBtn());
	}

	@Test
	public void testUtilitiesBtnThenInternetBtnInit() {

		Assert.assertTrue(gpage.clickUtilitiesBtnThenInternet());
	}

	@Test
	public void testUtilitiesBtnThenMobilePlansBtnInit() {

		Assert.assertTrue(gpage.clickUtilitiesBtnThenMobilePlans());
	}

	@Test
	public void testUtilitiesBtnThenMovingHouseBtnInit() {

		Assert.assertTrue(gpage.clickUtilitiesBtnThenMovingHouse());
	}

	@Test
	public void testCompareHealthInsuranceBtnInHealth() {

		Assert.assertTrue(gpage.clickCompareHealthInsurancebuttonInHealth());
	}

	@Test
	public void testScheduleACallBtnInHealth() {

		Assert.assertTrue(gpage.clickScheduleACallbuttonInHealth());
	}

	@Test
	public void testMedicalLevySurchargeBtnInHealth() {

		Assert.assertEquals(gpage.clickMedicalLevySurchargebuttonInHealth(), "The Medicare Levy Surcharge");
	}

	@Test
	public void testLifetimeHealthCoverLoadingBtnInHealth() {

		Assert.assertEquals(gpage.clickLifetimeHealthCoverLoadingbuttonInHealth(), "Lifetime Health Cover Loading");
	}

	@Test
	public void testTaxImplicationsBtnInHealth() {

		Assert.assertEquals(gpage.clicktaxImplicationsbuttonInHealth(),
				"What You Need To Know About Private Health Insurance Tax");
	}

	@Test
	public void testAusisGovtRebateBtnInHealth() {

		Assert.assertEquals(gpage.clickAusisGovtRebatebuttonInHealth(),
				"Private Health Insurance Australian Government Rebate");
	}

	@Test
	public void testAmbulanceCoverBtnInHealth() {

		Assert.assertEquals(gpage.clickAmbulanceCoverbuttonInHealth(), "Ambulance Cover In Australia");
	}

	@Test
	public void testHospitalWaitingPeriodsBtnInHealth() {

		Assert.assertEquals(gpage.clickHospitalWaitingPeriodsbuttonInHealth(), "Health Insurance Waiting Periods");
	}

	@Test
	public void testSwitchingHealthInsuranceBtnInHealth() {

		Assert.assertEquals(gpage.clickSwitchingHealthInsurancebuttonInHealth(), "Switching Health Insurance");
	}

	@Test
	public void testHospitalCoverBtnInHealth() {

		Assert.assertEquals(gpage.clickHospitalCoverbuttonInHealth(), "Hospital Cover");
	}

	@Test
	public void testExtrasCoverBtnInHealth() {

		Assert.assertEquals(gpage.clickExtrasCoverbuttonInHealth(),
				"Extras Cover: Learn more about what can be covered & compare policies*");
	}

	@Test
	public void testSinglesCoverBtnInHealth() {

		Assert.assertEquals(gpage.clickSinglesCoverbuttonInHealth(), "Singles Health Insurance");
	}

	@Test
	public void testCouplesCoverBtnInHealth() {

		Assert.assertEquals(gpage.clickCouplesCoverbuttonInHealth(), "Couples Health Insurance");
	}

	@Test
	public void testFamilyCoverBtnInHealth() {

		Assert.assertEquals(gpage.clickFamilyCoverbuttonInHealth(), "Family Health Insurance");
	}

	@Test
	public void testDentalCoverBtnInHealth() {

		Assert.assertEquals(gpage.clickDentalCoverbuttonInHealth(), "Dental Cover Through Health Insurance");
	}

	@Test
	public void testPregnancyAndNewBornCoverBtnInHealth() {

		Assert.assertEquals(gpage.clickPregnancyAndNewBornCoverbuttonInHealth(),
				"Pregnancy Cover Through Health Insurance");
	}

	@Test
	public void testHealthInsuranceClaimsProcessBtnInHealth() {

		Assert.assertEquals(gpage.clickHealthInsuranceClaimsProcessBtnInHealth(),
				"Understanding The Health Insurance Claim Process");
	}

	@Test
	public void testBenefitsofbeingaprivatepatientBtnInHealth() {

		Assert.assertEquals(gpage.clickBenefitsOfPrivatePatientBtnInHealth(),
				"Whats so good about being a private patient?");
	}

	@Test
	public void testPregnancyAndHealthInsuranceBtnInHealth() {

		Assert.assertEquals(gpage.clickPregnancyAndHealthInsuranceBtnInHealth(),
				"Pregnancy And Health Insurance: What Are The waiting Periods?");
	}

	@Test
	public void testWhyHealthInsuranceBtnInHealth() {

		Assert.assertEquals(gpage.clickWhyHealthInsuranceBtnInHealth(), "Why Should I Get Health Insurance?");
	}

	@Test
	public void testCompareLifeInsuranceBtnInLifeSection() {

		Assert.assertEquals(gpage.clickCompareLifeInsuranceBtnInLife(), "Easily compare life insurance quotes");
	}

	// below test case has bug
	@Test()
	public void testWhatIsLifeInsuranceBtnInLifeSection() {

		Assert.assertEquals(gpage.clickWhatIsLifeInsuranceBtnInLife(), "What Is Life Insurance?");
	}

	@Test
	public void testWhyLifeInsuranceBtnInLifeSection() {

		Assert.assertEquals(gpage.clickWhyLifeInsuranceBtnInLife(), "Why Do You Need Life Insurance?");
	}

	@Test
	public void testTypesOfLifeInsuranceInLifeSection() {

		Assert.assertEquals(gpage.clickTypesOfLifeInsuranceBtnInLife(), "Life Insurance Products");
	}

	@Test
	public void testLifeInsCalcInLifeSection() {

		Assert.assertEquals(gpage.clickLifeInsuranceCalcInLife(), "Tips For Calculating Your Life Insurance Coverage");
	}

	@Test
	public void testIncomeProtectionCalcInLifeSection() {

		Assert.assertEquals(gpage.clickIncomeProtCalcInLife(),
				"Tips For Calculating Your Income Protection Insurance Coverage");
	}

	@Test
	public void testLifeInsFAQsBtnInLifeSection() {

		Assert.assertEquals(gpage.clickLifeInsuranceFAQsInLife(), "Life Insurance  Frequently Asked Questions");
	}

	@Test
	public void testHowToPurchaseLifeInsBtnInLifeSection() {

		Assert.assertEquals(gpage.clickHowToPurchaseLifeInsuranceBtnInLife(), "How To Buy Life Insurance In Australia");
	}

	@Test
	public void testTPDInsuranceBtnInLifeSection() {

		Assert.assertEquals(gpage.clickTPDInsuranceBtnInLife(), "Total and Permanent Disability (TPD) Insurance");
	}

	@Test
	public void testTraumaInsuranceBtnInLifeSection() {

		Assert.assertEquals(gpage.clickTraumaInsuranceBtnInLife(), "Trauma Insurance");
	}

	@Test
	public void testKeyPersonInsuranceBtnInLifeSection() {

		Assert.assertEquals(gpage.clickKeyPersonInsuranceBtnInLife(), "Key Person Insurance");
	}

	@Test
	public void testMakeTheMostOfFreedomYearsInsuranceBtnInLifeSection() {

		Assert.assertEquals(gpage.clickMakeTheMostOfYourFreedomYearsBtnInLife(),
				"How To Make The Most Of The Freedom Years");
	}

	@Test
	public void testLifeInsuranceVsIncomeProtBtnInLifeSection() {

		Assert.assertEquals(gpage.clickLifeInsuranceVsIncomeProtBtn(), "Life And Income Protection Insurance");
	}

	@Test
	public void testfindASuitableLifeInsPolicyInLifeSection() {

		Assert.assertEquals(gpage.clickfindASuitableLifeInsPolicy(), "Life Insurance Products");
	}

	@Test
	public void testHowInterestRatesAffectYourHomeLoanbtn() {

		Assert.assertEquals(gpage.clickOnHowInterestRatesAffectYourHomeLoanbtn(),
				"Interest Rates: What they are and how they work");
	}

	@Test
	public void testclickOnDebtConsolidationbtn() {

		Assert.assertEquals(gpage.clickOnDebtConsolidationbtn(), "Consolidate Debt by Refinancing Your Home Loan");
	}

	@Test
	public void testclickOnTenMortagageRepaybtn() {

		Assert.assertEquals(gpage.clickOnTenMortagageRepaybtn(), "9 ways to pay off your mortgage faster");
	}

	@Test
	public void testclickOnTenTipsForFinanciallySavyRenovatersbtn() {

		Assert.assertEquals(gpage.clickOnTenTipsForFinanciallySavyRenovatersbtn(),
				"10 Tips For Financially Savvy Renovators");
	}

	@Test
	public void testclickOnHomeLoanAppCheckListbtn() {

		Assert.assertEquals(gpage.clickOnHomeLoanAppCheckListbtn(), "Home Loan Application Checklist");
	}

	@Test
	public void testclickShouldIUseMortagageBrokerbtn() {

		Assert.assertEquals(gpage.clickShouldIUseMortagageBrokerbtn(), "Should I Use a Mortgage Broker?");
	}

	@Test
	public void testclickFirstHomeBuyersbtn() {

		Assert.assertEquals(gpage.clickFirstHomeBuyersbtn(), "First Home Buyer Grant");
	}

	@Test
	public void testclickOnHowMuchCanIBorrowbtn() {

		Assert.assertEquals(gpage.clickHowMuchCanIBorrowbtn(), "How Much Can I Borrow For My Home Loan?");
	}

	@Test
	public void testLendersMortgageInsuranceAustralia() {

		Assert.assertEquals(gpage.clickLendersMortagagebtn(), "Lenders Mortgage Insurance Australia");
	}

	@Test
	public void testclickPropertyInvestmentbtn() {

		Assert.assertEquals(gpage.clickPropertyInvestmentbtn(), "Property Investment");
	}

	@Test
	public void testclickInterestOnlyHomeLoansbtn() {

		Assert.assertEquals(gpage.clickInterestOnlyHomeLoansbtn(), "Interest Only Home Loans");
	}

	@Test
	public void testclickFixedVsVariableInterestbtn() {

		Assert.assertEquals(gpage.clickFixedVsVariableInterestbtn(),
				"Difference Between Fixed and Variable Home Loans");
	}

	@Test
	public void testclickVariableRateHomeLoansbtn() {

		Assert.assertEquals(gpage.clickVariableRateHomeLoansbtn(), "Variable Rate Home Loans");
	}

	@Test
	public void testclickFixedRateHomeLoansbtn() {

		Assert.assertEquals(gpage.clickFixedRateHomeLoansbtn(), "Difference Between Fixed and Variable Home Loans");
	}

	@Test
	public void testStampDutyBtn() {

		Assert.assertEquals(gpage.clickStampDuty(), "What is Stamp Duty and how does it work?");
	}

	@Test
	public void testRefinancehomeloans() {

		Assert.assertEquals(gpage.clickRefinanceHomeLoansbtn(), "Refinancing Your Home Loan");
	}

	@Test
	public void testExtraRepaymentBtn() {

		Assert.assertEquals(gpage.clickExtraRepayCalc(), "Extra Repayments Calculator");
	}

	@Test
	public void testAllHomeLoanCalculators() {

		Assert.assertEquals(gpage.clickAllHomeLoanCalc(), "Home Loan Calculators");
	}

	@Test
	public void testBorrowingPowerCalc() {

		Assert.assertEquals(gpage.clickBorrowingPowerCalc(), "Borrowing Power Calculator");
	}

	@Test
	public void testclickStampDutyCalcBtn() {

		Assert.assertEquals(gpage.clickStampDutyCalc(), "Stamp Duty Calculator");
	}

	@Test
	public void testclickOnHomeLoanCalc() {

		Assert.assertEquals(gpage.clickHomeLoanCalc(), "Mortgage Repayment Calculator");
	}

	@Test
	public void testDirectLifeInsurance() {

		Assert.assertEquals(gpage.clickDirectLifeInsurance(), "Direct Life Insurance");
	}

	@Test
	public void testWhyTimeSeemsToFlyAsWeGetOlder() {

		Assert.assertEquals(gpage.clickOnWhyTimeSeemsToFlyAsWeGetOlder(), "Why Time Seems To Fly The Older We Get");
	}

	@Test
	public void testLifeInsuranceGlossary() {

		Assert.assertEquals(gpage.clickOnLifeInsuranceGlossary(), "Life Insurance Glossary");
	}

	@Test
	public void testHealthInsuranceGlossary() {

		Assert.assertEquals(gpage.clickOnHealthInsuranceGlossary(), "Health Insurance Glossary");
	}

	@Test
	public void testFindingTheRightHealthInsurance() {

		Assert.assertTrue(gpage.clickOnFindingRightHealthInsurance());
	}

	@Test
	public void testIsHealthInsuranceWorthHaving() {

		Assert.assertEquals(gpage.clickOnIsHealthInsuranceWorthHaving(), "Is Private Health Insurance Worth Having?");
	}

	@Test
	public void testCompareBusinessLoansBtn() {

		Assert.assertEquals(gpage.clickOnCompareBusinessLoansBtn(),
				"Find a business loan for your business from over 80 leading lenders across Australia, powered by Valiant.");
	}

	// below test case failing
	@Test
	public void testScheduleAcallBtnInBusinessLoans() {

		Assert.assertEquals(gpage.clickOnScheduleAcallBtnBusinessLoansBtn(),
				"Find a business loan for your business from over 80 leading lenders across Australia, powered by Valiant.");
	}

	@Test
	public void testClickOnChattelMortgage() {

		Assert.assertEquals(gpage.clickOnChattelMortgage(), "Chattel Mortgage");
	}

	@Test
	public void testEquipmentLoansandFinancing() {

		Assert.assertEquals(gpage.clickOnEquipmentLoansAndFinancing(), "Equipment Loans and Financing");
	}

	@Test
	public void testClickOnSecuredBusinessLoans() {

		Assert.assertEquals(gpage.clickOnSecuredBusinessLoans(), "Secured Business Loans");
	}

	@Test
	public void testClickOnUnSecuredBusinessLoans() {

		Assert.assertEquals(gpage.clickOnUnSecuredBusinessLoans(), "Unsecured Business Loans");
	}

	@Test
	public void testClickOnBusinessOverdraft() {

		Assert.assertEquals(gpage.clickOnBusinessOverdraft(), "Business Overdraft");
	}

	@Test
	public void testClickOnCompareIncomeProtectionButton() {

		Assert.assertEquals(gpage.clickOnCompareIncomeprotection(), "Easily compare income protection quotes");
	}

	@Test
	public void testClickOnBestIncomeProtectionCover() {
		Assert.assertEquals(gpage.clickOnBestIncomeprotectionCover(), "Choosing Suitable Income Protection Insurance");
	}

	@Test
	public void testClickIsIncomeProtectionInsuranceTaxDeductibleBtn() {

		Assert.assertEquals(gpage.clickOnIncomeProtectionInsuranceTaxDeductibleBtn(),
				"Is Income Protection Insurance Tax Deductible?");
	}

	@Test
	public void testIncomeProtectionThroughSuperannuation() {

		Assert.assertEquals(gpage.clickOnIncomeProtectionThroughSuperannuation(),
				"Income Protection Through Superannuation");
	}

	@Test
	public void testIncomeProtectionInsurancevsMortgageProtection() {

		Assert.assertEquals(gpage.clickOnIncomeProtectionInsurancevsMortgageProtection(),
				"Income Protection Insurance vs Mortgage Protection");
	}

	@Test
	public void testMLCIncomeProtection() {

		Assert.assertEquals(gpage.clickOnMLCIncomeProtection(), "MLC Income Protection Insurance");
	}

	@Test
	public void testTALIncomeProtection() {

		Assert.assertEquals(gpage.clickOnTALIncomeProtection(), "TAL Income Protection");
	}

	@Test
	public void testCommInsureIncomeProtection() {

		Assert.assertEquals(gpage.clickOnCommInsureIncomeProtection(), "CommInsure Income Protection Insurance");
	}

	@Test
	public void testFaceBookLink() {
		Assert.assertEquals(gpage.clickOnFacebook(), "iSelect - Home | Facebook");
	}

	@Test
	public void testTwitterLink() {
		Assert.assertEquals(gpage.clickOnTwitter(), "iSelect");
	}

	@Test
	public void testYoutubeLink() {
		Assert.assertEquals(gpage.clickOnYoutube(), "iSelect");
	}

	@Test
	public void testLinkedInLink() {
		Assert.assertTrue(gpage.clickOnLinkedIn());
	}

	@Test
	public void testclickTermsAndConditions() {
		Assert.assertTrue(gpage.clicktermsAndConditions());
	}

	@Test
	public void testclickOnPrivacyPolicy() {
		Assert.assertTrue(gpage.clickOnPrivacyPolicy());
	}

	@Test
	public void testclickOnDisclaimer() {
		Assert.assertTrue(gpage.clickOnDisclaimer());
	}

	@Test
	public void testContactUsLink() {
		Assert.assertEquals(gpage.clickOnContactUs(), "Contact");
	}

	@Test
	public void testHowIselectWork() {
		Assert.assertEquals(gpage.clickOnHowISelectWorks(), "How iSelect works");
	}

	@Test
	public void testOurCompanyLink() {
		Assert.assertEquals(gpage.clickOnOurCompany(), "Our Company");
	}

	@Test
	public void testCareersLink() {
		Assert.assertEquals(gpage.clickOnCareers(), "Careers");
	}

	@Test
	public void testMediaCenterLink() {
		Assert.assertEquals(gpage.clickOnMediaCenter(), "Media Centre");
	}

	@Test
	public void testInvestorCentreLink() {
		Assert.assertEquals(gpage.clickOnInvestorCentreLink(), "Investor Centre");
	}
	
	@Test
	public void testBecomeOurPartnerLink() {
		Assert.assertEquals(gpage.clickOnBecomeOurPartner(), "BECOME OUR PARTNER");
	}

	@Test
	public void testiSelectPartnerOfYearText() {
		Assert.assertTrue(gpage.verifyHealthInsurancePartnerOfyeartextLink());
	}

	@Test
	public void testHealthInsurancePartnerOfYearImg() {
		Assert.assertTrue(gpage.verifyHealthInsurancePartnerOfyearImg());
	}

	@Test
	public void testClickingSwitchingElectricityProvidersText() {
		Assert.assertEquals(gpage.clickSwitchingElecAndGasText(), "Switching Electricity Providers");
	}

	@Test
	public void testClickingWhatIsLifeInsuranceText() {
		Assert.assertEquals(gpage.clickWhatIsLifeInsuText(), "Why Do You Need Life Insurance?");
	}

	@Test
	public void testClickingReadMoreLinkEnergy() {
		Assert.assertEquals(gpage.clickReadMoreLinkEnergy(), "Switching Electricity Providers");
	}

	@Test
	public void testClickingReadMoreLinkLife() {
		Assert.assertEquals(gpage.clickReadMoreLinkLifeInsurance(), "Why Do You Need Life Insurance?");
	}

	@Test
	public void testReadMoreButtonOnLHCLoadingTile() {
		String url = driver.getCurrentUrl() + "health-insurance/";
		driver.get(url);
		Assert.assertEquals(gpage.clickLHCLoadingTileReadMoreInHealth(), "Lifetime Health Cover Loading");
	}

	@Test
	public void testReadMoreButtonOnAmbulanceCoverTile() {
		String url = driver.getCurrentUrl() + "health-insurance/";
		driver.get(url);
		Assert.assertEquals(gpage.clickAmbulanceCoverTileReadMoreInHealth(), "Ambulance Cover In Australia");
	}

	@Test
	public void testReadMoreButtonOnPrivateHospitalCoverTile() {
		String url = driver.getCurrentUrl() + "health-insurance/";
		driver.get(url);
		Assert.assertEquals(gpage.clickPrivateHospitalCoverTileReadMoreInHealth(),
				"A Simple Guide To The New Private Health Insurance Tiers");
	}

//below test case failing
	@Test
	public void testReadMoreButtonOnFindingSuitableInsCoverTile() {
		String url = driver.getCurrentUrl() + "health-insurance/";
		driver.get(url);
		Assert.assertEquals(gpage.clickFindingSuitableHealthInsTileInHealth(),
				"Is there a 'best health insurance'? Tips for finding a suitable policy.");
	}

	@Test
	public void testReadMoreButtonOnHealthFundsCoverTile() {
		String url = driver.getCurrentUrl() + "health-insurance/";
		driver.get(url);
		Assert.assertEquals(gpage.clickHealthFundsReadMoreInHealth(),
				"Health Funds: Learn more about iSelects participating health insurers");
	}

	@Test
	public void testClickCompareCarInsBtn() {
		Assert.assertEquals(gpage.clickCompareCarInsuranceBtn(), "EASILY COMPARE CAR INSURANCE QUOTES*");
	}

	@Test
	public void testMovingHouseBtnInCar() {
		Assert.assertEquals(gpage.clickMovingHouseBtnInCarHover(), "Moving House?");
	}

	@Test
	public void testTypesOfcarInsurancebtn() {
		Assert.assertEquals(gpage.clickTypesOfCarInsInCarHover(),
				"The Different Types of Car Insurance & What You Need To Know");
	}

	@Test
	public void testSwitchingCarInsurancebtn() {
		Assert.assertEquals(gpage.clickSwitchingCarInsBtn(), "Switch Car Insurance Companies");
	}

	@Test
	public void testSavingOnCarInsurancebtn() {
		Assert.assertEquals(gpage.clickSavingOnCarInsBtn(), "How To Save Money On Car Insurance");
	}

	@Test
	public void testComprehensiveExplainedbtnInCarHover() {
		Assert.assertEquals(gpage.clickOnComprehensiveExplained(),
				"What Is Comprehensive Car Insurance & What Does It Cover?");
	}

	@Test
	public void testComprehensivevsThirdPartyInCarHover() {
		Assert.assertEquals(gpage.clickOnComprehensiveVsThirdParty(), "Comprehensive vs Third Party Car Insurance");
	}

	@Test
	public void testCompulsoryThirdPartyCTPInCarHover() {
		Assert.assertEquals(gpage.clickOnCompulsoryThirdParty(),
				"Compulsory Third Party (CTP) Insurance: What it is and how it works in Australia");
	}

	@Test
	public void testSeniorsCarInsurance() {
		Assert.assertEquals(gpage.clickOnSeniorsCarIns(), "Seniors Car Insurance Comparison");
	}

	@Test
	public void testComprehensiveCarInsurance() {
		Assert.assertEquals(gpage.clickOnComprehensiveCarInsurance(), "Comprehensive Car Insurance");
	}

	@Test
	public void testCarInsuranceVictoria() {
		Assert.assertEquals(gpage.clickOnCarInsuranceVic(), "Car insurance Victoria");
	}

	@Test
	public void testCarInsuranceNSW() {
		Assert.assertEquals(gpage.clickOnCarInsuranceNSW(), "Car Insurance New South Wales");
	}

	@Test
	public void testCarInsuranceQLD() {
		Assert.assertEquals(gpage.clickOnCarInsuranceQLD(), "Car Insurance Queensland");
	}

	@Test
	public void testCarInsuranceSA() {
		Assert.assertEquals(gpage.clickOnCarInsuranceSA(), "Car Insurance South Australia");
	}

	@Test
	public void testCarInsuranceTasmania() {
		Assert.assertEquals(gpage.clickOnCarInsuranceTasmania(), "Car Insurance Tasmania");
	}

	@Test
	public void testCarInsuranceACT() {
		Assert.assertEquals(gpage.clickOnCarInsuranceACT(), "Car Insurance ACT");
	}

	@Test
	public void testDoINeedCarInsurance() {
		Assert.assertEquals(gpage.clickOnDoiNeedCarInsurance(), "Do I Need Car Insurance?");
	}

	@Test
	public void testTipsForFirstTimeDrivers() {
		Assert.assertEquals(gpage.clickOnTipsForFirstTimeDrivers(), "Tips For First Time Drivers");
	}

	@Test
	public void testTipsForBuyingCarInsurance() {
		Assert.assertEquals(gpage.clickOnTipsForBuyingCarInsurance(), "Buying Car Insurance Online");
	}

	@Test
	public void testMakingAClaimAfterAccident() {
		Assert.assertEquals(gpage.clickOnMakingAClaimAfterCarAccident(),
				"Making An Insurance Claim After A Car Accident");
	}

	@Test
	public void testCarInsuranceGlossary() {
		Assert.assertEquals(gpage.clickOnCarInsuranceGlossary(), "Car Insurance Terminology");
	}

	@Test
	public void testClickOnAgreedVsMarketValueCarInsurance() {
		Assert.assertEquals(gpage.clickOnAgreedvaluevsmarketvalueCarInsurance(),
				"Agreed value vs market value Car Insurance");
	}

	@Test
	public void testClickOnFindingBestCarInsurance() {
		Assert.assertEquals(gpage.clickOnFindingBestCarInsurance(),
				"Looking For Suitable Comprehensive Car Insurance?");
	}

	@Test
	public void testClickOnFindHomeAndContentsbutton() {
		Assert.assertEquals(gpage.clickOnFindHomeAndContentsButton(), "Compare Home and Contents Insurance");
	}

	@Test
	public void testClickOnWhatIsHomeAndContentsbutton() {
		Assert.assertEquals(gpage.clickOnWhatIsHomeAndContentsInsurance(), "What Is Home And Contents Insurance?");
	}

	@Test
	public void testclickOnInsuranceForRenters() {
		Assert.assertEquals(gpage.clickOnInsuranceForRenters(), "Renter's Insurance");
	}

	@Test
	public void testclickOnAHomeOwnersGuideToHomeAndContentsInsurance() {
		Assert.assertEquals(gpage.clickOnAHomeOwnersGuideToHomeAndContentsInsurance(),
				"A Home Owners Guide To Home & Contents Insurance");
	}

	@Test
	public void testclickOnHomeAndContentsInsuranceFAQS() {
		Assert.assertEquals(gpage.clickOnHomeAndContentsInsuranceFAQS(), "Home And Contents FAQ");
	}

	@Test
	public void testclickOnContentsInsurance() {
		Assert.assertEquals(gpage.clickOnContentsInsurance(), "Compare Contents Insurance");
	}

	@Test
	public void testclickOnLandlordInsurance() {
		Assert.assertEquals(gpage.clickOnLandlordInsurance(), "Compare Landlord Insurance");
	}

	@Test
	public void testclickOnMakeYourNextHouseMoveQuick() {
		Assert.assertEquals(gpage.clickOnMakeYourNextHouseMoveQuick(), "Make your next house move quick and painless");
	}

	// below tc failing
	@Test
	public void testclickOnClaimingHomeAndContents() {
		Assert.assertEquals(gpage.clickOnClaimingHomeAndContents(), "Claiming Home And Contents Insurance");
	}

	@Test
	public void testclickOnMovingWithYourPartner() {
		Assert.assertEquals(gpage.clickOnMovingWithYourPartner(),
				"Four topics to talk about before you move in with your partner");
	}

	@Test
	public void testMovingHouseBtnInHomeAndContents() {
		Assert.assertEquals(gpage.clickMovingHouseBtnInHomeAndContentsHover(), "Moving House?");
	}

	@Test
	public void testCompareBusinessInsuranceBtn() {
		Assert.assertEquals(gpage.clickOnCompareBusinessInsuranceBtn(), "Compare Business Insurance");
	}

	@Test
	public void testPublicLiabilityInsuranceBtnInQLD() {
		Assert.assertEquals(gpage.clickOnPublicLiabilityInsuranceBtnInQLD(),
				"Public Liability Insurance In Queensland");
	}

	@Test
	public void testPublicLiabilityInsuranceBtnInSA() {
		Assert.assertEquals(gpage.clickOnPublicLiabilityInsuranceBtnInSA(),
				"Public Liability Insurance For South Australia");
	}

	@Test
	public void testPublicLiabilityInsuranceBtnInNSW() {
		Assert.assertEquals(gpage.clickOnPublicLiabilityInsuranceBtnInNSW(),
				"Public Liability Insurance In New South Wales");
	}

	@Test
	public void testPublicLiabilityInsuranceBtnInWA() {
		Assert.assertEquals(gpage.clickOnPublicLiabilityInsuranceBtnInWA(), "Public Liability Insurance In WA");
	}

	@Test
	public void testPublicLiabilityInsuranceBtn() {
		Assert.assertEquals(gpage.clickOnPublicLiabilityInsuranceBtn(), "Public Liability Insurance");
	}

	@Test
	public void testProfessionalIndemnityinsurance() {
		Assert.assertEquals(gpage.clickOnProfessionalIdemnityInsurance(), "Professional Indemnity insurance");
	}

	@Test
	public void testclickOnPersonalAccidentInsurance() {
		Assert.assertEquals(gpage.clickOnPersonalAccidentInsurance(), "Personal Accident Insurance");
	}

	@Test
	public void testCyberLiabilityInsurance() {
		Assert.assertEquals(gpage.clickOnCyberLiabilityInsurance(), "Cyber Liability Insurance");
	}

	@Test
	public void testInsuranceForTradies() {
		Assert.assertEquals(gpage.clickOnInsuranceForTradies(), "Insurance For Tradies");
	}

	@Test
	public void testCompareTravelInsuranceBtn() {
		Assert.assertEquals(gpage.clickOnCompareTravelInsurance(), "Compare Travel Insurance");
	}

	@Test
	public void testFindingBestTravelInsurance() {
		Assert.assertEquals(gpage.clickOnFindingBestTravelIns(),
				"Is There A Best Travel Insurance? Tips For Finding A Suitable Policy");
	}

	@Test
	public void testclickOnAnnualTravelInsurance() {
		Assert.assertEquals(gpage.clickOnAnnualTravelInsurance(), "Annual Travel Insurance");
	}

	@Test
	public void testclickOnInternationalTravelInsurance() {
		Assert.assertEquals(gpage.clickOnInternationalTravelInsurance(), "International Travel Insurance");
	}

	@Test
	public void testclickOnDomesticTravelInsurance() {
		Assert.assertEquals(gpage.clickOnDomesticTravelInsurance(), "Domestic Travel Insurance");
	}

	@Test
	public void testclickOnCruiseTravelInsurance() {
		Assert.assertEquals(gpage.clickOnCruiseTravelInsurance(),
				"Cruise Travel Insurance: Information & things to consider when booking your cruise holiday");
	}

	@Test
	public void testclickOnComparePetInsurance() {
		Assert.assertEquals(gpage.clickOnComparePetInsurance(), "Compare Pet Insurance");
	}

	@Test
	public void testclickOnWhatIsPetInsurance() {
		Assert.assertEquals(gpage.whatIsPetInsurance(), "Easily compare Pet Insurance");
	}

	@Test
	public void testclickOnCostOfOwingAPetInsurance() {
		Assert.assertEquals(gpage.whatIsCostOfOwingAPet(), "The Cost of Owning a Pet");
	}

	@Test
	public void testclickOnGetRightVetForYourPet() {
		Assert.assertEquals(gpage.getRightVetForYourPet(), "How to find the right Vet for your Pet");
	}

	@Test
	public void testclickOnReviewingPetInsurance() {
		Assert.assertEquals(gpage.clickOnReviewingPetInsurance(), "Reviewing Pet Insurance  What You Should Look For");
	}

	@Test
	public void testclickOnwhatIsCatInsurance() {
		Assert.assertEquals(gpage.clickOnWhatIsCatInsurance(), "What is cat insurance?");
	}

	@Test
	public void testclickOnWhatIsDogInsurance() {
		Assert.assertEquals(gpage.clickOnWhatIsDogInsurance(), "What is dog insurance?");
	}

	@Test
	public void testclickOnOverseasVisitorHealthInsurance() {
		Assert.assertEquals(gpage.clickOnCompareOverseasVisitorCover(), "Overseas Visitors Health Insurance");
	}

	@Test
	public void testclickOnChoosingRightVisitorCover() {
		Assert.assertEquals(gpage.clickOnChoosingRightCover(), "Choosing the right Overseas Visitor Cover");
	}

	@Test
	public void testclickOnBenefitsOfHavingOVC() {
		Assert.assertEquals(gpage.clickOnOVCBenefits(), "Benefits of having Overseas Visitors Cover");
	}

	@Test
	public void testclickOnVisaReq() {
		Assert.assertEquals(gpage.clickOnVisaReqBtn(), "Overseas Visitor 457 Work Visa");
	}

	@Test
	public void testclickOnWaitingPeriods() {
		Assert.assertEquals(gpage.clickOnWaitingPeriodBtn(), "Waiting periods for Overseas Visitor Cover");
	}

	@Test
	public void testclickOnPolicyDetails() {
		Assert.assertEquals(gpage.clickOnPolicyDetailsBtn(), "Policy Details");
	}

	@Test
	public void testclickOnHowToPurchaseOvc() {
		Assert.assertEquals(gpage.clickOnHowToPurchaseOVC(), "How do I purchase Overseas Visitors Cover with iSelect?");
	}

	@Test
	public void testclickOnOVCInCompareOptions() {
		Assert.assertEquals(gpage.clickOnOVCInCompareOptions(), "About Overseas Visitors Cover");
	}

	@Test
	public void testclickOnOverseasStudentHealthCover() {
		Assert.assertEquals(gpage.clickOnOverseasStudentHealthCover(), "Overseas Student Health Cover");
	}

	@Test
	public void testclickOnAusisBridgingVisaExplained() {
		Assert.assertEquals(gpage.clickOnAusisBridgingVisaExplained(), "Bridging Visa");
	}

	@Test
	public void testclickOnPermanentResidencyExplained() {
		Assert.assertEquals(gpage.clickOnPermanentResidencyExplained(), "Permanent Residency");
	}

	@Test
	public void testclickOnReciprocalHealthCareAgreements() {
		Assert.assertEquals(gpage.clickOnReciprocalHealthCareAgreements(), "Reciprocal Health Care Agreements (RHCA)");
	}

	@Test
	public void test417WorkingHolidayVisa() {
		Assert.assertEquals(gpage.clickOn417WorkingHolidayVisa(), "Overseas Visitor 417 Working Holiday Visa");
	}

	@Test
	public void test411ExchangeVisa() {
		Assert.assertEquals(gpage.clickOn411ExchangeVisa(), "Overseas Visitor 411 Exchange Visa");
	}

	@Test
	public void test416SpecialProgramVisa() {
		Assert.assertEquals(gpage.clickOn416SpecialProgramVisa(), "Overseas Visitor 416 Special Program Visa");
	}

	@Test
	public void test405InvestorRetirementVisa() {
		Assert.assertEquals(gpage.clickOn405InvestorRetirementVisa(),
				"Overseas Visitor 405 Investor Retirement Visa, 410 Retirement Visa");
	}

	
	@Test
	public void clickOnSwitchingElecProviders() {
		Assert.assertEquals(gpage.clickOnSwitchingElectricityProviders(),
				"Switching Electricity Providers");
	}

	
	@Test
	public void testclickOnSaveElectricity() {
		Assert.assertEquals(gpage.clickOnSaveElectricity(),
				"How you can save electricity costs and have more money for the things you love");
	}
	
	@Test
	public void testclickOnElectricityProviders() {
		Assert.assertEquals(gpage.clickOnElectricityProviders(),
				"Our Range Of Electricity Suppliers In Australia*");
	}

	
	@Test
	public void testclickOnAusisEnergyQuotes() {
		Assert.assertEquals(gpage.clickOnAusisEnergyQuotes(),
				"Australian Energy Quotes");
	}
	
	@Test
	public void testclickOnSolarEnergy() {
		Assert.assertEquals(gpage.clickOnSolarEnergy(),
				"An Introduction To Solar Energy");
	}

	
	@Test
	public void testclickOnWindEnergy() {
		Assert.assertEquals(gpage.clickOnWindEnergy(),
				"Why People Are Turning To Wind Power");
	}
	
	@Test
	public void testclickOnHydroElec() {
		Assert.assertEquals(gpage.clickOnHydroElec(),
				"Hydroelectricity");
	}
	
	
	@Test
	public void testclickOnEnergyComparisonQLD() {
		Assert.assertEquals(gpage.clickOnEnergyComparisonQLD(),
				"Compare Electricity Providers Queensland");
	}
	
	@Test
	public void testclickOnEnergyComparisonNSW() {
		Assert.assertEquals(gpage.clickOnEnergyComparisonNSW(),
				"Compare Electricity Providers NSW");
	}

	
	@Test
	public void testclickOnEnergyComparisonACT() {
		Assert.assertEquals(gpage.clickOnEnergyComparisonACT(),
				"Compare Electricity Providers ACT");
	}
	
	@Test
	public void testclickOnEnergyComparison() {
		Assert.assertEquals(gpage.clickOnEnergyComparison(),
				"Energy Plan Comparison Australia");
	}
	
	@Test
	public void testclickOnRenewableEnergy() {
		Assert.assertEquals(gpage.clickOnRenewableEnergy(),
				"Everything You Need To Know About Renewable Energy");
	}

	
	@Test
	public void testclickOnEnergyComparisonSA() {
		Assert.assertEquals(gpage.clickOnEnergyComparisonSA(),
				"Compare Electricity Providers South Australia");
	}
	
	@Test
	public void testclickOnEnergyComparisonVIC() {
		Assert.assertEquals(gpage.clickOnEnergyComparisonVIC(),
				"Compare Electricity Providers Victoria");
	}
	
	
	@Test
	public void testclickOnFindACheaperEnergyPlan() {
		Assert.assertEquals(gpage.clickOnFindTheCheaperEnergyPlan(),
				"Find A Cheaper Energy Plan");
	}

	
	@Test
	public void testclickOnFindTheBestEnergyPlan() {
		Assert.assertEquals(gpage.clickOnFindTheBestEnergyPlan(),
				"Finding A Suitable Electricity Plan For You");
	}
	
	@Test
	public void testclickOnEnergySavingTips() {
		Assert.assertEquals(gpage.clickOnEnergySavingtips(),
				"Energy Saving Tips");
	}
	
	
	@Test
	public void testClickOnHowToHandleHighElecBill() {
		Assert.assertEquals(gpage.clickOnHowToHandleHighElecBill(),
				"How To Handle An Unexpectedly High Electricity Bill");
	}

	
	@Test
	public void testClickOnHowDoEnergyDiscountsWork() {
		Assert.assertEquals(gpage.clickOnHowDoEnergyDiscountsWork(),
				"How Do Energy Discounts Work?");
	}
	
	@Test
	public void testclickOnEasyWaysToReduceElecBill() {
		Assert.assertEquals(gpage.clickOnEasyWaysToreduceYourElecBill(),
				"8 Easy Ways To Reduce Your Electricity Bill This Winter");
	}
	
	@Test
	public void testClickOnBenefitsOfSolarEnergy() {
		Assert.assertEquals(gpage.clickOnBenefitsOfSolarEnergy(),
				"What Are The Benefits Of Solar Energy?");
	}
	
	@Test
	public void testclickOnViewBasicPlanInfo() {
		Assert.assertEquals(gpage.clickOnViewBasicPlanInfo(),
				"Find your Basic plan Information documents");
	}

	
	@Test
	public void testclickOnFindEnergyFactsSheet() {
		Assert.assertEquals(gpage.clickOnViewEnergyFactsSheet(),
				"Find your Energy Fact Sheet");
	}
	
	@Test
	public void testclickOnCompareElecAndGasBtn() {
		Assert.assertEquals(gpage.clickOnCompareElecAndGasBtn(),
				"Compare Electricity & Gas");
	}
	
	@Test
	public void testclickOnNBNBtn() {
		Assert.assertEquals(gpage.clickOnNBNBtn(),
				"National Broadband Network (NBN)");
	}

	@Test    
	public void testclickOnInternetSpeedBtn() {
		Assert.assertEquals(gpage.clickOnInternetSpeedBtn(),
				"How Internet Speed Works");
	}
	
	@Test
	public void testclickOnmobileBroadbandBtn() {
		Assert.assertEquals(gpage.clickOnmobileBroadbandBtn(),
				"Mobile Broadband");
	}
	
	@Test
	public void testclickOnADSLTwoPlusBtn() {
		Assert.assertEquals(gpage.clickOnADSLTwoPlusBtn(),
				"ADSL2 Plans Comparison");
	}
	
	@Test
	public void testclickOnCheapInternetBtn() {
		Assert.assertEquals(gpage.clickOnCheapInternetBtn(),
				"Cheap Internet Plans: Is price everything when it comes to selecting an internet plan?");
	}
  
	@Test
	public void testclickOnWirelessInternetBtn() {
		Assert.assertEquals(gpage.clickOnWirelessInternetBtn(),
				"Wireless Broadband:");
	}
	
	@Test
	public void testclickOnNakedDSLBtn() {
		Assert.assertEquals(gpage.clickOnNakedDSLBtn(),
				"Naked DSL Plans");
	}

	@Test
	public void testclickOnNBNPlansBtn() {
		Assert.assertEquals(gpage.clickOnNBNPlansBtn(),
				"Compare NBN Plans");
	}
	
	
	@Test
	public void testclickOnInternetPlansBtn() {
		Assert.assertEquals(gpage.clickOnInternetPlansBtn(),
				"Internet Plans");
	}
	
	@Test
	public void testclickOnInternetProvidersBtn() {
		Assert.assertEquals(gpage.clickOnInternetProvidersBtn(),
				"Internet Providers");
	}

	@Test
	public void testclickOnInternetDealsBtn() {
		Assert.assertEquals(gpage.clickOnInternetDealsBtn(),
				"Unlimited Internet Deals and Different Internet Options");
	}

	
	@Test
	public void testclickOnBroadBandPlansBtn() {
		Assert.assertEquals(gpage.clickOnBroadbandPlansBtn(),
				"Broadband Plans");
	}
	
	@Test
	public void testclickOnWirelessInternetPlansBtn() {
		Assert.assertEquals(gpage.clickOnWirelessInternetPlansBtn(),
				"Wireless Internet Plans");
	}
	
	@Test
	public void testclickOnCableInternetPlansBtn() {
		Assert.assertEquals(gpage.clickOnCableInternetPlansBtn(),
				"Cable Internet Plans");
	}

	
	@Test
	public void testclickOnChooseRightBroadbandPlan() {
		Assert.assertEquals(gpage.clickOnChoosingRightBroadbandPlan(),
				"Paying too much for your internet? Choosing the right broadband plan");
	}
	
	@Test
	public void testclickOnChooseRightNBNPlan() {
		Assert.assertEquals(gpage.clickOnChoosingRightNBNPlan(),
				"A Guide For Choosing An NBN Plan");
	}
	
	@Test
	public void testclickOnConnectingToNBNPlan() {
		Assert.assertEquals(gpage.clickOnConnectingToNBNPlan(),
				"How To Connect To The NBN");
	}

	
	@Test
	public void testclickOnMovingHouseMakeItEasy() {
		Assert.assertEquals(gpage.clickOnMovingHouseMakeItEasyBtn(),
				"Make your next house move quick and painless");
	}
	

	@Test
	public void testclickOnHighSpeedInternetPlans() {
		Assert.assertEquals(gpage.clickOnHowTogetHighSpeedInternetPlansBtn(),
				"High Speed Internet Plans");
	}
	
	
	@Test
	public void testclickOnWhatIsADSLAndADSLTwoPlus() {
		Assert.assertEquals(gpage.clickOnWhatIsADSLAndADSLTwoPlusBtn(),
				"ADSL Internet Plans: Things to consider when comparing plans");
	}

	

	@Test
	public void testclickOnInternetGlossaryBtn() {
		Assert.assertEquals(gpage.clickOnInternetGlossaryBtn(),
				"Internet Glossary");
	}
	
	@Test
	public void testclickOnCompareBroadbandBtn() {
		Assert.assertEquals(gpage.clickOnCompareBroadbandBtn(),
				"Internet Plans");
	}
	
	@Test
	public void testclickOnIamMovingBtn() {
		Assert.assertEquals(gpage.clickOnMovingHouseBtnAvailableInInternet(),
				"Moving House?");
	}
	
	@Test
	public void testclickOnCompareMobilePlansBtn() {
		Assert.assertEquals(gpage.clickOnCompareMobilePlansButton(),
				"Mobile Plans");
	}
	
	@Test
	public void testclickOnOperatingSystemsBtn() {
		Assert.assertEquals(gpage.clickOnOSButton(),
				"Mobile Operating Systems");
	}
	
	@Test
	public void testclickOnHowMuchDataBtn() {
		Assert.assertEquals(gpage.clickOnHowMuchDataButton(),
				"How much data do you need?");
	}
	
	@Test
	public void testclickOnProvidersBtn() {
		Assert.assertEquals(gpage.clickOnProvidersButton(),
				"Mobile  Participating Providers");
	}
	
	@Test
	public void testclickOnPhoneAndInternetBundlesBtn() {
		Assert.assertEquals(gpage.clickOnPhoneAndInternetBundlesButton(),
				"Phone and Internet Bundles");
	}
	
	@Test
	public void testclickOn3gVs4gBtn() {
		Assert.assertEquals(gpage.clickOn3gVs4gButton(),
				"3G vs 4G");
	}
	
	@Test
	public void testclickOnUnderstandingMobileGargonsBtn() {
		Assert.assertEquals(gpage.clickOnMobileGargonsBtn(),
				"Jargon Glossary");
	}
	
	
	@Test
	public void testclickOnMobilePhoneTipsBtn() {
		Assert.assertEquals(gpage.clickOnMobilePhoneTipsBtn(),
				"Mobile Phone Tips");
	}
	
	@Test
	public void testclickOnHealthInBottomMenu() {
		Assert.assertEquals(gpage.clickOnHealthInBottomMenu(),
				"Compare Health Insurance");
	}
	
	@Test
	public void testclickOnIncomeProtInBottomMenu() {
		Assert.assertEquals(gpage.clickOnIncomeProtInBottomMenu(),
				"Easily compare income protection quotes");
	}
	
	@Test
	public void testclickOnTravelInBottomMenu() {
		Assert.assertEquals(gpage.clickOnTravelInBottomMenu(),
				"Compare Travel Insurance");
	}
	
	@Test
	public void testclickOnCarInBottomMenu() {
		Assert.assertEquals(gpage.clickOnCarInBottomMenu(),
				"EASILY COMPARE CAR INSURANCE QUOTES*");
	}
	
	@Test
	public void testclickOnPetInBottomMenu() {
		Assert.assertEquals(gpage.clickOnPetInBottomMenu(),
				"Compare Pet Insurance");
	}
	
	@Test
	public void testclickOnHomeAndContentsInBottomMenu() {
		Assert.assertEquals(gpage.clickOnHomeAndContentsInBottomMenu(),
				"Compare Home and Contents Insurance");
	}
	
	@Test
	public void testclickOnLifeInBottomMenu() {
		Assert.assertEquals(gpage.clickOnLifeInBottomMenu(),
				"Easily compare life insurance quotes");
	}
	

	@Test
	public void testclickOnBusinessInBottomMenu() {
		Assert.assertEquals(gpage.clickOnBusinessInBottomMenu(),
				"Compare Business Insurance");
	}
	
	@Test
	public void testclickOnOverseasVisitorCoverInBottomMenu() {
		Assert.assertEquals(gpage.clickOnOverseasVisitorCoverInBottomMenu(),
				"Overseas Visitors Health Insurance");
	}
	
	@Test
	public void testclickOnElecAndGasInBottomMenu() {
		Assert.assertEquals(gpage.clickOnElecAndGasInBottomMenu(),
				"Compare Electricity & Gas");
	}
	
	
	@Test
	public void testclickOnInternetInBottomMenu() {
		Assert.assertEquals(gpage.clickOnInternetInBottomMenu(),
				"Internet Plans");
	}
	
	@Test
	public void testclickOnMobilePlansInBottomMenu() {
		Assert.assertEquals(gpage.clickOnMobilePlansInBottomMenu(),
				"Mobile Plans");
	}
	
	
	@Test
	public void testclickOnMovingHouseInBottomMenu() {
		Assert.assertEquals(gpage.clickOnMovingHouseInBottomMenu(),
				"Moving House?");
	}
	
	@Test
	public void testclickOnHomeLoansInBottomMenu() {
		Assert.assertEquals(gpage.clickOnHomeLoansInBottomMenu(),
				"Compare Australian Home Loans");
	}
	
	
	@Test
	public void testclickOnPersonalLoansInBottomMenu() {
		Assert.assertEquals(gpage.clickOnPersonalLoansInBottomMenu(),
				"Compare Personal Loans*");
	}
	
	@Test
	public void testclickOnCarLoansInBottomMenu() {
		Assert.assertEquals(gpage.clickOnCarLoansInBottomMenu(),
				"Compare Car Loans*");
	}
	
	@Test
	public void testclickOnCreditCardsInBottomMenu() {
		Assert.assertEquals(gpage.clickOnCreditCardsInBottomMenu(),
				"Compare Credit Cards*");
	}
	
	@Test
	public void testclickOnBusinessLoansInBottomMenu() {
		Assert.assertEquals(gpage.clickOnBusinessLoansInBottomMenu(),
				"Find a business loan for your business from over 80 leading lenders across Australia, powered by Valiant.");
	}*/
}
