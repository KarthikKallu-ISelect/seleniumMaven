package com.iselect.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.iselect.base.BaseClass;
import com.iselect.pages.CarPage;

public class CarPageTest extends BaseClass{

	CarPage cpage;
	
	@Test
	public void testclickTermsAndConditions() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(gpage.clicktermsAndConditions());
	}

	@Test
	public void testclickOnPrivacyPolicy() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(gpage.clickOnPrivacyPolicy());
	}

	@Test
	public void testclickOnDisclaimer() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(gpage.clickOnDisclaimerInLifeInsurance());
	}

	@Test
	public void testContactUsLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(gpage.clickOnContactUs(), "Contact");
	}

	@Test
	public void testHowIselectWork() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(gpage.clickOnHowISelectWorks(), "How iSelect works");
	}

	@Test
	public void testOurCompanyLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(gpage.clickOnOurCompany(), "Our Company");
	}

	@Test
	public void testCareersLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(gpage.clickOnCareers(), "Careers");
	}

	@Test
	public void testMediaCenterLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(gpage.clickOnMediaCenter(), "Media Centre");
	}

	@Test
	public void testInvestorCentreLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(gpage.clickOnInvestorCentreLink(), "Investor Centre");
	}
	
	@Test
	public void testclickOnFacebook() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(gpage.clickOnFacebook(),"iSelect - Home | Facebook");
	}

	@Test
	public void testclickOnLinkedIn() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(gpage.clickOnLinkedIn());
	}

	@Test
	public void testclickOnTwitter() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(gpage.clickOnTwitter(), "iSelect");
	}

	@Test
	public void testclickOnYoutube() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(gpage.clickOnYoutube(), "iSelect");
	}
	
	@Test
	public void testFinancialServicesLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(cpage.verifyCarInsfinancialServicesGuide(),"General Insurance Financial Services Guide");
			
	}
	
	@Test
	public void testParticipatingInsurersLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(cpage.verifyParticipatingInsurersLink(),"Auto & General Insurance Company Limited (AFSL 285571)");
			
	}
	
	@Test
	public void testBecomeOurPartnerLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(cpage.verifyBecomeOurPartnerLink(),"BECOME OUR PARTNER");
			
	}
	
	
	@Test
	public void testCarPartnerOfYearLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(cpage.verifyPartnerAwardsLink());
			
	}

	
	@Test
	public void testCollapseButtons() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(cpage.collapseButtons());
			
	}
	
	
	@Test
	public void testYourCarInsuranceQuestionsAnsweredTxt() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(cpage.yourCarInsuranceQuestionsAnsweredTxt());
			
	}

	@Test
	public void testYouMightBeInterestedInTxt() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(cpage.youMightBeInterestedInTxt());
			
	}
	

	@Test
	public void testReadMoreAboutTypesOfCarInsuranceLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(cpage.verifyReadMoreAboutTypesOfCarInsurance(),"The Different Types of Car Insurance & What You Need To Know");
			
	}
	
	@Test
	public void testReadMoreAboutSavingMoneyOnCarInsuranceLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(cpage.verifyReadMoreAboutSavingMoneyOnCarInsurance(),"How To Save Money On Car Insurance");
			
	}


	@Test
	public void testReadMoreAboutTipsForFirstTimeDriversLink() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(cpage.verifyReadMoreAboutTipsForFirstTimeDrivers(),"Tips For First Time Drivers");
			
	}
	

	@Test
	public void testReadMoreAboutComprehensiveCarIns() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(cpage.verifyReadMoreAboutComprehensiveCarInsurance(),"Comprehensive Car Insurance");
			
	}


	@Test
	public void testReadMoreAboutDoINeedCarInsurance() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertEquals(cpage.verifyReadMoreAboutDoINeedCarInsurance(),"Do I Need Car Insurance?");
			
	}
	
	
	@Test
	public void testOptionalExtrasOfferedTxt() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(cpage.verifylearnMoreAboutOptionalExtrasOfferedText());
			
	}
	

	@Test
	public void testCompareCarInsuranceScrollBtn() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(cpage.verifyCompareCarInsuranceScrollButton());
			
	}
	
	@Test
	public void testAverageCarInsurancePremiumsInAusisTxt() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(cpage.verifyAverageCarInsuranceTxt());
			
	}
	
	@Test
	public void testWhatIsCarInsuranceTxt() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(cpage.verifyWhatIsCarInsuranceTxt());
			
	}
	
	@Test
	public void testWhatDoesCarInsuranceCover() {
		cpage = gpage.carInsuranceLanding();
		Assert.assertTrue(cpage.verifyWhatDoesCarInsuranceCover());
			
	}
	
	
	@Test
	public void testCompareCarInsuranceHeader() {
		cpage = gpage.carInsuranceLanding();
		assertTrue(cpage.verifyCompareCarInsuranceheader().contains("Car Insurance*"));
		assertTrue(cpage.verifyCompareCarInsuranceheader().contains("Compare"));	
	}
	
	@Test
	public void testCarInsuranceSimplifiedTxt() {
		cpage = gpage.carInsuranceLanding();
		assertEquals(cpage.verifyCarInsuranceSimplifiedTxt(),"Car insurance, simplified");	
	}
	
	@Test
	public void testEasilyCompareSelectSaveTxt() {
		cpage = gpage.carInsuranceLanding();
		assertEquals(cpage.verifyEasilyCompareSelectSaveTxt(),"Easily compare, select and save on car insurance policies");	
	}
	
	@Test
	public void testCompareCarInsuranceQuotesWithIselectTxt() {
		cpage = gpage.carInsuranceLanding();
		assertEquals(cpage.verifyCompareCarInsuranceQuotesWithIselectTxt(),"How you can compare car insurance quotes with iSelect*");	
	}
	
	@Test
	public void testGetStartedBtn() {
		cpage = gpage.carInsuranceLanding();
		assertTrue(cpage.getStartedBtn());	
	}
	
	@Test
	public void testSeeOurPartnersBtn() {
		cpage = gpage.carInsuranceLanding();
		assertEquals(cpage.seeOursPartnersBtn(),"We compare and sell a wide range of brands across insurance, utilities and personal finance.");	
	}
	
	@Test
	public void testHowUsersRatedOurServiceTxt() {
		cpage = gpage.carInsuranceLanding();
		assertTrue(cpage.howUsersRatedOurServiceTxt());	
	}
	
	@Test
	public void testComprehensiveCarInsReadMore() {
		cpage = gpage.carInsuranceLanding();
		assertEquals(cpage.verifyComprehensiveCarInsReadMore(),"Comprehensive Car Insurance");	
	}
	
	@Test
	public void testCtpInsuranceReadMore() {
		cpage = gpage.carInsuranceLanding();
		assertEquals(cpage.verifyCtpInsuranceReadMore(),"Compulsory Third Party (CTP) Insurance: What it is and how it works in Australia");	
	}
	
	@Test
	public void testThirdPartyPropertyDamageReadMore() {
		cpage = gpage.carInsuranceLanding();
		assertEquals(cpage.verifyThirdPartyPropertyDamageReadMore(),"Third Party Property Insurance");	
	}

	
	@Test
	public void testThirdPartyFireReadMore() {
		cpage = gpage.carInsuranceLanding();
		assertEquals(cpage.verifyThirdPartyFireReadMore(),"Third Party Fire and Theft Car Insurance");	
	}

}
