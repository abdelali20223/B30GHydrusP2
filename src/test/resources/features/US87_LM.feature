
Feature: CRM Employee Page
  Agile Story: User should be able to access the Employees page

@B30G21-109
  Scenario: View the following 8 modules on the Employees page
    Given user is on the CRM login page
    When user enters Username and Password to login
    And user clicks the Employees Tab
    Then user should see Company Structure on the employees page
    And user should see Find Employee on the employees page
    And user should see Telephone Directory on the employees page
    And user should see Staff Changes on the employees page
    And user should see Efficiency Report on the employees page
    And user should see Honored Employees on the employees page
    And user should see Birthdays on the employees page
    Then user should see New Page on the employees page

   @B30G21-110
   Scenario: User should view the Company Structure by default after clicking the Employees Module
    Given user is on the CRM login page
    When user enters Username and Password to login
    And user clicks the Employees Tab
    Then user should view the Company Structure by default after clicking the Employees Module



