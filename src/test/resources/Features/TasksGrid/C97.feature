Feature: C97

	Scenario: Add/Edit task
		Given Visit the app url
		When I see login page title
		And I enter username
		And I enter password
		Then I click on login button
		And I click on session popup cancel button
		Then I click on tasks grid
		And I see tasks page title
		Then I click on go to tasks button
		And I click on add task button
		When I populate required fields on the add task section
		Then I click on the save task button
		And I click on success popup ok button
		Then I verify that the new task is added
		When I double click on editable task
		Then I edit the task fields
		Then I click on the save task button
		And I click on success popup ok button
		Then I verify that the task was edited



	

		
    
    