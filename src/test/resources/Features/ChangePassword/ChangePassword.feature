Feature: ChangePassword

  Scenario: Step_9_As a user i check for change password screen loading for new users
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I see atlas main page
    Then I click on profile name drop down
    Then I click on dropdown change password button
    And I see enter new password text field
    And I see enter confirm Password text field
    And I see change password button
    And I see cancel button
    And I see help dropdown
    And I see bell icon
    And I see bell Icon unread count
    And I see copyright label
    And I see logo on change password page
    Then I enter values in change password input fields buttons link are clickable
    And I see browser tab name pharma solution atlas
    And I see change password input fields should have a proper placeholder name
    