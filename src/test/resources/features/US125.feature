Feature: US125 As a user, I want to access my profile page.
  @B30G21-126
  Background:User is already logged into the crm portal
  Scenario: As a user, I want to access my profile page.
  Scenario: Verify the user views the following options on my profile page
    When user clicks on his username on the right hand corner
    Then user clicks on the my profile
    Then user should see the following modules
      |General|
      |Drive|
      |Tasks|
      |Calendar|
      |Conversations|

  @B30G21-127
Scenario: Verify the email address under the General tab
Then user should see email address under general tab