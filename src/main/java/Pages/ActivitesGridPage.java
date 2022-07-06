package Pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import Utils.BaseClass;
import org.junit.Assert;


public class ActivitesGridPage extends BaseClass {
	private WebDriver podriver = null;

	String activitiesGrid = "(//div[@class='mbp'])[3]";
	String companySearch = "(//th[@aria-label='Company: activate to sort column ascending']/following::input)[2]";
	String compMgrSearch = "(//th[@aria-label='Comp.Mgr: activate to sort column ascending']/following::input)[1]";
	String facilitySearch = "(//th[@aria-label='Facility: activate to sort column descending']/following::input)[3]";
	String licenseNameSearch = "(//th[@aria-label='License Name: activate to sort column ascending']/following::input)[4]";
	String licenseSearch = "(//th[@aria-label='License #: activate to sort column ascending']/following::input)[5]";
	String stateSearch = "(//th[@aria-label='State: activate to sort column ascending']/following::input)[6]";
	String statusSearch = "(//th[@aria-label='Status: activate to sort column ascending']/following::input)[8]";
	String activitySearch = "(//th[@aria-label='Activity: activate to sort column ascending']/following::input)[12]";
	String progressSearch = "(//th[@aria-label='Progress: activate to sort column ascending']/following::input)[13]";
	String goToTasksButton = "(//*[@title='Go To Tasks'])[1] | (//span[@data-toggle='tooltip'])[1]";
	String addActivityButton = "//button[@id='addActivity'] | //button[@data-original-title='Add License Activity']";
	String licenseProgressFilterDropdown = "//select[@id='incomplete'] | //select[@name='incomplete']";
	String urlIconLicense = "( //a[contains(@href,'https://')  and contains(@target,'_blank')])[2]";
	String loadingPleaseWait = "//div[@class='col text-center company']";
	String addActivityBtn = "//button[@id='addActivity']";
	String activeLicensData = "(//*[@title='Go To Tasks']/ancestor::td/../td)[3]/..";
	String editLicenseCompanyDropDown = "//select[@id='CompanyKey']";
	String editLicenseFacilityDropDown = "//select[@id='FacilityKeyPair']";
	String editLicenseStatesDropDown = "//select[@id='StatesKey']";
	String editLicenseActivityKeyDropDown = "//select[@id='LicenseActivityKey']";
	String editLicenseLicenseStatusDropDown = "//select[@id='LicenseStatusMasterKey']";
	String editLicenseStatusDropDown = "//select[@id='LicenseStatusMasterKey']";
	String editLicenseActivityPageTitel = "//div[@class='modal-header head-back'] | //p[contains(text(),'License Details - Edit Activity')]";
	String ActivityStartDateTxt = "//input[@id='ActivityStartDate']";
	
	
	
	
	
	int licenseDetailsCount = 0;
	String fileNameOnQueue = "";
	String clientSelected = "";
	String companySelected = "";
	String facilitySelected = "";
	int licenseCountBefore = 0;
	int expireKpiValue;
	HashMap<String, String> licenseDetials = new HashMap<String, String>();
	ArrayList<String> gridDataList = new ArrayList<String>();
	ArrayList<String> gridDataPDFUploadList = new ArrayList<String>();
	ArrayList<String> activeLicensDataList = new ArrayList<String>();
	String filepath = filePath + "TestSample.pdf";

	public ActivitesGridPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public Boolean verifyActivitiesGridUnderlineColorYellow(WebDriver driver) {
		String yellowColor = "#feb62b";
		WebElement element = driver.findElement(By.xpath(activitiesGrid));
		String colorBdr = element.getCssValue("border-bottom-color");
		System.out.println("color Bdr: " + colorBdr);
		String getYellowColor = Color.fromString(colorBdr).asHex().trim();
		System.out.println("color Bdr: " + getYellowColor);
		if (getYellowColor.equalsIgnoreCase(getYellowColor)) {
			System.out.println("color True: " + getYellowColor);
			return true;
		} else {
			System.out.println("color False: " + getYellowColor);
			return false;
		}
	}
	
	public Boolean verifyColumnSearchForEachColumnInTheActivitiesGrid(WebDriver driver) {
		try {
			waitForElementVisibility(compMgrSearch, "30", driver);
			System.out.println("compMgrSearch: ");

			waitForElementVisibility(companySearch, "30", driver);
			System.out.println("companySearch: ");

			waitForElementVisibility(facilitySearch, "30", driver);
			System.out.println("facilitySearch: ");

			waitForElementVisibility(stateSearch, "30", driver);
			System.out.println("stateSearch: ");

			waitForElementVisibility(licenseNameSearch, "30", driver);
			System.out.println("licenseNameSearch: ");

			waitForElementVisibility(licenseSearch, "30", driver);
			System.out.println("licenseSearch: ");

			waitForElementVisibility(statusSearch, "30", driver);
			System.out.println("statusSearch: ");
			
			waitForElementVisibility(activitySearch, "30", driver);
			System.out.println("activitySearch: ");

			waitForElementVisibility(progressSearch, "30", driver);
			System.out.println("progressSearch: ");			

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyGoToTasksButton(WebDriver driver) {
		try {
			waitForElementVisibility(goToTasksButton, "30", driver);
			System.out.println("goTo Tasks Button : ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyAddActivityButton(WebDriver driver) {
		try {
			waitForElementVisibility(addActivityButton, "30", driver);
			System.out.println("Add Activity Button : ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyLicenseProgressFilterDefaultDropdownValueSectionShouldBeIncompleteOnly(WebDriver driver) {
		try {
			Select select = new Select(driver.findElement(By.xpath(licenseProgressFilterDropdown)));
			WebElement option = select.getFirstSelectedOption();
			String defaultItem = option.getText().trim();
			Assert.assertTrue((defaultItem.equals("Incomplete only")));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnUrlIconActivities(WebDriver driver) {
		waitTime(7000);
		waitForElementVisibility(urlIconLicense, "30", driver);
		
		click(urlIconLicense, driver);
	}
	
	public void clickOnAddActivityButton(WebDriver driver) {
		waitForElementVisibility(addActivityBtn, "30", driver);
		click(addActivityBtn, driver);
	}
	

	public boolean verifyTheActivitiesUrlOpensAndLoadsSuccessfullyIfTheUrlIsValid(WebDriver driver) {

		try {

			shiftWindowHandle(1);

			String titleText = driver.getTitle();
			System.out.println("Page title is : " + titleText);
			boolean equal = (titleText.equals(titleText));
			Assert.assertTrue(equal);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void doubleClickOnActivelicensToEdit(WebDriver driver) {
		waitTime(6000);
		for (int i = 2; i < 8; i++) {
			if (i == 4 || i == 6) {
				i += 1;
				System.out.println(i);
			}
			WebElement data = driver
					.findElement(By.xpath("(//*[@title='Go To Tasks']/ancestor::td/../td)[" + i + "]"));
			scrollIntoViewSmoothly(data, driver);
			String getData = getValue(data, driver);
			activeLicensDataList.add(getData);
		}
		scrollToElement(activeLicensData, driver);
		doubleClick(activeLicensData, driver);
	}
	
	public Boolean verifyInTheEditActivitySectionTheFollowingFieldsAreMandatoryAndNonEditableCompanyFacilityStateLicenseStatus(WebDriver driver) {
		try {
			Assert.assertFalse("Verify Company DropDown is Disabeld", isDisabeld(editLicenseCompanyDropDown, driver));

			Assert.assertFalse("Verify Facility DropDown is Disabeld", isDisabeld(editLicenseFacilityDropDown, driver));

			Assert.assertFalse("Verify Facility DropDown is Disabeld", isDisabeld(editLicenseStatesDropDown, driver));
			
			Assert.assertFalse("Verify Facility DropDown is Disabeld", isDisabeld(editLicenseStatusDropDown, driver));

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyInTheAddActivitySectionTheFollowingFieldsAreMandatoryAndEditableLicenseActivityAndActivityStartDate(WebDriver driver) {
		try {
			Select activityKeyDropdown = new Select(driver.findElement(By.xpath(editLicenseActivityKeyDropDown)));
			WebElement activityKeyOption = activityKeyDropdown.getFirstSelectedOption();
			String activityKeyValueBefore = activityKeyOption.getText();
			activityKeyDropdown.selectByIndex(1);
			activityKeyOption = activityKeyDropdown.getFirstSelectedOption();
			String activityKeyValueAfter = activityKeyOption.getText();
			Assert.assertFalse("Verify activityKey DropDown is Editable",
					activityKeyValueAfter.equals(activityKeyValueBefore));

			
			waitForElementVisibility(ActivityStartDateTxt, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyEditLicenseActivityPageTitel(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(editLicenseActivityPageTitel, "20", driver);
			System.out.println("editLicensePageTitel: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
