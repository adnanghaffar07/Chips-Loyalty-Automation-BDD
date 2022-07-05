Feature: ActivitesGrid

		Scenario: Step_36_As a user i select values in the license progress all Incomplete Only complete only
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on activities grid
		And I see activities page title
		Then I select incomplete only from license progress dropdown
		And I see the licenses activities are filtered based on the chosen license progress incomplete only
		Then I select complete only from license progress dropdown
		And I see the licenses activities are filtered based on the chosen license progress complete only
		Then I select all from license progress dropdown
		And I see the licenses activities are filtered based on the chosen license progress all
    
    
    Scenario: Step_37_As a user i click on the advanced filters on activities grid search icon and users can view the pop up which should have the following
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on activities grid
		And I see activities page title
		Then I get it activities column name and click on advanced filters
		And I see the advance filters popup		
		Then I see column names Of the grid in field dropdown and select value from it
		And I see data in operator dropdown and select value from it
		Then I enter advance filters value in input fields
		And I click on advance filters save button
		And I see advance filters is closed
		And I see the license grid is filtered
		Then I click on advanced filters
		Then I click on add condition link
		And I see dropdown have AND OR value and with the delete button
		And I see field dropdown operator dropdown and value text filed
		And I click on advance filters close button
		And I see advance filters is closed
		
		Scenario: Step_34_As a user i validate the following sections and tabs and grid records are visible on the Activities Grid
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on activities grid
		And I see activities page title
		And I see client dropdown company dropdown and facility dropdown are selected All by default
		And I see reset filter feature should be available for the global filters
		And I see column search for each column in the activities grid
		And I see export button
		And I see advanced filters link
		And I see global search filters
		And I see url icon for each license in the grid
		And I see call the log icon
		And I see activities grid underline color is yellow
		And I see Go To tasks button
		Then I see add activity button
		Then I see license progress filter default dropdown value section should be incomplete only
				
		
		Scenario: Step_39_As a user i click the url icon for the licenses
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on activities grid
		And I see activities page title
		Then I click on the url icon for the activities
		And I see activities url opens and loads successfully if the url is valid
		
		Scenario: Step_45_As a user i verify the list of entries or entries is showing for Licenses on  activity grid
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on licenses grid
		And I see license Page Title
		Then I see label showing xx of xx entries
    
		Scenario: Step_46_As a user i verify reset filter works in the licenses activity grid
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on activities grid
		And I see activities page title
		Then I enter value in license name search filter
		And I click on reset page filters link
		Then I see the reset filter works in the licenses grid
		
		Scenario: Step_47_As a user i verify call log popup on activities grid
    Given Visit the app url
    When I see login page title
    And I enter username
    And I enter password
    Then I click on login button
    And I click on session popup cancel button
    Then I click on licenses grid
		And I see license Page Title
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
		
    
    