Feature: feature to test Order list

  Scenario Outline: Check order list validity
    Given I have an admin with <email> and <password>
    When I open the order section
    Then order transactions are displayed as a list

    Examples: 
      | email                  | password |
      | hussainabbas@gmail.com | ST123    |
