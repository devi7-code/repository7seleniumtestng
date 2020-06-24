package com.uniqlo.Assignment1.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.uniqlo.Assignment1.Resources.Base;
import com.uniqlo.Assignment1.Resources.ExtentReporterNG;

import junit.framework.Assert;

import com.aventstack.extentreports.Status;
import com.uniqlo.Assignment1.Pages.DatePickerPageObjects;



public class TC_05_DatePicker extends Base {
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	@BeforeMethod
	public void setUp() throws Exception {
		
	driver=initializeDriver();
	driver.get(prop.getProperty("BASE_URL_DatePicker"));
	logger.info("Verifying Opening page DatePicker");
	ExtentReporterNG.test=ExtentReporterNG.extent.createTest("TC_05_DatePicker Starting");
	
	}
	
	@Test
	public void DatePicker() throws ParseException {
		Date today = new Date();
        String todayDate = sdf.format(today);
        java.util.Calendar date = java.util.Calendar.getInstance();
        date.setTime(sdf.parse(todayDate));
        date.add(Calendar.DATE, +7);
        String finaldate=sdf.format(date.getTime());
        logger.info("Verifying Disabled Date Picker");
        WebElement element1=DatePickerPageObjects.Date1(driver);
        DatePick(driver,finaldate,element1);
        logger.info("Verifying Enabled date picker");
        WebElement element2=DatePickerPageObjects.Date2(driver);
        DatePick(driver,finaldate,element2);
        ExtentReporterNG.test.log(Status.PASS,"Test Passed successfully");
	}
	@AfterMethod
	public void tearDown() {
//		ExtentReporterNG.extent.e
		ExtentReporterNG.extent.flush();
		driver.quit();
	}
	public static void DatePick(WebDriver driver,String datval,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
        js.executeScript("arguments[0].setAttribute('value','"+datval+"');",element);

	}
}

