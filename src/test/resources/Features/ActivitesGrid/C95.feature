Feature: C95

	Scenario: Add/Edit activity
		Given Visit the app url
		When I see login page title
		And I enter username
		And I enter password
		Then I click on login button
		And I click on session popup cancel button
		When I select client in filter
		And I select company from dropdown
		Then I select the Reset Filter
		Then I click on activities grid
		And I see activities page title
		Then I double click on active licens to edit
		And I see the edit license Activity page titel
		And I see In the edit activity section the following fields are mandatory and non editable company facility state license status
		And I see in the add activity section the following fields are mandatory and editable license activity and activity start date
		Then I click on save activity button
		When I click on active licens to select
		And I click on add activity button
		And I see the Add license Activity page titel
		And I see In the edit activity section the following fields are mandatory and non editable company facility state license status
		And I see in the add activity section the following fields are mandatory and editable license activity and activity start date
		Then I click on add activity Next button
		And I see add task titel
		And I see in the add task section the following fields are mandatory and non editable activity createdby
		And I see in the add task section the following fields are mandatory and Editable type taskstatus assignee duedate
		Then I click on add activity add task back button
		And I see the Add license Activity page titel
		Then I click on next button
		And I see in the add task section the following fields are mandatory and Editable type taskstatus assignee duedate
		Then I click on add activity add task save button
		Then I click on success popup ok button
		And I see the newly added license activity is listed in the license activity grid



	

		
    
    