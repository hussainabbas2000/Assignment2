Feature: feature to test tags

  Scenario: Check tag addition
    Given I have an admin
    When I open the add tag section
    And I enter new tag information
    Then the tag is created
    And it is displayed as an option
