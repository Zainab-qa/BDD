@FunctionalTest
Feature: Hub spot  application testing


@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is deal test case

@RegressionTest
Scenario: Create a Task 
Given This is task test case

@SmokeTest
Scenario: Create a case
Given This is case test case

Scenario: Verify left panel tasks
Given clicking on left panel links

@SmokeTest
Scenario: Search a deal
Given This is a search deal

@RegressionTest
Scenario: Search a case
Given This is a search case test

@SmokeTest @RegressionTest
Scenario: Search a task 
Given This a search task test

@SmokeTest @RegressionTest
Scenario: Search a call
Given This a call test case

@SmokeTest @RegressionTest
Scenario: Search a email
Given This a email test

@End2End
Scenario: Search a docs
Given This is a search docs test 

@SmokeTest @RegressionTest
Scenario: validate a report
Given This is a report test 

@SmokeTest @RegressionTest  @End2End
Scenario: Application Logout
Given This is log out test case

