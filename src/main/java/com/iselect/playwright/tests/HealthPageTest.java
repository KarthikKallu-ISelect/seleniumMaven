package com.iselect.playwright.tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.iselect.playwright.pageObjects.HealthInsurancePage;

public class HealthPageTest extends BaseTest {

	@Test
	public void testHealthInsuranceQuestionsAnsweredText() {
		HealthInsurancePage health = new HealthInsurancePage(page, extentlog);
		health.navigate(p.getProperty("healthUrl"));
		assertTrue(health.verifyYourHealthInsuranceQuestionsAnswered());
	}

	@Test
	public void testHeadersAndCompareHealthInsuranceScrollButtonInHealthPage() {
		HealthInsurancePage health = new HealthInsurancePage(page, extentlog);
		health.navigate(p.getProperty("healthUrl"));
		assertTrue(health.verifyTextsAndHeadersInHealthPage());
	}

	@Test
	public void testGetStartedButton() {
		HealthInsurancePage health = new HealthInsurancePage(page, extentlog);
		health.navigate(p.getProperty("healthUrl"));
		assertTrue(health.getStartedButton());
	}

	@Test
	public void testViewAllOfOursPartnersButtonAndRangeOfHealthFundsText() {
		HealthInsurancePage health = new HealthInsurancePage(page, extentlog);
		health.navigate(p.getProperty("healthUrl"));
		assertTrue(health.checkOutRangeOfHealthFundsTextAndViewAllOurPartnersText());
	}

	@Test
	public void testHealthInsurancePremiumTextAndHowUsersRatedOurServiceText() {
		HealthInsurancePage health = new HealthInsurancePage(page, extentlog);
		health.navigate(p.getProperty("healthUrl"));
		assertTrue(health.checkHealthInsurancePremiumTextAndHowUsersRatedOurServiceText());
	}

	@Test
	public void testTrustPilotSection() {
		HealthInsurancePage health = new HealthInsurancePage(page, extentlog);
		health.navigate(p.getProperty("healthUrl"));
		assertTrue(health.verifyTrustpilotSection());
	}

	@Test
	public void testLearnMoreLink() {
		HealthInsurancePage health = new HealthInsurancePage(page, extentlog);
		health.navigate(p.getProperty("healthUrl"));
		assertTrue(health.verifyLearnMoreButton());
	}

	@Test
	public void testScheduleACallBtn() {
		HealthInsurancePage health = new HealthInsurancePage(page, extentlog);
		health.navigate(p.getProperty("healthUrl"));
		assertTrue(health.verifyScheduleAcallButton());
	}
	
	@Test
	public void testParticipatingHealthFundsLink() {
		HealthInsurancePage health = new HealthInsurancePage(page, extentlog);
		health.navigate(p.getProperty("healthUrl"));
		assertTrue(health.participatingHealthFunds());
	}
	

	@Test
	public void testHealthInsuranceWaitingPeriodsReadMoreLink() {
		HealthInsurancePage health = new HealthInsurancePage(page, extentlog);
		health.navigate(p.getProperty("healthUrl"));
		assertTrue(health.healthInsuranceWaitingPeriodsReadMoreLink());
	}

	

}
