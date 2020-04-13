package com.generic;

import org.openqa.selenium.WebDriver;

import com.masterpagefactory.MasterPageFactory;
import com.util.ExplicitWait;
import com.util.HighLighter;

public class AllPageTitle {
	public void getTitle(WebDriver driver, MasterPageFactory pf) {
		System.out.println("Total page number= " + pf.getAllPageName().size());
		for(int i=0; i<pf.getAllPageName().size(); i++) {
			ExplicitWait.getMyWait(driver, pf.getAllPageName().get(i));
			HighLighter.getcolour(driver, pf.getAllPageName().get(i), "red");
			pf.getAllPageName().get(i).click();
			System.out.println("Current Page Number="+i + "Title is ="+driver.getTitle());
			driver.navigate().back();
		}
	}

}
