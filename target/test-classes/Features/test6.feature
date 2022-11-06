Feature: feature to test Signup

  Scenario: Check Signup
    Given I have an user
    When I click the create account button
    And I enter details
    Then my account is created
