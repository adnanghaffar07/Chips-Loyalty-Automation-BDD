package StepDefinations;

import Utils.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BrandAccountCreationSteps extends BaseClass {	
	
	@Given("^the user is on the brand account creation page$")
	public void UserIsOnbrandCreationPage() {
	}
	
	@When("^the user enters their email, password, brand information, and credit card details$")
	public void EnterDetails() {
	}
	
	@And("^the user submits the account creation form$")
	public void userSubmitAccountCreationForm() {
	}
	
	
	@Then("^the user should receive a confirmation message or email indicating that their account has been created$")
	public void receiveConfirmationEmail() {
	}
	
	@And("^the confirmation message should include account details$")
	public void verifyConfirmationEmail() {
	}
	
	@Given("^the user has successfully created a brand account$")
	public void userCreatedBrandAccount() {
	}
	
	@And("^the user is logged into their brand account$")
	public void loginToBrandAccount() {
	}
	
	@When("^the user navigates to the 'Add Store' section$")
	public void navigateToAddStore() {
	}
	
	@And("^the user enters store details such as store name, address, and contact information$")
	public void enterValidDetails() {
	}
	
	@And("^the user submits the store addition form$")
	public void submitAdditionForm() {
	}
	
	@Then("^the user should see a confirmation message indicating that the store has been added$")
	public void verifyConfirmationMessage() {
	}
	
	@And("^the store should appear in the list of stores associated with the brand account$")
	public void verifyListOfStoresVisible() {
	}

	
}






