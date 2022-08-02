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
	String dateValueTaskAdd = "(//p[contains(text(),'Date')])[1]/following-sibling::p";
	
	
	
	String assigneeValueAfter="";
	String taskDateSelect="";
	

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
			Assert.assertFalse("Verify type DropDown is Editable",
					typeValueAfter.equals(typeValueBefore));
			
			waitForElementVisibility(taskStatusMandatory, "20", driver);
			Select taskStatusValDropDown = new Select(driver.findElement(By.xpath(taskStatusDropDown)));
			WebElement taskStatusOption = taskStatusValDropDown.getFirstSelectedOption();
			String taskStatusValueBefore = taskStatusOption.getText();
			taskStatusValDropDown.selectByIndex(1);
			taskStatusOption = taskStatusValDropDown.getFirstSelectedOption();
			String taskStatusValueAfter = taskStatusOption.getText();
			Assert.assertFalse("Verify Task Status DropDown is Editable",
					taskStatusValueAfter.equals(taskStatusValueBefore));
			
			waitForElementVisibility(assigneeMandatory, "20", driver);
			Select assigneeValDropDown = new Select(driver.findElement(By.xpath(assigneeDropDown)));
			WebElement assigneeOption = assigneeValDropDown.getFirstSelectedOption();
			String assigneeValueBefore = assigneeOption.getText();
			assigneeValDropDown.selectByIndex(1);
			assigneeOption = assigneeValDropDown.getFirstSelectedOption();
			assigneeValueAfter = assigneeOption.getText();
			Assert.assertFalse("Verify type DropDown is Editable",
					assigneeValueAfter.equals(assigneeValueBefore));
			
			waitForElementVisibility(dueDateMandatory, "20", driver);			
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
