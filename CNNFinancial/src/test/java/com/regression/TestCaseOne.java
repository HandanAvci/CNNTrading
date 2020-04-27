package com.regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.TakeScreenShot;

public class TestCaseOne {
static  WebDriver driver;
	
	public static WebDriver setup(){
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nefer\\Downloads\\Chrome_last\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.get("https://www.cnn.com/BUSINESS");
		System.out.println(driver.getTitle());
		TakeScreenShot.captureScreenShot(driver, "Home Page");
		
		return driver;
	}

}
