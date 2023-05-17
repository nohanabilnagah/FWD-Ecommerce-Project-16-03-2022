@smoke
Feature: F03_ResetPassword | User could reset his password

  Scenario: user reset his password successfully
    Given user navigates to login page
    Given user clicks on forgot password
    When user enters his valid email address
    And user clicks on recover button
    Then user got a Displayed Message
    And user could close the Notification Bar


