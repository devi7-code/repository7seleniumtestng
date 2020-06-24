package com.uniqlo.Assignment1.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.uniqlo.Assignment1.Pages.LoginPageObjectsIndia;
import com.uniqlo.Assignment1.Resources.Base;

import util.TestUtil;


public class TC_07_Login_India extends Base{
	
	public void Register(String fname,String lname,String email,
			String pass,String confirmpass, String month,String year,String zipcode) throws Exception  {
    	
	LoginPageObjectsIndia.Register(driver).click();
		LoginPageObjectsIndia.firstname(driver).clear();
		LoginPageObjectsIndia.firstname(driver).sendKeys(fname);
		LoginPageObjectsIndia.lastname(driver).clear();
		LoginPageObjectsIndia.lastname(driver).sendKeys(lname);
		LoginPageObjectsIndia.email(driver).clear();
		LoginPageObjectsIndia.email(driver).sendKeys(email);
		LoginPageObjectsIndia.pass(driver).clear();
		LoginPageObjectsIndia.pass(driver).sendKeys(pass);
		LoginPageObjectsIndia.confirmpass(driver).clear();
		LoginPageObjectsIndia.confirmpass(driver).sendKeys(confirmpass);
		LoginPageObjectsIndia.month(driver).selectByVisibleText(month);
		Thread.sleep(4000);
		LoginPageObjectsIndia.year(driver).selectByVisibleText(year);
		Thread.sleep(3000);
		LoginPageObjectsIndia.zipcode(driver).click();
		LoginPageObjectsIndia.zipcode(driver).sendKeys(zipcode);
		LoginPageObjectsIndia.submit(driver).click();
		

	}

	public void Login(String email,String pass) {
		LoginPageObjectsIndia.Login(driver).click();
		LoginPageObjectsIndia.username(driver).clear();
		LoginPageObjectsIndia.username(driver).sendKeys(email);
		LoginPageObjectsIndia.password(driver).clear();
		LoginPageObjectsIndia.password(driver).sendKeys(pass);
		LoginPageObjectsIndia.submitlogin(driver).click();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
