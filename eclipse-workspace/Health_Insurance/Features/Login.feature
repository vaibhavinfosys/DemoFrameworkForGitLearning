Feature: login functionality
@smoke
  Scenario Outline: To verify the login functionality
    Given user is on the login page
    When User enter UserName as "<username>" and password as "<password>"
    And User click on the login button
    Then System should show the homepage

    Examples: 
      | username | password |
      | Admin    | admin123 |
