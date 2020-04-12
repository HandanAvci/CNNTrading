package com.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.config.ObjectMap;
import com.generic.DriverScript;
import com.masterpagefactory.MasterPageFactory;

public class MarketData {
	WebDriver driver;
	
	MasterPageFactory pf;
	
	@BeforeTest
	public void setup_tc1() {
		driver=new DriverScript().getDriver(ObjectMap.getconfig("URL"));
		pf=PageFactory.initElements(driver, MasterPageFactory.class);
	}
@Test
public void regression_tc2() {
	System.out.println("Total Page Numbers"+ pf.getAllPageName().size());
	
	for(int i=0; i<pf.getAllPageName().size(); i++);
	//pf.getAllPageName().get(i).click();
	System.out.println(driver.getTitle());
	
	//Finish everytging 
}
}
