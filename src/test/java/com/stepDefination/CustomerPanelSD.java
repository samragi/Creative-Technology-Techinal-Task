package com.stepDefination;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CustomerPanelSD extends BaseClass {

	@Given("^I am on Customer List Page$")
	public void i_am_on_Customer_List_Page() throws Throwable {
	    
		cDatabasePage.VerifyCustomerListingPage();
	}

	@Then("^I will be able to see the Customer One Heading$")
	public void i_will_be_able_to_see_the_Customer_One_Heading() throws Throwable {
	   
		customerPanel.VerifyCustomerOneHeading();
	}

	@Then("^I will be able to see the Customer One Email and Phone Number$")
	public void i_will_be_able_to_see_the_Customer_One_Email_and_Phone_Number() throws Throwable {
	    
		customerPanel.VerifyCustomerOneEmailAndPhoneNumber();
	}

	@Then("^I will be able to see the Customer Two Heading$")
	public void i_will_be_able_to_see_the_Customer_Two_Heading() throws Throwable {
	    
		customerPanel.VerifyCustomerTwoHeading();
	}

	@Then("^I will be able to see the Customer Two Email and Phone Number$")
	public void i_will_be_able_to_see_the_Customer_Two_Email_and_Phone_Number() throws Throwable {
	    
		customerPanel.VerifyCustomerTwoEmailAndPhoneNumber();
	}

	@Then("^I will be able to see the Customer Three Heading$")
	public void i_will_be_able_to_see_the_Customer_Three_Heading() throws Throwable {
	   
		customerPanel.VerifyCustomerThreeHeading();
	}

	@Then("^I will be able to see the Customer Three Email and Phone Number$")
	public void i_will_be_able_to_see_the_Customer_Three_Email_and_Phone_Number() throws Throwable {
	    
		customerPanel.VerifyCustomerThreeEmailAndPhoneNumber();
	}
	
}
