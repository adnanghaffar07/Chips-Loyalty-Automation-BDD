#Feature: LicenseGrid
#
  #Scenario: Step_22_As a user i validate the following sections and tabs and grid records are visible on the License Grid
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		And I see client dropdown company dropdown and facility dropdown are selected All by default
#		And I see reset filter feature should be available for the global filters
#		And I see column search for each columnIn the grid
#		And I see export button
#		And I see advanced filters link
#		And I see global search filters
#		And I see url icon for each license in the grid
#		And I see status help icon and active help icon
#		And I see call the log icon
#
#		Scenario: Step_24_As a user i mouse over on the i icon for the status and activity column header
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		And I hover mouse on status i icon and i see tool tip
#		And I hover mouse on active i icon and i see tool tip
#		
#		Scenario: Step_25_As a user i click the url icon for the licenses
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		Then I click on the url icon for the license
#		And I see the url opens and loads successfully if the url is valid
#		
#		Scenario: Step_27_As a user i verify add and go to activity
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		Then I click on license go to activity icon
#		And I see activities page title
#		And I see the activity data for the chosen licenses
#		Then click on licenses grid
#		And I see license Page Title
#		Then I click on add activity icon
#		And I see the activity data on license details page
#		And I add activity and task entry for the chosen license
#		And I see the task details saved successfully popup
#		And I click on task details saved successfully popup ok button
#
#
#Scenario: Step_23_As a user i click on the advanced filters search icon and users can view the pop up which should have the following
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		Then I click on advanced filters
#		And I see the advance filters popup		
#		Then I see column names Of the grid in field dropdown and select value from it
#		And I see data in operator dropdown and select value from it
#		Then I enter advance filters value in input fields
#		And I click on advance filters save button
#		And I see advance filters is closed
#		And I see the license grid is filtered
#		Then I click on advanced filters
#		Then I click on add condition link
#		And I see dropdown have AND OR value and with the delete button
#		And I see field dropdown operator dropdown and value text filed
#		And I click on advance filters close button
#		And I see advance filters is closed
#
#Scenario: Step_28_As a user i validate add license popup
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		Then I click on add new license button
#		Then I select company from dropdown
#		And I select facility from dropdown
#		Then I select states from dropdown
#		Then I select license status from dropdown
#		And I enter license name in input fields
#		And I enter license number in input fields
#		And I click on add license save button
#		And I see license details saved successfully
#		Then I click on success popup ok button
#		And I see the newly added license is listed in the license grid
#		
#		Scenario: Step_26_As a user i verify Add and view pdf icon
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		Then I click on upload license pdf button
#		Then I choose file to upload
#		Then I click on save button
#		And I see pdf file success popup
#		Then I click on pdf file success popup ok button
#		And I click on view icon and see pdf file
#		
#		Scenario: Step_29_As a user i validate Edit License popup
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		Then I double click on licens to edit
#		And I see the edit license page titel
#		And I see the user is allowed to edit all the fields except the company facility state
#		And I see the user is allowed to remove the license pdf file if the file exists
#		Then I double click on licens to edit
#		Then I see the user is able to view the delete button if the user has a permission to delete licenses
#		Then I double click on licens to edit
#		And I see the edit license page titel
#		And I see the editing a license is successful
#		And I see the user is redirection to the license grid and verify the newly edited license is listed in the license grid with the newly edited values
#		
#		Scenario: Step_31_As a user i verify the list of entries or entries is showing for licenses on licenses grid
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		Then I see label showing xx of xx entries
#		
#		Scenario: Step_32_As a user i verify reset filter works in the licenses grid
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		Then I enter value in license name search filter
#		And I click on reset page filters link
#		Then I see the reset filter works in the licenses grid
#		
#		Scenario: Step_33_As a user i verify call log popup
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		Then I select value from clint Filter
#		Then I click on communication log button
#		And I see the callLog popoup titel
#		Then I see the add call log button
#		And I see the call log popoup close X icon button
#		And I see the call log popoup entries
#		And I see the call log popoup global search
#		Then I double click on existing call log entries and user is allowed to view call log entries
#		And I see the type and date fields are mandatory
#		Then I click on save button and verify the modified values saved successfully
#		And I click on Add call Log button
#		Then I click on save button and verify the new entries are listed in the existing communication logs grid
#		
#		Scenario: Step_40_As a user i verify license expiration
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		Then I see the license with expiration field populated
#		Then I double click on expiration date
#		And I see the edit license page titel
#		Then I see the expiry date matches the expiration date noted in the license grid
#		
#		Scenario: Step_38_As a user i enters the keyword by typing in two characters in the column search text field
    #Given Visit the app url
    #When I see login page title
    #And I enter username
    #And I enter password
    #Then I click on login button
    #And I click on session popup cancel button
    #Then I click on licenses grid
#		And I see license Page Title
#		Then I enter two characters in column search filter
#		Then I see the licenses activities are filtered based on the entered column wise search keywords
#
#		
#
#				
    