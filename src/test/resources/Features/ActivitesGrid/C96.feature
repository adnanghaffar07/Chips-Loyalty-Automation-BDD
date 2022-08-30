Feature: C96

	Scenario: Delete activity
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
		And I see activities count
		When I click on active licens to select
		Then I double click on active licens to edit
		Then I see the user is able to view the delete button if the user has a permission to delete licenses
		Then I verify that the activity is deleted



	

		
    
    