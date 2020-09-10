# Author Nahar
Feature: User wants to see the locations Of Hilton

In order to see the locations
As a  user
I want to visit Hilton homepage

@sc1
Scenario: Validation of Locations

Given user visits homepage
When click on Locations button
Then user successfully redirect to locations page

