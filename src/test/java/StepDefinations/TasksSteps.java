package StepDefinations;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import Constants.Constants;
import Pages.ActivitesGridPage;
import Pages.ChangePasswordPage;
import Pages.DashboardPage;
import Pages.LicenseGridPage;
import Pages.LoginPage;
import Pages.TasksPage;
import Utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import static org.junit.Assert.*;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;

public class TasksSteps extends BaseClass {
	TasksPage tasksPage = new TasksPage(driver);
	
	
	@Then("^I click on go to tasks button$")
	public void clickOnGoToTasksButton() {
		tasksPage.clickOnGoToTasksButton(driver);
	}	
	
	@Then("^I see the tasks page$")
	public void verifyLicenseWithExpirationFieldPopulated() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyTaskSubpanel(driver));
	}
	
	@And("^I click on go to tasks license activities button$")
	public void clickOngoToTaskLicenseActivitiesButton() {
		tasksPage.clickOnGoToTaskLicenseActivitiesButton(driver);
	}
	
	@And("^I click on back to tasks button$")
	public void clickOnBackToTasksButton() {
		tasksPage.clickOnBackToTasksButton(driver);
	}
	
	@And("^I click on add task button$")
	public void clickOnAddTaskButton() {
		tasksPage.clickOnAddTaskButton(driver);
	}
	
	@Then("^I see add task title$")
	public void verifyAddTaskTitle() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyAddTaskTitle(driver));
	}
	
	@Then("^I see following fields are mandatory and non editable date and createdBy$")
	public void verifyFollowingFieldsAreMandatoryAndNonEditableDateAndCreatedBy() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyFollowingFieldsAreMandatoryAndNonEditableDateAndCreatedBy(driver));
	}
	
	@Then("^I see following fields are mandatory and editable type task Status assignee and dueDate$")
	public void verifyFollowingFieldsAreMandatoryAndEditableTypeTaskStatusAssigneeAndDueDate() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyFollowingFieldsAreMandatoryAndEditableTypeTaskStatusAssigneeAndDueDate(driver));
	}
	
	@And("^I click on add task save button$")
	public void clickOnSaveButton() {
		tasksPage.clickOnSaveButton(driver);
	}
	
	@Then("^I see the modified license activity is listed in the license activity grid$")
	public void verifyTheModifiedLicenseActivityIsListedInTheLicenseActivityGrid() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyTheModifiedLicenseActivityIsListedInTheLicenseActivityGrid(driver));
	}
	
	
	@Then("^I see client company facility global filters and reset filter$")
	public void verifyClientCompanyFacilityGlobalAndResetFilter() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyGlobalClientCompanyFacilityAndResetFilters(driver));
	}
	
	@Then("^I see export button on task grid$")
	public void verifyExportButton() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyExportButton(driver));
	}
	
	@Then("^I see export with notes button on task grid$")
	public void verifyExportWithNotesButton() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyExportWithNotes(driver));
	}
	
	@Then("^I see  alltasks mytasks filter assigned tasks dropdown default dropdown value is all tasks$")
	public void verifyAllTaskMyTaskAssignedTaskDropDown() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyAllTaskMyTaskAssignedTaskDropDown(driver));
	}
	
	@Then("^I see tasks standing filter drop down default dropdown value selected is incomplete only$")
	public void verifyTaskStandingDropDown() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyTaskStandingDropDown(driver));
	}
	
	@Then("^I see show all links on task grid$")
	public void verifyShowAllEntriesDropdown() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyShowAllEntriesDropdown(driver));
	}
	
	@Then("^I see advance filter icon on task grid$")
	public void verifyAdvanceFilterIcon() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyAdvanceFilterIcon(driver));
	}
	
	@Then("^I see global search on task grid$")
	public void verifyGlobalSearch() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyGlobalSearch(driver));
	}
	
	@Then("^I see column search for each column in the grid$")
	public void verifyColumnSearch() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyColumnSearch(driver));
	}
	
	@Then("^I see column wise sort for each column in the grid$")
	public void verifyColumnWiseSort() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyColumnWiseSort(driver));
	}
	
	@Then("^I see edit tasks on double click of each task in the grid$")
	public void verifyEditTaskTitle() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyEditTaskTitle(driver));
	}
	
	@And("^I click on all task drop down$")
	public void clickOnUserTypeAllTask() {
		tasksPage.clickOnUserTypeAllTask(driver);
	}
	@And("^I click on my task drop down$")
	public void clickOnUserTypeMyTask() {
		tasksPage.clickOnUserTypeMyTask(driver);
	}
	@And("^I click on assigned task drop down$")
	public void clickOnUserTypeAssignedTask() {
		tasksPage.clickOnUserTypeAssignedTask(driver);
	}
	@Then("^I see all task in the grid$")
	public void verifyAllTaskAreShowing() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyAllTaskAreShowing(driver));
	}
	@Then("^I see my task in the grid$")
	public void verifyMyTaskAreShowing() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyMyTaskAreShowing(driver));
	}
	@Then("^I see assigned task in the grid$")
	public void verifyAssignedTaskAreShowing() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyAssignedTaskAreShowing(driver));
	}
	@And("^I click on advance filter icon$")
	public void clickOnAdvanceFilterIcon() {
		tasksPage.clickOnAdvanceFilterIcon(driver);
	}
	
	@Then("^I see field drop down have all column values$")
	public void verifyFieldDropDownHaveAllColumnValues() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyFieldDropDownHaveAllColumnValues(driver));
	}
	
	@Then("^I see operator drop down have folowing values$")
	public void verifyOperatorDropDownHasFollowingValues() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyOperatorDropDownHasFollowingValues(driver));
	}
	@Then("^I see text box allowed user to enter text$")
	public void verifyTextBoxAllowedEnterText() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyTextBoxAllowedEnterText(driver));
	}
	@And("^I click on add condition link on advance filter pop up$")
	public void clickOnAddConditionIcon() {
		tasksPage.clickOnAddConditionIcon(driver);
	}
	@Then("^I see user can see and or drop down$")
	public void verifyUserCanSeeAndOrDropDown() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyUserCanSeeAndOrDropDown(driver));
	}
	
	@Then("^I see user can see one or more field$")
	public void verifyUserCanSeeOneOrMoreSetOfField() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyUserCanSeeOneOrMoreSetOfField(driver));
	}
	
	@Then("^I see on click of close button pop up closed$")
	public void verifyOnClickOfCloseButtonPopShouldClosed() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyOnClickOfCloseButtonPopShouldClosed(driver));
	}
	
	@Then("^I see on click of save button grid is filtered$")
	public void verifyOnClickOfSaveButtonTaskGridIsFiltered() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyOnClickOfSaveButtonTaskGridIsFiltered(driver));
	}
	@And("^I double click on task detail$")
	public void doubleClickOnTask() {
		tasksPage.doubleClickOnTask(driver);
	}
	@Then("^I see header section display chosen activity details$")
	public void verifyTaskActivityDetailOnEditPopup() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyTaskActivityDetailOnEditPopup(driver));
	}
	@Then("^I see user is able to view delete task button$")
	public void verifyDeleteTaskButton() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyDeleteTaskButton(driver));
	}
	@Then("^I see user is redirect to task subpanel$")
	public void verifyUserRedirectToTaskSubpanel() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyUserRedirectToTaskSubpanel(driver));
	}
	@Then("^I see task is edited successfully$")
	public void verifyTaskEditedSuccessfully() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyTaskEditedSuccessfully(driver));
	}
	@And("^I see fields in spreadsheet matches on the task grid$")
	public void verifyFieldsInSpreadsheetMatchesOnTheLicensesGrid() throws IOException {
		tasksPage.verifyFieldsInSpreadsheetMatchesOnTheTaskGrid(driver);
	}
	
}
