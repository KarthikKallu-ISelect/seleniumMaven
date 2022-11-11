package com.iselect.playwright.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.iselect.utils.CustomUtils;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class BaseTest {

	public FileReader reader;
	public Properties p;
	protected ExtentTest extentlog;
	public ExtentReports reports;
	public ExtentSparkReporter htmlReporter;
	public Playwright playwright;
	public BrowserType chromium;
	public Browser browser;
	public com.microsoft.playwright.Page page;

	@BeforeSuite(groups = { "Smoke", "Sanity", "Regression" })
	public void startTest() {
		try {
			String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
					+ File.separator + "resources" + File.separator + "config.properties";
			reader = new FileReader(path);
			p = new Properties();
			p.load(reader);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		reports = new ExtentReports();
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator + "reports"
				+ File.separator + "ISelectAutomationReportUsingPlaywright_" + CustomUtils.getDateAndTime());
		reports.attachReporter(htmlReporter);
		reports.setSystemInfo("Env", p.getProperty("env"));
		reports.setSystemInfo("Organization", "Valuelabs");
		reports.setSystemInfo("Website", p.getProperty("url"));
		reports.setSystemInfo("browser", "chrome");
		try {
			htmlReporter.loadXMLConfig(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
					+ File.separator + "resources" + File.separator + "extentconfig.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@BeforeTest(groups = { "Smoke", "Sanity", "Regression" })
	public void beforeAllTests() {
	}

	@BeforeMethod
	public void setUp(Method method) {
		playwright = Playwright.create();
		chromium = playwright.chromium();
		// Can be "msedge", "chrome-beta", "msedge-beta", "msedge-dev", etc.
		browser = chromium.launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(Boolean.parseBoolean(p.getProperty("headless"))).setSlowMo(1000));
		extentlog = reports.createTest("Test Case: " + method.getName());
		extentlog.info("Following test case i.e " + method.getName() + " execution started");
		page = browser.newPage();
		page.setDefaultNavigationTimeout(60000);
		page.setDefaultTimeout(60000);
		page.setViewportSize(1600,900);
	}

	@AfterMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void endTest(ITestResult result, Method method) {
		extentlog.info("Following test case i.e " + method.getName() + " execution ended");
		if (result.getStatus() == ITestResult.FAILURE) {
			extentlog.log(Status.FAIL, result.getName()
					+ " test case execution failed ,Please find the failure Test Case ScreenShot below");
			extentlog.log(Status.FAIL, result.getThrowable());
			try {
				extentlog.fail(MediaEntityBuilder.createScreenCaptureFromPath(capture()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentlog.log(Status.PASS, result.getName() + " test case execution successfully passed");

			try {
				extentlog.pass(MediaEntityBuilder.createScreenCaptureFromPath(capture()).build());
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else if (result.getStatus() == ITestResult.SKIP) {
			extentlog.skip("Test Case : " + result.getName() + " has been skipped");
		}

		page.close();
	}

	@AfterTest(groups = { "Smoke", "Sanity", "Regression" })
	public void endTest() {
		reports.flush();
	}

	@AfterSuite(groups = { "Smoke", "Regression", "Sanity" })
	public void afterSuite() {
	}

	public String capture() throws IOException {
		String dest = null;

		dest = System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator
				+ "TestProof_Screenshot_" + CustomUtils.getDateAndTime() + ".png";

		Path path = Paths.get(dest);
		page.screenshot(new Page.ScreenshotOptions().setPath(path).setFullPage(false));

		return dest;

	}

	public String takeScreenshotUsingRobot() throws IOException {
		String dest = null;
		try {
			Robot r = new Robot();

			dest = System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator
					+ "TestProof_Screenshot_" + CustomUtils.getDateAndTime() + ".png";

			// Used to get ScreenSize and capture image
			Rectangle captureScreenSizeAndImage = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage Image = r.createScreenCapture(captureScreenSizeAndImage);
			ImageIO.write(Image, "png", new File(dest));
			System.out.println("Screenshot saved");

		} catch (AWTException | IOException ex) {
			System.out.println(ex);
		}
		return dest;

	}
}
