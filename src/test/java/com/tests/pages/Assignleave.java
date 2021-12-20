package com.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Assignleave 
{
	WebDriver driver;
	@FindBy(xpath = "//span[contains(text(),'Assign Leave')]")
	WebElement assinleave;
@FindBy(id="assignleave_txtEmployee_empName")
	WebElement empName;
@FindBy(xpath = "//img[@class='ui-datepicker-trigger']")
WebElement fromdate;
////	WebElement dates;

	@FindBy(xpath = "//a[contains(text(),'17')]")
	WebElement ddate;
	@FindBy(xpath = "//label[@for='assignleave_txtToDate']")
	WebElement todate;
	@FindBy(xpath = "//a[contains(text(),'17')]")
	WebElement ddate1;
	@FindBy(id="assignleave_txtComment")
	WebElement comment;
	@FindBy(xpath="//input[@id=\"assignBtn\"]")
	WebElement assign;
	
//	@FindBy(id="assignleave_duration_duration")
//	WebElement Duration;
	public void dropDown1() throws InterruptedException 
	{
		Thread.sleep(3000);
		WebElement dd_po=driver.findElement(By.id("assignleave_txtLeaveType"));
		Select SelectDD=new Select(dd_po);
		Thread.sleep(3000);
		//.selectByVisibleText("US-Vacation");
		SelectDD.deselectByIndex(4);
//		WebElement dd=driver.findElement(By.id("assignleave_duration_duration"));
//		Select Selectsk=new Select(dd);
//		Thread.sleep(3000);
//		SelectDD.selectByIndex(1);
		
	}
			

public void myleave() throws Exception
{
	
	assinleave.click();
	empName.sendKeys("Orange Test");
	Thread.sleep(4000);
	fromdate.click();
	Thread.sleep(4000);
	todate.click();
	Thread.sleep(4000);
	ddate1.click();
	//date.click();
	comment.sendKeys("present");
	Thread.sleep(4000);
	assign.click();
	


}}
