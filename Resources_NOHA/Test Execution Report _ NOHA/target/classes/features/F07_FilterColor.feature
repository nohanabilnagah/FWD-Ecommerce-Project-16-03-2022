@smoke
Feature: F07_FilterColor | Logged user could filter with color

  Scenario: Logged user could filter product with color
    Given logged user selects Category and hover to open sub-Category
    When logged user can filter sub-Category with color
    Then logged user could find product with the selected color