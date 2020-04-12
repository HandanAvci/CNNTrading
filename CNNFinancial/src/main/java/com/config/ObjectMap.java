package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectMap {
	public static String getconfig (String object) {
		//if u throw one time u have to throw always, better use try catch
	String file = "./config.properties";
	FileInputStream fis=null;
	try {
		fis = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} 
	Properties properties=new Properties();  
	
	try {
		properties.load(fis);
	} catch (IOException e) {
		
		e.printStackTrace();
	} 
	

	properties.getProperty(object) ;
	
	return properties.getProperty(object);

}
}
