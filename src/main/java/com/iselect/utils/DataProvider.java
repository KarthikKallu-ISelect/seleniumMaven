package com.iselect.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;



public class DataProvider {

	public static ArrayList<Object[]> getExcelData(String fileName) throws FileNotFoundException {
		String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
				+ "resources" + File.separator + "DataSheets" + File.separator + fileName;
		String sheetName = "Data";
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		ExcelUtility utility = new ExcelUtility(sheetName, path);
		for (int rowNum = 2; rowNum <= utility.getRowCount(sheetName); rowNum++) {
			String fname = utility.getCellData(sheetName, "FirstNames", rowNum);
			String lname = utility.getCellData(sheetName, "LastNames", rowNum);
			Object obj[] = { fname , lname};
			data.add(obj);
		}
		return data;
	}
	
	
	public static ArrayList<Object[]> getFirstnames(String fileName) throws FileNotFoundException {
		String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
				+ "resources" + File.separator + "DataSheets" + File.separator + fileName;
		String sheetName = "Rapide";
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		ExcelUtility utility = new ExcelUtility(sheetName, path);
		for (int rowNum = 2; rowNum <= utility.getRowCount(sheetName); rowNum++) {
			String productShortName = utility.getCellData(sheetName, "Product Short Name", rowNum);
			String state = utility.getCellData(sheetName, "State", rowNum);
			String membership = utility.getCellData(sheetName, "Membership", rowNum);
			String policyType = utility.getCellData(sheetName, "Policy type", rowNum);
			String tier = utility.getCellData(sheetName, "Tier", rowNum);
			String age = utility.getCellData(sheetName, "Age", rowNum);
			String lhcOutput = utility.getCellData(sheetName, "LHC output", rowNum);
			String output = utility.getCellData(sheetName, "Output", rowNum);
			Object obj[] = {productShortName,state,membership,policyType,tier,age,output,lhcOutput};
			data.add(obj);
		}
		return data;
	}
	
	public static ArrayList<Object[]> getLinks(String fileName,String tabName) throws FileNotFoundException {
		String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
				+ "resources" + File.separator + "DataSheets" + File.separator + fileName;
		String sheetName = tabName;
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		ExcelUtility utility = new ExcelUtility(sheetName, path);
		for (int rowNum = 2; rowNum <= utility.getRowCount(sheetName); rowNum++) {
			String actualUrl = utility.getCellData(sheetName, "From", rowNum);
			String expectedUrl = utility.getCellData(sheetName, "To", rowNum);
			Object obj[] = {actualUrl,expectedUrl};
			data.add(obj);
		}
		return data;
	}

}
