package com.uniqlo.Assignment1.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectablePageObjects {
	public static WebElement Serializebtn(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='#Serialize']"));
	}
	public static List<WebElement> SelectEachbtn(WebDriver driver) {
		return driver.findElements(By.xpath("//ul[@class='SerializeFunc']//li"));
	}
	public static WebElement DisplayedElement(WebDriver driver) {
		return driver.findElement(By.xpath("//p[@id='feedback']/child::span[@id='result']"));
	}
}
