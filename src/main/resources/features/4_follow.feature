
Feature: follow
 Scenario: open facebook

    Given user click face link
    And user open facebook
    Then go to home page

  Scenario: user opens twitter link

    Given user click twitter icon link

    And user go to twitter
    Then go to home page

  Scenario: open youtube

    Given user click youtube link
    And user open youtube
    Then go to home page

  Scenario: opens  rss

    Given user clicks rss link


