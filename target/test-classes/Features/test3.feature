Feature: feature to test language change

  Scenario: Check language settings
    Given I have a user
    When I click the language drop down list
    And I click the Deutsch as language
    Then website language is changed to dutch
