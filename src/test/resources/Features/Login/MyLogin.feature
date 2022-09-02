@MyLogin

Feature: Login

      Scenario: Step_8_Check for New users with Unrecognized or already recognized IP Address and with temp password
            Given Visit the app url
            When I see login page title
            And I enter user name "lulmineknu@vusra.com"
            And I enter password "c7wx$KJudc"
            Then I click on login button to test validation code
            And I see temp password change message
            Then I enter new password "NewPassword"
            Then I enter confirm password "NewPassword"
            Then I click on cancel change password button
            Then I see login page title

      Scenario: Step_10_Check for existing users with the already recognized IP Address
            Given Visit the app url
            When I see login page title
            And I enter username
            And I enter password
            Then I click on login button
            And I click on session popup cancel button
            Then I see USA map

      Scenario: Step_11_Check for existing users with unrecognized IP Address
            Given Visit the app url
            When I see login page title
            And I enter user name "sixiw28286@xitudy.com"
            And I enter password "Testing2022!!"
            When I click on login button to test validation code
            Then I see verification code message on login page

      Scenario: Step_12_Check for invalid Validation code
            Given Visit the app url
            When I see login page title
            And I enter user name "sixiw28286@xitudy.com"
            And I enter password "Testing2022!!"
            When I click on login button to test validation code
            Then I see verification code message on login page
            And I click on the pop up ok button
            When I enter "fakecode" verification code
            And I click on the submit verification code button
            Then I see invalid validation code message

      Scenario: Step_14_Validate Logout
            Given Visit the app url
            When I see login page title
            And I enter username
            And I enter password
            Then I click on login button
            And I click on session popup cancel button
            When I click on profile name drop down
            Then I click on logout option
            Then I see login page title
            Then I see user name text field
            Then I see password text field
            Then I see login button

      Scenario: Step_15_Check the Menu items after the successful login
            Given Visit the app url
            When I see login page title
            And I enter username
            And I enter password
            Then I click on login button
            And I click on session popup cancel button
            Then I see USA map
            And I see client label and default value all
            And I see facility label and default value all
            And I see company label and default value all
            #And I see atlas navigator
            And I see licenses grid
            And I see activities grid
            And I see tasks grid
            And I see documents grid
            And I see notifications grid

      Scenario: Step_17_Validate that section and tabs are visible on the Dashboard Grid
            Given Visit the app url
            When I see login page title
            And I enter username
            And I enter password
            Then I click on login button
            And I click on session popup cancel button
            And I see client label and default value all
            And I see facility label and default value all
            And I see company label and default value all
            And I see USA map
            And I see KPI table
            And I see license details Label
            And I see license details table
            And I see license status
            And I see License Count
            And I see upcoming renewals Label
            And I see expiring documents Label
            And I see tasks Label

      Scenario: Step_18_Validate that drop-downs, KPI and map are working
            Given Visit the app url
            When I see login page title
            And I enter username
            And I enter password
            Then I click on login button
            And I click on session popup cancel button
            When I select client in filter
            Then I see only the licenses that are related to the "365 Logistics" client
            When I click on the "AR" state on the map
            Then I see only the licenses that are related to the "AR" state
            When I select the Reset Filter
            When I double click on kpi expiring licenses expired option
            Then I see only the expiring licenses on document grid

      Scenario: Step_30_Validate Delete license feature
            Given Visit the app url
            When I see login page title
            And I enter username
            And I enter password
            Then I click on login button
            And I click on session popup cancel button
            When I click on licenses grid
            Then I double click on licens to edit
            Then I click on delete license button
            Then I see delete license confirm message
            Then I click on cancel license deletion button
            Then I double click on licens to edit
            Then I click on delete license button
            Then I click on confirm license deletion button
            Then I see "Records deleted successfully" success message

      Scenario: Step_35_Check the export functionality
            Given Visit the app url
            Given I clear the files directory
            When I see login page title
            And I enter username
            And I enter password
            Then I click on login button
            And I click on session popup cancel button
            When I click on licenses grid
            And I select 7 client in global filter
            Then I click on export button
            And I compare the exported licenses with the licenses on the grid