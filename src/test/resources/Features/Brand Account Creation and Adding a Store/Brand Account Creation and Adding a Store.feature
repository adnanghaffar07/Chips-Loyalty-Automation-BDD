Feature: Brand Account Creation and Adding a Store

    Scenario: TC_01_Brand user creates a new account
    Given the user is on the brand account creation page
		When the user enters their email, password, brand information, and credit card details
		And the user submits the account creation form
		Then the user should receive a confirmation message or email indicating that their account has been created
		And the confirmation message should include account details



		Scenario: TC_02_Brand user adds a new store to their account
		Given the user has successfully created a brand account
		And the user is logged into their brand account
		When the user navigates to the 'Add Store' section
		And the user enters store details such as store name, address, and contact information
		And the user submits the store addition form
		Then the user should see a confirmation message indicating that the store has been added
		And the store should appear in the list of stores associated with the brand account
		   