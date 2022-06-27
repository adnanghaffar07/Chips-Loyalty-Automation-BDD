package StepDefinations;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import Constants.Constants;
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

public class DashboardSteps extends BaseClass {

	LoginPage loginPage = new LoginPage(driver);
	DashboardPage dashboardPage = new DashboardPage(driver);
	public Constants loginconstant;
	@And("^I see dashboard grid$")
	public void verifyDashboardGrid() {
		Assert.assertTrue(dashboardPage.verifyDashboardGrid(driver));
	}
	
	@And("^I see licenses grid$")
	public void verifyLicensesGrid() {
		Assert.assertTrue(dashboardPage.verifyLicensesGrid(driver));
	}
	
	@And("^I see activities grid$")
	public void verifyActivitiesGrid() {
		Assert.assertTrue(dashboardPage.verifyActivitiesGrid(driver));
	}
	
	@And("^I see tasks grid$")
	public void verifyTasksGrid() {
		Assert.assertTrue(dashboardPage.verifyTasksGrid(driver));
	}
	
	@And("^I see documents grid$")
	public void verifyDocumentsGrid() {
		Assert.assertTrue(dashboardPage.verifyDocumentsGrid(driver));
	}
	
	@And("^I see dashboard grid underline color is yellow$")
	public void verifyDashboardGridUnderlineColorYellow() {
		Assert.assertTrue(dashboardPage.verifyDashboardGridUnderlineColorYellow(driver));
	}

	@And("^I see filter by Label$")
	public void verifyFilterByLabel() {
		Assert.assertTrue(dashboardPage.verifyFilterByLabel(driver));
	}
	
	@And("^I see reset filter Label$")
	public void verifyResetFilterLabel() {
		Assert.assertTrue(dashboardPage.verifyResetFilterLabel(driver));
	}
	
	@And("^I see upcoming renewals Label$")
	public void verifyUpcomingRenewalsLabel() {
		Assert.assertTrue(dashboardPage.verifyUpcomingRenewalsLabel(driver));
	}
	
	@And("^I see expiring documents Label$")
	public void verifyExpiringDocumentsLabel() {
		Assert.assertTrue(dashboardPage.verifyExpiringDocumentsLabel(driver));
	}

	@And("^I see tasks Label$")
	public void verifyTasksLabel() {
		Assert.assertTrue(dashboardPage.verifyTasksLabel(driver));
	}
	
	@And("^I see license details Label$")
	public void verifyLicenseDetailsLabel() {
		Assert.assertTrue(dashboardPage.verifyLicenseDetailsLabel(driver));
	}
	
	@And("^I select client in filter$")
	public void selectClient() {

		dashboardPage.selectClient(driver);
	}
	
	@Then("^I see client filter related data in license details table$")
	public void verifyClientLicenseDetals() {
		Assert.assertTrue(dashboardPage.verifyClientLicenseDetals(driver));
	}
	
	@And("^I select company in filter$")
	public void selectCompany() {
		dashboardPage.selectCompany(driver);
	}
	
	@Then("^I see company filter related data in license details table$")
	public void verifyCompanyLicenseDetals() {
		Assert.assertTrue(dashboardPage.verifyCompanyLicenseDetals(driver));
	}
	
	@And("^I select facility in filter$")
	public void selectFacility() {
		dashboardPage.selectFacility(driver);
	}
	
	@Then("^I see facility filter related data in license details table$")
	public void verifyFacilityLicenseDetals() {
		Assert.assertTrue(dashboardPage.verifyFacilityLicenseDetals(driver));
	}
	
	@And("^I select the Reset Filter$")
	public void selectResetFacility() {
		dashboardPage.clickOnresetFilter(driver);
	}
	@And("^I see License Count reset$")
	public void verifyLicenseCountReset() {
		Assert.assertTrue(dashboardPage.getLicenseCountText(driver));
	}
	
	@And("^I see License Details reset$")
	public void verifyLicenseDetailsReset() {
		Assert.assertTrue(dashboardPage.verifyLicenseDetailsCountChanged(driver));
	}

	@Then("^I click on licenses grid$")
	public void clickOnclickOnLicensesGrid() {
		dashboardPage.clickOnLicensesGrid(driver);
	}
	
	@And("^I see license Page Title$")
	public void verifyLicencePageTitle() {
		Assert.assertTrue(dashboardPage.verifyLicencePageTitle(driver));
	}
	
	@Then("^I click on activities grid$")
	public void clickOnActivitiesGrid() {
		dashboardPage.clickOnActivitiesGrid(driver);
	}
	
	@And("^I see activities page title$")
	public void verifyActivitiesPageTitle() {
		Assert.assertTrue(dashboardPage.verifyActivitiesPageTitle(driver));
	}
	
	@Then("^I click on tasks grid$")
	public void clickOnTasksGrid() {
		dashboardPage.clickOnTasksGrid(driver);
	}
	
	@And("^I see tasks page title$")
	public void verifyTasksPageTitle() {
		Assert.assertTrue(dashboardPage.verifyTasksPageTitle(driver));
	}
	
	@Then("^I click on documents grid$")
	public void clickOnDocumentsGrid() {
		dashboardPage.clickOnDocumentsGrid(driver);
	}
	
	@And("^I see documents page title$")
	public void verifyDocumentsPageTitle() {
		Assert.assertTrue(dashboardPage.verifyDocumentsPageTitle(driver));
	}
	
	@Then("^I click on dashboard grid$")
	public void clickOnDashboardGrid() {
		dashboardPage.clickOnDashboardGrid(driver);
	}
	
	@And("^I see dashboard page title$")
	public void verifyDashboardPageTitle() {
		Assert.assertTrue(dashboardPage.verifyDashboardPageTitle(driver));
	}
	
	@And("^I see client label and default value all$")
	public void verifyClientLabelAndDefaultAll() {
		dashboardPage.verifyClientLabelAndDefaultAll(driver);
	}
	
	@And("^I see company label and default value all$")
	public void verifyCompanyLabelAndDefaultAll() {
		dashboardPage.verifyCompanyLabelAndDefaultAll(driver);
	}
	
	@And("^I see facility label and default value all$")
	public void verifyFacilityLabelAndDefaultAll() {
		dashboardPage.verifyFacilityLabelAndDefaultAll(driver);
	}
	
	@Then("^I see grid available on toolbar and showing correct data in each visual$")
	public void verifyGridAvailableOnToolbarAndShowingCorrectDataInEachVisual() {
		dashboardPage.verifyGridAvailableOnToolbarAndShowingCorrectDataInEachVisual(driver);
	}
	
	@And("^I see USA map$")
	public void verifyUSAMap() {
		Assert.assertTrue(dashboardPage.verifyUSAMap(driver));
	}
	
	@Then("^I double click on license detials$")
	public void doubleClickLicenseDetials() {
		dashboardPage.doubleClickLicenseDetials(driver);
	}
	
	@Then("^I see license detials data on license page$")
	public void verifyLicenseDetialsDataOnLicensePage() {
		dashboardPage.verifyLicenseDetialsDataOnLicensePage(driver);
	}
	
	@Then("^I double click on kpi task all incomplete option$")
	public void doubleClickOnKpiTaskAllIncompleteOption() {
		dashboardPage.doubleClickOnKpiTaskAllIncompleteOption(driver);
	}
	
	
	@Then("^I see only the incomplete licenses for the selected global filter values should be shown in the grid$")
	public void verifyOnlyTheIncompleteLicensesForTheSelectedGlobalFilterValuesShouldBeShownInTheGrid() {
		dashboardPage.verifyOnlyTheIncompleteLicensesForTheSelectedGlobalFilterValuesShouldBeShownInTheGrid(driver);
	}

	@Then("^I select client from filter options and verify expiring document on kpi$")
	public void selectClientFromFilterOptionsAndVerifyExpiringDocumentOnKPI() {
		Assert.assertTrue(dashboardPage.selectClientFromFilterOptionsAndVerifyExpiringDocumentOnKPI(driver));
		
	}
	
	@Then("^I double click on kpi expiring documents expired option$")
	public void doubleClickOnKpiExpiringDocumentsExpiredOption() {
		dashboardPage.doubleClickOnKpiExpiringDocumentsExpiredOption(driver);
	}
	
	@And("^I see only the expiring licenses on document grid$")
	public void verifyOnlyExpiringLicensesOnDocumentGrid() {
		Assert.assertTrue(dashboardPage.verifyOnlyExpiringLicensesOnDocumentGrid(driver));
		
	}
	
	@Then("^I see Number of rows in the grid should match the kpi value in the dashboard$")
	public void verifyNoOfRowsInTheGridShouldMatchTheKPIValueInTheDashboard() {
		Assert.assertTrue(dashboardPage.verifyNoOfRowsInTheGridShouldMatchTheKPIValueInTheDashboard(driver));
		
	}

	@Then("^I click on upload license pdf button$")
	public void clickOnUploadLicensePDFButton() {
		dashboardPage.clickOnUploadLicensePDFButton(driver);
	}
	
	@Then("^I choose file to upload$")
	public void uploadfile() throws InterruptedException {
		dashboardPage.uploadfile(driver);
	}
	
	@And("^I see pdf file success popup$")
	public void verifyPdfFileSuccessPopup() {
		Assert.assertTrue(dashboardPage.verifyPdfFileSuccessPopup(driver));
	}
	
	@Then("^I click on pdf file success popup ok button$")
	public void clickOnPdfFileSuccessPopupOkButton() {
		dashboardPage.clickOnPdfFileSuccessPopupOkButton(driver);
	}
	
	@Then("^I click on save button$")
	public void clickOnSaveButton() {
		dashboardPage.clickOnSaveButton(driver);
	}
	
	@And("^I click on view icon and see pdf file$")
	public void verifyTheUserIsAbleToViewThePDF() {
		dashboardPage.verifyTheUserIsAbleToViewThePDF(driver);
	}
	
	
	
	
	
	
	
}
