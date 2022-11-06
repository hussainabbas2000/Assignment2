Feature: feature to test login

  Scenario Outline: Check login success with valid credentials
    Given I have a user with <email> and <password>
    When I enter login credentials
    Then user dashboard is displayed

    Examples: 
      | email             | password |
      | hussainabbas@gmail.com | ST123    |
