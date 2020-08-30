Feature: Free HubSpot Create Contact Feature


Scenario: Free HupSpot Create a new contact scenairo

Given user is already on Login Page
When  title of login page is HubSpot Login
Then  user enter login details
    | username                | password   |
    | tester@gmail.com| password|
Then  user clicks on login button
Then  user is on homepage
Then  user click on new contact option
Then  user enter contact detail
   | email                 | firstname | lastname |
   | robintester@gmail.com | Robin     | Tester |
   | testing@gmail.com     | Tuscany   | Tester |

Then  close the browser




   