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
import java.time.LocalDate;

import Utils.BaseClass;
import org.junit.Assert;
import static org.junit.Assert.*;

public class TasksPage extends BaseClass {
	private WebDriver podriver = null;

	String goToTasks = "(//span[@title='Go To Tasks'])[2]";
	String goToTaskLicenseActivitiesBtn = "//img[@id='activity-view-btn']";
	String taskSubpanel = "(//button[@type='submit'])[2] | //button[contains(@class,'editcenter')]";
	String backToTasksBtn = "//img[@data-original-title='Back to Tasks']";
	String addTaskBtn = "(//button[@type='submit'])[last()] | //div[@class='nav-item ']/button";
	String addTaskTitle = "//p[text()[contains(.,'Add Task')]]";
	String dateMandatory = "//label[text()='Date ']/span[@class='red']";
	String dateTxt = "//input[@id='CreationDate']";
	String createdByMandatory = "//label[text()='Created By ']/span[@class='red']";
	String creatByTxt = "//input[@id='TaskAuthor']";
	String typeMandatory = "//label[text()='Type ']/span[@class='red']";
	String typeDropDown = "//select[@id='TaskTypeKey']";
	String taskStatusMandatory = "//label[text()='Task Status ']/span[@class='red']";
	String taskStatusDropDown = "//select[@id='TaskStandingKey']";
	String assigneeMandatory = "//label[text()='Assignee ']/span[@class='red']";
	String assigneeDropDown = "//select[@id='AssignedUserKey']";
	String dueDateMandatory = "//label[text()='Due Date ']/span[@class='red']";
	String dueDateDropDown = "//input[@id='ExpCompletionDate']";
	String saveBtn = "//button[@id='task-save']";
	String assigneeValueTaskAdd = "(//p[contains(text(),'Assignee')])[1]/following-sibling::p";
	String dateValueTaskAdd = "(//p[contains(text(),'Due')])[1]/following-sibling::p";

	String clientFilter = "//select[@id='GlobalClientKey']";
	String companyFilter = "//select[@id='GlobalCompanyKey']";
	String facilityFilter = "//select[@id='GlobalFacilityKey']";
	String resetGlobalFilter = "//a[text()='Reset Global Filters']";

	String exportButton = "(//span[text()='Export'])";
	String exportNotesButton = "(//span[text()='Export with Notes'])";

	String incompleteSelect = "(//select[@id='incomplete'])";
	String UserTypeSelect = "(//select[@id='UserType'])";
	String allTaskOption = "//option[text()=' All Tasks']";
	String myTaskOption = "//option[text()=' My Tasks ']";
	String assignedTaskOption = "//option[text()=' Assigned Tasks']";

	String advanceFilterIcon = "//a[text()=' Advanced Filters ']";
	String globalSearch = "//input[@type='search']";
	String showEntriesSelect = "//label//select";
	String editTaskTitle = "//p[contains(text(),'Edit Task')]";

	String assigneeValueAfter = "";
	String taskDateSelect = "";
	
	String creatdBy = "//tr[@class='odd']//td[10]";
	
	String currentUserName = "((//li[contains(@class,'profile-name')])[2]//a)[1]";
	
	String noDataTxt = "//td[text()='No data available in table']";
	String recordsCounter = "//div[contains(text(),'Showing')]";

	int pageCounter = 0;
	
	String fieldOptionCompany = "//option[text()='Company']";
	String fieldOptionCompManager = "//option[text()='Compliance Manager']";
	String fieldOptionClientCode = "//option[text()='Client Code']";
	String fieldOptionFacility = "//option[text()='Facility']";
	String fieldOptionLicenseName = "//option[text()='License Name']";
	String fieldOptionLicenseNumber = "//option[text()='License Number']";
	String fieldOptionState = "//option[text()='State']";
	String fieldOptionActivity = "//option[text()='Activity']";
	String fieldOptionTaskStartDate = "//option[text()='Task StartDate']";
	String fieldOptionCreatedBy = "//option[text()='Created By']";
	String fieldOptionTaskType = "//option[text()='Task Type']";
	String fieldOptionTaskStanding = "//option[text()='Task Standing']";
	String fieldOptionTaskDueDate = "//option[text()='Task Due Date']";
	String fieldOptionAssignedTo = "//option[text()='Assigned To']";
		
	
	String operatorOptionEquals = "//option[text()='equals']";
	String operatorOptionContains = "//option[text()='contains']";
	String operatorOptionLessThan = "//option[text()='is less than']";
	String operatorOptionGreaterThan = "//option[text()='is greater than']";
	String operatorOptionLessThanEqual = "//option[text()='is less than or equals']";
	String operatorOptionGreaterThanEqual = "//option[text()='is greater than or equals ']";
	
	String conditionOptoinAnd = "(//option[contains(text(),'AND')])[2]";
	String conditionOptoinOR = "(//option[contains(text(),'OR')])[2]";

	

	String advanceFilterField = "//select[contains(@id,'field')]";
	String advanceFilterOpterator = "//select[contains(@id,'operator0')]";
	String advanceFilterValue = "//input[contains(@id,'search_value_one0')]";
	
	String conditionDropDown = "//select[@id='condition1']";
	
	String advanceFilterField1 = "//select[contains(@id,'field1')]";
	String advanceFilterOpterator1 = "//select[contains(@id,'operator1')]";
	String advanceFilterValu1 = "//input[contains(@id,'search_value_one1')]";
	
	
	String addConditionButton = "//a[text()='Add Condition']";
	
	String conditionDeleteIcon = "//img[contains(@src,'delete')]";
	
	
	String advanceFilterCloseButton = "//button[text()='Close']";
	String advanceFilterSaveButton = "//button[text()='Save']";
	
	String taskDetialsFirstRow = "(//tr[@class='odd']//td)[2]";

	
	String companyNameEditTask = "//div[@class='modal-content'] //p[contains(text(),'Company')]//following-sibling::p";
	String facilityNameEditTask = "//div[@class='modal-content'] //p[contains(text(),'Facility')]//following-sibling::p";
	String stateNameEditTask = "//div[@class='modal-content'] //p[contains(text(),'State')]//following-sibling::p";
	String LicenseNameEditTask = "//div[@class='modal-content'] //p[contains(text(),'License Name')]//following-sibling::p";
	String ActivityEditTask = "//div[@class='modal-content'] //p[contains(text(),'Activity')]//following-sibling::p";
	String progressEditTask = "//div[@class='modal-content'] //p[contains(text(),'Progress')]//following-sibling::p";
	
	
	String deleteTaskBtn = "//button[text()='Delete']";
	String taskSection = "//section[@id='task']";
	
	
	
	String editTaskType = "";
	String editTaskStatus = "";
	String editTaskAssignee = "";

 
	
	HashMap<String, String> taskDetails = new HashMap<String, String>();


	public TasksPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void clickOnGoToTasksButton(WebDriver driver) {
		waitForElementVisibility(goToTasks, "20", driver);
		click(goToTasks, driver);
	}

	public void clickOnGoToTaskLicenseActivitiesButton(WebDriver driver) {
		waitForElementVisibility(goToTaskLicenseActivitiesBtn, "20", driver);
		click(goToTaskLicenseActivitiesBtn, driver);
	}

	public void clickOnBackToTasksButton(WebDriver driver) {
		waitForElementVisibility(backToTasksBtn, "20", driver);
		click(backToTasksBtn, driver);
	}
	
	public void clickOnUserSelect(WebDriver driver) {
		click(UserTypeSelect, driver);
	}
	
public void doubleClickOnTask(WebDriver driver) {
	
	try {
		String str = getText(recordsCounter, driver);
		String[] fArr = str.split("of ", 2);
		String[] sArr = fArr[1].split(" Entries",2);
		pageCounter = Integer.parseInt(sArr[0].replace(",",""));
	} catch (Exception e) {
		pageCounter  = 0;
	}
	
	
	
	
	for (int i = 2; i < 15; i++) {
		WebElement data = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
		WebElement titel = driver.findElement(By.xpath("//tr[@role='row']//th[" + i + "]"));

		String getData = getValue(data, driver);
		String getTitel = getValue(titel, driver);
		taskDetails.put(getTitel.trim(), getData.trim());
		System.out.println(taskDetails.get(getTitel));

	}
	doubleClick(taskDetialsFirstRow, driver);
}

	public Boolean verifyTaskSubpanel(WebDriver driver) {
		try {
			waitForElementVisibility(taskSubpanel, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyAddTaskTitle(WebDriver driver) {
		try {
			waitForElementVisibility(addTaskTitle, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnAddTaskButton(WebDriver driver) {
		waitForElementVisibility(addTaskBtn, "20", driver);
		click(addTaskBtn, driver);
	}

	public void clickOnSaveButton(WebDriver driver) {
		waitForElementVisibility(saveBtn, "20", driver);
		click(saveBtn, driver);
	}
	

	public void clickOnUserTypeAllTask(WebDriver driver) {
		click(UserTypeSelect, driver);
		click(allTaskOption, driver);
	}
	
	public void clickOnUserTypeMyTask(WebDriver driver) {
		click(UserTypeSelect, driver);
		click(myTaskOption, driver);
	}
	
	public void clickOnUserTypeAssignedTask(WebDriver driver) {
		click(UserTypeSelect, driver);
		click(assignedTaskOption, driver);
	}
	
	
	public Boolean verifyAllTaskAreShowing(WebDriver driver) {
		
		waitTime(5000);
		WebElement item = driver.findElement(By.xpath(creatdBy));
		
			if(item.getText().isEmpty())
				return false;

		
		return true;
	}
	
	public Boolean verifyMyTaskAreShowing(WebDriver driver) {
		
		String currentUserNameTxt = getText(currentUserName, driver);
		
		WebElement item = driver.findElement(By.xpath(creatdBy));
		
			if(!item.getText().equals(currentUserNameTxt))
				return false;
		
		return true;
	}
	
	public Boolean verifyAssignedTaskAreShowing(WebDriver driver) {
		try {
			waitForElementVisibility(noDataTxt, "20", driver);

		} catch (Exception e) {
			
		}
		return true;
	}

	public Boolean verifyFollowingFieldsAreMandatoryAndNonEditableDateAndCreatedBy(WebDriver driver) {
		try {
			waitForElementVisibility(dateMandatory, "20", driver);
			Assert.assertTrue("Verify Date input is Disabeld", isDisabeldCheckAttribute(dateTxt, driver));

			waitForElementVisibility(createdByMandatory, "20", driver);
			Assert.assertTrue("Verify Facility DropDown is Disabeld", isDisabeldCheckAttribute(creatByTxt, driver));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyFollowingFieldsAreMandatoryAndEditableTypeTaskStatusAssigneeAndDueDate(WebDriver driver) {
		try {
			waitForElementVisibility(typeMandatory, "20", driver);
			Select typeValDropDown = new Select(driver.findElement(By.xpath(typeDropDown)));
			WebElement typeOption = typeValDropDown.getFirstSelectedOption();
			String typeValueBefore = typeOption.getText();
			typeValDropDown.selectByIndex(1);
			typeOption = typeValDropDown.getFirstSelectedOption();
			String typeValueAfter = typeOption.getText();
			if(!typeValueAfter.equals(typeValueBefore)) {
				
				Assert.assertFalse("Verify type DropDown is Editable", typeValueAfter.equals(typeValueBefore));

			} else {
				typeValDropDown.selectByIndex(2);
				typeOption = typeValDropDown.getFirstSelectedOption();
				 typeValueAfter = typeOption.getText();
				Assert.assertFalse("Verify type DropDown is Editable", typeValueAfter.equals(typeValueBefore));

			}
			editTaskType = typeValueAfter;

			waitForElementVisibility(taskStatusMandatory, "20", driver);
			Select taskStatusValDropDown = new Select(driver.findElement(By.xpath(taskStatusDropDown)));
			WebElement taskStatusOption = taskStatusValDropDown.getFirstSelectedOption();
			String taskStatusValueBefore = taskStatusOption.getText();
			taskStatusValDropDown.selectByIndex(1);
			taskStatusOption = taskStatusValDropDown.getFirstSelectedOption();
			String taskStatusValueAfter = taskStatusOption.getText();
			
			if(!taskStatusValueAfter.equals(taskStatusValueBefore)) {
				Assert.assertFalse("Verify Task Status DropDown is Editable",
						taskStatusValueAfter.equals(taskStatusValueBefore));
			} else {
				
				taskStatusValDropDown.selectByIndex(2);
				taskStatusOption = taskStatusValDropDown.getFirstSelectedOption();
				taskStatusValueAfter = taskStatusOption.getText();
				Assert.assertFalse("Verify Task Status DropDown is Editable",
						taskStatusValueAfter.equals(taskStatusValueBefore));
			}
			
			editTaskStatus = taskStatusValueAfter;
			

			waitForElementVisibility(assigneeMandatory, "20", driver);
			Select assigneeValDropDown = new Select(driver.findElement(By.xpath(assigneeDropDown)));
			WebElement assigneeOption = assigneeValDropDown.getFirstSelectedOption();
			String assigneeValueBefore = assigneeOption.getText();
			assigneeValDropDown.selectByIndex(1);
			assigneeOption = assigneeValDropDown.getFirstSelectedOption();
			assigneeValueAfter = assigneeOption.getText();
			
			if(!assigneeValueAfter.equals(assigneeValueBefore)) {
				Assert.assertFalse("Verify type DropDown is Editable", assigneeValueAfter.equals(assigneeValueBefore));

			} else{
				assigneeValDropDown.selectByIndex(2);
				assigneeOption = assigneeValDropDown.getFirstSelectedOption();
				assigneeValueAfter = assigneeOption.getText();
				Assert.assertFalse("Verify type DropDown is Editable", assigneeValueAfter.equals(assigneeValueBefore));

			}
			
			editTaskAssignee = assigneeValueAfter;
			
			waitForElementVisibility(dueDateMandatory, "20", driver);

			taskDateSelect = getValue(dueDateDropDown, driver);
			System.out.println("taskDateSelect");

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyTheModifiedLicenseActivityIsListedInTheLicenseActivityGrid(WebDriver driver) {
		try {
			waitForElementVisibility(addTaskBtn, "20", driver);
			String assigneeValue = getText(assigneeValueTaskAdd, driver);
			System.out.println("Value assign" + assigneeValue);
			Assert.assertTrue("Verify Value of assign are equal", assigneeValue.equals(assigneeValueAfter));

			String dateValue = getText(dateValueTaskAdd, driver);
			dateValue = reformatDate(dateValue, "MM-dd-yyyy", "yyyy-MM-dd");
			System.out.println("Value date" + dateValue);
			Assert.assertTrue("Verify Value of date are equal", dateValue.equals(taskDateSelect));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyGlobalClientCompanyFacilityAndResetFilters(WebDriver driver) {
		try {
			waitForElementVisibility(clientFilter, "20", driver);
			waitForElementVisibility(companyFilter, "20", driver);
			waitForElementVisibility(facilityFilter, "20", driver);
			waitForElementVisibility(resetGlobalFilter, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyExportButton(WebDriver driver) {
		try {
			waitForElementVisibility(exportButton, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyExportWithNotes(WebDriver driver) {
		try {
			waitForElementVisibility(exportNotesButton, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyAllTaskMyTaskAssignedTaskDropDown(WebDriver driver) {
		waitTime(9000);
		try {
			String client = (new Select(driver.findElement(By.xpath(UserTypeSelect)))).getFirstSelectedOption()
					.getText().trim();

			if (client.equals("All Tasks"))
				return true;

			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyTaskStandingDropDown(WebDriver driver) {
		waitTime(9000);
		try {
			String client = (new Select(driver.findElement(By.xpath(incompleteSelect)))).getFirstSelectedOption()
					.getText().trim();

			if (client.equals("Incomplete only"))
				return true;

			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyShowAllEntriesDropdown(WebDriver driver) {
		waitTime(9000);
		try {
			String client = (new Select(driver.findElement(By.xpath(showEntriesSelect)))).getFirstSelectedOption()
					.getText().trim();

			if (client.equals("All"))
				return true;

			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyAdvanceFilterIcon(WebDriver driver) {
		try {
			waitForElementVisibility(advanceFilterIcon, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyGlobalSearch(WebDriver driver) {
		try {
			waitForElementVisibility(globalSearch, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyEditTaskTitle(WebDriver driver) {
		try {
			waitForElementVisibility(editTaskTitle, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyColumnSearch(WebDriver driver) {
		try {
			for (int i = 1; i <= 13; i++) {
				WebElement element = driver.findElement(By.xpath("//input[@id='myInput"+i+"']"));
				waitForElementVisibility(element, "20", driver);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyColumnWiseSort(WebDriver driver) {
		try {
			for (int i = 2; i <= 13; i++) {
				WebElement element = driver.findElement(By.xpath("//thead//tr[1]//th["+i+"]"));
				waitForElementVisibility(element, "20", driver);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickOnAdvanceFilterIcon(WebDriver driver) {
		click(advanceFilterIcon, driver);
	}
	
	public void clickOnAddConditionIcon(WebDriver driver) {
		click(addConditionButton, driver);
	}
	
	public Boolean verifyFieldDropDownHaveAllColumnValues(WebDriver driver) {
		try {
			click(advanceFilterField, driver);
			waitForElementVisibility(fieldOptionCompManager, "20", driver);
			waitForElementVisibility(fieldOptionCompany, "20", driver);
			waitForElementVisibility(fieldOptionClientCode, "20", driver);
			waitForElementVisibility(fieldOptionFacility, "20", driver);
			waitForElementVisibility(fieldOptionLicenseName, "20", driver);
			waitForElementVisibility(fieldOptionLicenseNumber, "20", driver);
			waitForElementVisibility(fieldOptionState, "20", driver);
			waitForElementVisibility(fieldOptionActivity, "20", driver);
			waitForElementVisibility(fieldOptionTaskStartDate, "20", driver);
			waitForElementVisibility(fieldOptionCreatedBy, "20", driver);
			waitForElementVisibility(fieldOptionTaskType, "20", driver);
			waitForElementVisibility(fieldOptionTaskStanding, "20", driver);
			waitForElementVisibility(fieldOptionTaskDueDate, "20", driver);
			waitForElementVisibility(fieldOptionAssignedTo, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyOperatorDropDownHasFollowingValues(WebDriver driver) {
		try {
			click(advanceFilterOpterator, driver);
			waitForElementVisibility(operatorOptionEquals, "20", driver);
			waitForElementVisibility(operatorOptionContains, "20", driver);
			waitForElementVisibility(operatorOptionLessThan, "20", driver);
			waitForElementVisibility(operatorOptionGreaterThan, "20", driver);
			waitForElementVisibility(operatorOptionLessThanEqual, "20", driver);
			waitForElementVisibility(operatorOptionGreaterThanEqual, "20", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyTextBoxAllowedEnterText(WebDriver driver) {
		try {
			type(advanceFilterValue, "pharma", driver);

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public Boolean verifyUserCanSeeAndOrDropDown(WebDriver driver) {
		try {
			click(conditionDropDown, driver);
			waitForElementVisibility(conditionOptoinAnd, "20", driver);
			waitForElementVisibility(conditionOptoinOR, "20", driver);
			waitForElementVisibility(conditionDeleteIcon, "20", driver);
			

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyUserCanSeeOneOrMoreSetOfField(WebDriver driver) {
		try {
			waitForElementVisibility(advanceFilterField1, "20", driver);
			waitForElementVisibility(advanceFilterOpterator1, "20", driver);
			waitForElementVisibility(advanceFilterValu1, "20", driver);

			click(conditionDeleteIcon, driver);


			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyOnClickOfCloseButtonPopShouldClosed(WebDriver driver) {
		try {
			click(advanceFilterCloseButton, driver);
			if(isElementDisplayed(advanceFilterField, driver))
				return false;
			
			
			return true;

		} catch (Exception e) {
			return true;
		}
	}
	
	public Boolean verifyOnClickOfSaveButtonTaskGridIsFiltered(WebDriver driver) {
		try {
			
			String str = getText(recordsCounter, driver);
			String[] fArr = str.split("of ", 2);
			String[] sArr = fArr[1].split(" Entries",2);
			int beforeCounter = Integer.parseInt(sArr[0].replace(",",""));
			
			click(advanceFilterIcon, driver);
			
			click(advanceFilterField, driver);
			click(fieldOptionCompany, driver);

			click(advanceFilterOpterator, driver);			
			click(operatorOptionContains, driver);

			type(advanceFilterValue, "pharma", driver);

			click(advanceFilterSaveButton, driver);			
			
			str = getText(recordsCounter, driver);
			fArr = str.split("of ", 2);
			sArr = fArr[1].split(" Entries",2);
			int afterCounter = Integer.parseInt(sArr[0].replace(",",""));

			return beforeCounter>afterCounter;

		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyTaskActivityDetailOnEditPopup(WebDriver driver) {
		waitTime(9000);
		try {
			
				String getval = getText(companyNameEditTask, driver);
				Assert.assertTrue(taskDetails.containsValue(getval.trim()));
				
				getval = getText(facilityNameEditTask, driver);
				Assert.assertTrue(taskDetails.containsValue(getval.trim()));
				
				getval = getText(stateNameEditTask, driver);
				Assert.assertTrue(taskDetails.containsValue(getval.trim()));
				
				getval = getText(LicenseNameEditTask, driver);
				Assert.assertTrue(taskDetails.containsValue(getval.trim()));
				
				getval = getText(ActivityEditTask, driver);
				Assert.assertTrue(taskDetails.containsValue(getval.trim()));
				
				getval = getText(progressEditTask, driver).trim();
				if(!taskDetails.containsValue(getval))
					Assert.assertTrue(getval.equals("Incomplete"));
				else
					Assert.assertTrue(taskDetails.containsValue(getval));
			
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public Boolean verifyDeleteTaskButton(WebDriver driver) {
		try {
			waitForElementVisibility(deleteTaskBtn, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyUserRedirectToTaskSubpanel(WebDriver driver) {
		try {
			waitForElementVisibility(taskSection, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Boolean verifyTaskEditedSuccessfully(WebDriver driver) {
		waitTime(5000);
		try {
					
			for (int i = 2; i < 15; i++) {
				WebElement data = driver.findElement(By.xpath("(//tr[@class='odd']//td)[" + i + "]"));
				WebElement titel = driver.findElement(By.xpath("//tr[@role='row']//th[" + i + "]"));

				String getData = getValue(data, driver);
				String getTitel = getValue(titel, driver);
				taskDetails.put(getTitel.trim(), getData.trim());
				System.out.println(taskDetails.get(getTitel));

			}			
			taskDetails.containsValue(editTaskType);
			taskDetails.containsValue(editTaskStatus);
			taskDetails.containsValue(editTaskAssignee);			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void verifyFieldsInSpreadsheetMatchesOnTheTaskGrid(WebDriver driver) throws IOException {
		int countOfTite=1;
		int countOfExelSheetTitle=0; 
		String sheetValue ="";
		String dirPath = System.getProperty("user.dir") + "\\src\\test\\resources\\data\\ExcelFile";
	    File dir = new File(dirPath);
		File[] dir_contents = dir.listFiles();
		String fileName = dir_contents[0].getName();
		System.out.println("fileName:-"+fileName);
		Object[][] data = getData(fileName, "Sheet1");
		for (countOfTite = 2; countOfTite < 14; countOfTite++) {
//			if (countOfTite == 7) {
//				countOfTite += 1;
//			}
			WebElement title = driver.findElement(By.xpath("//tr[@role='row']//th[" + countOfTite + "]"));
			String getTitle = getValue(title, driver).trim();
			System.out.println("web page data"+getTitle);
			System.out.println("sheet data: "+data[0][countOfExelSheetTitle].toString());
//			if (countOfExelSheetTitle == 6) {
//			countOfExelSheetTitle++;
//			}
			sheetValue = data[0][countOfExelSheetTitle].toString().trim();
			
			if (sheetValue.equals("License Number")) {
				sheetValue ="License #";
			}
			Assert.assertTrue(sheetValue.equals(getTitle));
			countOfExelSheetTitle++;
		}
		//Delete the Excel file from the directory 	
		File path = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\data\\ExcelFile");
	    File[] files = path.listFiles();
	    for (File file : files) {
	        System.out.println("Deleted filename :"+ file.getName());
	        file.delete();
	    }
}


}
