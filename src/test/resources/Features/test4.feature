Feature: feature to test publishing product

  Scenario: Check product publish
    Given I have an administrator
    When I open the add product section
    And I enter new product information
    Then the product is registered
    And it is displayed on the storefront
