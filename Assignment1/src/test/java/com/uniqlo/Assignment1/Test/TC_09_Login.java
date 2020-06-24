package com.uniqlo.Assignment1.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.uniqlo.Assignment1.Resources.Base;

import util.TestUtil;
import util.TestUtilcsv;

public class TC_09_Login extends Base{
	String country=null;
	TC_07_Login_India obj1=new TC_07_Login_India();
	TC_08_LoginAustria obj2=new TC_08_LoginAustria();
	@BeforeMethod
	public void setUp() throws Exception {
		
	driver=initializeDriver();
	driver.get(CountryUrl());
	}	
	
@Test(priority=1)
public void TC_09_FirstRegister() throws Exception {
	country=prop.getProperty("Country");
	if(country.equals("India")) {	
		
		obj1.Register(DataRegisterIndia().get(0),DataRegisterIndia().get(1),DataRegisterIndia().get(2),DataRegisterIndia().get(3),DataRegisterIndia().get(4),
				DataRegisterIndia().get(5),DataRegisterIndia().get(6),DataRegisterIndia().get(7));
	}else {
		obj2.Register(DataRegisterAustria().get(0),DataRegisterAustria().get(1),DataRegisterAustria().get(2),DataRegisterAustria().get(3),DataRegisterAustria().get(4));
			}
	
}
@Test(priority=2)
public void TC_09_FirstLogin() throws Exception {
	country=prop.getProperty("Country");
	if(country.equals("India")) {
		obj1.Login(Data().get(0),Data().get(1));
	}else {
		obj2.Login(Data().get(0),Data().get(1));
			}	
}

public List<String> Data() throws Exception {
	List<String> list=new ArrayList<String>();
TestUtilcsv obj=new TestUtilcsv();
list= Arrays.asList(obj.getTestData(currentdir+"\\src\\test\\java\\testData\\data.csv"));
return list;

}
public List<String> DataRegisterAustria() throws Exception {
	List<String> list=new ArrayList<String>();
TestUtilcsv obj=new TestUtilcsv();
list= Arrays.asList(obj.getTestData(currentdir+"\\src\\test\\java\\testData\\dataRegisterAustria.csv"));
return list;

}

public List<String> DataRegisterIndia() throws Exception {
	List<String> list=new ArrayList<String>();
TestUtilcsv obj=new TestUtilcsv();
list= Arrays.asList(obj.getTestData(currentdir+"\\src\\test\\java\\testData\\dataRegisterIndia.csv"));
return list;

}


@AfterMethod
public void tearDown() {
	driver.quit();
}



}
