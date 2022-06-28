@smoke
Feature: Login Page
Scenario: user could login with valid email and password
Given user navigates to login page
When user can login with valid data
Then user can login successfully
And home page is opened