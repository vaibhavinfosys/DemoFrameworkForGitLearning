Feature: HomePage functionality

  Background: User is logged in
    Given User is on the login page
    When User enter the Username and password
    And User click on the login button
    Then system should navigate to the homepage

  Scenario: To verify Homepage functionality
    When User click on the Admin tab
    Then System should navigate to admin page
