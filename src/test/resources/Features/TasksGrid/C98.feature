Feature: C98

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
		And I double click on editable task
		Then I delete the task
		And I see "Record deleted successfully" message
		Then I verify that the task is deleted



	

		
    
    