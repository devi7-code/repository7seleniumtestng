package com.uniqlo.Assignment1.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.uniqlo.Assignment1.Resources.ExtentReporterNG;
import com.uniqlo.Assignment1.Pages.RegisterPageObjects;
import com.uniqlo.Assignment1.Resources.Base;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import junit.framework.Assert;
import util.TestUtil;

public class TC_01_Register extends Base {
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		
	driver=initializeDriver();
	driver.get(prop.getProperty("BASE_URL_Register"));
	logger.info("Verifying Opening page Register");
	ExtentReporterNG.test=ExtentReporterNG.extent.createTest("TC_01_Register Starting");
	
	}
	@DataProvider
	public Object[][] RegisterData() throws Exception {
		Object data[][]=TestUtil.getTestData("Sheet1",currentdir+"\\src\\test\\java\\testData\\Register.xlsx");
		return data;
	}
	
	
	@Test(dataProvider="RegisterData")
	public void Register(String firstname,String lastname, String email, String phone, String country,
	String year, String month, String day,String password, String confirm)  {
		logger.info("Verifying Entering all the details required for registeration");
		RegisterPageObjects.firstname(driver).clear();
		RegisterPageObjects.firstname(driver).sendKeys(firstname);
		RegisterPageObjects.lastname(driver).clear();
		RegisterPageObjects.lastname(driver).sendKeys(lastname);
		RegisterPageObjects.email(driver).clear();
		RegisterPageObjects.email(driver).sendKeys(email);
		RegisterPageObjects.phone(driver).clear();
		RegisterPageObjects.phone(driver).sendKeys(phone);
		RegisterPageObjects.radio(driver).click();
		RegisterPageObjects.country(driver).selectByVisibleText(country);
		RegisterPageObjects.year(driver).selectByVisibleText(year);
		RegisterPageObjects.month(driver).selectByVisibleText(month);
		RegisterPageObjects.day(driver).selectByVisibleText(day);
		RegisterPageObjects.pass(driver).clear();
		RegisterPageObjects.pass(driver).sendKeys(password);
		RegisterPageObjects.confirmpass(driver).clear();
		RegisterPageObjects.confirmpass(driver).sendKeys(confirm);
		RegisterPageObjects.submit(driver).click();
		logger.info("Verifying the title of the newly opened page after registered");
		Assert.assertEquals("Register", driver.getTitle());
		ExtentReporterNG.test.log(Status.PASS,"Test Passed successfully");
		
		

	}
	@AfterMethod
	public void tearDown() {
		ExtentReporterNG.extent.flush();
		driver.quit();
	}

}
