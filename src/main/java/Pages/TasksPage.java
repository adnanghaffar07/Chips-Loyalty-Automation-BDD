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


public class TasksPage extends BaseClass {
	private WebDriver podriver = null;

	String goToTasks = "(//span[@title='Go To Tasks'])[2]";
	String taskSubpanel = "(//button[@type='submit'])[2] | //button[contains(@class,'editcenter')]";
	

	public TasksPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}
	
	public void clickOnGoToTasksButton(WebDriver driver) {
		waitTime(6000);
//		waitForElementVisibility(goToTasks, "30", driver);
//		scrollToElement(goToTasks, driver);
		waitTime(6000);
		click(goToTasks, driver);
	}

	public Boolean verifyTaskSubpanel(WebDriver driver) {
		try {
			waitForElementVisibility(taskSubpanel, "20", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
