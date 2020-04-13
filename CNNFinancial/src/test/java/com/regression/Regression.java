package com.regression;


import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.config.ObjectMap;
import com.masterpagefactory.MasterPageFactory;
import com.util.ExplicitWait;
import com.util.HighLighter;
import com.util.TakeScreenShot;

public class Regression  {
	WebDriver driver;
	MasterPageFactory pf;
	/*Logger log=Logger.getLogger("Regression");
	List<String> excelValue=new ArrayList<>();
	
	@Test
	public void regression_TC1() {
		driver=DriverManager.getDriverManager(ObjectMap.getconfig("URL"));
		PropertyConfigurator.configure("Log4j.properties");
		log.info("Home Page Title "+ driver.getTitle());
		pf=PageFactory.initElements(driver, MasterPageFactory.class);
		//TakeScreenShot.emptyScreenShotFolder();
		TakeScreenShot.captureScreenShot(driver, "Home page");
	}
		@Test
		public void regression_TC2() {
			
			new ExplicitWait().webDriverwait(driver, pf.getAllPageName());
			log.info("Total pages to check title="+pf.getAllPageName().size());
	for(int i=0; i<pf.getAllPageName().size(); i++) {
		new ExplicitWait().webDriverwait(driver, pf.getAllPageName().get(i));
		new HighLighter().getColor(driver, pf.getAllPageName().get(i),  "red");
		pf.getAllPageName().get(i).click();
	}
	

		}
}
*/
}