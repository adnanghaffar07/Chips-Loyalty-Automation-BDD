package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;


import Utils.BaseClass;



public class BrandAccountCreationPage extends BaseClass {
	private WebDriver podriver = null;

	String activitiesGrid = "(//div[@class='mbp'])[3]";
	String companySearch = "//input[@id='myInput1']";
	String compMgrSearch = "//input[@id='myInput0']";
	

	public BrandAccountCreationPage(WebDriver driverParam) {
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
}
