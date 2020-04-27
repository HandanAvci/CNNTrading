package com.masterpagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


		@FindBy(xpath="(//*[@class='sc-htoDjs dpodOf'])[1]//li")
		private List<WebElement> allPageName;
		public List<WebElement> getAllPageName() {
			return allPageName;
		}
		 
		@FindBy(xpath="(//*[@class='sc-htoDjs dpodOf'])[1]//a")
		private List<WebElement> allpage;
	
		public List<WebElement> getAllpage() {
			return allpage;
		}


		@FindBy //TC-3
		(xpath=("//*[@class='ticker-name-charge']"))
		private List<WebElement>topSecurityNameAndValue;

		public List<WebElement> getTopSecurityNameAndValue() {
			return topSecurityNameAndValue;
		}
		
		
		@FindBy //TC-3
		(xpath="//*[contains(@class,'logo')]")
		private List<WebElement> pagelogo;
		public List<WebElement> getPagelogo() {
			return pagelogo;
		}
		
		@FindBy //TC-3
		(xpath="//*[@class='module-body wsod most-popular-stocks']//a")
		private List<WebElement>mostPopularStock;
		public List<WebElement> getMostPopularStock() {
			return mostPopularStock;
		}
		@FindBy //TC-3
		(xpath="//*[@class='module-body wsod key-stats' or @class='module-body wsod commodities']//*[@class='quote']")
		private List<WebElement>KeystartsAndCommodities;
		public List<WebElement> getKeystartsAndCommodities() {
			return KeystartsAndCommodities;
		}
		
}


