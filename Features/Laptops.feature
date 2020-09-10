# Author Nahar
Feature: User wants to see the Laptops Of Dell

In order to see the 
As a  user
I want to visit Dell homepage

@sc1
Scenario: positive Validation of Laptops

Given user visits Dell homepage
And user hover on product menu 
When user hover on Laptops
And user clicks on for home
Then user successfully redirect to the Laptops page
