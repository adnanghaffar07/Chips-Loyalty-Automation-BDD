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
	
}
