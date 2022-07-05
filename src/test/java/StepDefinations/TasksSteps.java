package StepDefinations;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

import Constants.Constants;
import Pages.ActivitesGridPage;
import Pages.ChangePasswordPage;
import Pages.DashboardPage;
import Pages.LicenseGridPage;
import Pages.LoginPage;
import Pages.TasksPage;
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

public class TasksSteps extends BaseClass {
	TasksPage tasksPage = new TasksPage(driver);
	
	
	@Then("^I click on go to tasks button$")
	public void clickOnGoToTasksButton() {
		tasksPage.clickOnGoToTasksButton(driver);
	}
	
	
	@Then("^I see the tasks page$")
	public void verifyLicenseWithExpirationFieldPopulated() throws InterruptedException {
		Assert.assertTrue(tasksPage.verifyTaskSubpanel(driver));
	}
	
}
