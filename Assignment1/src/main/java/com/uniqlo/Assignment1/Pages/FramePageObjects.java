package com.uniqlo.Assignment1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramePageObjects {
	public static WebElement Single(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='#Single']"));
	}
	public static WebElement Nested(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='#Multiple']"));
	}
	public static WebElement TypeText(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='text']"));
	}
}
