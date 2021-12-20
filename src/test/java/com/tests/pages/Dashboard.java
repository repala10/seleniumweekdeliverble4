package com.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Dashboard 
{

	WebDriver driver;
	@FindBy(how=How.XPATH,using="(//img[@src=\"/webres_61b909b95abd45.64680148/orangehrmTimePlugin/images/MyTimesheet.png\"])[2]")
	WebElement mytimesheet;
	@FindBy(how=How.XPATH, using=("//select[@id=\"startDates\"]"))
	WebElement Timesheet ;
	@FindBy(id="btnEdit")
	WebElement editbtn;
	@FindBy(id="initialRows_0_toDelete")
	WebElement checkbox;
	@FindBy(id="initialRows_0_projectName")
	WebElement projectname;

	@FindBy(how=How.XPATH,using = "//body/div[4]/ul[1]/li[3] ")
	WebElement dropDowns;
	@FindBy(className = "projectActivity")
	WebElement projactivity;
	
	@FindBy(id="initialRows_0_0")
	WebElement mon;
	@FindBy(id="initialRows_0_1")
	WebElement tue;
	@FindBy(id="initialRows_0_2")
	WebElement wed;
	@FindBy(name = "initialRows[0][3]")
	WebElement thu;
	@FindBy(name = "initialRows[0][4]")
	WebElement fri;
	@FindBy(name = "initialRows[0][5]")
	WebElement sat;
	@FindBy(name = "initialRows[0][6]")
	WebElement sun;
	@FindBy(name = "btnSave")
	WebElement saBtn;
	@FindBy(id="btnSubmit")
	WebElement submit;
	@FindBy(how=How.XPATH,using="//img[@src=\"/webres_61b909b95abd45.64680148/orangehrmLeavePlugin/images/ApplyLeave.png\"]")
	WebElement assinleave;
	public Dashboard(WebDriver driver) {
		this.driver=driver;
	}
	public void MyTimeSheet() throws InterruptedException {
		mytimesheet.click();
		editbtn.click();
		checkbox.click();
		projectname.click();
		projectname.sendKeys("a");
		Thread.sleep(2000);
		dropDowns.click();
		projactivity.click();
	}
	public void dropDown() throws InterruptedException 
	{

		WebElement dd_po=driver.findElement(By.id("initialRows_0_projectActivityName"));
		Select SelectDD=new Select(dd_po);
		Thread.sleep(3000);
		SelectDD.selectByVisibleText("Feature Development");
	}

	public void timesheet()
	{
		mon.sendKeys("8");
		tue.sendKeys("8");
		wed.sendKeys("8");
		thu.sendKeys("8");
		fri.sendKeys("8");
		sat.sendKeys("8");
		sun.sendKeys("8");
		saBtn.click();
        submit.click();		
        driver.quit();
        assinleave.click();
	}
}
