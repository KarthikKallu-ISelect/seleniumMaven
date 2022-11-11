package com.iselect.tests;

import org.testng.annotations.Test;
import com.iselect.base.BaseClass;
import com.iselect.pages.HealthPageWeb;


public class HealthPageWebTest  extends BaseClass{

	
	@Test
	public void enterPostcode()
	{
		HealthPageWeb hpw=new HealthPageWeb(driver,extentlog);
		hpw.navigate("https://wwwuat.iselect.com.au/health-insurance/");
		hpw.clickOnSelectDropdown();
		hpw.clickOnMembership("Just for me - male");
		hpw.enterPostCode("2000");
		hpw.clickOnCurrentlyNotCovered();
		hpw.clickOnHealthConcernOption();
		hpw.enterUserDob("09/01/1980");
		hpw.clickOnAppDisclaimer();
		hpw.selectRebateTier("Single Male",1);
		hpw.clickOnContinueBtn();
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
