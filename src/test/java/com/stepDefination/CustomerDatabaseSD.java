package com.stepDefination;


import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CustomerDatabaseSD extends BaseClass{
	
	//Customer Listing Page
	
	@Given("^I am on Customer Listing Page$")
	public void i_am_on_Customer_Listing_Page() throws Throwable {
		
		cDatabasePage.VerifyCustomerListingPage();
	}

	//Customer One
	
	@When("^I click on John Smith 'Click to View Details' button$")
	public void i_click_on_John_Smith_Click_to_View_Details_button() throws Throwable {
	 
		cDatabasePage.VerifyJohnSmithButton();
	}

	@Then("^I will be able to see John Smith's valid details$")
	public void i_will_be_able_to_see_John_Smith_s_valid_details() throws Throwable {
	  
		cDatabasePage.VerifyJohnSmithValidDetails();
	}

	@Then("^I will be able to see the City of Customer One$")
	public void i_will_be_able_to_see_the_City_of_Customer_One() throws Throwable {
	    
		cDatabasePage.VerifyCustomerOneCity();
	}

	@Then("^I will be able to see the State of Customer One$")
	public void i_will_be_able_to_see_the_State_of_Customer_One() throws Throwable {
	    
		cDatabasePage.VerifyCustomerOneState();
	}

	@Then("^I will be able to see the Organisation of Customer One$")
	public void i_will_be_able_to_see_the_Organisation_of_Customer_One() throws Throwable {
	   
		cDatabasePage.VerifyCustomerOneOrganisation();
	}

	@Then("^I will be able to the see the Additional Info of Customer One$")
	public void i_will_be_able_to_the_see_the_Additional_Info_of_Customer_One() throws Throwable {
	   
		cDatabasePage.VerifyCustomerOneAdditionalInfo();
	}

	//Customer Two
	
	@When("^I click on Jeff Bridge 'Click to View Details' button$")
	public void i_click_on_Jeff_Bridge_Click_to_View_Details_button() throws Throwable {
		
		cDatabasePage.VerifyJeffBridgeButton();
	}

	@Then("^I will be able to see Jeff Bridge's valid details$")
	public void i_will_be_able_to_see_Jeff_Bridge_s_valid_details() throws Throwable {
	   
		cDatabasePage.VerifyJeffBridgeValidDetails();
	}

	@Then("^I will be able to see the City of Customer Two$")
	public void i_will_be_able_to_see_the_City_of_Customer_Two() throws Throwable {
	    
		cDatabasePage.VerifyCustomerTwoCity();
	}

	@Then("^I will be able to see the State of Customer Two$")
	public void i_will_be_able_to_see_the_State_of_Customer_Two() throws Throwable {
	   
		cDatabasePage.VerifyCustomerTwoState();
	}

	@Then("^I will be able to see the Organisation of Customer Two$")
	public void i_will_be_able_to_see_the_Organisation_of_Customer_Two() throws Throwable {
	   
		cDatabasePage.VerifyCustomerTwoOrganisation();
	}

	@Then("^I will be able to the see the Additional Info of Customer Two$")
	public void i_will_be_able_to_the_see_the_Additional_Info_of_Customer_Two() throws Throwable {
	   
		cDatabasePage.VerifyCustomerTwoAdditionalInfo();
	}

	//Customer Three
	
	@When("^I click on Steve Jones 'Click to View Details' button$")
	public void i_click_on_Steve_Jones_Click_to_View_Details_button() throws Throwable {
	
		cDatabasePage.VerifySteveJonesButton();
	}

	@Then("^I will be able to see Steve Jones's valid details$")
	public void i_will_be_able_to_see_Steve_Jones_s_valid_details() throws Throwable {
	  
		cDatabasePage.VerifySteveJonesValidDetails();
	}

	@Then("^I will be able to see the City of Customer Three$")
	public void i_will_be_able_to_see_the_City_of_Customer_Three() throws Throwable {
	    
		cDatabasePage.VerifyCustomerThreeCity();
	}

	@Then("^I will be able to see the State of Customer Three$")
	public void i_will_be_able_to_see_the_State_of_Customer_Three() throws Throwable {
	    
		cDatabasePage.VerifyCustomerThreeState();
	}

	@Then("^I will be able to see the Organisation of Customer Three$")
	public void i_will_be_able_to_see_the_Organisation_of_Customer_Three() throws Throwable {
	    
		cDatabasePage.VerifyCustomerThreeOrganisation();
	}

	@Then("^I will be able to the see the Additional Info of Customer Three$")
	public void i_will_be_able_to_the_see_the_Additional_Info_of_Customer_Three() throws Throwable {
	   
		cDatabasePage.VerifyCustomerThreeAdditionalInfo();
	}

}
