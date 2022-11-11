package com.iselect.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.iselect.base.BaseClass;
import com.iselect.pages.HealthPage;

public class HealthPageTest extends BaseClass {

	HealthPage hpage;
	
	@Test
	public void testclickTermsAndConditions() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertTrue(gpage.clicktermsAndConditions());
	}

	@Test
	public void testclickOnPrivacyPolicy() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertTrue(gpage.clickOnPrivacyPolicy());
	}

	@Test
	public void testclickOnDisclaimer() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertTrue(gpage.clickOnDisclaimer());
	}

	@Test
	public void testContactUsLink() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertEquals(gpage.clickOnContactUs(), "Contact");
	}

	@Test
	public void testHowIselectWork() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertEquals(gpage.clickOnHowISelectWorks(), "How iSelect works");
	}

	@Test
	public void testOurCompanyLink() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertEquals(gpage.clickOnOurCompany(), "Our Company");
	}

	@Test
	public void testCareersLink() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertEquals(gpage.clickOnCareers(), "Careers");
	}

	@Test
	public void testMediaCenterLink() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertEquals(gpage.clickOnMediaCenter(), "Media Centre");
	}

	@Test
	public void testInvestorCentreLink() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertEquals(gpage.clickOnInvestorCentreLink(), "Investor Centre");
	}
	
	@Test
	public void testclickOnFacebook() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertEquals(gpage.clickOnFacebook(),"iSelect - Home | Facebook");
	}

	@Test
	public void testclickOnLinkedIn() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertTrue(gpage.clickOnLinkedIn());
	}

	@Test
	public void testclickOnTwitter() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertEquals(gpage.clickOnTwitter(), "iSelect");
	}

	@Test
	public void testclickOnYoutube() {
		hpage = gpage.clickHealthInsuranceBtn();
		Assert.assertEquals(gpage.clickOnYoutube(), "iSelect");
	}

}
