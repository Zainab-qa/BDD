Feature: Free HubSpot Create Contact Feature


Scenario Outline: Free HupSpot Create a new contact scenairo

Given user is already on Login Page
When  title of login page is HubSpot Login
Then  user enter "<username>" and "<password>"
Then  user clicks on login button
Then  user is on homepage
Then  user click on new contact option
Then  user enter "<email>" "<firstname>" and "<lastname>"
Then  close the browser

Examples:
	| username | password | email | firstname | lastname |
	| tester@gmail.com |  password | robintester@gmail.com | Robin | Tester |

   