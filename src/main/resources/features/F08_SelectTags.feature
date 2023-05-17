@smoke
Feature: F08_SelectTags | Logged user could select different tags

  Scenario: Logged user could select different tags
    Given logged user can select a popular tag
    When logged user finds products
    Then logged user could select a different tag
    And logged user finds another different products
