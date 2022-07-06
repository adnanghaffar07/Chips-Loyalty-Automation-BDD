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
import Pages.LoginPage;
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
	
	@And("^I see the edit license Activity page titel$")
	public void verifyEditLicensePageTitel() {
		Assert.assertTrue(activitesGridPage.verifyEditLicenseActivityPageTitel(driver));
	}
	
	@And("^I see In the edit activity section the following fields are mandatory and non editable company facility state license status$")
	public void verifyInTheEditActivitySectionTheFollowingFieldsAreMandatoryAndNonEditableCompanyFacilityStateLicenseStatus() {
		Assert.assertTrue(activitesGridPage.verifyInTheEditActivitySectionTheFollowingFieldsAreMandatoryAndNonEditableCompanyFacilityStateLicenseStatus(driver));
	}
	
	@And("^I see in the add activity section the following fields are mandatory and editable license activity and activity start date$")
	public void verifyInTheAddActivitySectionTheFollowingFieldsAreMandatoryAndEditableLicenseActivityAndActivityStartDate() {
		Assert.assertTrue(activitesGridPage.verifyInTheAddActivitySectionTheFollowingFieldsAreMandatoryAndEditableLicenseActivityAndActivityStartDate(driver));
	}
	
	
}
