package com.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.scuba.helper.reports;
public class Loginpage   
{
	//	public static ExtentReports extent;
	//	public static ExtentTest test;
	//	public static ExtentSparkReporter spark;
	//	@BeforeMethod
	//	public void setUp() {
	//		extent=reports.getReports();
	//		test=extent.createTest("Login Test");
	//	}
	//	
	WebDriver driver;
	// locators username, passwd, login_button

	@FindBy(id="txtUsername") 
	@CacheLookup   //element will be saved in cache. Will not check webelement again, will fetch from cache memory
	WebElement username;

	@FindBy(how=How.ID, using="txtPassword")
	@CacheLookup
	WebElement password;

	@FindBy(how=How.XPATH, using="//input[@id='btnLogin']")
	@CacheLookup
	WebElement login_button;
	// constructor
	//img[@src="/webres_61b909b95abd45.64680148/orangehrmTimePlugin/images/MyTimesheet.png"]
	public Loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void loginHRM_New(String uid, String passwd)
	{
		username.sendKeys(uid);
		password.sendKeys(passwd);
		login_button.click();
		// mytimesheet.click();   
	}



}



