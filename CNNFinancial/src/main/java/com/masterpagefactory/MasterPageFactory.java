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
		
		@FindBy //TC-3
		(xpath=("//*[@class,'ticker-name-charge']"))
		private List<WebElement>topSecurityNameAndValue;

		public List<WebElement> getTopSecurityNameAndValue() {
			return topSecurityNameAndValue;
		}
		
		
		@FindBy //TC-3
		(xpath="(//*[@class='sc-htoDjs dpodOf'])[1]//a")
		private List<WebElement>allPage;

		public List<WebElement> getAllPage() {
			return allPage;
		}
		
}

