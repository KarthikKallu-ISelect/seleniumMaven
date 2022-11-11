package com.iselect.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.iselect.base.BaseClass;
import com.iselect.utils.DataProvider;
import com.iselect.utils.ExcelUtility;

public class VerifyLinks extends BaseClass {

	@Test
	public void testAllBrokenLinks() {
		driver.get("https://www.iselect.com.au/");
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter(
					"C:\\Users\\karthikreddy.kallu\\Desktop\\Prod_Evidences\\linksUpAndRunningEvidence.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size());
		for (int i = 0; i < elements.size(); i++) {
			WebElement element = elements.get(i);
			String url = element.getAttribute("href");

			try {
				URL link = new URL(url);
				try {
					HttpURLConnection conn = (HttpURLConnection) link.openConnection();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					conn.connect();
					int responseCode = conn.getResponseCode();
					String statusMessage = conn.getResponseMessage();
					if (responseCode >= 400) {
						System.out.println(url + " link is broken");
						System.out.println(statusMessage);
						myWriter.write("url => " + url + " is broken And Status Message is : " + statusMessage);

					} else if (responseCode == 200) {
						myWriter.write("url => " + url + " is up And running ,Status Message is : " + statusMessage);
						System.out.println(url + " link is valid one");
						System.out.println(statusMessage);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			myWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * @org.testng.annotations.DataProvider public Iterator<Object[]> getTestData()
	 * throws FileNotFoundException { ArrayList<Object[]> data =
	 * DataProvider.getFirstnames("firstNames.xlsx"); return data.iterator(); }
	 */

	@Test(dataProvider = "getTestData")
	public void enterCustomerInformation(String fname) {
		System.out.println("my name is:" + fname);
	}

	@org.testng.annotations.DataProvider
	public Iterator<Object[]> getTestData() throws FileNotFoundException {
		ArrayList<Object[]> data = DataProvider.getFirstnames("AU_DualPricing_CalcualtionTemplate.xlsx");
		return data.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void enterCustomerInformation(String productName, String state, String membership, String policyType,
			String tier, String age, String output, String lhcOutput) {

		System.out.println(productName);
	}

	@Test
	public void testHyperlinksForOgImage() {
		SoftAssert soft = new SoftAssert();
		driver.get("https://wwwuat.iselect.com.au/");
		driver.manage().window().maximize();
		List<WebElement> hyperlinks = driver.findElements(By.xpath("//div[@id='globalnav']//ul//li//a"));
		Set<String> uniqueUrls = new HashSet<String>();
		hyperlinks.forEach(hyperlink -> {
			uniqueUrls.add(hyperlink.getAttribute("href"));
		});
		 for (Object ob : uniqueUrls) {
			driver.get(ob.toString());
			String pageSource = driver.getPageSource();
			soft.assertTrue(pageSource.contains("<meta property=\"og:image\" content=\"https://"));
			if (!pageSource.contains("<meta property=\"og:image\" content=\"https://")) {
		    System.out.println(" OG property visible? for url i.e " + ob.toString() + " :: "+ pageSource.contains("<meta property=\"og:image\" content=\"https://"));
			}
		}

	}

	@Test
	public void testHyperlinksFor2019TextOrImg() {
	
		driver.get("https://wwwuat.iselect.com.au/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		List<WebElement> hyperlinks = driver.findElements(By.xpath("//div[@id='globalnav']//ul//li//a"));
		List<String> urls = new ArrayList<String>();
		hyperlinks.forEach(hyperlink -> {
			urls.add(hyperlink.getAttribute("href"));
		});
		Set<String> uniqueUrls = new HashSet<String>(urls);
		System.out.println(uniqueUrls.size());
		 for (Object ob : uniqueUrls)
		 {
			    driver.get(ob.toString());
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				String dest = System.getProperty("user.dir") + File.separator + "Screenshots";
				 Shutterbug.shootPage(driver).save(dest);
				
				try {
					Boolean statusOne = driver.findElement(By.xpath("//*[text()='2019 Partner Awards']")).isDisplayed();
					System.out.println(
							"is 2019 Partner Awards text visible in the url? i.e " + ob.toString() + " ::: " + statusOne);
				} catch (Exception e) {
					System.out.println("There is no such 2019 Partner Awards text in the url i.e " + ob.toString());
				}
				try {
					Boolean statusTwo = driver
							.findElement(
									By.xpath("//a[@href='/partner_awards/']//*[contains(text(),'Partner of the Year')]"))
							.isDisplayed();
					System.out.println(
							"is partner of the year text visible in the url? i.e " + ob.toString() + " ::: " + statusTwo);
				} catch (Exception e) {
					System.out.println("There is no such Partner of the year text in the url i.e " +ob.toString());

				}
				try {
					Boolean statusThree = driver.findElement(By.xpath("//a[@href='/partner_awards/']//img")).isDisplayed();
					System.out.println(
							"is partner awards logo visible in the url? i.e " + ob.toString() + " ::: " + statusThree);
				} catch (Exception e) {
					System.out.println("There is no such Partner awards logo in the url i.e " + ob.toString());

				}
				
				try {
					Boolean statusFour=	 driver
							.findElement(
									By.xpath("//a[@href='/partner_awards/']//*[contains(text(),'Partner')]"))
							.isDisplayed();
					System.out.println(
							"is partner text visible in the url? i.e " + ob.toString() + " ::: " + statusFour);
				} catch (Exception e) {
					System.out.println("There is no such Partner text in the url i.e " + ob.toString());

				}
				
				try
				{
					Boolean statusFive=driver.findElement(By.xpath("//*[contains(text(),'Partner of the Year') or contains(text(),'iSelect Best Partner')]")).isDisplayed();
					System.out.println(
							"is partner of the year or iSelect best partner visible in the url? i.e " + ob.toString() + " ::: " + statusFive);
				}catch(Exception e)
				{
					System.out.println("There is no such partner of the year or iSelect best partner text in the url i.e " + ob.toString());
				}
				
		 }
	/*	for (int i = 0; i < urls.size(); i++) {
			driver.get(urls.get(i));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// Scroll down till the bottom of the page
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dest = System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator
					+ "Screenshot_" + getDateAndTime() + ".png";
			File destination = new File(dest);
			try {
				FileUtils.copyFile(source, destination);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				Boolean statusOne = driver.findElement(By.xpath("//div[text()='2019 Partner Awards']")).isDisplayed();
				System.out.println(
						"is 2019 Partner Awards text visible in the url? i.e " + urls.get(i) + " ::: " + statusOne);
			} catch (Exception e) {
				System.out.println("There is no such 2019 Partner Awards text in the url i.e " + urls.get(i));
			}
			try {
				Boolean statusTwo = driver
						.findElement(
								By.xpath("//a[@href='/partner_awards/']//*[contains(text(),'Partner of the Year')]"))
						.isDisplayed();
				System.out.println(
						"is partner of the year text visible in the url? i.e " + urls.get(i) + " ::: " + statusTwo);
			} catch (Exception e) {
				System.out.println("There is no such Partner of the year text in the url i.e " + urls.get(i));

			}
			try {
				Boolean statusThree = driver.findElement(By.xpath("//a[@href='/partner_awards/']//img")).isDisplayed();
				System.out.println(
						"is partner awards logo visible in the url? i.e " + urls.get(i) + " ::: " + statusThree);
			} catch (Exception e) {
				System.out.println("There is no such Partner awards logo in the url i.e " + urls.get(i));

			}
		}
*/
	}
	
	@Test
	public void getAllLinksAndLinkTexts()
	{
		int i=1;
		driver.get("https://www.iselect.com.au");
		List<WebElement> webElements = driver.findElements(By.xpath("//div[@id='globalnav']//ul//li//a"));
		Set<String> urls=new HashSet<String>();
		ExcelUtility util=new ExcelUtility("Sheet2", "./src/test/resources/DataSheets/data.xlsx");	
		webElements.forEach(webElement->urls.add(webElement.getAttribute("href")));
		for(String url : urls)
		{
			util.setCellData("Sheet2","urls",++i, url);
		}
		
	}

}
