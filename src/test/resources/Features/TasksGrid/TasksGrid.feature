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
		
		Scenario: Step_59_As a user i verify reset filter works in the licenses tasks grid
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
		
		Scenario: Step_58_As a user i verify the list of entries or entries is showing for Licenses on tasks grid
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on tasks grid
		And I see tasks page title
		Then I see label showing xx of xx entries
		
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