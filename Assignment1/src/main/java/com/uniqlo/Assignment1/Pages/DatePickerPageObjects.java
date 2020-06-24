package com.uniqlo.Assignment1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerPageObjects {
	public static WebElement Date1(WebDriver driver) {
		return driver.findElement(By.id("datepicker1"));
	}
	public static WebElement Date2(WebDriver driver) {
		return driver.findElement(By.id("datepicker2"));
	}
}
