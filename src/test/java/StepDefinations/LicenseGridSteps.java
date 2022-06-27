package StepDefinations;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import Constants.Constants;
import Pages.ChangePasswordPage;
import Pages.LicenseGridPage;
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

public class LicenseGridSteps extends BaseClass {

	LoginPage loginPage = new LoginPage(driver);
	LicenseGridPage licenseGridPage = new LicenseGridPage(driver);
	public Constants loginconstant;

	@And("^I see client dropdown company dropdown and facility dropdown are selected All by default$")
	public void verifyClientDropdownCompanyDropdownFacilityDropdownDefaultSelectedAll() {
		licenseGridPage.verifyClientDropdownCompanyDropdownFacilityDropdownDefaultSelectedAll(driver);
	}
	
	@And("^I see reset filter feature should be available for the global filters$")
	public void verifyResetFilterFeatureShouldBeAvailableForTheGlobalFilters() {
		licenseGridPage.verifyResetFilterFeatureShouldBeAvailableForTheGlobalFilters(driver);
	}
	
	@And("^I see column search for each columnIn the grid$")
	public void verifyColumnSearchForEachColumnInTheGrid() {
		Assert.assertTrue(licenseGridPage.verifyColumnSearchForEachColumnInTheGrid(driver));
	}
	
	@And("^I see export button$")
	public void verifyExportButton() {
		Assert.assertTrue(licenseGridPage.verifyExportButton(driver));
	}
	@And("^I see advanced filters link$")
	public void verifyAdvancedFiltersLink() {
		Assert.assertTrue(licenseGridPage.verifyAdvancedFiltersLink(driver));
	}
	@And("^I see global search filters$")
	public void verifyGlobalSearch() {
		Assert.assertTrue(licenseGridPage.verifyGlobalSearch(driver));
	}
	@And("^I see url icon for each license in the grid$")
	public void verifyUrlIconForEachLicenseInTheGrid() {
		Assert.assertTrue(licenseGridPage.verifyUrlIconForEachLicenseInTheGrid(driver));
	}
	@And("^I see status help icon and active help icon$")
	public void verifyStatusHelpIconAndActiveHelpIcon() {
		Assert.assertTrue(licenseGridPage.verifyStatusHelpIconAndActiveHelpIcon(driver));
	}
	@And("^I see call the log icon$")
	public void verifyCallTheLogIcon() {
		Assert.assertTrue(licenseGridPage.verifyCallTheLogIcon(driver));
	}
	
	@And("^I see licenses grid underline color is yellow$")
	public void verifyLicensesGridUnderlineColorYellow() {
		Assert.assertTrue(licenseGridPage.verifyLicensesGridUnderlineColorYellow(driver));
	}
	
	@And("^I hover mouse on status i icon and i see tool tip$")
	public void hoverMouseOnStatusIIconAndVerifyTooltip() {
		Assert.assertTrue(licenseGridPage.hoverMouseOnStatusIIconAndVerifyTooltip(driver));
	}
	
	@And("^I hover mouse on active i icon and i see tool tip$")
	public void hoverMouseOnActiveIIconAndVerifyTooltip() {
		Assert.assertTrue(licenseGridPage.hoverMouseOnActiveIIconAndVerifyTooltip(driver));
	}
	
	@Then("^I click on the url icon for the license$")
	public void clickOnUrlIconLicenses() {
		licenseGridPage.clickOnUrlIconLicenses(driver);
	}
	
	@And("^I see the url opens and loads successfully if the url is valid$")
	public void verifyTheUrlOpensAndLoadsSuccessfullyIfTheUrlIsValid() {
		Assert.assertTrue(licenseGridPage.verifyTheUrlOpensAndLoadsSuccessfullyIfTheUrlIsValid(driver));
	}
	
	@Then("^I click on license go to activity icon$")
	public void clickOnGoToActivityIcon() {
		licenseGridPage.clickOnGoToActivityIcon(driver);
	}
	
	@And("^I see the activity data for the chosen licenses$")
	public void verifyActivityDataForTheChosenLicenses() {
		Assert.assertTrue(licenseGridPage.verifyActivityDataForTheChosenLicenses(driver));
	}
	
	@Then("^I click on add activity icon$")
	public void clickOnAddActivityIcon() {
		licenseGridPage.clickOnAddActivityIcon(driver);
	}
	
	@And("^I see the activity data on license details page$")
	public void verifyActivityDataOnLicenseDetailsPage() {
		licenseGridPage.verifyActivityDataOnLicenseDetailsPage(driver);
	}
	
	@And("^I add activity and task entry for the chosen license$")
	public void addActivityAndTaskEntryForTheChosenLicense() {
		licenseGridPage.addActivityAndTaskEntryForTheChosenLicense(driver);
	}
	
	@And("^I see the task details saved successfully popup$")
	public void verifyTaskDetailsSavedSuccessfullyPopup() {
		licenseGridPage.verifyTaskDetailsSavedSuccessfullyPopup(driver);
	}
	
	
	@Then("^I click on task details saved successfully popup ok button$")
	public void clickOnTaskDetailsSavedSuccessfullyPopupOkButton() {
		licenseGridPage.clickOnTaskDetailsSavedSuccessfullyPopupOkButton(driver);
	}
	
	@Then("^I click on advanced filters$")
	public void clickOnAdvancedFilters() {
		licenseGridPage.clickOnAdvancedFilters(driver);
	}
	 
	@And("^I see the advance filters popup$")
	public void verifyAdvanceFiltersPopup() {
		licenseGridPage.verifyAdvanceFiltersPopup(driver);
	}
	
	@Then("^I see column names Of the grid in field dropdown and select value from it$")
	public void verifyColumnNamesOfTheGridInFieldDropdownAndselectValueFromField() {
		Assert.assertTrue(licenseGridPage.verifyColumnNamesOfTheGridInFieldDropdownAndselectValueFromDropdown(driver));
	}
	
	@And("^I see data in operator dropdown and select value from it$")
	public void verifyDataInDropdownAndselectValueFromOperator() {
		Assert.assertTrue(licenseGridPage.verifyDataInDropdownAndselectValueFromOperatorDropdown(driver));
	}
	
	@Then("^I enter advance filters value in input fields$")
	public void enterAdvanceFiltersValue() {
		licenseGridPage.enterAdvanceFiltersValue(driver);
	}
	
	@And("^I see dropdown have AND OR value and with the delete button$")
	public void verifyDropdownhaveAndOrValueWithTheDeleteButton() {
		Assert.assertTrue(licenseGridPage.verifyDropdownhaveAndOrValueWithTheDeleteButton(driver));
	}
	
	@And("^I see field dropdown operator dropdown and value text filed$")
	public void verifyDropdownFieldOperatorAndValueTextFiled() {
		Assert.assertTrue(licenseGridPage.verifyDropdownFieldOperatorAndValueTextFiled(driver));
	}
	
	@Then("^I click on add condition link$")
	public void clickOnAddConditionLink() {
		licenseGridPage.clickOnAddConditionLink(driver);
	}
	
	@Then("^I click on advance filters close button$")
	public void clickOnAdvanceFiltersCloseButton() {
		licenseGridPage.clickOnAdvanceFiltersCloseButton(driver);
	}
	
	@And("^I see advance filters is closed$")
	public void verifyAdvanceFiltersIsClosed() {
		Assert.assertFalse(licenseGridPage.verifyAdvanceFiltersIsClosed(driver));
	}
	
	@And("^I select advance filters data$")
	public void selectAdvanceFiltersData() {
		Assert.assertTrue(licenseGridPage.selectAdvanceFiltersData(driver));
	}
	
	@Then("^I click on advance filters save button$")
	public void clickOnAdvanceFiltersSaveButton() {
		licenseGridPage.clickOnAdvanceFiltersSaveButton(driver);
	}
	
	@Then("^I click on add new license button$")
	public void clickOnAddNewLicenseButton() {
		licenseGridPage.clickOnAddNewLicenseButton(driver);
	}
	
	@And("^I see add license page title$")
	public void verifyAddLicensePageTitle() {
		Assert.assertFalse(licenseGridPage.verifyAddLicensePageTitle(driver));
	}
	
	@Then("^I select company from dropdown$")
	public void selectCompanyDropdown() {
		licenseGridPage.selectCompanyDropdown(driver);
	}
	
	@Then("^I select facility from dropdown$")
	public void selectFacilityDropdown() {
		licenseGridPage.selectFacilityDropdown(driver);
	}
	
	@Then("^I select states from dropdown$")
	public void selectStatesDropdown() {
		licenseGridPage.selectStatesDropdown(driver);
	}
	
	@Then("^I select license status from dropdown$")
	public void selectLicenseStatusDropdown() {
		licenseGridPage.selectLicenseStatusDropdown(driver);
	}
	
	@Then("^I enter license name in input fields$")
	public void enterLicenseName() {
		licenseGridPage.enterLicenseName(driver);
	}

	@Then("^I enter license number in input fields$")
	public void enterLicenseNumber() {
		licenseGridPage.enterLicenseNumber(driver);
	}
	
	@Then("^I click on add license save button$")
	public void clickOnAddLicenseSaveButton() {
		licenseGridPage.clickOnAddLicenseSaveButton(driver);
	}
	
	@And("^I see license details saved successfully$")
	public void verifyLicenseDetailsSavedSuccessfully() {
		Assert.assertTrue(licenseGridPage.verifyLicenseDetailsSavedSuccessfully(driver));
	}
	
	@Then("^I click on success popup ok button$")
	public void clickOnSuccessPopupOkButton() {
		licenseGridPage.clickOnSuccessPopupOkButton(driver);
	}
	

	@And("^I see the newly added license is listed in the license grid$")
	public void verifyTheNewlyAddedLicenseIsListedInTheLicenseGrid() {
		Assert.assertTrue(licenseGridPage.verifyTheNewlyAddedLicenseIsListedInTheLicenseGrid(driver));
	}
	
	@And("^I see the license grid is filtered$")
	public void verifyLicenseGridIsFiltered() {
		Assert.assertTrue(licenseGridPage.verifyLicenseGridIsFiltered(driver));
	}
	
	
	
	
}
