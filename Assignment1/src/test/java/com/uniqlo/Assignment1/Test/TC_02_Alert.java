package com.uniqlo.Assignment1.Test;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.uniqlo.Assignment1.Pages.AlertPageObjects;
import com.uniqlo.Assignment1.Resources.Base;
import com.uniqlo.Assignment1.Resources.ExtentReporterNG;

import junit.framework.Assert;


public class TC_02_Alert extends Base {
	
	public static Alert alt;
	@BeforeMethod
	public void setUp() throws Exception {	
	driver=initializeDriver();
	driver.get(prop.getProperty("BASE_URL_Alerts"));
	logger.info("Verifying Opening page Alerts");
	ExtentReporterNG.test=ExtentReporterNG.extent.createTest("TC_02_Alert Starting");
	
	}
	
	@Test
	public void Alert() throws Exception{
		logger.info("Verifying Alerts Appears and pressing OK button");
		AlertPageObjects.Ok(driver).click();
		Thread.sleep(1000);
		AlertPageObjects.onclick(driver).click();
		if(isAlertPresent(driver)) {
			Assert.assertEquals(prop.getProperty("AlertWithOK"), alt.getText());
			alt.accept();
			
				
		}
		logger.info("Verifying Alerts Appears and pressing OK/Cancel button");
		AlertPageObjects.OkCancel(driver).click();
		AlertPageObjects.clickokcancel(driver).click();
		if(isAlertPresent(driver)) {
			Assert.assertEquals(prop.getProperty("AlertWithOkAndCancel"), alt.getText());
			alt.dismiss();
			
				
		}
		logger.info("Verifying Alerts Appears and prompting to enter text");
		AlertPageObjects.TextBox(driver).click();
		AlertPageObjects.clickTextBox(driver).click();
		if(isAlertPresent(driver)) {
			Assert.assertEquals(prop.getProperty("AlertWithBox"), alt.getText());
			alt.sendKeys("devi");
			alt.accept();
				
		}
		ExtentReporterNG.test.log(Status.PASS,"Test Passed successfully");
	}
	@AfterMethod
	public void tearDown() {
		ExtentReporterNG.extent.flush();
		driver.quit();
	}
	public static boolean isAlertPresent(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
		try{
			  alt=driver.switchTo().alert();
			  return true;
			 }catch(NoAlertPresentException ex){
				 logger.error("Alert box has not appeared");
			  return false;
			 }

}

}
