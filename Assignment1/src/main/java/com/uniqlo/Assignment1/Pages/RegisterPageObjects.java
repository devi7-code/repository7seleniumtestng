package com.uniqlo.Assignment1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageObjects {
public static WebElement firstname(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@placeholder='First Name']"));
}
public static WebElement lastname(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
}
public static WebElement email(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
}
public static WebElement phone(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@type='tel']"));
}
public static WebElement radio(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@value='FeMale']"));
}

public static WebElement pass(WebDriver driver) {
	return driver.findElement(By.id("firstpassword"));
}
public static WebElement confirmpass(WebDriver driver) {
	return driver.findElement(By.id("secondpassword"));
}
public static WebElement submit(WebDriver driver) {
	return driver.findElement(By.id("submitbtn"));
}
public static Select country(WebDriver driver) {
	return new Select(driver.findElement(By.id("countries")));
}
public static Select year(WebDriver driver) {
	return new Select(driver.findElement(By.id("yearbox")));
}
public static Select month(WebDriver driver) {
	return new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
}
public static Select day(WebDriver driver) {
	return new Select(driver.findElement(By.id("daybox")));
}


}
