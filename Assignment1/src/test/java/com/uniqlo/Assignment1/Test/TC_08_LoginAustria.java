package com.uniqlo.Assignment1.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.uniqlo.Assignment1.Resources.Base;

import util.TestUtil;
import util.TestUtilcsv;

import com.uniqlo.Assignment1.Pages.LoginPageObjectsIndia;
import com.uniqlo.Assignment1.Pages.EntryPageObjects;
import com.uniqlo.Assignment1.Pages.LoginPageObjectsAustria;
public class TC_08_LoginAustria extends Base {
	
		public void Register(String name,String email,String confirmemail,String pass,String confirmpass) throws Exception  {
	    	
	    	Actions actions = new Actions(driver);
	    	actions.moveToElement(LoginPageObjectsAustria.RegisterIcon(driver)).build().perform(); 	
		LoginPageObjectsAustria.Register(driver).click();
		LoginPageObjectsAustria.name(driver).clear();
		LoginPageObjectsAustria.name(driver).sendKeys(name);
		LoginPageObjectsAustria.email(driver).clear();
		LoginPageObjectsAustria.email(driver).sendKeys(email);
		LoginPageObjectsAustria.confirmemail(driver).clear();
		LoginPageObjectsAustria.confirmemail(driver).sendKeys(confirmemail);
		LoginPageObjectsAustria.pass(driver).clear();
		LoginPageObjectsAustria.pass(driver).sendKeys(pass);
		LoginPageObjectsAustria.confirmpass(driver).clear();
		LoginPageObjectsAustria.confirmpass(driver).sendKeys(confirmpass);
		LoginPageObjectsAustria.gender(driver).click();
		LoginPageObjectsAustria.submit(driver).click();
		
		System.out.println("title is "+driver.getTitle());
		

		}
		
		public void Login(String email, String pass) throws Exception {
			LoginPageObjectsAustria.RegisterIcon(driver).click();
			LoginPageObjectsAustria.Login(driver).click();
			LoginPageObjectsAustria.username(driver).sendKeys(email);
			LoginPageObjectsAustria.password(driver).clear();
			LoginPageObjectsAustria.password(driver).sendKeys(pass);
			LoginPageObjectsAustria.submitlogin(driver).click();
			System.out.println("title is "+driver.getTitle());
		}
		
		}
