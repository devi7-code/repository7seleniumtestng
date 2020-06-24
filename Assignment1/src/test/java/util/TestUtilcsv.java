package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class TestUtilcsv {
	    
	public static String[] getTestData(String path) throws Exception 
	{
		String[] data = null;
	 Reader reader = new FileReader(path);
	CSVReader csvreader=new CSVReader(reader);
	List<String[]> list = csvreader.readAll();
	
	Iterator<String[]>ite= list.iterator();
	
	while(ite.hasNext()){
		 data = ite.next();
		
	}
	return data;
	
	}
}
