Feature: feature to test create groups

  Scenario: Check create groups
    Given that I have an administrator
    When I click the create group option
    And I add members
    Then a group is created
