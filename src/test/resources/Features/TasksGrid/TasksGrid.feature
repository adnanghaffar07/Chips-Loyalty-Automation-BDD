Feature: TasksGrid

		Scenario: Step_62_As a user i verify go to tasks icon
		Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
		And I see tasks page title
		Then I click on go to tasks button
		And I click on go to tasks license activities button
		Then I see the tasks page
		
		Scenario: Step_61_As a user i verify call log popup on tasks grid
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
		And I see tasks page title
		Then I select value from clint Filter
		Then I click on communication log button
		And I see the callLog popoup titel
		Then I see the add call log button
		And I see the call log popoup close X icon button
		And I see the call log popoup entries
		And I see the call log popoup global search
		Then I double click on existing call log entries and user is allowed to view call log entries
		And I see the type and date fields are mandatory
		Then I click on save button and verify the modified values saved successfully
		And I click on Add call Log button
		Then I click on save button and verify the new entries are listed in the existing communication logs grid
		
		Scenario: Step_60_As a user i verify reset filter works in the licenses tasks grid
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
   	Then I click on tasks grid
		And I see tasks page title
		Then I enter value in license name search filter
		And I click on reset page filters link
		Then I see the reset filter works in the licenses grid
		
		Scenario: Step_59_As a user i verify the list of entries or entries is showing for Licenses on tasks grid
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
		And I see tasks page title
		Then I see label showing xx of xx entries
    
    Scenario: Step_63_As a user i verify the back to tasks icon
		Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
		And I see tasks page title
		Then I click on go to tasks button
		And I click on go to tasks license activities button
		Then I see the tasks page
		And I click on back to tasks button
		Then I see the tasks page
		
		Scenario: Step_49_As a user i validate add tasks popup
		Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
		And I see tasks page title
		Then I click on go to tasks button
		Then I see the tasks page
		And I click on add task button
		Then I see add task title
		Then I see following fields are mandatory and non editable date and createdBy
		Then I see following fields are mandatory and editable type task Status assignee and dueDate
		And I click on add task save button
		Then I click on success popup ok button
		Then I see the modified license activity is listed in the license activity grid
		
    
    Scenario: Step_52_As a user i Validate the following sections and tabs and grid records are visible on the Tasks Grid
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
    Then I see client company facility global filters and reset filter
    Then I see export button on task grid
    Then I see export with notes button on task grid
    Then I see  alltasks mytasks filter assigned tasks dropdown default dropdown value is all tasks
    Then I see tasks standing filter drop down default dropdown value selected is incomplete only
    Then I see advance filter icon on task grid
    Then I see global search on task grid
    Then I see column search for each column in the grid
    Then I see show all links on task grid
    Then I see column wise sort for each column in the grid
    And I double click on license detail
    Then I see edit tasks on double click of each task in the grid
    
    
    Scenario: Step_51_As a user i validate delete tasks feature
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
    And I double click on license detail
    And I click on delete button
    And I see the task documents under selected license
    And I see the task notification under selected license
    Then I click on confirm button on delete popup
    And I see the license details records deleted successfully
    And I double click on license detail
    And I click on delete button
    Then I click on cancel button on delete popup
    And I see the license details records not deleted
    
    

    Scenario: Step_55_As a user i validate select the below values in the all tasks my tasks
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
    Then I click on all task drop down
    And I see all task in the grid
    Then I click on my task drop down
    And I see my task in the grid
    Then I click on assigned task drop down
    And I see assigned task in the grid
      
    Scenario: Step_56_As a user i validate click the advanced filters icon:
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
    Then I click on advance filter icon
    And I see field drop down have all column values
    And I see operator drop down have folowing values
		And I see text box allowed user to enter text
		And I click on add condition link on advance filter pop up
		Then I see user can see and or drop down
		Then I see user can see one or more field
		Then I see on click of close button pop up closed
		Then I see on click of save button grid is filtered
		
		Scenario: Step_57_As a user i enters the keyword by typing in two characters in the column search text field on task grid
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
		Then I enter two characters in column search filter on task grid page
		Then I see the licenses activities are filtered based on the entered column wise search keywords on task grid page
		
		
		
		Scenario: Step_50_As a user i Validate edit tasks popup
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
    And I double click on task detail
    Then I see header section display chosen activity details
    Then I see following fields are mandatory and non editable date and createdBy
		Then I see following fields are mandatory and editable type task Status assignee and dueDate
		Then I see user is able to view delete task button
		And I click on add task save button
		Then I click on success popup ok button
		Then I see task is edited successfully		
		
		Scenario: Step_53_As a user i click the export button on license grid page
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
		And I click on export button
		And I see the count of selected rows in excel sheet
		And I see fields in spreadsheet matches on the task grid
		
		Scenario: Step_54_As a user i click the export with notes button on license grid page
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
		And I click on export with notes button
		And I see the count of selected rows in excel sheet
		And I see fields in spreadsheet matches on the task grid notes
		
		

    