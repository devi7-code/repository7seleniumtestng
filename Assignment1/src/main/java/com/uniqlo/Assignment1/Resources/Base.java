package com.uniqlo.Assignment1.Resources;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.uniqlo.Assignment1.Resources.ExtentReporterNG;
import com.uniqlo.Assignment1.Test.TC_02_Alert;
public class Base {
public static WebDriver driver;
public static Properties prop;static String url; 


public static String currentdir=System.getProperty("user.dir");
public static Logger logger=LogManager.getLogger(Base.class.getName());String browserName;
@BeforeSuite
public void reportsetup() {
	ExtentReporterNG.getReportObject();
}

public WebDriver initializeDriver() throws Exception{
	System.out.println(currentdir+"\\src\\test\\java\\testData\\Register.xlsx");
	BasicConfigurator.configure();
	logger.atLevel(Level.INFO);
	System.out.println(currentdir);
	prop=new Properties();
	FileInputStream fis=new FileInputStream(currentdir +"\\src\\main\\java\\com\\uniqlo\\Assignment1\\Resources\\config.properties");
	prop.load(fis);
	int WAIT_TIME=Integer.parseInt(prop.getProperty("WAIT_TIME"));
	 browserName=prop.getProperty("browser");
	System.out.println(browserName);
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", currentdir+"\\src\\test\\resources\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	
	}else {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\devi\\Downloads\\drivers\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver();		
	}
	
	
	
	
	driver.manage().timeouts().pageLoadTimeout(WAIT_TIME, TimeUnit.SECONDS);
driver.manage().timeouts()
	.implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
driver.manage().window().maximize();

	return driver;
}
public static String CountryUrl() {
	String country=prop.getProperty("Country");
	System.out.println(country);
	if(country.equals("India")) {
		url=prop.getProperty("BASE_URL_Login_India");
	}else {
		url=prop.getProperty("BASE_URL_Login_Austria");
	}
	return url;
	
}

@AfterSuite
public void flush() {
	ExtentReporterNG.extent.flush();
}
}
