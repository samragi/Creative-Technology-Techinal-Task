@CustomerDatabase
Feature: Customer Database 

Background:
Given I am on Customer Listing Page

@test1
Scenario: Verify Customer One Details

When I click on John Smith 'Click to View Details' button
Then I will be able to see John Smith's valid details
And I will be able to see the City of Customer One 
And I will be able to see the State of Customer One
And I will be able to see the Organisation of Customer One
And I will be able to the see the Additional Info of Customer One


@test2
Scenario: Verify Customer Two Details

When I click on Jeff Bridge 'Click to View Details' button
Then I will be able to see Jeff Bridge's valid details
And I will be able to see the City of Customer Two
And I will be able to see the State of Customer Two
And I will be able to see the Organisation of Customer Two
And I will be able to the see the Additional Info of Customer Two


@test3
Scenario: Verify Customer Three Details

When I click on Steve Jones 'Click to View Details' button
Then I will be able to see Steve Jones's valid details
And I will be able to see the City of Customer Three
And I will be able to see the State of Customer Three
And I will be able to see the Organisation of Customer Three
And I will be able to the see the Additional Info of Customer Three





 

