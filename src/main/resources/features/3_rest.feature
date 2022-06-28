@smoke
Feature: reset his password

  Scenario: user reset his password successfully

    Given clicks on forgot password
    When enter his valid email address
    And click on recover button
    Then user got a Displayed Message
    And  close the Notification Bar