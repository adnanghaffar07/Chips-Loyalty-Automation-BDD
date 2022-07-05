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
		

    
    
    