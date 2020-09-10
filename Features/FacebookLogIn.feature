# Author Nahar
@userlogin
Feature: User wants to log in Facebook
In order to log in FB account
As a registered user
I want to enter E-mail Address, password and click login


@sc1
Scenario Outline: Positive login 

Given user visiting homepage
When user enter valid "<E-mail address>" and "<Password>"
And user click on login button
Then user successfully login to the system


Examples:
|E-mail address| Password|
|fchowdhury977@gmail.com| akter2020|
