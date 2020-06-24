package com.uniqlo.Assignment1.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.uniqlo.Assignment1.Pages.FramePageObjects;
import com.uniqlo.Assignment1.Resources.Base;
import com.uniqlo.Assignment1.Resources.ExtentReporterNG;



public class TC_04_Frames extends Base {

	@BeforeMethod
	public void setUp() throws Exception {
		
	driver=initializeDriver();
	driver.get(prop.getProperty("BASE_URL_Frames"));
	logger.info("Verifying Opening page Frames");
	ExtentReporterNG.test=ExtentReporterNG.extent.createTest("TC_04_Frames Starting");
	
	}
	
	@Test
	@Parameters({"text1","text2"})
	public void Frames(String text1,String text2) {
		logger.info("Verifying Opening Single Frame");
		FramePageObjects.Single(driver).click();
		switchToFrame(0);
		FramePageObjects.TypeText(driver).clear();
		FramePageObjects.TypeText(driver).sendKeys(text1);
		driver.switchTo().defaultContent();
		logger.info("Verifying Opening Nested Frames");
		FramePageObjects.Nested(driver).click();
		switchToFrame(1);
		switchToFrame(0);
		FramePageObjects.TypeText(driver).clear();
		FramePageObjects.TypeText(driver).sendKeys(text2);
		driver.switchTo().defaultContent();
		
		ExtentReporterNG.test.log(Status.PASS,"Test Passed successfully");	
	}
	@AfterMethod
	public void tearDown() {
		ExtentReporterNG.extent.flush();
		driver.quit();
	}
	public static void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
}

