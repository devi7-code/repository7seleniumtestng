package com.uniqlo.Assignment1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntryPageObjects {
	
	public static WebElement OneWay(WebDriver driver) {
		return driver.findElement(By.id("oneway"));
	}
	public static WebElement FromSrc(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='From']"));
	}
	public static WebElement Chennai(WebDriver driver) {
		return driver.findElement(By.xpath("//ul[@id='react-autosuggest-1']/child::li[1]"));
	}
	public static WebElement DestinationTo(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='Destination']"));
	}
	public static WebElement Kochi(WebDriver driver) {
		return driver.findElement(By.xpath("//ul[@id='react-autosuggest-1']/child::li[1]"));
	}
	public static WebElement departureCalendar(WebDriver driver) {
		return driver.findElement(By.id("departureCalendar"));
	}
	public static WebElement Traveller(WebDriver driver) {
		return driver.findElement(By.id("pax_label"));
	}
	public static WebElement Travellercount(WebDriver driver) {
		return driver.findElement(By.id("adultPaxPlus"));
	}
	
	public static WebElement Search(WebDriver driver) {
		return driver.findElement(By.id("gi_search_btn"));
	}
	public static WebElement DatValue(WebDriver driver) {
		return driver.findElement(By.id("fare_20200624"));
	}
	public static WebElement Price(WebDriver driver) {
		return driver.findElement(By.xpath("//span[contains(text(),'PRICE')]"));
	}
	public static WebElement Book(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='button']"));
	}
	
	
}
