@B30G21-101
Feature: User should be able to send a message


  Background:
		# @B30G21-98
    Given User navigate to "https://qa.azulcrm.com/"
    When User enter valid username "hr15@cybertekschool.com" on the username box
    And User enter valid password "UserUser" on the password box
    Then User click login button, and login successfully
    And  User click on message button


  @B30G21-95
  Scenario Outline:  User should be able to send a message by filling in the mandatory fields.      Mandatory fields:  'Message content & 'Recipient'.
    And user type "<messages>" in the mandatory fields
    Then User  click send, user should be able to send message successfuly
    Examples:
      | messages     |
      | Hello world  |
      | Hello bach30 |
      | Hello Hyders |

  @B30G21-96
  Scenario: The error message "The message title is not specified"
    And User click send
    Then user should see "The message title is not specified." error message


  @B30G21-97
  Scenario: The error message "Please specify at least one person."
    When User doesn't specify at least  one person
    And User click send
    Then User Should see please specify msg "Please specify at least one person." error message


  @B30G21-99
  Scenario: The message delivery should be to 'All employees' by default.
    Then The user should see 'All employees' by default


  @B30G21-100
  Scenario: User should be able to cancel sending messages at any time before sending.
    When User start typing "random text" on the mandatory field
    Then User click cancel button, should be able to cancel