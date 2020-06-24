package com.uniqlo.Assignment1.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.uniqlo.Assignment1.Pages.SelectablePageObjects;
import com.uniqlo.Assignment1.Resources.Base;
import com.uniqlo.Assignment1.Resources.ExtentReporterNG;
public class TC_06_Selectable extends Base{
	@BeforeMethod
	public void setUp() throws Exception {
		
	driver=initializeDriver();
	driver.get(prop.getProperty("BASE_URL_Selectable"));
	logger.info("Verifying Opening page Selectable");
	ExtentReporterNG.test=ExtentReporterNG.extent.createTest("TC_06_Selectable Starting");
	
	}
@Test
public void selectable() {
	SelectablePageObjects.Serializebtn(driver).click();
	
	logger.info("Verifying clicking on Dynamic WebElements");
	for (WebElement element : SelectablePageObjects.SelectEachbtn(driver)) {

	element.click();
	Assert.assertTrue(SelectablePageObjects.DisplayedElement(driver).isDisplayed());
	ExtentReporterNG.test.log(Status.PASS,"Test Passed successfully");

	}
}
@AfterMethod
public void tearDown() {
	
	ExtentReporterNG.extent.flush();
	driver.quit();
}
}
