
@B30G21-117
Feature: Default

  Background:

    Given User navigate to homePage
    When User enter valid username "hr15@cydeo.com" on the username box
    And User enter valid password "UserUser" on the password box
    Then User click login button, and login successfully


    Given user should click on message button on the menu under search box
    When user clicks on upload files icon
    And user clicks Upload files and images button
    And user should be able to  upload files.

	#The user should be able to upload files and pictures.
	#        Supported file formats .pdf, .txt, .jpeg, .png, .docx
  @B30G21-113
  Scenario: verify User should be able to upload files and pictures.

    Then user should be able to see uploaded files contains formats below:
      |  txt   |
      |  pdf   |
      |  docx  |
      |  png   |
      |  jpeg  |


  @B30G21-115
  Scenario: Verify User should be able to insert the files and images into the text.


    And user should click on insert button
    Then user should be able to see the file in text area


  @B30G21-116
  Scenario: Verify User should be able to remove files and images at any time before sending.


    And user should click on insert button
    And user should be able to see the file in text area
    Then user should be able to remove files and images by clicking 'X'button before sending