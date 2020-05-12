package com.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;

public class CustomerDatabasePage extends BaseClass {

  
	private static By SEARCHBUTTON1=By.xpath("//body//div[@id='root']//div//div//div//div[1]//button[1]");
	private static By SEARCHBUTTON2=By.xpath("//body//div[2]//div[2]//button[1]");
	private static By SEARCHBUTTON3=By.xpath("//div[3]//div[2]//button[1]");
	
	//Customer Listing Page
	
	public void VerifyCustomerListingPage() {
		
		 Assert.assertEquals("Selenium Test",driver.getTitle());
		 Assert.assertEquals("Selenium Test", driver.findElement(By.cssSelector("h1")).getText());
	}
	
	//Customer One
	
	public void VerifyJohnSmithButton() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(SEARCHBUTTON1).click();
	}
	
	public void VerifyJohnSmithValidDetails() throws InterruptedException {
		 Thread.sleep(5000);
		Assert.assertEquals("John Smith", driver.findElement(By.cssSelector("#root .col-md-6 .panel-heading h3")).getText());
	}
	
	public void VerifyCustomerOneCity(){
		
		Assert.assertEquals("City : London",driver.findElement(By.xpath("//body//p[4]")).getText());
	}
	
	public void VerifyCustomerOneState(){
		
		Assert.assertEquals("State : Greater London",driver.findElement(By.xpath("//body//p[5]")).getText());
	}
	
	public void VerifyCustomerOneOrganisation(){
		
		Assert.assertEquals("Organization : Company 1",driver.findElement(By.xpath("//body//p[7]")).getText());
	}
	
	public void VerifyCustomerOneAdditionalInfo(){
		
		Assert.assertEquals("Additional Info : Has Bought a lot of products before and a high Value Customer",driver.findElement(By.xpath("//body//p[9]")).getText());
	}
	
	//Customer Two
	
	public void VerifyJeffBridgeButton() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(SEARCHBUTTON2).click();
	}
	
    public void VerifyJeffBridgeValidDetails() throws InterruptedException {
		
		Thread.sleep(5000);
		Assert.assertEquals("Jeff Bridges", driver.findElement(By.cssSelector("#root .col-md-6 .panel-heading h3")).getText());
	}
	
    public void VerifyCustomerTwoCity(){
		
    	Assert.assertEquals("City : Manchester", driver.findElement(By.xpath("//body//p[4]")).getText());
	}
	
	public void VerifyCustomerTwoState(){
		
		Assert.assertEquals("State : Greater Manchester",driver.findElement(By.xpath("//body//p[5]")).getText());
	}
	
	public void VerifyCustomerTwoOrganisation(){
		
		Assert.assertEquals("Organization : Company 2",driver.findElement(By.xpath("//body//p[7]")).getText());
	}
	
	public void VerifyCustomerTwoAdditionalInfo(){
		
		Assert.assertEquals("Additional Info : Buys Products Rarely", driver.findElement(By.xpath("//body//p[9]")).getText());
	}

	//Customer Three
	
	public void VerifySteveJonesButton() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(SEARCHBUTTON3).click();
	}
	
	public void VerifySteveJonesValidDetails() throws InterruptedException {
		Thread.sleep(5000);
        Assert.assertEquals("Steve Jones", driver.findElement(By.cssSelector("#root .col-md-6 .panel-heading h3")).getText());
	}
	
    public void VerifyCustomerThreeCity(){
		
    	Assert.assertEquals("City : Horsham",driver.findElement(By.xpath("//body//p[4]")).getText() );
	}
	
	public void VerifyCustomerThreeState(){
		
		Assert.assertEquals("State : West Sussex", driver.findElement(By.xpath("//body//p[5]")).getText());
	}
	
	public void VerifyCustomerThreeOrganisation(){
		
		Assert.assertEquals("Organization : Company 3",driver.findElement(By.xpath("//body//p[7]")).getText());
	}
	
	public void VerifyCustomerThreeAdditionalInfo(){
		
		Assert.assertEquals("Additional Info : Buys Lots of Products in general",driver.findElement(By.xpath("//body//p[9]")).getText());
	}
	
	
	
}
