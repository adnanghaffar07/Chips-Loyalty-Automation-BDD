package StepDefinations;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

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
	public void addActivityAndTaskEntryForTheChosenLicense() throws ParseException {
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
	
	@Then("^I double click on licens to edit$")
	public void doubleClickOnlicensToEdit() {
		licenseGridPage.doubleClickOnlicensToEdit(driver);
	}
	
	@And("^I see the edit license page titel$")
	public void verifyEditLicensePageTitel() {
		Assert.assertTrue(licenseGridPage.verifyEditLicensePageTitel(driver));
	}
	
	@And("^I see the user is allowed to edit all the fields except the company facility state$")
	public void verifyTheUserIsAllowedToEditAllTheFieldsExceptTheCompanyFacilityState() {
		Assert.assertTrue(licenseGridPage.verifyTheUserIsAllowedToEditAllTheFieldsExceptTheCompanyFacilityState(driver));
	}
	
	@And("^I see the user is allowed to remove the license pdf file if the file exists$")
	public void verifyTheUserIsAllowedToRemoveTheLicensePdfFileIfTheFileExists() {
		Assert.assertTrue(licenseGridPage.verifyTheUserIsAllowedToRemoveTheLicensePdfFileIfTheFileExists(driver));
	}
	
	@And("^I see the user is able to view the delete button if the user has a permission to delete licenses$")
	public void verifyTheUserIsAbleToViewTheDeleteButtonIfTheUserHasAPermissionToDeleteLicenses() {
		Assert.assertTrue(licenseGridPage.verifyTheUserIsAbleToViewTheDeleteButtonIfTheUserHasAPermissionToDeleteLicenses(driver));
	}
	
	@And("^I see the user is redirection to the license grid and verify the newly edited license is listed in the license grid with the newly edited values$")
	public void verifyRedirectionToTheLicenseGridAndVerifyTheNewlyEditedLicenseIsListedInTheLicenseGridWithTheNewlyEditedValues() {
		licenseGridPage.verifyRedirectionToTheLicenseGridAndVerifyTheNewlyEditedLicenseIsListedInTheLicenseGridWithTheNewlyEditedValues(driver);
	}
	
	@And("^I see the editing a license is successful$")
	public void verifyEditingALicenseIsSuccessful() {
		Assert.assertTrue(licenseGridPage.verifyEditingALicenseIsSuccessful(driver));
	}
	
	@Then("^I see label showing xx of xx entries$")
	public void verifyEntriesIsShowingForLicenseslabel() {
		Assert.assertTrue(licenseGridPage.verifyEntriesIsShowingForLicensesLibel(driver));
	}
	
	@Then("^I enter value in license name search filter$")
	public void enterValueInLicenseNameSearch() {
		licenseGridPage.enterValueInLicenseNameSearch(driver);
	}
	
	@And("^I click on reset page filters link$")
	public void clickOnResetPageFiltersLink() {
		licenseGridPage.clickOnResetPageFiltersLink(driver);
	}
	
	@Then("^I see the reset filter works in the licenses grid$")
	public void verifyResetFilterWorksInTheLicensesGrid() {
		Assert.assertTrue(licenseGridPage.verifyResetFilterWorksInTheLicensesGrid(driver));
	}
	
	@Then("^I select value from clint Filter$")
	public void selectValueFromClintFilter() {
		licenseGridPage.selectValueFromClintFilter(driver);
	}
	
	@And("^I see the callLog popoup titel$")
	public void verifyCallLogPopoupTitel() {
		Assert.assertTrue(licenseGridPage.verifyCallLogPopoupTitel(driver));
	}
	
	@Then("^I see the add call log button$")
	public void verifyAddCallLogButton() {
		Assert.assertTrue(licenseGridPage.verifyAddCallLogButton(driver));
	}
	
	@And("^I see the call log popoup close X icon button$")
	public void verifyCallLogPopoupCloseXIconButton() {
		Assert.assertTrue(licenseGridPage.verifyCallLogPopoupCloseXIconButton(driver));
	}
	
	@And("^I see the call log popoup entries$")
	public void verifyCallLogPopoupcallLogListEntries() {
		Assert.assertTrue(licenseGridPage.verifyCallLogPopoupcallLogListEntries(driver));
	}
	
	@And("^I see the call log popoup global search$")
	public void verifyCallLogLogPopoupGlobalSearch() {
		Assert.assertTrue(licenseGridPage.verifyCallLogLogPopoupGlobalSearch(driver));
	}
	
	@Then("^I double click on existing call log entries and user is allowed to view call log entries$")
	public void doubleClickOnExistingCallLogEntriesAndUserIsAllowedToViewCallLogEntries() {
		Assert.assertTrue(licenseGridPage.doubleClickOnExistingCallLogEntriesAndUserIsAllowedToViewCallLogEntries(driver));
	}
	
	@Then("^I see the client and facility fields are not editable$")
	public void verifyClientFacilityAreNotEditable() {
		Assert.assertTrue(licenseGridPage.verifyClientFacilityAreNotEditable(driver));
	}
	
	@And("^I see the type and date fields are mandatory$")
	public void verifyTypeAndDateFieldsAreMandatory() {
		Assert.assertTrue(licenseGridPage.verifyTypeAndDateFieldsAreMandatory(driver));
	}
	
	@Then("^I click on save button and verify the modified values saved successfully$")
	public void clickOnSaveButtonVerifyTheModifiedValuesSavedSuccessfully() {
		Assert.assertTrue(licenseGridPage.clickOnSaveButtonVerifyTheModifiedValuesSavedSuccessfully(driver));
	}
	
	@Then("^I click on communication log button$")
	public void clickOnCommunicationLogButton() {
		licenseGridPage.clickOnCommunicationLogButton(driver);
	}
	
	
	@Then("^I click on save button and verify the new entries are listed in the existing communication logs grid$")
	public void clickOnSaveButtonVerifyTheNewEntriesAreListedInTheExistingCommunicationLogsGrid() {
		Assert.assertTrue(licenseGridPage.clickOnSaveButtonVerifyTheNewEntriesAreListedInTheExistingCommunicationLogsGrid(driver));
	}
	
	@And("^I click on Add call Log button$")
	public void clickOnCallLogPopoupAddCallLogButton() {
		licenseGridPage.clickOnCallLogPopoupAddCallLogButton(driver);
	}
	
	
	@Then("^I select incomplete only from license progress dropdown$")
	public void selectIncompleteOnlyFromLicenseProgressDropdown() {
		licenseGridPage.selectIncompleteOnlyFromLicenseProgressDropdown(driver);
	}
	
	@Then("^I select all from license progress dropdown$")
	public void selectAllFromLicenseProgressDropdown() {
		licenseGridPage.selectAllFromLicenseProgressDropdown(driver);
	}
	
	@Then("^I select complete only from license progress dropdown$")
	public void selectCompleteOnlyFromLicenseProgressDropdown() {
		licenseGridPage.selectCompleteOnlyFromLicenseProgressDropdown(driver);
	}
	
	@And("^I see the licenses activities are filtered based on the chosen license progress incomplete only$")
	public void verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressIncompleteOnly() {
		Assert.assertTrue(licenseGridPage.verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressIncompleteOnly(driver));
	}
	
	@Then("^I see the licenses activities are filtered based on the chosen license progress complete only$")
	public void verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressCompleteOnly() {
		Assert.assertTrue(licenseGridPage.verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressCompleteOnly(driver));
	}
	
	@Then("^I see the licenses activities are filtered based on the chosen license progress all$")
	public void verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressAll() {
		Assert.assertTrue(licenseGridPage.verifyLicensesActivitiesAreFilteredBasedOnTheChosenLicenseProgressAll(driver));
	}
	
	@Then("^I get it activities column name and click on advanced filters$")
	public void getActivitiesTitel() {
		licenseGridPage.getActivitiesTitel(driver);
	}
	
	@Then("^I see the license with expiration field populated$")
	public void verifyLicenseWithExpirationFieldPopulated() throws InterruptedException {
		Assert.assertTrue(licenseGridPage.verifyLicenseWithExpirationFieldPopulated(driver));
	}
	
	@Then("^I double click on expiration date$")
	public void doubleClickOnExpirationDate() throws InterruptedException {
		licenseGridPage.doubleClickOnExpirationDate(driver);
	}
	
	@Then("^I see the expiry date matches the expiration date noted in the license grid$")
	public void verifyTheExpiryDateMatchesTheExpirationDateNotedInTheLicenseGrid() {
		Assert.assertTrue(licenseGridPage.verifyTheExpiryDateMatchesTheExpirationDateNotedInTheLicenseGrid(driver));
	}
	
	
	
}
