
Feature: B30G21 US81 As a user, I should be able to login

  @B30G21-102
  Scenario Outline:  AC01 user should be able to log in with valid credentials
    Given user is on the login page
    When the user enters "<username>","<password>"
    Then the user should be able to log in successfully to crm homepage

    Examples:
      | username        | password      |
      | hr1@cydeo.com   | UserUser      |
      |helpdesk1@cydeo.com|    UserUser |
      | marketing1@cydeo.com| UserUser|
  @B30G21-103
  Scenario: : AC02 user should see Incorrect login or password text when entering invalid credentials
    When user enters invalid username and invalid password
    And user click on login button
    Then user should see Incorrect login or password text

  @B30G21-105
  Scenario Outline: :AC04 user should see Remember ME link and is clickable on login page
    When user enters "<username>","<password>"
    Then user should see Remember Me link on the page
    And user Remember Me link should be clickable
    Examples:
      | username        | password      |
      | hr1@cydeo.com   | UserUser      |
      |helpdesk1@cydeo.com|    UserUser |
      | marketing1@cydeo.com| UserUser|

