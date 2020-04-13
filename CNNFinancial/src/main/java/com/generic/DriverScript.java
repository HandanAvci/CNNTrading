package com.generic;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class DriverScript {
	//create a return method and name it as getdriver
		//how to open the browser
		//implicit wait 
		//max ur browser code should be here
		//Another browser capabilities here
		
		
		protected WebDriver driver;
		public static WebDriver getDriver(String URL){ 
		
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nefer\\Downloads\\Chrome_last\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.get(URL);
	    System.out.println("Browser opened");
		return driver;
	    
	    
		
		}



}
