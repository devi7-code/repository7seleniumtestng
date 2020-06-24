package com.uniqlo.Assignment1.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.uniqlo.Assignment1.Pages.WindowPageObjects;
import com.uniqlo.Assignment1.Resources.Base;
import com.uniqlo.Assignment1.Resources.ExtentReporterNG;



public class TC_03_Windows extends Base {
	public static Logger logger=LogManager.getLogger(TC_03_Windows.class);
	
	@BeforeMethod
	public void setUp() throws Exception {
		
	driver=initializeDriver();
	driver.get(prop.getProperty("BASE_URL_Windows"));
	logger.info("Verifying Opening page Windows");
	ExtentReporterNG.test=ExtentReporterNG.extent.createTest("TC_03_Windows Starting");
	
	
	}
	
	@Test
	public void Windows() {
		logger.info("Verifying Tabbed Windows opening");
		WindowPageObjects.Tabbed(driver).click();
		WindowPageObjects.onclicktabbed(driver).click();
		switchToWindow();
		logger.info("Verifying Seperate Windows Opening");
        WindowPageObjects.Seperate(driver).click();
		WindowPageObjects.onclickseperate(driver).click();
		switchToWindow();
		ExtentReporterNG.test.log(Status.PASS,"Test Passed successfully");
	}
	@AfterMethod
	public void tearDown() {
		ExtentReporterNG.extent.flush();
		driver.quit();
	}
	public static void switchToWindow() {
		String  currentHandle = driver.getWindowHandle();
		System.out.println("The title of the parent window is "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), prop.getProperty("Parent_Window"), "parent window is not displayed");
		Set < String > handles = driver.getWindowHandles();
        for (String actual: handles) {
            if (!actual.equalsIgnoreCase(currentHandle)) { //switching to the opened tab              
                driver.switchTo().window(actual); //opening the URL saved.  
                System.out.println("The title of the child  window is "+driver.getTitle());
                Assert.assertEquals(driver.getTitle(), prop.getProperty("Child_Window"), "child window is not displayed");
                driver.close();
                driver.switchTo().window(currentHandle);
            }
        }
	}
}

