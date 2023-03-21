Feature: SmokeTest

Scenario: Smoke_Test_As a user I login
		 Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button

		Scenario: Smoke_Test_As a user i validate Edit requirement popup
		Then I click on activities grid
		And I see activities page title
		Then I click on dashboard grid
		Then I click on requirements grid
		And I see requirement Page Title
		Then I double click on licens to edit
		And I see the edit requirement page titel
		And I see the user is allowed to edit all the fields except the company facility state
		And I see the user is allowed to remove the requirement pdf file if the file exists
		Then I double click on licens to edit
		Then I see the user is able to view the delete button if the user has a permission to delete requirements
		Then I double click on licens to edit
		And I see the edit requirement page titel
		And I see the editing a requirement is successful
		And I see the user is redirection to the requirement grid and verify the newly edited requirement is listed in the requirement grid with the newly edited values
		
		
		Scenario: Smoke_Test_As a user i validate add requirement popup
		Then I click on dashboard grid
		Then I click on requirements grid
		And I see requirement Page Title
		Then I click on add new requirement button
		Then I select company from dropdown
		And I select facility from dropdown
		Then I select states from dropdown
		Then I select requirement status from dropdown
		And I enter requirement name in input fields
		And I enter requirement number in input fields
		And I click on add requirement save button
		And I see requirement details saved successfully
		Then I click on success popup ok button
		And I see the newly added requirement is listed in the requirement grid		
		
			Scenario: Smoke_Test_As a user i validate add activity popup on the activity grid
		Then I click on dashboard grid  
    Then I click on activities grid
		And I see activities page title
		Then I click on active licens to select
		And I click on add activity button
		And I see the Add requirement Activity page titel
		And I see In the edit activity section the following fields are mandatory and non editable company facility state requirement status
		And I see in the add activity section the following fields are mandatory and editable requirement activity and activity start date
		Then I click on add activity Next button
		And I see add task titel
		And I see in the add task section the following fields are mandatory and non editable activity createdby
		And I see in the add task section the following fields are mandatory and Editable type taskstatus assignee duedate
		Then I click on add activity add task back button
		And I see the Add requirement Activity page titel
		Then I click on next button
		And I see in the add task section the following fields are mandatory and Editable type taskstatus assignee duedate
		Then I click on add activity add task save button
		Then I click on success popup ok button
		And I see the newly added requirement activity is listed in the requirement activity grid
		
		Scenario: Smoke_Test_As a user i validate Edit Activity popup
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		Then I double click on active licens to edit
		And I see the edit requirement Activity page titel
		And I see In the edit activity section the following fields are mandatory and non editable company facility state requirement status
		And I see in the add activity section the following fields are mandatory and editable requirement activity and activity start date
		Then I see the user is able to view the delete button if the user has a permission to delete requirements
		Then I double click on active licens to edit
		And I see the edit requirement Activity page titel
		And I click on edit pop up save button
		
		Scenario: Smoke_Test_A User i Validate edit tasks popup
		Then I click on dashboard grid
    Then I click on tasks grid
    And I double click on task detail
    Then I see header section display chosen activity details
    Then I see following fields are mandatory and non editable date and createdBy
		Then I see following fields are mandatory and editable type task Status assignee and dueDate
		Then I see user is able to view delete task button
		And I click on add task save button
		Then I click on success popup ok button
		Then I see task is edited successfully
		
		Scenario: Smoke_Test_As a user i validate delete tasks feature
    Then I click on dashboard grid
    Then I click on tasks grid
    And I double click on requirement detail
    And I click on delete button
    And I see the task documents under selected requirement
    And I see the task notification under selected requirement
    Then I click on confirm button on delete popup
    And I see the requirement details records deleted successfully
    And I double click on requirement detail
    And I click on delete button
    Then I click on cancel button on delete popup
    And I see the requirement details records not deleted
    
    Scenario: Smoke_Test_As a user i Validate Delete requirement activity feature
    Then I click on dashboard grid
    Then I click on activities grid
		And I see activities page title
		And I double click on requirement detail
    And I click on delete button
    And I see the task under selected requirement
    And I see the task documents under selected requirement
    And I see the task notification under selected requirement
    Then I click on confirm button on delete popup
    And I see the requirement details records deleted successfully
    And I double click on requirement detail
    And I click on delete button
    Then I click on cancel button on delete popup
    And I see the requirement details records not deleted
    
    	Scenario: Smoke_Test_As a user i validate add tasks popup   
		Then I click on dashboard grid
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
		Then I see the modified requirement activity is listed in the requirement activity grid
		
		Scenario: Smoke_Test_As a user i add a document
		Then I click on dashboard grid
    Then I click on documents menu button
		And I see the document page
		And I select client on document page
		Then I click on upload document button
		And I upload document
		Then I see the document details saved successfully popup
		Then I click on document details saved successfully popup ok button
		Then I see the document uploaded
		Then I delete uploaded file
		
		Scenario: Smoke_Test_As a user i navigate to documents
		Then I click on dashboard grid
    Then I click on documents menu button
		And I see the document page
		
		Scenario: Smoke_Test_As a user i navigate to document notification
		Then I click on dashboard grid
		Then I click on notifications menu button
    And I click on notifications dropdown documents button
		And I see the document notification page
		
		
		
		
		