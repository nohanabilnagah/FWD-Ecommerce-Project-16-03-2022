@smoke
Feature: F05_SwitchCurrency | Logged user could switch between currencies

  Scenario: Logged user could switch currency
    Given user selects a product
    When user changes the currency
    Then user could find the selected currency


