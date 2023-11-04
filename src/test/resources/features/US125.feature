Feature: US125 As a user, I want to access my profile page.

  @B30G21-126
  Scenario: Verify the user views the following options on my profile page
    Given user is already logged on to the crm portal
    When user clicks on his username on the right hand corner
    Then user clicks on the my profile
    Then user should see the following modules
      |General|
      |Drive|
      |Tasks|
      |Calendar|
      |Conversations|

