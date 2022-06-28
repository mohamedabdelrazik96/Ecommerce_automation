@smoke
Feature: select different Categories
  Scenario: Logged user could select random category then hover and open sub-Category




    Given user navigates to login page
    When user can login with valid data
    Given  select random category
    Then user should redirected to the page of the selected category