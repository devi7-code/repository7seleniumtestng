package com.uniqlo.Assignment1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPageObjectsIndia {

	
	public static WebElement Register(WebDriver driver) {
		return driver.findElement(By.className("event_profile_register"));
	}
	public static WebElement firstname(WebDriver driver) {
		return driver.findElement(By.id("phdesktopbody_0_grs_consumer[firstname]"));
	}
	public static WebElement lastname(WebDriver driver) {
		return driver.findElement(By.id("phdesktopbody_0_grs_consumer[lastname]"));
	}
	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.id("phdesktopbody_0_grs_account[emails][0][address]"));
	}
	public static WebElement pass(WebDriver driver) {
		return driver.findElement(By.id("phdesktopbody_0_grs_account[password][password]"));
	}
	public static WebElement confirmpass(WebDriver driver) {
		return driver.findElement(By.id("phdesktopbody_0_grs_account[password][confirm]"));
	}
	
	public static Select year(WebDriver driver) {
		return new Select(driver.findElement(By.id("phdesktopbody_0_grs_consumer[birthdate][year]")));
	}
	public static Select month(WebDriver driver) {
		return new Select(driver.findElement(By.id("phdesktopbody_0_grs_consumer[birthdate][month]")));
	}
	public static WebElement zipcode(WebDriver driver) {
		return driver.findElement(By.id("phdesktopbody_0_grs_account[addresses][0][postalarea]"));
	}
	public static WebElement submit(WebDriver driver) {
		return driver.findElement(By.id("phdesktopbody_0_submit"));
	}
	public static WebElement Login(WebDriver driver) {
		return driver.findElement(By.className("event_profile_login"));
	}
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("phdesktopbody_0_username"));
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("phdesktopbody_0$ctl04"));
	}
	public static WebElement submitlogin(WebDriver driver) {
		return driver.findElement(By.id("phdesktopbody_0_Sign In"));
	}

	
}
