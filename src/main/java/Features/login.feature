Feature: Free HubSpot Login Feature

#without examples keywords  use scenario
#Scenario : Free HupSpot Login Test Scenario


#Given user is already on Login Page
#When  title of login page is HubSpot Login
#Then  user enter "tester@gmail.com" and "password"
#Then   user clicks on login button
#Then   user is on homepage

#with example keyword use scenario outline
Scenario Outline: Free HupSpot Login Test Scenario

Given user is already on Login Page
When  title of login page is HubSpot Login
Then  user enter "<username>" and "<password>"
Then   user clicks on login button
Then   user is on homepage
Then   close the browser

Examples:
	| username | password |
	| tester@gmail.com |  password |
	#| tester@gmail.com |  password |
   