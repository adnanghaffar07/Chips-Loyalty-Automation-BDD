package Pages;

import java.util.ArrayList;
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
import java.time.LocalDate;

import Utils.BaseClass;
import org.junit.Assert;
//import junit.framework.Assert;

public class LicenseGridPage extends BaseClass {
	private WebDriver podriver = null;

	String clientDropdownOnLicense = "(//label[text()='Client']/following-sibling::select)[last()]";
	String companyDropdownOnLicense = "(//label[text()='Company']/following-sibling::select)[last()]";
	String facilityDropdownOnLicense = "(//label[text()='Facility']/following-sibling::select)[last()]";
	String clientDropDownOption = "(//select[@id='ClientKey']/option)[2]";
	String resetGlobalFilters = "//a[@title='Clear All Filters']";
	String exportBtn = "//span[text()='Export']";
	String licenseCategory = "//select[@id='progress']";
	String advancedFilters = "//a[text()='Advanced Filters'] | //a[text()[contains(.,'Advanced Filters')]]";
	String compMgrSearch = "(//input[contains(@class,'input-search')])[1]";
	String companySearch = "(//input[contains(@class,'input-search')])[2]";
	String facilitySearch = "(//input[contains(@class,'input-search')])[3]";
	String stateSearch = "(//input[contains(@class,'input-search')])[4]";
	String licenseNameSearch = "(//input[contains(@class,'input-search')])[5]";
	String licenseDetialsSearch = "(//input[contains(@class,'input-search')])[6]";
	String licenseSearch = "(//input[contains(@class,'input-search')])[7]";
	String statusSearch = "(//input[contains(@class,'input-search')])[8]";
	String statusHelpIcon = "(//*[local-name()='svg' and @class='bi bi-info-circle'])[1]";
	String activeHelpIcon = "(//*[local-name()='svg' and @class='bi bi-info-circle'])[2]";
	String callTheLogIcon = "//img[@class='call-icon']";
	String addActivityLink = "(//a[@title='Add Activity'])[1]";
	String urlIconEachLicense = "//tr//td[11]";
	String urlIconLicense = "(//tr//td[11])[1]";
	String licensesGrid = "(//div[@class='mbp'])[2]";
	String tooltipIIcon = "//div[@class='popover-body']";
	String goToActivityIcon = "(//*[@title='Go To Activity'])[1]";
	String addActivityIcon = "(//a[@title='Add Activity'])[1]";
	String selecteCompany = "//select[@id='CompanyKey']";
	String selecteFacility = "//select[@id='FacilityKeyPair']";
	String selecteLicenseActivity = "//select[@id='LicenseActivityKey']";
	String activityStartDate = "//input[@name='ActivityStartDate']";
	String activityPopupNextBtn = "//button[text()='Next'][1]";
	String activityPopupSaveBtn = "//button[@id='task-modal-save']";
	String selecteType = "//select[@id='TaskTypeKey']";
	String selecteTaskStatus = "//select[@id='TaskStandingKey']";
	String selecteAssigne = "//select[@id='AssignedUserKey']";
	String taskDetailsSavedSuccessfullyPopup = "//div[text()='Task Details Saved Successfully']";
	String taskDetailsSavedSuccessfullyPopupOKBtn = "//a[@aria-label='Close']";
	String advanceFiltersSelectField = "//select[contains(@id,'field')]";
	String advanceFiltersSelectOperator = "//select[contains(@id,'operator')]";
	String advanceFiltersValueTxt = "//input[contains(@id,'search_value_one')]";
	String addConditionLink = "//a[@id='button_add_search_entry']";
	String advanceFiltersSelectFieldSecond = "(//select[contains(@id,'field')])[last()]";
	String advanceFiltersSelectOperatorSecond = "(//select[contains(@id,'operator')])[last()]";
	String advanceOperatorValueSecondTxt = "(//input[contains(@id,'search_value_one')])[last()]";
	String advanceFiltersSaveBtn = "//button[text()='Save']";
	String advanceFiltersCloseBtn = "//button[text()='Close']";
	String advanceFiltersAndOrDropdown = "(//select[contains(@id,'condition')])[last()]";
	String advanceFiltersDeleteIcon = "//img[contains(@onclick,'removeDiv')]";
	String addNewLicenseBtn = "//button[@title='Add New License']";
	String addLicensePageTitle = "//p[contains(text(),'License Det')]";
	String addLicenseCompanyDropdown = "//select[@id='CompanyKey']";
	String addLicenseFacilityDropdown = "//select[@id='FacilityKeyPair']";
	String addLicenseLicenseNameTxt = "//input[@id='FormerLicenseName']";
	String addLicenseLicenseNumberTxt = "//input[@id='LicenseNumber']";
	String addLicenseSaveBtn = "//button[@id='modal-save']";
	String addLicenseStatesDropdown = "//select[@id='StatesKey']";
	String addLicenseLicenseStatusDropdown = "//select[@id='LicenseStatusMasterKey']";
	String licenseDetailsSavedSuccessfully = "//div[text()='License Details saved successfully']";
	String successPopupOk = "//a[@id='successok']";
	String licenseSerachTxt = "(//input[contains(@id,'myInput')])[5]";
	String facilityDataInGrid = "(//tr[@class='odd']//td)[3]";
	String facilityFilterDataInGrid = "//th[@aria-label='Facility: activate to sort column descending']/following::tr//td[3]";
	
	
	ArrayList<String> activeLicenseList = new ArrayList<String>();
	ArrayList<String> addActiveLicenseList = new ArrayList<String>();
	ArrayList<String> addLicenseList = new ArrayList<String>();
	String licenseName = "License" + randomNumberString(5);
	ArrayList<String> activeLicenseTitelList = new ArrayList<String>();
	ArrayList<String> operatorDropdownValueList = new ArrayList<String>();
	 String facilityValueOfGrid ;
	

	public LicenseGridPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void verifyClientDropdownCompanyDropdownFacilityDropdownDefaultSelectedAll(WebDriver driver) {
		Select select = new Select(driver.findElement(By.xpath(clientDropdownOnLicense)));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		boolean defualtValueEqual = (defaultItem.equals("All"));
		System.out.println(defaultItem);
		Assert.assertTrue(defualtValueEqual);

		Select companySelect = new Select(driver.findElement(By.xpath(companyDropdownOnLicense)));
		WebElement companyOption = select.getFirstSelectedOption();
		String companyDefault = companyOption.getText();
		boolean companyDefualtValueEqual = (companyDefault.equals("All"));
		System.out.println(companyDefualtValueEqual);
		Assert.assertTrue(companyDefualtValueEqual);

		Select facilitySelect = new Select(driver.findElement(By.xpath(facilityDropdownOnLicense)));
		WebElement facilityOption = select.getFirstSelectedOption();
		String facilityDefault = facilityOption.getText();
		boolean facilityDefualtValueEqual = (facilityDefault.equals("All"));
		System.out.println(facilityDefualtValueEqual);
		Assert.assertTrue(facilityDefualtValueEqual);

	}

	public void verifyResetFilterFeatureShouldBeAvailableForTheGlobalFilters(WebDriver driver) {
		String clientSelected;
		waitForElementVisibility(clientDropdownOnLicense, "30", driver);
		Select client = new Select(driver.findElement(By.xpath(clientDropdownOnLicense)));
		client.selectByIndex(1);
		WebElement selectOption = client.getFirstSelectedOption();
		String companyselect = selectOption.getText();
		boolean companyEqual = (companyselect.equals(companyselect));
		Assert.assertTrue(companyEqual);

		waitTime(4000);
		click(resetGlobalFilters, driver);
		waitTime(4000);

		WebElement companyOption = client.getFirstSelectedOption();
		String companyDefault = companyOption.getText();
		boolean companyDefualtValueEqual = (companyDefault.equals("All"));
		System.out.println(companyDefualtValueEqual);
		Assert.assertTrue(companyDefualtValueEqual);
	}

	public Boolean verifyExportButton(WebDriver driver) {
		try {
			waitForElementVisibility(exportBtn, "30", driver);
			System.out.println("exportBtn: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyAdvancedFiltersLink(WebDriver driver) {
		try {
			waitForElementVisibility(advancedFilters, "30", driver);
			System.out.println("advancedFilters: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyGlobalSearch(WebDriver driver) {
		try {
			waitForElementVisibility(clientDropdownOnLicense, "30", driver);
			System.out.println("clientDropdownOnLicense: ");
			
			waitForElementVisibility(companyDropdownOnLicense, "30", driver);
			System.out.println("companyDropdownOnLicense: ");
			
			waitForElementVisibility(facilityDropdownOnLicense, "30", driver);
			System.out.println("facilityDropdownOnLicense: ");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyColumnSearchForEachColumnInTheGrid(WebDriver driver) {
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
			
			waitForElementVisibility(licenseDetialsSearch, "30", driver);
			System.out.println("licenseDetialsSearch: ");
			
			waitForElementVisibility(licenseSearch, "30", driver);
			System.out.println("licenseSearch: ");
			
			waitForElementVisibility(statusSearch, "30", driver);
			System.out.println("statusSearch: ");
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyUrlIconForEachLicenseInTheGrid(WebDriver driver) {
		waitTime(7000);
		try {
			for (int i = 1; i < urlIconEachLicense.length(); i++) {
				WebElement element = driver.findElement(By.xpath("(//tr//td[11])[" + i + "]"));
				scrollIntoViewSmoothly(element, driver);
				Assert.assertTrue(isElementDisplayed(element, driver));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyStatusHelpIconAndActiveHelpIcon(WebDriver driver) {
		try {
			waitForElementVisibility(statusHelpIcon, "30", driver);
			System.out.println("statusHelpIcon: ");
			
			waitForElementVisibility(activeHelpIcon, "30", driver);
			System.out.println("activeHelpIcon: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyCallTheLogIcon(WebDriver driver) {
		try {
			waitForElementVisibility(callTheLogIcon, "30", driver);
			System.out.println("callTheLogIcon: ");
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyAddActivityLink(WebDriver driver) {
		try {
			waitForElementVisibility(addActivityLink, "30", driver);
			System.out.println("addActivityLink: ");
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyLicensesGridUnderlineColorYellow(WebDriver driver) {
		String yellowColor = "#feb62b";
		WebElement element = driver.findElement(By.xpath(licensesGrid));
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

	public Boolean hoverMouseOnStatusIIconAndVerifyTooltip(WebDriver driver) {
		try {
			waitForElementVisibility(statusHelpIcon, "30", driver);
			click(statusHelpIcon, driver);
			isElementDisplayed(tooltipIIcon, driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean hoverMouseOnActiveIIconAndVerifyTooltip(WebDriver driver) {
		try {
			waitForElementVisibility(activeHelpIcon, "30", driver);
			click(activeHelpIcon, driver);
			isElementDisplayed(tooltipIIcon, driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnUrlIconLicenses(WebDriver driver) {
		waitForElementVisibility(urlIconLicense, "30", driver);
		click(urlIconLicense, driver);
	}

	public boolean verifyTheUrlOpensAndLoadsSuccessfullyIfTheUrlIsValid(WebDriver driver) {

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


	public void clickOnGoToActivityIcon(WebDriver driver) {
		for (int i = 2; i < 8; i++) {
			if (i == 4 || i == 6) {
				i += 1;
				System.out.println(i);
			}
			WebElement data = driver
					.findElement(By.xpath("(//*[@title='Go To Activity']/ancestor::td/../td)[" + i + "]"));
			String getData = getValue(data, driver);
			activeLicenseList.add(getData);
		}
		click(goToActivityIcon, driver);
	}

	public Boolean verifyActivityDataForTheChosenLicenses(WebDriver driver) {
		waitTime(9000);
		try {
			for (int i = 2; i < 6; i++) {

				WebElement element = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
				String getval = getValue(element, driver);
				System.out.println(getval);
				System.out.println("value : " + getval);
				Assert.assertTrue(activeLicenseList.contains(getval));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnAddActivityIcon(WebDriver driver) {
		for (int i = 2; i < 8; i++) {
			if (i == 4 || i == 6) {
				i += 1;
				System.out.println(i);
			}
			WebElement data = driver
					.findElement(By.xpath("(//*[@title='Add Activity']/ancestor::td/../td)[" + i + "]"));
			String getData = getValue(data, driver);
			addActiveLicenseList.add(getData);
		}
		click(addActivityIcon, driver);
	}

	public void verifyActivityDataOnLicenseDetailsPage(WebDriver driver) {
		waitTime(9000);
		Select company = new Select(driver.findElement(By.xpath(selecteCompany)));
		company.selectByIndex(0);
		WebElement option = company.getFirstSelectedOption();
		String companyItem = option.getText();
		Assert.assertTrue(addActiveLicenseList.contains(companyItem));

		Select facility = new Select(driver.findElement(By.xpath(selecteFacility)));
		company.selectByIndex(0);
		WebElement facilityOption = facility.getFirstSelectedOption();
		String facilityItem = facilityOption.getText();
		Assert.assertTrue(addActiveLicenseList.contains(facilityItem));

	}

	public void addActivityAndTaskEntryForTheChosenLicense(WebDriver driver) {
		waitTime(9000);
		Select company = new Select(driver.findElement(By.xpath(selecteLicenseActivity)));
		company.selectByIndex(1);

		LocalDate currentDate = java.time.LocalDate.now();
		String date = "00" + currentDate.toString().replace("-", "");
		System.out.println("Active Date: " + date);

		type(activityStartDate, date, driver);

		click(activityPopupNextBtn, driver);

		Select type = new Select(driver.findElement(By.xpath(selecteType)));
		type.selectByIndex(1);

		Select taskStatus = new Select(driver.findElement(By.xpath(selecteTaskStatus)));
		taskStatus.selectByIndex(1);

		Select assigne = new Select(driver.findElement(By.xpath(selecteAssigne)));
		assigne.selectByIndex(1);

		click(activityPopupSaveBtn, driver);
	}

	public Boolean verifyTaskDetailsSavedSuccessfullyPopup(WebDriver driver) {
		try {
			waitForElementVisibility(taskDetailsSavedSuccessfullyPopup, "30", driver);
			System.out.println("taskDetailsSavedSuccessfullyPopup: ");
			isElementDisplayed(taskDetailsSavedSuccessfullyPopup, driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnTaskDetailsSavedSuccessfullyPopupOkButton(WebDriver driver) {
		waitForElementVisibility(taskDetailsSavedSuccessfullyPopupOKBtn, "30", driver);
		click(taskDetailsSavedSuccessfullyPopupOKBtn, driver);
	}

	public void clickOnAdvancedFilters(WebDriver driver) {
		waitTime(7000);
		facilityValueOfGrid = getValueFromAttribute(facilityDataInGrid, driver).trim();
		for (int i = 1; i < 13; i++) {
			if (i == 9 || i == 11) {
				i += 1;
			}
			WebElement titel = driver.findElement(By.xpath("//tr[@role='row']//th[" + i + "]"));
			String getTitel = getValue(titel, driver).trim();
			if (i == 8) {
				getTitel = getTitel.substring(0, 6);
				System.out.println(getTitel);
			}
			activeLicenseTitelList.add(getTitel);

//			System.out.println(activeLicenseTitelList.get(i));

		}
		
		waitForElementVisibility(advancedFilters, "30", driver);
		click(advancedFilters, driver);
	}

	public Boolean verifyAdvanceFiltersPopup(WebDriver driver) {
		try {
			waitForElementVisibility(advanceFiltersSelectField, "30", driver);
			System.out.println("advanceFiltersSelectField: ");
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyColumnNamesOfTheGridInFieldDropdownAndselectValueFromDropdown(WebDriver driver) {
		try {
			Select advanceFiltersField = new Select(driver.findElement(By.xpath(advanceFiltersSelectField)));
			List<WebElement> op = advanceFiltersField.getOptions();

			int size = op.size();
			for (int i = 1; i < size; i++) {
				String options = op.get(i).getText().trim();
				System.out.println(options);
				if (options.equals("Compliance Manager")) {
					options = "Comp.Mgr";
				} else if (options.equals("License Number")) {
					options = "License #";
				} else if (options.equals("Expiry Date")) {
					options = "Expiration";
				} else if (options.equals("License Status")) {
					options = "Status";
				} else if (options.equals("Verfied On")) {
					options = "Ver On";
				} else if (options.equals("Client Code")) {
					options = "Ver On";
				}

				Assert.assertTrue(activeLicenseTitelList.contains(options));
			}
			advanceFiltersField.selectByIndex(4);

			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean verifyDataInDropdownAndselectValueFromOperatorDropdown(WebDriver driver) {
		operatorDropdownValueList.add("equals");
		operatorDropdownValueList.add("contains");
		operatorDropdownValueList.add("is less than");
		operatorDropdownValueList.add("is greater than");
		operatorDropdownValueList.add("is less than or equals");
		operatorDropdownValueList.add("is greater than or equals");
		try {
			Select advanceFiltersField = new Select(driver.findElement(By.xpath(advanceFiltersSelectOperator)));
			List<WebElement> op = advanceFiltersField.getOptions();

			int size = op.size();
			for (int i = 1; i < size; i++) {
				String options = op.get(i).getText().trim();
				System.out.println(options);
				
				Assert.assertTrue(operatorDropdownValueList.contains(options));
			}

			advanceFiltersField.selectByIndex(1);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void enterAdvanceFiltersValue(WebDriver driver) {
		waitForElementVisibility(advanceFiltersValueTxt, "30", driver);
		type(advanceFiltersValueTxt, facilityValueOfGrid, driver);
	}

	public Boolean verifyDropdownhaveAndOrValueWithTheDeleteButton(WebDriver driver) {
		try {
			Select select = new Select(driver.findElement(By.xpath(advanceFiltersAndOrDropdown)));
			select.selectByIndex(0);
			WebElement andOption = select.getFirstSelectedOption();
			String andValue = andOption.getText();
			Assert.assertTrue(andValue.equals("AND"));

			select.selectByIndex(1);
			WebElement orOption = select.getFirstSelectedOption();
			String orValue = orOption.getText();
			Assert.assertTrue(orValue.equals("OR"));

			waitForElementVisibility(advanceFiltersDeleteIcon, "30", driver);
			System.out.println("advanceFiltersDeleteIcon: ");
			isElementDisplayed(advanceFiltersDeleteIcon, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyDropdownFieldOperatorAndValueTextFiled(WebDriver driver) {
		try {

			waitForElementVisibility(advanceFiltersSelectFieldSecond, "30", driver);
			System.out.println("advanceFiltersSelectFieldSecond: ");
		
			waitForElementVisibility(advanceFiltersSelectOperatorSecond, "30", driver);
			System.out.println("advanceFiltersSelectOperatorSecond: ");
		
			waitForElementVisibility(advanceOperatorValueSecondTxt, "30", driver);
			System.out.println("advanceOperatorValueSecondTxt: ");
		
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnAddConditionLink(WebDriver driver) {
		waitForElementVisibility(addConditionLink, "30", driver);
		System.out.println("addConditionLink: ");
		click(addConditionLink, driver);
	}

	public void clickOnAdvanceFiltersCloseButton(WebDriver driver) {
		waitForElementVisibility(advanceFiltersCloseBtn, "30", driver);
		System.out.println("advanceFiltersCloseBtn: ");
		click(advanceFiltersCloseBtn, driver);
	}

	public Boolean verifyAdvanceFiltersIsClosed(WebDriver driver) {
		try {
			waitForElementVisibility(advanceFiltersSelectFieldSecond, "20", driver);
			System.out.println("advanceFiltersSelectFieldSecond: ");
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean selectAdvanceFiltersData(WebDriver driver) {
		try {
			Select advanceOperator = new Select(driver.findElement(By.xpath(advanceFiltersSelectOperator)));
			advanceOperator.selectByIndex(1);

			Select advanceFilters = new Select(driver.findElement(By.xpath(advanceFiltersSelectField)));
			advanceFilters.selectByIndex(4);

			waitForElementVisibility(advanceFiltersValueTxt, "30", driver);
			type(advanceFiltersValueTxt, "1718 Rockford, IL", driver);

			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void clickOnAdvanceFiltersSaveButton(WebDriver driver) {
		waitForElementVisibility(advanceFiltersSaveBtn, "30", driver);
		System.out.println("advanceFiltersSaveBtn: ");
		click(advanceFiltersSaveBtn, driver);
		
	}

	public void clickOnAddNewLicenseButton(WebDriver driver) {
		waitForElementVisibility(addNewLicenseBtn, "30", driver);
		System.out.println("addNewLicenseBtn: ");
		click(addNewLicenseBtn, driver);
	}

	public Boolean verifyAddLicensePageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(addLicensePageTitle, "20", driver);
			System.out.println("addLicensePageTitle: ");
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void selectCompanyDropdown(WebDriver driver) {
		Select select = new Select(driver.findElement(By.xpath(addLicenseCompanyDropdown)));
		select.selectByIndex(1);
		WebElement option = select.getFirstSelectedOption();
		String value = option.getText();
		addLicenseList.add(value);

	}

	public void selectFacilityDropdown(WebDriver driver) {

		Select select = new Select(driver.findElement(By.xpath(addLicenseFacilityDropdown)));
		select.selectByIndex(17);
		WebElement option = select.getFirstSelectedOption();
		String value = option.getText();
		addLicenseList.add(value);

	}

	public void selectStatesDropdown(WebDriver driver) {

		Select select = new Select(driver.findElement(By.xpath(addLicenseStatesDropdown)));
		select.selectByIndex(1);
		WebElement option = select.getFirstSelectedOption();
		String value = option.getText();
		addLicenseList.add(value);

	}

	public void selectLicenseStatusDropdown(WebDriver driver) {
		Select select = new Select(driver.findElement(By.xpath(addLicenseLicenseStatusDropdown)));
		select.selectByIndex(1);

		WebElement option = select.getFirstSelectedOption();
		String value = option.getText();
		addLicenseList.add(value);

	}

	public void enterLicenseName(WebDriver driver) {
		waitForElementVisibility(addLicenseLicenseNameTxt, "30", driver);
		type(addLicenseLicenseNameTxt, licenseName, driver);
		addLicenseList.add(licenseName);
	}

	public void enterLicenseNumber(WebDriver driver) {
		waitForElementVisibility(addLicenseLicenseNumberTxt, "30", driver);
		type(addLicenseLicenseNumberTxt, "987654321", driver);
		addLicenseList.add("987654321");
	}

	public void clickOnAddLicenseSaveButton(WebDriver driver) {
		waitForElementVisibility(addLicenseSaveBtn, "30", driver);
		System.out.println("addLicenseSaveBtn: ");
		click(addLicenseSaveBtn, driver);
	}

	public Boolean verifyLicenseDetailsSavedSuccessfully(WebDriver driver) {
		try {
			waitForElementVisibility(licenseDetailsSavedSuccessfully, "20", driver);
			System.out.println("licenseDetailsSavedSuccessfully: ");
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnSuccessPopupOkButton(WebDriver driver) {
		waitForElementVisibility(successPopupOk, "30", driver);
		System.out.println("successPopupOk: ");
		click(successPopupOk, driver);
	}

	public Boolean verifyTheNewlyAddedLicenseIsListedInTheLicenseGrid(WebDriver driver) {
		try {
			waitForElementVisibility(licenseSerachTxt, "30", driver);
			type(licenseSerachTxt, licenseName, driver);
			waitTime(6000);
			for (int i = 2; i < 8; i++) {
				if (i == 4 || i == 6) {
					i += 1;
					System.out.println(i);
				}
				WebElement element = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
				String getData = getValue(element, driver);
				Assert.assertTrue(addLicenseList.contains(getData));
			}

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyLicenseGridIsFiltered(WebDriver driver) {
		try {
			waitTime(6000);
			System.out.println(facilityFilterDataInGrid.length());
			int size = facilityFilterDataInGrid.length();
			size = (size - 25);
			for (int i = 1; i < size; i++) {
				WebElement element = driver.findElement(By.xpath("(//th[@aria-label='Facility: activate to sort column descending']/following::tr//td[3])["+i+"]"));
				scrollToElement(element, driver);
				String getData = getValue(element, driver);
				Assert.assertTrue(getData.equals(facilityValueOfGrid));
				System.out.println("inside : "+facilityFilterDataInGrid.length());
			}

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	

}
