package com.Pages;



import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;



public class CustomerPanel extends BaseClass{
	
	public void VerifyCustomerOneHeading() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals("John Smith",driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[1]/div[1]/div[1]")).getText());
	}
	
	public void VerifyCustomerOneEmailAndPhoneNumber() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals("jsmith@test.com",driver.findElement(By.xpath("//p[contains(text(),'jsmith@test.com')]")).getText());
		Assert.assertEquals("0208092029",driver.findElement(By.xpath("//p[contains(text(),'0208092029')]")).getText());
		
	}
	
    public void VerifyCustomerTwoHeading() throws InterruptedException {
		Thread.sleep(5000);
    	Assert.assertEquals("Jeff Bridges",driver.findElement(By.xpath("//body//div[@id='root']//div//div//div//div[2]//div[1]")).getText());	
	}
	
	public void VerifyCustomerTwoEmailAndPhoneNumber() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals("abcd@test.com",driver.findElement(By.xpath("//p[contains(text(),'abcd@test.com')]")).getText());
		Assert.assertEquals("0161 225 7632",driver.findElement(By.xpath("//p[contains(text(),'0161 225 7632')]")).getText());
		
	}
    public void VerifyCustomerThreeHeading() throws InterruptedException {
	Thread.sleep(5000);
    	Assert.assertEquals("Steve Jones",driver.findElement(By.xpath("//div[3]//div[1]")).getText());
    }
	
	public void VerifyCustomerThreeEmailAndPhoneNumber() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals("steven.jones@test.com",driver.findElement(By.xpath("//p[contains(text(),'steven.jones@test.com')]")).getText());
		Assert.assertEquals("01403 215100",driver.findElement(By.xpath("//p[contains(text(),'01403 215100')]")).getText());
		
	}

	
	
	
	
	

}
