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


public class DashboardPage extends BaseClass {
	private WebDriver podriver = null;

	String dashboardGrid = "//a[@class='nav-link menu-item']//span";
	String licensesGrid = "(//div[@class='mbp'])[2]";
	String activitiesGrid = "(//div[@class='mbp'])[3]";
	String tasksGrid = "(//div[@class='mbp'])[4]";
	String documentsGrid = "(//div[@class='mbp'])[5]";
	String activeGrid = "//li[contains(@class,'active')]";
	String mapUSA = "//div[@id='map']";
	String filterByLbl = "//label[text()[contains(.,'Filter By:')]]";
	String resetFilterLbl = "//a[text()[contains(.,'Reset Filter')]]";
	String upcomingRenewalsLbl = "//div[text()[contains(.,'Upcoming Renewals')]]";
	String expiringDocumentsLbl = "//div[text()[contains(.,'Expiring Documents')]]";
	String tasksLbl = "//div[@class='panel panel-default']/div[text()[contains(.,'Tasks')]]";
	String licenseDetailsLbl = "//label[text()[contains(.,'License Details:')]]";
	String clientDropDown = "//select[@id='ClientKey']";
	String clientDropDownOption = "(//select[@id='ClientKey']/option)[2]";
	String clientDefualtOption = "(//select[@id='ClientKey']/option)[1]";
	String companyDropDown = "//select[@id='CompanyKey']";
	String companyDropDownOption = "(//select[@id='CompanyKey']/option)[2]";
	String companyDefualtOption = "(//select[@id='CompanyKey']/option)[1]";
	String facilityDropDown = "//select[@id='FacilityKey']";
	String facilityDropDownOption = "(//select[@id='FacilityKey']/option)[2]";
	String facilityDefualtOption = "(//select[@id='FacilityKey']/option)[1]";
	String resetFilter = "//a[@title='Clear All Filters']";
	String licenseDetails = "//div[@id='table-report_wrapper']//td";
	String licencecount = "//table[@id='status-table']//tr[4]//td[2]";
	String licencePageTitle = "//p[text()[contains(.,'Licenses')]]";
	String activitiesPageTitle = "//p[text()[contains(.,'Activities')]]";
	String tasksPageTitle = "//p[text()[contains(.,'Tasks')]]";
	String documentsPageTitle = "//p[text()[contains(.,'Documents')]]";
	String userDropDown = "(//li/a//i[contains(@class,'down')])[2]";
	String logoutBtn = "//a[text()[contains(.,'Logout')]]";
	String licenseDetialsFirstRow = "(//tr[@class='odd']//td)[2]";
	String kpiTaskAllIncompleteOption = "//td[text()='All Incomplete']";
	String taskIncompleteStatusList = "//tr//td[11]";
	String taskNumberOfRowsLabelOnLicense = "//div[@id='tasks-list-main_info']";
	String expiringDocumentsExpired = "//td[text()='Expired']/following::td[@class='right-align  red']";
	String expiryDocumentOnDocumentGrid = "//th[@aria-label='Expiry Date: activate to sort column ascending']/following::tr//td[12]";
	String chooseFileUpload = "//input[@id='file'] | //input[@name='LicenseFile']";
	String saveBtn = "//button[@id='modal-save']";
	String uploadLicenseBtn = "(//a[@title='Upload License'])[1]";
	String pdfFileSuccessPopup = "//div[@id='text_success']";
	String pdfFileSuccessPopupOkBtn = "//a[@id='successok']";
	String licenseNumberCoun = "(//*[@title='View License']/ancestor::td/../td[7])";
	
	
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
	String filepath = filePath + "TestSample.pdf";

	public DashboardPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void navigateToUrl(WebDriver driver, String Url) throws InterruptedException {
		driver.get(Url);

	}

	public Boolean verifyDashboardGrid(WebDriver driver) {
		try {
			waitForElementVisibility(dashboardGrid, "30", driver);
			System.out.println("dashboard Grid : ");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyLicensesGrid(WebDriver driver) {
		try {
			waitForElementVisibility(licensesGrid, "30", driver);
			System.out.println("licenses Grid: ");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyActivitiesGrid(WebDriver driver) {
		try {
			waitForElementVisibility(activitiesGrid, "30", driver);
			System.out.println("activities Grid: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyTasksGrid(WebDriver driver) {
		try {
			waitForElementVisibility(tasksGrid, "30", driver);
			System.out.println("tasks Grid: ");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyDocumentsGrid(WebDriver driver) {

		try {
			waitForElementVisibility(documentsGrid, "30", driver);
			System.out.println("documentsGrid: ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyDashboardGridUnderlineColorYellow(WebDriver driver) {
		String yellowColor = "#feb62b";
		WebElement element = driver.findElement(By.xpath(dashboardGrid));
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

	public Boolean verifyFilterByLabel(WebDriver driver) {
		try {
			waitForElementVisibility(filterByLbl, "30", driver);
			System.out.println("filter By : ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyResetFilterLabel(WebDriver driver) {
		try {
			waitForElementVisibility(resetFilterLbl, "30", driver);
			System.out.println("reset Filter : ");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyUpcomingRenewalsLabel(WebDriver driver) {

		try {
			waitForElementVisibility(upcomingRenewalsLbl, "30", driver);
			System.out.println("Upcoming Renewals : ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyExpiringDocumentsLabel(WebDriver driver) {

		try {
			waitForElementVisibility(expiringDocumentsLbl, "30", driver);
			System.out.println("Expiring Documents : ");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyTasksLabel(WebDriver driver) {
		try {
			waitForElementVisibility(tasksLbl, "30", driver);
			System.out.println("tasksLbl : ");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyLicenseDetailsLabel(WebDriver driver) {
		try {
			waitForElementVisibility(licenseDetailsLbl, "30", driver);
			System.out.println("licenseDetailsLbl : ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void selectClient(WebDriver driver) {
		waitForElementVisibility(clientDropDown, "30", driver);
		Select client = new Select(driver.findElement(By.xpath(clientDropDown)));

		client.selectByIndex(1);
		WebElement element = driver.findElement(By.xpath(clientDropDownOption));
		clientSelected = element.getText().trim();
		System.out.println("seleced clint: " + clientSelected);
	}

	public void verifyClientLabelAndDefaultAll(WebDriver driver) {
		String defualt;
		waitForElementVisibility(clientDropDown, "30", driver);
		Select client = new Select(driver.findElement(By.xpath(clientDropDown)));
		client.selectByIndex(0);
		WebElement element = driver.findElement(By.xpath(clientDefualtOption));
		defualt = element.getText().trim();
		boolean defualtValueEqual = (defualt.equals("All"));
		System.out.println(defualtValueEqual);

		Assert.assertTrue(defualtValueEqual);

		System.out.println("seleced clint: " + defualt);
	}

	public void verifyCompanyLabelAndDefaultAll(WebDriver driver) {
		String defualt;
		waitForElementVisibility(companyDropDown, "30", driver);
		Select client = new Select(driver.findElement(By.xpath(companyDropDown)));
		client.selectByIndex(0);
		WebElement element = driver.findElement(By.xpath(companyDefualtOption));
		defualt = element.getText().trim();
		boolean defualtValueEqual = (defualt.equals("All"));
		System.out.println(defualtValueEqual);

		Assert.assertTrue(defualtValueEqual);

		System.out.println("seleced Company: " + defualt);
	}

	public void verifyFacilityLabelAndDefaultAll(WebDriver driver) {
		String defualt;
		waitForElementVisibility(facilityDropDown, "30", driver);
		Select client = new Select(driver.findElement(By.xpath(facilityDropDown)));
		client.selectByIndex(0);
		WebElement element = driver.findElement(By.xpath(facilityDefualtOption));
		defualt = element.getText().trim();
		boolean defualtValueEqual = (defualt.equals("All"));
		System.out.println(defualtValueEqual);

		Assert.assertTrue(defualtValueEqual);

		System.out.println("seleced Facility: " + defualt);
	}

	public Boolean verifyClientLicenseDetals(WebDriver driver) {
		WebElement clientLicenseDetals = driver.findElement(By.xpath("(//td[text()='" + clientSelected + "'])[1]"));
		try {
			waitForElementVisibility(clientLicenseDetals, "30", driver);
			System.out.println("client License Detals : " + clientLicenseDetals.getText());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void selectCompany(WebDriver driver) {
		waitForElementVisibility(companyDropDown, "30", driver);
		Select company = new Select(driver.findElement(By.xpath(companyDropDown)));
		company.selectByIndex(1);
		WebElement element = driver.findElement(By.xpath(companyDropDownOption));
		companySelected = element.getText().trim();
		System.out.println("seleced company: " + companySelected);
	}

	public Boolean verifyCompanyLicenseDetals(WebDriver driver) {
		WebElement companyLicenseDetals = driver.findElement(By.xpath("(//td[text()='" + companySelected + "'])[1]"));
		try {
			waitForElementVisibility(companyLicenseDetals, "30", driver);
			System.out.println("client License Detals : " + companyLicenseDetals.getText());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void selectFacility(WebDriver driver) {
		waitForElementVisibility(facilityDropDown, "30", driver);
		waitTime(4000);
		Select facility = new Select(driver.findElement(By.xpath(facilityDropDown)));
		facility.selectByIndex(1);
		WebElement element = driver.findElement(By.xpath(facilityDropDownOption));
		facilitySelected = element.getText().trim();
		System.out.println("seleced facility: " + facilitySelected);
	}

	public Boolean verifyFacilityLicenseDetals(WebDriver driver) {
		WebElement facilityLicenseDetals = driver.findElement(By.xpath("(//td[text()='" + facilitySelected + "'])[1]"));
		try {
			waitForElementVisibility(facilityLicenseDetals, "30", driver);
			System.out.println("client facility Detals : " + facilityLicenseDetals.getText());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean getLicenseCountText(WebDriver driver) {
		WebElement licencecount1 = driver.findElement(By.xpath(licencecount));
		int licenseCountAfter = Integer.parseInt(licencecount1.getText());
		return licenseCountBefore == licenseCountAfter;
	}

	public void clickOnresetFilter(WebDriver driver) {
		WebElement licencecount1 = driver.findElement(By.xpath(licencecount));
//		WebElement licenseDetails1 = driver.findElement(By.xpath(licenseDetails));
		licenseDetailsCount = driver.findElements(By.xpath(licenseDetails)).size();
		licenseCountBefore = Integer.parseInt(licencecount1.getText());
		waitForElementVisibility(resetFilter, "30", driver);
		click(resetFilter, driver);
	}

	public Boolean verifyLicenseDetailsCountChanged(WebDriver driver) {
		int licenseDetailsCountAfter = driver.findElements(By.xpath(licenseDetails)).size();
		return licenseDetailsCount != licenseDetailsCountAfter;

	}

	public void clickOnLicensesGrid(WebDriver driver) {
		waitTime(10000);
		waitForElementVisibility(licensesGrid, "30", driver);
		click(licensesGrid, driver);
	}

	public void clickOnActivitiesGrid(WebDriver driver) {
		waitForElementVisibility(activitiesGrid, "30", driver);
		click(activitiesGrid, driver);
	}

	public void clickOnTasksGrid(WebDriver driver) {
		waitForElementVisibility(tasksGrid, "30", driver);
		click(tasksGrid, driver);
	}

	public void clickOnDocumentsGrid(WebDriver driver) {
		waitForElementVisibility(documentsGrid, "30", driver);
		click(documentsGrid, driver);
	}

	public void clickOnDashboardGrid(WebDriver driver) {
		waitTime(10000);
		waitForElementVisibility(dashboardGrid, "30", driver);
		click(dashboardGrid, driver);
	}

	public void clickOnUserDropDown(WebDriver driver) {
		waitForElementVisibility(userDropDown, "30", driver);
		click(userDropDown, driver);
	}

	public void clickOnLogoutButton(WebDriver driver) {
		waitForElementVisibility(logoutBtn, "30", driver);
		click(logoutBtn, driver);
	}

	public Boolean verifyLicencePageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(licencePageTitle, "30", driver);
			System.out.println("licencePageTitle : ");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyGridAvailableOnToolbarAndShowingCorrectDataInEachVisual(WebDriver driver) {
		try {
			waitForElementVisibility(licensesGrid, "30", driver);
			click(licensesGrid, driver);

			waitForElementVisibility(licencePageTitle, "30", driver);
			System.out.println("licencePageTitle : ");
			
			waitForElementVisibility(activitiesGrid, "30", driver);
			click(activitiesGrid, driver);

			waitForElementVisibility(activitiesPageTitle, "30", driver);
			System.out.println("activitiesPageTitle : ");
			
			waitForElementVisibility(tasksGrid, "30", driver);
			click(tasksGrid, driver);

			waitForElementVisibility(tasksPageTitle, "30", driver);
			System.out.println("tasksPageTitle : ");
			
			waitForElementVisibility(documentsGrid, "30", driver);
			click(documentsGrid, driver);

			waitForElementVisibility(documentsPageTitle, "30", driver);
			System.out.println("documentsPageTitle : ");
			
			waitForElementVisibility(dashboardGrid, "30", driver);
			click(dashboardGrid, driver);

			waitForElementVisibility(filterByLbl, "30", driver);
			System.out.println("filterByLbl : ");
			
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Boolean verifyActivitiesPageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(activitiesPageTitle, "30", driver);
			System.out.println("activitiesPageTitle : ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyTasksPageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(tasksPageTitle, "30", driver);
			System.out.println("tasksPageTitle : ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyDocumentsPageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(documentsPageTitle, "30", driver);
			System.out.println("documentsPageTitle : ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyDashboardPageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(filterByLbl, "30", driver);
			System.out.println("filterByLbl : ");
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyUSAMap(WebDriver driver) {
		try {
			waitForElementVisibility(mapUSA, "30", driver);
			System.out.println("mapUSA : ");
			return true;
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
		doubleClick(licenseDetialsFirstRow, driver);
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

	public void doubleClickOnKpiTaskAllIncompleteOption(WebDriver driver) {
		waitTime(6000);
		waitForElementVisibility(kpiTaskAllIncompleteOption, "30", driver);
		doubleClick(kpiTaskAllIncompleteOption, driver);
		waitTime(7000);
	}

	public Boolean verifyOnlyTheIncompleteLicensesForTheSelectedGlobalFilterValuesShouldBeShownInTheGrid(
			WebDriver driver) {
		waitTime(7000);
		try {
			for (int i = 1; i < taskIncompleteStatusList.length(); i++) {

				WebElement element = driver.findElement(By.xpath("(//tr//td[11])[" + i + "]"));
				String getval = getValue(element, driver);
				getval = getval.trim();
				System.out.println(getval);
				System.out.println("value : " + getval);
				Assert.assertTrue(getval.equals("Incomplete"));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean selectClientFromFilterOptionsAndVerifyExpiringDocumentOnKPI(WebDriver driver) {

		try {
			waitForElementVisibility(clientDropDown, "30", driver);
			Select client = new Select(driver.findElement(By.xpath(clientDropDown)));
			List<WebElement> op = client.getOptions();

			int size = op.size();
			for (int i = 1; i < size; i++) {
				client.selectByIndex(i);
				int expCount = Integer.parseInt(getValueFromAttribute(expiringDocumentsExpired, driver).trim());
				expireKpiValue = expCount;
				if (expCount > 0) {
					Assert.assertTrue(true);
					break;
				}

			}

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void doubleClickOnKpiExpiringDocumentsExpiredOption(WebDriver driver) {
		waitTime(6000);
		waitForElementVisibility(expiringDocumentsExpired, "30", driver);
		doubleClick(expiringDocumentsExpired, driver);
		waitTime(7000);
	}

	public Boolean verifyOnlyExpiringLicensesOnDocumentGrid(WebDriver driver) {
		waitTime(7000);
		try {
			List<WebElement> elementSize = driver.findElements(By.xpath(expiryDocumentOnDocumentGrid));
			System.out.println("size: " + elementSize.size());

			for (int i = 1; i <= elementSize.size(); i++) {
				WebElement element = driver.findElement(By.xpath(
						"(//th[@aria-label='Expiry Date: activate to sort column ascending']/following::tr//td[12])["
								+ i + "]"));
				String getval = getValue(element, driver);
				getval = getval.trim();
				System.out.println(getval);
				System.out.println("value : " + getval);
				Assert.assertTrue(getval.equals(getval));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyNoOfRowsInTheGridShouldMatchTheKPIValueInTheDashboard(WebDriver driver) {
		waitTime(7000);
		System.out.println(expireKpiValue);
		try {
			List<WebElement> noOfRow = driver.findElements(By.xpath(expiryDocumentOnDocumentGrid));
			Assert.assertTrue(expireKpiValue == noOfRow.size());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void uploadfile(WebDriver driver) throws InterruptedException {
		waitForElementVisibility(chooseFileUpload, "30", driver);
		type(chooseFileUpload, filepath, driver);
		
	}

	public void clickOnSaveButton(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(saveBtn, "30", driver);
		click(saveBtn, driver);

	}

	public void clickOnUploadLicensePDFButton(WebDriver driver) {
		for (int i = 2; i < 8; i++) {
			if (i == 4 || i == 6) {
				i += 1;
				System.out.println(i);
			}
			WebElement data = driver
					.findElement(By.xpath("(//*[@title='Upload License']/ancestor::td/../td)[" + i + "]"));
			String getData = getValue(data, driver);
			gridDataList.add(getData);
		}
		click(uploadLicenseBtn, driver);
	}

	public Boolean verifyPdfFileSuccessPopup(WebDriver driver) {
		waitTime(9000);
		try {
			waitForElementVisibility(pdfFileSuccessPopup, "30", driver);
			System.out.println("pdfFileSuccessPopup : ");
		
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnPdfFileSuccessPopupOkButton(WebDriver driver) {
		waitTime(5000);
		waitForElementVisibility(pdfFileSuccessPopupOkBtn, "30", driver);
		click(pdfFileSuccessPopupOkBtn, driver);

	}

	public void verifyTheUserIsAbleToViewThePDF(WebDriver driver) {
		int count=1;
			for (int i = 1; i < licenseNumberCoun.length(); i++) {

				WebElement data = driver
						.findElement(By.xpath("(//*[@title='View License']/ancestor::td/../td[7])[" + i + "]"));
				String getData = getValue(data, driver).trim();

				if (gridDataList.contains(getData) == true) {
					WebElement data2 = driver
							.findElement(By.xpath("(//*[@title='View License']/ancestor::td/../td[13])[" + count + "]"));
					click(data2, driver);
					break;
		        }
				count++;
			}
		
	}
}
