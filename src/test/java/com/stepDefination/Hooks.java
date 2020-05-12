package com.stepDefination;

import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	
	private static String BaseURL="https://9a2cdb3e.azurewebsites.net/customerlist";
	
	@Before
	public void Start() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver5");
	    driver=new ChromeDriver();
		driver.get(BaseURL);
	}
	
	@After
	public void Close() {
		driver.close();
		
	}
	
	
	
	

}
