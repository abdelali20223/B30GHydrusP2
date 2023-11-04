Feature: Activity Stream Page
  Agile Story: User should be able to see all options on the Activity Stream Page

  @B30G21-123
  Scenario: View the following options on the Activity Stream Page
    Given user is on the CRM login page
    When user enters Username and Password to login
    And user clicks the Activity Stream tab
    Then user should see the MESSAGE tab on the Activity Stream Page
    And user should see the TASK tab on the Activity Stream Page
    And user should see the EVENT tab on the Activity Stream Page
    And user should see the POLL tab on the Activity Stream Page
    Then user should see the MORE tab on the Activity Stream Page


  @B30G21-124
  Scenario: view the following options under the More tab
    Given user is on the CRM login page
    When user enters Username and Password to login
    And user clicks the Activity Stream tab
    And user clicks the MORE tab
    Then user should see the File option
    And user should see the Appreciation option
    And user should see the Announcement option
    Then user should see the Workflow option


