@smoke
Feature: F01_Registration | New user could register

  Scenario: new user could register with valid data
    Given new user launch registration page
    And new user fills registration form with valid data
    When new user can register
    Then a success message is displayed
    And user logs out after registering

