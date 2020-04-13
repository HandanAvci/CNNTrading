package com.regression;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;
import com.config.ObjectMap;
import com.generic.DriverScript;
import com.masterpagefactory.MasterPageFactory;
import com.util.ExplicitWait;
import com.util.HighLighter;

import ExcellFactory.ReturnExcelNew;

public class MarketData {
	WebDriver driver;
	
	MasterPageFactory pf;
	Map<String,String> myMap;
	
	@BeforeTest
	public void setup_tc1() {
		driver= new DriverScript().getDriver(ObjectMap.getconfig("URL"));
		pf=PageFactory.initElements(driver, MasterPageFactory.class);
	}

	
	@Test
public void regression_tc2() {
	System.out.println("Total Page Numbers"+ pf.getAllPageName().size());
	
	for(int i=0; i<pf.getAllPageName().size(); i++) {
		ExplicitWait.getMyWait(driver, pf.getAllPageName().get(i));
		HighLighter.getColor(driver, pf.getAllPageName().get(i), "red");
		System.out.println("Current Page Number="+i + "Title is ="+driver.getTitle());
	driver.navigate().back();
	}
	//pf.getAllPageName().get(i).click();
	System.out.println(driver.getTitle());
	}
	@Test(dependsOnMethods = {"regression_tc2"})
	public void regression_tc3() throws Throwable {
		
		 myMap = new LinkedHashMap<>();
		new Actions(driver).moveToElement(pf.getAllPage().get(0)).click().perform();// 1
		ExplicitWait.getMyWait(driver, pf.getTopSecurityNameAndValue().get(0));
		
		for (int i = 0; i < pf.getTopSecurityNameAndValue().size(); i++) {
			HighLighter.getColor(driver, pf.getTopSecurityNameAndValue().get(i), "red");
			myMap.put(pf.getTopSecurityNameAndValue().get(i).getAttribute("data-ticker-name"),
					pf.getTopSecurityNameAndValue().get(i).getText());
		}
	}
		@Test(dependsOnMethods = { "regression_tc3" })
		public void regression_tc4() throws Throwable {
			List<String> testDataList = new ArrayList<>();
			testDataList=ReturnExcelNew.returnExcel("./Test Data/Test Data Financial.xlsx", "Market");
			//Log.info(testDataList.get(1));
			if(myMap.keySet().contains(testDataList.get(0)) 
					&& myMap.values().contains(testDataList.get(1))) {
				//Log.info("Top section Name Validation Passed ....."+myMap.keySet()+" = "+testDataList.get(0));
				Assert.assertEquals(myMap.keySet(), testDataList.get(0),"Passed the name........");
				//Log.info("Top section Value Validation Passed ....."+myMap.values()+" = "+testDataList.get(1));
				Assert.assertEquals(myMap.values(), testDataList.get(1),"Passed the value........");
			}else {
				//Log.info("Top section Name Validation Falied ....."+myMap.keySet()+" = "+testDataList.get(0));
				Assert.assertEquals(myMap.keySet(), testDataList.get(0),"Failed the name........");
				//Log.info("Top section Value Validation Failed ....."+myMap.values()+" = "+testDataList.get(1));
				Assert.assertEquals(myMap.values(), testDataList.get(1),"Failed the value........");
			}
	}
		@AfterTest
		public void teardown() {
			driver.quit();
		}
	}













