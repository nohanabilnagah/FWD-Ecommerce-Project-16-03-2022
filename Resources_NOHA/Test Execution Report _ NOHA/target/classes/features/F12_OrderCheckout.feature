@smoke
Feature: F12_OrderCheckout | Logged user could Create Successful Order

  Scenario: Logged user could Create Successful Order
    Given logged user agrees with terms and proceed to Checkout
    When logged user fills out Billing address to Create Order
    And logged user confirms Billing address
    And logged user selects Shipping Method to Continue
    And logged user selects Payment Method to Continue
    When logged user fills out Payment Information
    Then logged user could confirm his order
    And logged user can check order details
    And logged user could save invoice
    And logged user could print invoice







