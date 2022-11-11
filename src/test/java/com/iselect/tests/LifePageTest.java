package com.iselect.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.iselect.base.BaseClass;
import com.iselect.pages.LifePage;

public class LifePageTest extends BaseClass{

LifePage lpage;
	
	@Test
	public void testclickTermsAndConditions() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertTrue(gpage.clicktermsAndConditions());
	}

	@Test
	public void testclickOnPrivacyPolicy() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertTrue(gpage.clickOnPrivacyPolicy());
	}

	@Test
	public void testclickOnDisclaimer() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertTrue(gpage.clickOnDisclaimerInLifeInsurance());
	}

	@Test
	public void testContactUsLink() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(gpage.clickOnContactUs(), "Contact");
	}

	@Test
	public void testHowIselectWork() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(gpage.clickOnHowISelectWorks(), "How iSelect works");
	}

	@Test
	public void testOurCompanyLink() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(gpage.clickOnOurCompany(), "Our Company");
	}

	@Test
	public void testCareersLink() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(gpage.clickOnCareers(), "Careers");
	}

	@Test
	public void testMediaCenterLink() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(gpage.clickOnMediaCenter(), "Media Centre");
	}

	@Test
	public void testInvestorCentreLink() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(gpage.clickOnInvestorCentreLink(), "Investor Centre");
	}
	
	@Test
	public void testclickOnFacebook() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(gpage.clickOnFacebook(),"iSelect - Home | Facebook");
	}

	@Test
	public void testclickOnLinkedIn() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertTrue(gpage.clickOnLinkedIn());
	}

	@Test
	public void testclickOnTwitter() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(gpage.clickOnTwitter(), "iSelect");
	}

	@Test
	public void testclickOnYoutube() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(gpage.clickOnYoutube(), "iSelect");
	}
	
	
	@Test
	public void testEasilyCompareLifeInsuranceText() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertTrue(lpage.verifyEasilyCompareLifeInsuranceText());
	}

	@Test
	public void testSaveTimeAndEffortText() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertTrue(lpage.verifySaveTimeAndEffortHeaderText());
	}

	
	@Test
	public void testStartComparingBtn() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyStartComparingBtn(),"Tell us about yourself");
	}
	
	@Test
	public void testStartComparingBtnAvailableAtBottomOfPage() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyStartComparingBtnAtPageBottom(),"Tell us about yourself");
	}
	
	@Test
	public void testCompareLifeInsuranceQuotesText() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyCompareLifeInsuranceQuotesText(),"Compare life insurance quotes from leading life insurers in Australia quickly and easily.");
	}
	
	@Test
	public void testCompareFromLifeBrokersText() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyCompareFromLifeBrokerText(),"Compare from Lifebroker’s range of leading life insurance providers*");
	}
	
	
	@Test
	public void testWhatIsLifeInsuranceText() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyWhatIsLifeInsuranceText(),"What is life insurance?");
	}
	
	@Test
	public void testEasilyCompareWithIselectAndLifeBrokeText() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyEasilyCompareWithIselectAndLifeBrokerText(),"Easily compare with iSelect & Lifebroker");
	}
	
	@Test
	public void testCompareLifeInsScrollButton() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertTrue(lpage.verifyCompareLifeInsScrollBtn());
	}
	
	@Test
	public void testOthertypesOfLifeInsurance() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyOtherTypesOfLifeInsuranceText(),"Other types of life insurance");
	}

	@Test
	public void testYourLifeInsuranceQuestionsAnswered() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyYourLifeInsuranceQuestionsAnsweredText(),"Your life insurance questions answered");
	}
	
	@Test
	public void testyouMightBeInterestedInText() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyYouMightBeInterestedInText(),"You might be interested in...");
	}
	
	
	@Test
	public void testViewAllPartnersBtn() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyViewAllPartnersBtn(),"We compare and sell a wide range of brands across insurance, utilities and personal finance.");
	}
	
	@Test
	public void testTPDReadMoreLink() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyTPDReadMoreLink(),"Total and Permanent Disability (TPD) Insurance");
	}
	
	@Test
	public void testTraumaReadMoreLink() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyTraumaInsuranceReadMore(),"Trauma Insurance");
	}
	
	@Test
	public void testIncomeProtReadMoreLink() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyIncomeProtectionReadMore(),"Easily compare income protection quotes");
	}
	
	@Test
	public void testKeyPersonInsReadMoreLink() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyReadMoreLinkOfKeyPersonIns(),"Key Person Insurance");
	}
	
	@Test
	public void testWorryingAboutGettingOlderReadMoreLink() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyReadMoreLinkOfWorryingAboutGettingOlder(),"Worrying about getting old? You really shouldn't");
	}
	
	@Test
	public void testReadMoreLinkOfTPD() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyReadMoreLinkOfTPD(),"Total and Permanent Disability (TPD) Insurance");
	}
	
	@Test
	public void testReadMoreLinkOfTrauma() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyWhatIsTraumaInsReadMoreLink(),"Trauma Insurance");
	}
	
	@Test
	public void testReadMoreLinkOfWhatIsLifeIns() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyWhatIsLifeInsReadMoreLink(),"Why Do You Need Life Insurance?");
	}

	
	
	@Test
	public void testCollpseButtons() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertTrue(lpage.collapseButtons());
			
	}
	
	@Test
	public void testFinancialServicesLink() {
		lpage = gpage.clickLifeInsuranceBtn();
		Assert.assertEquals(lpage.verifyLifeInsfinancialServicesGuide(),"Life Insurance Financial Services Guide");
			
	}
	
	
}
