Feature: TasksGrid

		Scenario: Step_41_As a user i verify go to tasks icon
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
		
		Scenario: Step_60_As a user i verify call log popup on tasks grid
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
		

    
    
    