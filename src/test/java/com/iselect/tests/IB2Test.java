package com.iselect.tests;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.testng.annotations.Test;
import com.iselect.base.BaseClass;
import com.iselect.pages.IB2;
import com.iselect.utils.DataProvider;

public class IB2Test extends BaseClass {

	@Test
	public void createCustomerCouple() {
		IB2 ib2 = new IB2(driver, extentlog);
		ib2.navigate("https://uatib2.iselect.com.au/ib2/pages/Login_prepare.action");
		// policyType can be in the following => hospitalOnly,extrasOnly,both
		// excess can be in the following => 0/0,1/250,251/500,501/750,0/5000[All]
		// partnerhealthfundno,partnerhealthfundyesPartnercontinouscoverno,partnerhealthfundyesPartnercontinouscoveryes,healthfundno,healthfundyesContinouscoverno,healthfundyesContinouscoveryes
		ib2.createCustomer("VIC", "3000", "Couple", "04/09/1986", "04/09/1986", "2", "extrasOnly", "251/500", "bronze",
				"healthfundyesContinouscoverno", "partnerhealthfundyesPartnercontinouscoverno", 0.01);
		try {
			Thread.sleep(360000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void createCustomerSingle() {
		IB2 ib2 = new IB2(driver, extentlog);
		ib2.navigate("https://uatib2.iselect.com.au/ib2/pages/Login_prepare.action");
		// policyType can be in the following => hospitalOnly,extrasOnly,both
		// excess can be in the following => 0/0,1/250,251/500,501/750,0/5000[All]
		// partnerhealthfundno,partnerhealthfundyesPartnercontinouscoverno,partnerhealthfundyesPartnercontinouscoveryes,healthfundno,healthfundyesContinouscoverno,healthfundyesContinouscoveryes
		ib2.createCustomer("QLD", "4000", "Single Male", "09/09/1986", "", "3", "both", "251/500", "silver",
				"healthfundyesContinouscoverno", "", 0.01);
		try {
			Thread.sleep(36000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void createCustomerFamily() {
		IB2 ib2 = new IB2(driver, extentlog);
		ib2.navigate("https://uatib2.iselect.com.au/ib2/pages/Login_prepare.action");
		// policyType can be in the following => hospitalOnly,extrasOnly,both
		// excess can be in the following => 0/0,1/250,251/500,501/750,0/5000[All]
		// partnerhealthfundno,partnerhealthfundyesPartnercontinouscoverno,partnerhealthfundyesPartnercontinouscoveryes,healthfundno,healthfundyesContinouscoverno,healthfundyesContinouscoveryes
		ib2.createCustomer("NSW", "2000", "Family", "04/04/1988", "04/04/1988", "2", "both", "251/500", "bronze",
				"healthfundyesContinouscoverno", "partnerhealthfundyesPartnercontinouscoverno", 0.01);
		try {
			Thread.sleep(180000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void createCustomerSingleParentFamily() {
		IB2 ib2 = new IB2(driver, extentlog);
		ib2.navigate("https://uatib2.iselect.com.au/ib2/pages/Login_prepare.action");
		// NSW-2000,QLD-4000,SA-5000
		// policyType can be in the following => hospitalOnly,extrasOnly,both
		// excess can be in the following => 0/0,1/250,251/500,501/750,0/5000[All]
		// partnerhealthfundno,partnerhealthfundyesPartnercontinouscoverno,partnerhealthfundyesPartnercontinouscoveryes,healthfundno,healthfundyesContinouscoverno,healthfundyesContinouscoveryes
		ib2.createCustomer("QLD", "4000", "Single Parent Family", "04/04/1948", "", "3", "both", "251/500", "silver",
				"healthfundyesContinouscoverno", "", 0.01);
		try {
			Thread.sleep(18000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void createSingleParentFamilyCustomer(String excess, String hospitalCoverType, String postcode,
			String membership, String policyType, String tier, String age, double output, double lhcOutput) {
		IB2 ib2 = new IB2(driver, extentlog);
		ib2.navigate("https://uatib2.iselect.com.au/ib2/pages/Login_prepare.action");
		// NSW-2000,QLD-4000,SA-5000
		// policyType can be in the following => hospitalOnly,extrasOnly,both
		// excess can be in the following => 0/0,1/250,251/500,501/750,0/5000[All]
		// partnerhealthfundno,partnerhealthfundyesPartnercontinouscoverno,partnerhealthfundyesPartnercontinouscoveryes,healthfundno,healthfundyesContinouscoverno,healthfundyesContinouscoveryes
		ib2.createCustomer("", postcode, membership, age, age, tier, policyType, excess, hospitalCoverType,
				"healthfundno", "partnerhealthfundno", output);
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String readProductExcess(String product) {
		String arr[] = product.split(" ");
		List<String> strs = Arrays.asList(arr);
		if (strs.contains("$750"))
			return "501/750";
		else if (strs.contains("$500"))
			return "251/500";
		else if (strs.contains("$200"))
			return "1/250";
		return null;
	}

	public String readHospitalCover(String product) {
		String arr[] = product.split(" ");
		List<String> strs = Arrays.asList(arr);
		if (strs.contains("(Silver"))
			return "Silver";
		else if (strs.contains("(Bronze"))
			return "Bronze";
		else if (strs.contains("(Basic"))
			return "Basic";
		else
			return "Gold";
	}

	public String getMembership(String membership) {
		if (membership.trim().equalsIgnoreCase("SP"))
			return "Single Parent Family";
		else if (membership.trim().equalsIgnoreCase("S"))
			return "Single Male";
		else if (membership.trim().equalsIgnoreCase("F"))
			return "Family";
		else if (membership.trim().equalsIgnoreCase("C"))
			return "Couple";
		return null;
	}

	public String getAge(String age) {
		switch (age.trim()) {
		case "65.0":
			return "09/09/1956";
		case "75.0":
			return "09/09/1946";
		case "35.0":
			return "09/09/1986";
		}
		return age;

	}

	public String getPolicyType(String policyType) {
		if (policyType.trim().equalsIgnoreCase("B"))
			return "both";
		else if (policyType.trim().equalsIgnoreCase("A"))
			return "extrasOnly";
		else
			return "hospitalOnly";
	}

	public String getTier(String tier) {
		if (tier.trim().equalsIgnoreCase("Tier0"))
			return "0";
		else if (tier.trim().equalsIgnoreCase("Tier1"))
			return "1";
		else if (tier.trim().equalsIgnoreCase("Tier2"))
			return "2";
		else
			return "3";
	}

	public String getPostCode(String state) {
		switch (state.trim()) {
		case "QLD":
			return "4000";
		case "NSW":
			return "2000";
		case "VIC":
			return "3000";
		case "SA":
			return "5000";
		case "NT":
			return "0810";
		case "TAS":
			return "7000";
		case "WA":
			return "6000";
		case "NSW/ACT":
			return "2000";
		}
		return state;
	}

	@org.testng.annotations.DataProvider
	public Iterator<Object[]> getTestData() throws FileNotFoundException {
		ArrayList<Object[]> data = DataProvider.getFirstnames("AU_DualPricing_CalcualtionTemplate.xlsx");
		return data.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void enterCustomerInformation(String productName, String state, String membership, String policyType,
			String tier, String age, String output, String lhcOutput) {
		double outputt = (double) Math.round(Float.parseFloat(output) * 100) / 100;
		double lhcOutputt = (double) Math.round(Float.parseFloat(lhcOutput) * 100) / 100;
		System.out.println(productName + " " + state + " " + membership + " " + policyType + " " + tier + " " + age
				+ " " + outputt + " " + lhcOutputt);

		createSingleParentFamilyCustomer(readProductExcess(productName), readHospitalCover(productName),
				getPostCode(state), getMembership(membership), getPolicyType(policyType), getTier(tier), getAge(age),
				outputt, lhcOutputt);

	}
	// Note:
	// before july minus 30 and after july minus 31
	// for couple and family -- avg of lhc if different ages
	// for couple and family -- if lhc is same then ages are same
	// for AIA we need to add vitality amount [singles:114, couples:228]
}
