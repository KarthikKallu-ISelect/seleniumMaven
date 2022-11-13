package com.iselect.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.iselect.pages.GlobalHomePage;
import com.iselect.utils.CustomUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriverListener eventDriver;
	public WebDriverWait wait;
	public JavascriptExecutor jse;
	public Actions action;
	public DesiredCapabilities caps;
	public GlobalHomePage gpage;
	public CustomUtils cutils;
	public FileReader reader;
	public Properties p;
	public WebDriver driver = null;
	protected ExtentTest extentlog;
	public ExtentReports reports;
	public ExtentSparkReporter htmlReporter;

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
				+ File.separator + "ISelectAutomationReport_" + getDateAndTime());
		reports.attachReporter(htmlReporter);
		reports.setSystemInfo("Env", "UAT");
		reports.setSystemInfo("Organization", "Valuelabs");
		reports.setSystemInfo("Website", "https://wwwuat.iselect.com.au/");
		reports.setSystemInfo("browser", "chrome");
		try {
			htmlReporter.loadXMLConfig(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
					+ File.separator + "resources" + File.separator + "extentconfig.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// @Parameters("browser")
	@BeforeMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void setup(Method method) {
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(Boolean.parseBoolean(p.getProperty("headless")));
		options.addArguments("start-maximized");
		String browser = p.getProperty("browser");
		if (browser.equalsIgnoreCase("Chrome")) {
			//WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
		} else if (browser.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		eventDriver = new EventHandler();
		driver = new EventFiringDecorator(eventDriver).decorate(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(p.getProperty("dynamicWait"))));
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
		if(Boolean.parseBoolean(p.getProperty("headless")))
		driver.manage().window().setSize(new Dimension(2560, 1440));
		//driver.get(p.getProperty("url"));
		extentlog = reports.createTest("Test Case: " + method.getName());
		extentlog.info("Following test case i.e " + method.getName() + " execution started");
		gpage = new GlobalHomePage(driver, extentlog);
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
				e.printStackTrace();
			}
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentlog.log(Status.PASS, result.getName() + " test case execution successfully passed");
			try {
				extentlog.fail(MediaEntityBuilder.createScreenCaptureFromPath(capture()).build());
			} catch (IOException e) {
				e.printStackTrace();
			}
			/*
			 * try {
			 * extentlog.pass(MediaEntityBuilder.createScreenCaptureFromPath(capture()).
			 * build()); } catch (IOException e) { e.printStackTrace(); }
			 */
		} else if (result.getStatus() == ITestResult.SKIP) {
			extentlog.skip("Test Case : " + result.getName() + " has been skipped");
		}

		driver.quit();
	}

	@AfterTest(groups = { "Smoke", "Sanity", "Regression" })
	public void endTest() {
		reports.flush();
	}

	@AfterSuite(groups = { "Smoke", "Regression", "Sanity" })
	public void afterSuite() {
	}

	public String getDateAndTime() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E_yyyy-MM-dd_hh_mm_ss_a_zzz");
		return ft.format(dNow).toString();
	}

	// below method captures screenshot
	public String capture() throws IOException {
		// UUID uuid = UUID.randomUUID();
		if (driver == null)
			System.out.println("driver was null");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + File.separator + "Screenshots" + File.separator
				+ "TestProof_Screenshot_" + getDateAndTime() + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);

		return dest;
	}

}
