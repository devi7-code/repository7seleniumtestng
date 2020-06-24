package com.uniqlo.Assignment1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowPageObjects {
	public static WebElement Tabbed(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='#Tabbed']"));
	}
	public static WebElement Seperate(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='#Seperate']"));
	}
	public static WebElement onclickseperate(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	}
	public static WebElement onclicktabbed(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	}
}
