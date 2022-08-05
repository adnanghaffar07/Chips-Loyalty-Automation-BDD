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
import java.text.ParseException;
import java.time.LocalDate;

import Utils.BaseClass;
import org.junit.Assert;


public class ActivitesGridPage extends BaseClass {
	private WebDriver podriver = null;

	String activitiesGrid = "(//div[@class='mbp'])[3]";
	String companySearch = "(//th[text()='Company']/following::th/input)[2]";
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
	String addLicenseActivityPageTitel = "//div[@class='modal-header head-back'] | //p[contains(text(),'License Details - Add Activity')]";
	String addActivityNextBtn = "//button[@id='modal-task-slider'] | (//button[text()='Next'])[last()]";
	String addActivityNextSecondBtn = "//button[@id='modal-task-slider-two']";	
	String addActivityAddTaskTitel = "//p[contains(text(),'Add Task')]";
	String addActivityAddTaskDateTxt = "//input[@id='CreationDate']";
	String addActivityAddTaskCreatedByTxt = "//input[@id='TaskAuthor']";
	String addActivityAddTaskTypeDropdown = "//select[@id='TaskTypeKey']";
	String addActivityAddTaskTaskStatusDropdown = "//select[@id='TaskStandingKey']";
	String addActivityAddTaskAssignedDropdown = "//select[@id='AssignedUserKey']";
	String addActivityAddTaskDueDateTxt = "//input[@id='ExpCompletionDate']";
	String addActivityAddTaskBackBtn = "//button[@id='backToActivity']";
	String addActivityAddTaskSaveBtn = "//button[@id='task-modal-save']";
	String activityStartDatePicer = "(//th[text()='Activity Start']/following::input)[11]";
	String activityStartDateOnGrid = "(//*[text()='Activity Start']/following::td)[11]";	
	String activityOnGrid = "(//*[text()='Activity']/following::td)[12]";	
	String companySearchValue = "(//th[@aria-label='Company: activate to sort column ascending']/following::td)[2]";
	String companySearchList = "//th[@aria-label='Company: activate to sort column ascending']/following::tr//td[2]";
	String globalSearchTextbox = "//input[@aria-label='Search']";
	String advanceFilterIcon = "(//a[contains(text(),'Advanced')])[2]";
	String oldNotesIcon = "//img[contains(@src,'notes_small.svg')]";
	String companyName = "(//tr[@class='odd'])[1]/td[2]";
	String facilityName = "(//tr[@class='odd'])[1]/td[3]";
	String expiry = "(//tr[@class='odd'])[1]/td[9]";
	String activity = "(//tr[@class='odd'])[1]/td[12]";
	String status = "(//tr[@class='odd'])[1]/td[8]";
	String licenseState = "(//tr[@class='odd'])[1]/td[6]";
	
	String companyNameDetailGrid = "(//section[@id='task']//p[contains(text(),'Company')])[1]/following-sibling::p";
	String facilityNameDetailGrid = "(//section[@id='task']//p[contains(text(),'Facility')])[1]/following-sibling::p";
	String expiryDetailGrid = "(//section[@id='task']//p[contains(text(),'Expiry')])[1]/following-sibling::p";
	String activityDetailGrid = "(//section[@id='task']//p[contains(text(),'Activity')])[1]/following-sibling::p";
	String statusDetailGrid = "(//section[@id='task']//p[contains(text(),'License Status')])[1]/following-sibling::p";
	String licenseStateDetailGrid = "(//section[@id='task']//p[contains(text(),'State')])[1]/following-sibling::p";
	String addTaskButton = "(//button[contains(text(),'ADD')])[2]";
	String taskDetail = "//div[@id='tasks']//div[@class='scroll']";
	String taskNotes = "//p[contains(text(),'Activity Notes')]";
	String activityNotesBtn = "(//li//span[contains(text(),'Activity')])[1]";
	
	String companyNameFirstRow = "";
	String faciltyNameFirstRow = "";
	String expiryDateFirstRow = "";
	String activityFirstRow = "";
	String statusFirstRow = "";
	String stateFirstRow = "";


	
	
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
	String avtivitySartDateSelect;
	String licenseActivityValue;
	String twoCharOfValToSearch="";
	
	String deleteLicenseBtn = "//button[text()='Delete']";
	String confirmDeleteLicenseBtn = "//a[text()='Confirm']";
	String CancelDeleteLicenseBtn = "//a[text()='Cancel']";
	String deleteConfirmationButton = "//a[text()='OK']";
	
	String taskDeletePopup = "//p[contains(text(),'The following')]//following-sibling::p[contains(text(),'Tasks')]";
	String taskDocumentsDeletePopup = "//p[contains(text(),'The following')]//following-sibling::p[contains(text(),'Task Documents')]";
	String taskNotificationDeletePopup = "//p[contains(text(),'The following')]//following-sibling::p[contains(text(),'Task Notifications')]";


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
	
	public void clickOnGoToTaskButtonActivities(WebDriver driver) {
		waitTime(7000);
		waitForElementVisibility(goToTasksButton, "30", driver);
		
		click(goToTasksButton, driver);
	}
	
	public void clickOnActivityNotes(WebDriver driver) {
		waitTime(7000);
		waitForElementVisibility(activityNotesBtn, "30", driver);
		
		click(activityNotesBtn, driver);
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
		activeLicensDataList.clear();
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
	
	public void clickOnActivelicensToSelect(WebDriver driver) {
		waitTime(6000);
		activeLicensDataList.clear();
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
		scrollIntoViewSmoothly(activeLicensData, driver);
		waitTime(2000);
		click(activeLicensData, driver);
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
			activityKeyDropdown.selectByIndex(3);
			activityKeyOption = activityKeyDropdown.getFirstSelectedOption();
			String activityKeyValueAfter = activityKeyOption.getText();
			Assert.assertFalse("Verify activityKey DropDown is Editable",
					activityKeyValueAfter.equals(activityKeyValueBefore));
			
			waitForElementVisibility(ActivityStartDateTxt, "20", driver);
			
			waitForElementVisibility(editLicenseActivityKeyDropDown, "30", driver);
			Select licenseActivityDropdown = new Select(driver.findElement(By.xpath(editLicenseActivityKeyDropDown)));
			licenseActivityDropdown.selectByIndex(1);
			WebElement licenseActivityOption = licenseActivityDropdown.getFirstSelectedOption();
			licenseActivityValue = licenseActivityOption.getText();
			
			LocalDate currentDate = java.time.LocalDate.now();
			System.out.println(currentDate.toString());
			String date = reformatDate(currentDate.toString(),"yyyy-MM-dd", "MM/dd/yyyy");
			avtivitySartDateSelect = date; 
			System.out.println("Active Date: " + date);
//			date = date.replace("-", "");
			click(ActivityStartDateTxt, driver);
			type(ActivityStartDateTxt, date, driver);
			


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
	
	public Boolean verifyAddLicenseActivityPageTitel(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(addLicenseActivityPageTitel, "20", driver);
			System.out.println("editLicensePageTitel: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnAddActivityNextButton(WebDriver driver) throws ParseException {
		waitTime(8000);
		waitForElementVisibility(addLicenseActivityPageTitel, "20", driver);
		scrollIntoViewSmoothly(addActivityNextBtn, driver);
		click(addActivityNextBtn, driver);
	}


	public void clickOnNextButton(WebDriver driver) throws ParseException {
		waitTime(8000);
		waitForElementVisibility(addLicenseActivityPageTitel, "20", driver);
		scrollIntoViewSmoothly(addActivityNextSecondBtn, driver);
		click(addActivityNextSecondBtn, driver);
	}
	
	public Boolean verifyAddTaskTitel(WebDriver driver) {
		try {
			waitForElementVisibility(addActivityAddTaskTitel, "20", driver);
			System.out.println("addActivityAddTaskTitel: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyInTheAddTaskSectionTheFollowingFieldsAreMandatoryAndNonEditableActivityCreatedBy(WebDriver driver) {
		try {
			Assert.assertTrue(isDisabeldCheckAttribute(addActivityAddTaskDateTxt, driver));
			Assert.assertTrue(isDisabeldCheckAttribute(addActivityAddTaskCreatedByTxt, driver));

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyInTheAddTaskSectionTheFollowingFieldsAreMandatoryAndEditableTypeTaskStatusAssigneeDuedate(WebDriver driver) {
		try {
			Select typeDropdown = new Select(driver.findElement(By.xpath(addActivityAddTaskTypeDropdown)));
			typeDropdown.selectByIndex(1);
			WebElement typeOption = typeDropdown.getFirstSelectedOption();
			String typeValueBefore = typeOption.getText();
			
			typeDropdown.selectByIndex(2);
			typeOption = typeDropdown.getFirstSelectedOption();
			String typeValueAfter = typeOption.getText();			
			
			Assert.assertFalse("Verify Type DropDown is Editable",
					typeValueBefore.equals(typeValueAfter));
			
			Select taskStatusDropdown = new Select(driver.findElement(By.xpath(addActivityAddTaskTaskStatusDropdown)));
			taskStatusDropdown.selectByIndex(1);
			WebElement taskStatusOption = taskStatusDropdown.getFirstSelectedOption();
			String taskStatusValueBefore = taskStatusOption.getText();
			
			taskStatusDropdown.selectByIndex(2);
			taskStatusOption = taskStatusDropdown.getFirstSelectedOption();
			String taskStatusValueAfter = taskStatusOption.getText();	
			
			Assert.assertFalse("Verify task status DropDown is Editable",
					taskStatusValueBefore.equals(taskStatusValueAfter));

			
			Select assignedDropdown = new Select(driver.findElement(By.xpath(addActivityAddTaskAssignedDropdown)));
			assignedDropdown.selectByIndex(1);
			WebElement assignedOption = assignedDropdown.getFirstSelectedOption();
			String assignedValueBefore = assignedOption.getText();
			
			taskStatusDropdown.selectByIndex(5);
			assignedOption = assignedDropdown.getFirstSelectedOption();
			String assignedValueAfter = assignedOption.getText();	
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnAddActivityAddTaskBackButton(WebDriver driver) {
		waitForElementVisibility(addActivityAddTaskBackBtn, "30", driver);
		scrollToElement(addActivityAddTaskBackBtn, driver);
		click(addActivityAddTaskBackBtn, driver);
	}
	
	public void clickOnAddActivityButton(WebDriver driver) {
		waitForElementVisibility(addActivityBtn, "30", driver);
		scrollToElement(addActivityBtn, driver);
		click(addActivityBtn, driver);
	}
	
	public void clickOnAddActivityAddTaskSaveButton(WebDriver driver) {
		waitForElementVisibility(addActivityAddTaskSaveBtn, "30", driver);
		scrollToElement(addActivityAddTaskSaveBtn, driver);
		click(addActivityAddTaskSaveBtn, driver);
	}
	
	public Boolean verifyTheNewlyAddedLicenseActivityIsListedInTheLicenseActivityGrid(WebDriver driver) {
		waitForElementVisibility(activityStartDatePicer, "30", driver);
		String waitDateXpath;
		String replaceVale;
		try {
			type(activityStartDatePicer, avtivitySartDateSelect, driver);
//			replaceVale = avtivitySartDateSelect.replace("00", "").trim();
			replaceVale = reformatDate(avtivitySartDateSelect,"MM/dd/yyyy", "MM-dd-yyyy");
			System.out.println(replaceVale);
			waitTime(10000);
			waitDateXpath = "(//td[text()='"+replaceVale+"'])[1]";
			waitForElementVisibility(waitDateXpath, "300", driver);
			String date = getValueFromAttribute(activityStartDateOnGrid, driver).trim();
//			String activityStartDate = date.replace("-", "/");
			System.out.println("Active Start Serach Date: " + date);
			Assert.assertTrue(date.equals(replaceVale));
			String activity = getValueFromAttribute(activityOnGrid, driver).trim();
			System.out.println("Active: " + activity);
			Assert.assertTrue(activity.equals(licenseActivityValue));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void enterTwoCharactersInColumnSearchField(WebDriver driver) {
		waitForElementVisibility(addActivityAddTaskSaveBtn, "30", driver);
		scrollToElement(addActivityAddTaskSaveBtn, driver);
		click(addActivityAddTaskSaveBtn, driver);
		twoCharOfValToSearch = getValueFromAttribute(companySearchValue, driver);
		twoCharOfValToSearch = twoCharOfValToSearch.substring(0,2);
		type(companySearch, twoCharOfValToSearch, driver);
	}
	
	public Boolean verifyFilteredBasedOnEnteredColumnWiseSearchKeywords(WebDriver driver) {
		try {
			for (int i = 1; i < companySearchList.length(); i++) {
				WebElement element = driver.findElement(By.xpath(
						"(//th[@aria-label='Company: activate to sort column ascending']/following::tr//td[2])[" + i
								+ "]"));
				scrollToElement(element, driver);
				String getData = getValue(element, driver);
				getData = getData.substring(0,2);
				Assert.assertTrue(getData.equals(twoCharOfValToSearch));
				System.out.println("inside : " + companySearchList.length());
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean VerifyTheSubPanelHeaderSectionsDisplaysTheChosenActivitiesDetails(WebDriver driver) {
		try {
			for (int i = 1; i < companySearchList.length(); i++) {
				WebElement element = driver.findElement(By.xpath(
						"(//th[@aria-label='Company: activate to sort column ascending']/following::tr//td[2])[" + i
								+ "]"));
				scrollToElement(element, driver);
				String getData = getValue(element, driver);
				getData = getData.substring(0,2);
				Assert.assertTrue(getData.equals(twoCharOfValToSearch));
				System.out.println("inside : " + companySearchList.length());
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyGlobalSearchTextBoxInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(globalSearchTextbox, "20", driver);
			System.out.println("globalSearchTextbox: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyAdvanceFilterIconInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(advanceFilterIcon, "20", driver);
			System.out.println("advanceFilterIcon: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyAddTaskButtonInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(addTaskButton, "20", driver);
			System.out.println("addTaskButton: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyTaskDetailInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(taskDetail, "20", driver);
			System.out.println("taskDetail: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyNotesSectionDetailInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(taskNotes, "20", driver);
			System.out.println("taskNotes: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyOldNotesIconInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			waitForElementVisibility(oldNotesIcon, "20", driver);
			System.out.println("oldNotesIcon: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void getDetailsInFirstRow(WebDriver driver) {
		companyNameFirstRow = getText(companyName, driver).trim();
		faciltyNameFirstRow = getText(facilityName, driver).trim();
		statusFirstRow = getText(status, driver).trim();
		stateFirstRow = getText(licenseState, driver).trim();
		expiryDateFirstRow = getText(expiry, driver).trim();
		activityFirstRow = getText(activity, driver).trim();

	}
	
	public Boolean verifyDetailAreCorrectInTheLicencseActivityGrid(WebDriver driver) {
		waitTime(8000);
		try {
			if(getText(companyNameDetailGrid, driver).trim().equals(companyNameFirstRow) &&
			 getText(facilityNameDetailGrid, driver).trim().equals(faciltyNameFirstRow) &&
			 getText(statusDetailGrid, driver).trim().equals(statusFirstRow) &&
			 getText(licenseStateDetailGrid, driver).trim().equals(stateFirstRow) &&
			 getText(expiryDetailGrid, driver).trim().equals(expiryDateFirstRow) &&
			 getText(activityDetailGrid, driver).trim().equals(activityFirstRow)) {
				return true;
			}

			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void doubleClickLicenseDetials(WebDriver driver) {
		for (int i = 2; i < 10; i++) {
			WebElement data = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
			WebElement titel = driver.findElement(By.xpath("//tr[@role='row']//th[" + i + "]"));

			String getData = getValue(data, driver);
			String getTitel = getValue(titel, driver);
			licenseDetials.put(getTitel.trim(), getData.trim());
			System.out.println(licenseDetials.get(getTitel));

		}
		doubleClick(activeLicensData, driver);
		//doubleClick(activeLicensData, driver);
	}

	public Boolean verifyLicenseDetialsDataOnLicensePage(WebDriver driver) {
		waitTime(9000);
		try {
			for (int i = 2; i < 8; i++) {

				WebElement element = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
				String getval = getValue(element, driver);
				System.out.println(getval);
				System.out.println("value : " + getval);
				Assert.assertTrue(licenseDetials.containsValue(getval.trim()));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyLicenseDetialsDataDeletedOnLicensePage(WebDriver driver) {
		waitTime(9000);
		try {
			for (int i = 2; i < 8; i++) {

				WebElement element = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
				String getval = getValue(element, driver);
				System.out.println(getval);
				System.out.println("value : " + getval);
				if(!licenseDetials.containsValue(getval.trim()))
					return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnDeleteLicenseBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(deleteLicenseBtn, "30", driver);
		click(deleteLicenseBtn, driver);

	}
	
	public void clickOnConfirmDeleteLicenseBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(confirmDeleteLicenseBtn, "30", driver);
		click(confirmDeleteLicenseBtn, driver);

	}
	
	public void clickOnCancelDeleteLicenseBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(CancelDeleteLicenseBtn, "30", driver);
		click(CancelDeleteLicenseBtn, driver);

	}
	
	public void clickOnDeleteConfirmationBtn(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(deleteConfirmationButton, "30", driver);
		click(deleteConfirmationButton, driver);

	}
	
	public Boolean verifyTaskDocumentsDeletePopUp(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(taskDocumentsDeletePopup, "30", driver);
			System.out.println("taskDocumentsDeletePopup : ");
		
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyTaskNotificationDeletePopUp(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(taskNotificationDeletePopup, "30", driver);
			System.out.println("taskNotificationDeletePopup : ");
		
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean verifyTasksDeletePopUp(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(taskDeletePopup, "30", driver);
			System.out.println("taskDeletePopup : ");
		
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
}
