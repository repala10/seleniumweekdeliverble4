package com.tests.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.scuba.helper.Webunits;
import com.scuba.helper.browserfactory;
import com.scuba.helper.reports;
import com.tests.pages.Assignleave;
import com.tests.pages.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leavepage
{
	WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	@BeforeMethod
	public void setUp() {
		extent=reports.getReports();
		test=extent.createTest("leave page");
		
	
	}
	@Test
	public void TestValidLoginForChrome() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		// calling startbrowser from browser factory		
		WebDriver driver = browserfactory.StartBrowser("chrome", "https://opensource-demo.orangehrmlive.com");		
		Loginpage login_page = PageFactory.initElements(driver, Loginpage.class);
		Thread.sleep(2000);
		login_page.loginHRM_New("Admin", "admin123");
		//login_page.loginHRM_New("Admin", "admin123");
		Webunits. takeshreen(driver, "C:/Users/akhil/eclipse-workspace--MavenSeleniumWk3/MavenSeleniumProjects/target/screenShots/test2.png");
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="OrangeHRM";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		test.pass("login to HRM completed");
		Assignleave D=PageFactory.initElements(driver,Assignleave .class);
		D.myleave();
		D.dropDown1();
	}}

		

