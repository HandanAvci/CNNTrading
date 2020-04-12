package com.smoke;

import org.testng.annotations.Test;

import com.config.ObjectMap;
import com.generic.DriverScript;

public class ApplicationStatus {

	@Test
	public void setup() {
		// DriverScript obj=new DriverScript();
       // obj.getDriver();
		
		new DriverScript().getDriver(ObjectMap.getconfig("URL"));
	}
	
	

}
