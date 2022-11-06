Feature: feature to test sorting

  Scenario: Check sorting
    Given that I have a user
    When I select the sorting type
    Then the products are sorted accordingly
