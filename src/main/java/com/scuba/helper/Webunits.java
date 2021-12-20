package com.scuba.helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Webunits 
{
	public static void takeshreen(WebDriver webdriver,String filepath) throws IOException
	 {
		 TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	     //Call getScreenshotAs method to create image file

	             File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	         //Move image file to new destination

	             File DestFile=new File(filepath);

	             //Copy file at destination

	             FileUtils.copyFile(SrcFile, DestFile);
	 }
	}


