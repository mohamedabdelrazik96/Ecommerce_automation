@smoke
Feature: Registration Page

  Scenario: registration with valid data

    Given user open the registration page
    When user enter valid data
    And user click registration button
    Then verify message is displayed
    And user click log out