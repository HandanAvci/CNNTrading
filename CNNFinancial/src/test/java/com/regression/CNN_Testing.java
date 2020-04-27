package com.regression;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

class CNN_Testing {


	static WebDriver driver;
	 
	 @BeforeTest
	 public void setup() {
			driver=TestCaseOne.setup();//return driver
		 
	 }
	 
	 @Test
	 public void pageTitle_02() {
		 
		 
		 TestCaseTwo.getTitle(driver);
	
		}
	 @Test
	 public void Market_03() {
		 
		 //Most Popular Stocks===> read from APP 
	 }
 public void Market_04() {
	 //Most Popular stock >>>validate with Excel
		 
		 //Most Popular Stocks===> read from APP then write this table in my new excel
	 }
 @Test
 public void Market_05() {
	 
	 //Most Popular Stocks===> Write info with Excel 
 }
@AfterTest
public void teardown() {
	
	
}
}