Feature: Login Functionality
  Scenario: Valid Login
    Given User is on login page
    When User enters valid credentials
    Then User should be redirected to the homepage
