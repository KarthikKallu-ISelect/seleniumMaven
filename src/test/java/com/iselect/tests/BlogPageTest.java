package com.iselect.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.iselect.base.BaseClass;
import com.iselect.pages.BlogPage;


public class BlogPageTest extends BaseClass {

	BlogPage blog;


	@Test
	public void testBlogTitle() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(blog.verifyBlogTitle(),"Blog | iSelect");
	}
	
	
	
	@Test
	public void testHeaderText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(blog.verifyHeaderText(),"Find the advice and inspiration you need to get life right.");
	}
	
	
	@Test
	public void testPsychologyOfSavingLinkText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifyPsychologyOfSavingLinkText());
	}
	
	@Test
	public void testunderInsuringYourHomeLinkText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifyunderInsuringYourHomeLinkText());
	}
	
	@Test
	public void testPrivatehealthinsurancepremiumstorisebyLinkText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifyPrivateHealthInsPremiumsLinkText());
	}
	
	@Test
	public void testPrivateHealthInsurancePremiumsToRisebyLinkText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifyprivateHealthInsPremiumsPredictedToRiseLinkText());
	}
	
	@Test
	public void testDiscoverLifeTopicsText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifyDiscoverLifeTopicsText());
	}
	
	@Test
	public void testStartingOutLinkText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifyStartingOutLinkText());
	}
	
	@Test
	public void testSettlingDownLinkText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifySettlingDownLinkText());
	}
	
	@Test
	public void testEmbracingRetirementLinkText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifyEmbracingRetirementLinkText());
	}
	
	@Test
	public void testUnderstandingInsuranceLinkText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifyUnderstandingInsuranceLinkText());
	}
	
	@Test
	public void testOrganisingUtilitiesLinkText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifyOrganisingUtilitiesLinkText());
	}
	
	@Test
	public void testSortingFinancesLinkText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifySortingFinancesLinkText());
	}
	
	@Test
	public void testSeeWhatElseIsNewText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifySeeWhatElseIsNewText());
	}
	
	@Test
	public void testKeyFindingsLinkText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.verifyKeyFindingsLinkText());
	}
	
	@Test
	public void testViewMoreButton() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.viewMoreButton());
	}
	
	@Test
	public void testFaceBookLink() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(blog.fbButton(), "iSelect - Home | Facebook");
	}

	@Test
	public void testTwitterLink() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(blog.twitterButton(), "iSelect");
	}

	@Test
	public void testYoutubeLink() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(blog.youtubeButton(), "iSelect");
	}

	@Test
	public void testLinkedInLink() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.linkedInButton());
	}
	
	@Test
	public void testclickTermsAndConditions() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(gpage.clicktermsAndConditions());
	}

	@Test
	public void testclickOnPrivacyPolicy() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(gpage.clickOnPrivacyPolicy());
	}

	@Test
	public void testclickOnDisclaimer() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(gpage.clickOnDisclaimer());
	}

	@Test
	public void testContactUsLink() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(gpage.clickOnContactUs(), "Contact");
	}

	@Test
	public void testHowIselectWork() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(gpage.clickOnHowISelectWorks(), "How iSelect works");
	}

	@Test
	public void testOurCompanyLink() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(gpage.clickOnOurCompany(), "Our Company");
	}

	@Test
	public void testCareersLink() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(gpage.clickOnCareers(), "Careers");
	}

	@Test
	public void testMediaCenterLink() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(gpage.clickOnMediaCenter(), "Media Centre");
	}

	@Test
	public void testInvestorCentreLink() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(gpage.clickOnInvestorCentreLink(), "Investor Centre");
	}

	@Test
	public void testBecomeOurPartnerLink() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertEquals(gpage.clickOnBecomeOurPartner(), "BECOME OUR PARTNER");
	}

	@Test
	public void testGetOnTheListText() {
		blog = gpage.clickOnViewOurBlogButton();
		Assert.assertTrue(blog.getOnTheListText());
	}

	
	@Test()
	public void testFeedbackFunctionality() {
		blog = gpage.clickOnViewOurBlogButton();
		blog.testFeedBackFunctionality();
	}

	
}
