package com.runner;

import org.openqa.selenium.WebDriver;

import com.Pages.CustomerDatabasePage;
import com.Pages.CustomerPanel;


public class BaseClass {
	
	public static WebDriver driver;
	public static CustomerDatabasePage cDatabasePage=new CustomerDatabasePage();
	public static CustomerPanel customerPanel=new CustomerPanel();
	

}
