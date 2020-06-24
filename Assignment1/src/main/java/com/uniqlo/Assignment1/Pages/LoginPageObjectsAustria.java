package com.uniqlo.Assignment1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class LoginPageObjectsAustria {
	
	public static WebElement RegisterIcon(WebDriver driver) {
		return driver.findElement(By.className("responsiveAccountHeader_openAccountButton"));
	}
	public static WebElement Register(WebDriver driver) {
		return driver.findElement(By.className("responsiveAccountHeader_accountRegister"));
	}
	public static WebElement name(WebDriver driver) {
		return driver.findElement(By.id("customerName"));
	}
	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.id("customerEmail"));
	}
	public static WebElement confirmemail(WebDriver driver) {
		return driver.findElement(By.id("confirmCustomerEmail"));
	}
	public static WebElement pass(WebDriver driver) {
		return driver.findElement(By.id("customerPassword"));
	}
	public static WebElement confirmpass(WebDriver driver) {
		return driver.findElement(By.id("confirmPassword"));
	}
	public static WebElement gender(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='accountSignUp_optOut']/child::label[@class='accountSignUp_optOutLabel_RadioButtons']/child::input[@id='OptInReceiveNewsLetterRadio1']"));
	}
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.id("continue"));
	}
	public static WebElement accounticon(WebDriver driver) {
		return driver.findElement(By.id("responsiveAccountHeader_openAccountButtonMobile"));
	}
	public static WebElement signout(WebDriver driver) {
		return driver.findElement(By.id("responsiveAccountHeader_signOut"));
	}
	public static WebElement Login(WebDriver driver) {
		return driver.findElement(By.className("responsiveAccountHeader_accountLogin js-e2e-sign-in"));
	}
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("elysium_username"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}
	public static WebElement submitlogin(WebDriver driver) {
		return driver.findElement(By.id("login-submit"));
	}
	
	
}
