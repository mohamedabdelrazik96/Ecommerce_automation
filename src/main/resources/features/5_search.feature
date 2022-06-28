@smoke
Feature: search for any product on the website

  Scenario: Logged user could search by product name
    Given user navigates to login page
    And user can login with valid data
    When click on search field
    And  searches with name of product
    Then find relative results