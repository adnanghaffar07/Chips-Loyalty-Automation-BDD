package StepDefinations;

import Constants.Constants;
import Pages.ActivitesGridPage;
import Pages.LoginPage;
import Utils.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;
import java.text.ParseException;
//import junit.framework.Assert;


public class ActivitesGridSteps extends BaseClass {

	LoginPage loginPage = new LoginPage(driver);
	ActivitesGridPage activitesGridPage = new ActivitesGridPage(driver);
	public Constants loginconstant;
	
	@And("^I see activities grid underline color is yellow$")
	public void verifyActivitiesGridUnderlineColorYellow() {
		Assert.assertTrue(activitesGridPage.verifyActivitiesGridUnderlineColorYellow(driver));
	}
	
	
	@And("^I see column search for each column in the activities grid$")
	public void verifyColumnSearchForEachColumnInTheActivitiesGrid() {
		Assert.assertTrue(activitesGridPage.verifyColumnSearchForEachColumnInTheActivitiesGrid(driver));
	}
	
	@And("^I see Go To tasks button$")
	public void verifyGoToTasksButton() {
		Assert.assertTrue(activitesGridPage.verifyGoToTasksButton(driver));
	}
	
	@Then("^I see add activity button$")
	public void verifyAddActivityButton() {
		Assert.assertTrue(activitesGridPage.verifyAddActivityButton(driver));
	}
	
	@Then("^I see license progress filter default dropdown value section should be incomplete only$")
	public void verifyLicenseProgressFilterDefaultDropdownValueSectionShouldBeIncompleteOnly() {
		Assert.assertTrue(activitesGridPage.verifyLicenseProgressFilterDefaultDropdownValueSectionShouldBeIncompleteOnly(driver));
	}
	
	@Then("^I click on the url icon for the activities$")
	public void clickOnUrlIconActivities() {
		activitesGridPage.clickOnUrlIconActivities(driver);
	}
	
	@Then("^I see activities url opens and loads successfully if the url is valid$")
	public void verifyTheActivitiesUrlOpensAndLoadsSuccessfullyIfTheUrlIsValid() {
		Assert.assertTrue(activitesGridPage.verifyTheActivitiesUrlOpensAndLoadsSuccessfullyIfTheUrlIsValid(driver));
	}
	
	@Then("^I double click on active licens to edit$")
	public void doubleClickOnlicensToEdit() {
		activitesGridPage.doubleClickOnActivelicensToEdit(driver);
	}
	
	@Then("^I click on active licens to select$")
	public void clickOnActivelicensToSelect() {
		activitesGridPage.clickOnActivelicensToSelect(driver);
	}
	
	@Then("^I click on add activity button$")
	public void clickOnAddActivityButton() {
		activitesGridPage.clickOnAddActivityButton(driver);
	}
	
	
	@And("^I see the edit license Activity page titel$")
	public void verifyEditLicensePageTitel() {
		Assert.assertTrue(activitesGridPage.verifyEditLicenseActivityPageTitel(driver));
	}
	
	@And("^I see the Add license Activity page titel$")
	public void verifyAddLicenseActivityPageTitel() {
		Assert.assertTrue(activitesGridPage.verifyAddLicenseActivityPageTitel(driver));
	}	
	
	@And("^I see In the edit activity section the following fields are mandatory and non editable company facility state license status$")
	public void verifyInTheEditActivitySectionTheFollowingFieldsAreMandatoryAndNonEditableCompanyFacilityStateLicenseStatus() {
		Assert.assertTrue(activitesGridPage.verifyInTheEditActivitySectionTheFollowingFieldsAreMandatoryAndNonEditableCompanyFacilityStateLicenseStatus(driver));
	}
	
	@And("^I see in the add activity section the following fields are mandatory and editable license activity and activity start date$")
	public void verifyInTheAddActivitySectionTheFollowingFieldsAreMandatoryAndEditableLicenseActivityAndActivityStartDate() {
		Assert.assertTrue(activitesGridPage.verifyInTheAddActivitySectionTheFollowingFieldsAreMandatoryAndEditableLicenseActivityAndActivityStartDate(driver));
	}
	
	@Then("^I click on add activity Next button$")
	public void clickOnAddActivityNextButton() throws ParseException {
		activitesGridPage.clickOnAddActivityNextButton(driver);
	}
	
	@Then("^I click on next button$")
	public void clickOnNextButton() throws ParseException {
		activitesGridPage.clickOnNextButton(driver);
	}
	
	@And("^I see add task titel$")
	public void verifyAddTaskTitel() {
		Assert.assertTrue(activitesGridPage.verifyAddTaskTitel(driver));
	}
	
	@And("^I see in the add task section the following fields are mandatory and non editable activity createdby$")
	public void verifyInTheAddTaskSectionTheFollowingFieldsAreMandatoryAndNonEditableActivityCreatedBy() {
		Assert.assertTrue(activitesGridPage.verifyInTheAddTaskSectionTheFollowingFieldsAreMandatoryAndNonEditableActivityCreatedBy(driver));
	}
	
	@And("^I see in the add task section the following fields are mandatory and Editable type taskstatus assignee duedate$")
	public void verifyInTheAddTaskSectionTheFollowingFieldsAreMandatoryAndEditableTypeTaskStatusAssigneeDuedate() {
		Assert.assertTrue(activitesGridPage.verifyInTheAddTaskSectionTheFollowingFieldsAreMandatoryAndEditableTypeTaskStatusAssigneeDuedate(driver));
	}

	@Then("^I click on add activity add task back button$")
	public void clickOnAddActivityAddTaskBackButton() {
		activitesGridPage.clickOnAddActivityAddTaskBackButton(driver);
	}
	
	@Then("^I click on add activity add task save button$")
	public void clickOnAddActivityAddTaskSaveButton() throws ParseException {
		activitesGridPage.clickOnAddActivityAddTaskSaveButton(driver);
	}
	
	@And("^I see the newly added license activity is listed in the license activity grid$")
	public void verifyTheNewlyAddedLicenseActivityIsListedInTheLicenseActivityGrid() {
		Assert.assertTrue(activitesGridPage.verifyTheNewlyAddedLicenseActivityIsListedInTheLicenseActivityGrid(driver));
	}
	
	@Then("^I click on go to task button$")
	public void clickOnGoToTaskButton() {
		activitesGridPage.getDetailsInFirstRow(driver);
		activitesGridPage.clickOnGoToTaskButtonActivities(driver);
	}
	
	@And("^I see the sub panel header sections displays the chosen activities details$")
	public void verifyHeaderSectionsDisplaysTheChosenActivitiesDetails() {
		Assert.assertTrue(activitesGridPage.verifyDetailAreCorrectInTheLicencseActivityGrid(driver));
	}
	
	@And("^I see tasks section lists the related tasks details of the chosen activities$")
	public void verifyTheTaskDetail() {
		Assert.assertTrue(activitesGridPage.verifyTaskDetailInTheLicencseActivityGrid(driver));
	}
	
	@And("^I see the add task button in the license activity grid$")
	public void verifyTheAddTaskButton() {
		Assert.assertTrue(activitesGridPage.verifyAddTaskButtonInTheLicencseActivityGrid(driver));
	}
	
	@Then("^I click activity notes button$")
	public void clickActivityNotesButton() {
		activitesGridPage.clickOnActivityNotes(driver);
	}
	
	@And("^I see the activity notes section lists the related notes details of the chosen activities$")
	public void verifyTheTaskNotes() {
		Assert.assertTrue(activitesGridPage.verifyNotesSectionDetailInTheLicencseActivityGrid(driver));
	}
	
	@And("^I see the user is able to view the old notes icon$")
	public void verifyTheOldNotesIcon() {
		Assert.assertTrue(activitesGridPage.verifyOldNotesIconInTheLicencseActivityGrid(driver));
	}
	
	@And("^I see the global search text box in the license activity grid$")
	public void verifyTheGlobalSearchTextBox() {
		Assert.assertTrue(activitesGridPage.verifyGlobalSearchTextBoxInTheLicencseActivityGrid(driver));
	}
	
	@And("^I see the advance filters icon in the license activity grid$")
	public void verifyTheAdvanceFilterIcon() {
		Assert.assertTrue(activitesGridPage.verifyAdvanceFilterIconInTheLicencseActivityGrid(driver));
	}

	@And("^I click on export button$")
	public void clickOnExportButton() {
		activitesGridPage.clickOnExportButton(driver);
	}

	@And("^I see the count of selected rows in excel sheet$")
	public void verifyRowsCount() {
		activitesGridPage.verifyRowsCount(driver);
	}
	
	@And("^I see fields in spreadsheet matches on the licenses grid$")
	public void verifyFieldsInSpreadsheetMatchesOnTheLicensesGrid() throws IOException {
		activitesGridPage.verifyFieldsInSpreadsheetMatchesOnTheLicensesGrid(driver);
	}

	@Then("I click on save activity button")
	public void iClickOnSaveActivityButton() {
		activitesGridPage.clickOnSaveActivityFormButton(driver);
		activitesGridPage.clickOnSuccessPopupOkButton(driver);
	}

	@And("I verify that the activity is deleted")
	public void iVerifyThatTheActivityIsDeleted() {
		Assert.assertTrue(activitesGridPage.verifyThatActivityIsDeleted(driver));
	}

	@And("I see activities count")
	public void iSeeActivitiesCount() {
		activitesGridPage.getActivitiesCount(driver);
	}

}
