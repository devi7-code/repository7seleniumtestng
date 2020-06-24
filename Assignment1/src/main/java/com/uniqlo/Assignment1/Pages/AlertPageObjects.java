package com.uniqlo.Assignment1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPageObjects {
	public static WebElement Ok(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='#OKTab']"));
	}
	public static WebElement OkCancel(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	}
	public static WebElement TextBox(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='#Textbox']"));
	}
	public static WebElement onclick(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	}
	public static WebElement clickokcancel(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	}
	public static WebElement clickTextBox(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	}

}
