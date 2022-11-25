Feature: feature to test clear filter

  Scenario: Check clear filter functionality
    Given I have a user
    When I click the clear filter link
    Then all filters are removed
