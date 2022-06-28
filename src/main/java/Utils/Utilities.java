package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities extends Waits {

	public static void waitForElementVisibility(String xpath, String timeoutInSeconds, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		scrollToElement(element, driver);
		WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(timeoutInSeconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForElementVisibility(WebElement element, String timeoutInSeconds, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Long.parseLong(timeoutInSeconds));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void type(WebElement element, int timeInSecond, String value, WebDriver driver) {
		waitForElementVisibility(element, Integer.toString(timeInSecond), driver);
		waitForElementClickable(element, Integer.toString(timeInSecond), driver);
		scrollToElement(element, driver);
		element.clear();
		element.sendKeys(value);
	}

	public static void waitForElementClickable(WebElement element, String timeoutInSeconds, WebDriver driver) {
		WebDriverWait waitClickable = new WebDriverWait(driver, Long.parseLong(timeoutInSeconds));
		waitClickable.until(ExpectedConditions.elementToBeClickable(element));

	}

	public static void type(WebElement element, String value, WebDriver driver) {
		waitUntilElementDisplayed(element, driver);
		element.clear();
		try {
			element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			element.sendKeys(Keys.DELETE);
			System.out.println("Entered :" + value);
			element.sendKeys(value);
		} catch (Exception e) {
			element.sendKeys(value);
		}

	}

	public static void type(String xpath, String value, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.clear();
		try {
			element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			element.sendKeys(Keys.DELETE);
			System.out.println("Entered :" + value);
			element.sendKeys(value);
		} catch (Exception e) {
			element.sendKeys(value);
		}

	}

	public static void clearTextField(String xpath, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.clear();
		try {
			element.sendKeys(Keys.chord(Keys.CONTROL, "a"));
			element.sendKeys(Keys.DELETE);
		} catch (Exception e) {

		}

	}

	public static String getText(String xpath, WebDriver driver) {
		String getval;
		WebElement element = driver.findElement(By.xpath(xpath));
		getval = element.getText();
		System.out.println("name" + getval);
		return getval;
	}

	public static String getValue(String xpath, WebDriver driver) {
		String getval;
		WebElement element = driver.findElement(By.xpath(xpath));
		getval = element.getAttribute("value");
		System.out.println("name" + getval);
		return getval;
	}
	
	public static String getValue(WebElement element, WebDriver driver) {
		String getval;
		getval = element.getAttribute("innerHTML");
		System.out.println("name" + getval);
		return getval;
	}
	
	public static String getValueFromAttribute(String xpath, WebDriver driver) {
		String getval;
		WebElement element = driver.findElement(By.xpath(xpath));
		getval = element.getAttribute("innerHTML");
		System.out.println("name" + getval);
		return getval;
	}

	public static String getPlaceHolder(String xpath, WebDriver driver) {
		String getval;
		WebElement element = driver.findElement(By.xpath(xpath));
		getval = element.getAttribute("placeholder");
		System.out.println("name" + getval);
		return getval;
	}

	public static void waitUntilElementDisplayed(final WebElement webElement, WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		ExpectedCondition elementIsDisplayed = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver arg0) {
				try {
					webElement.isDisplayed();
					return true;
				} catch (NoSuchElementException e) {
					return false;
				} catch (StaleElementReferenceException f) {
					return false;
				}
			}
		};
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void click(WebElement element, WebDriver driver) {
		scrollIntoViewSmoothly(element, driver);
		waitForElementVisibility(element, "30", driver);
		waitForElementClickable(element, "20", driver);
		element.click();
		Waits.wait5s();
	}

	public static void click(String xpath, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		scrollIntoViewSmoothly(element, driver);
		waitForElementVisibility(element, "30", driver);
		waitForElementClickable(element, "20", driver);
		System.out.println("click:  ");
		element.click();
		System.out.println("click:  ");
		Waits.wait5s();

	}

	public static void doubleClick(String xpath, WebDriver driver) {
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(xpath));
		scrollIntoViewSmoothly(element, driver);
		waitForElementVisibility(element, "30", driver);
		waitForElementClickable(element, "20", driver);
		System.out.println("click:  ");

		actions.doubleClick(element).perform();

		System.out.println("click:  ");
		Waits.wait5s();
		Waits.waitTime(10000);

	}

	public static void clickJs(String xpath, WebDriver driver) {
		Waits.wait5s();
		WebElement element = driver.findElement(By.xpath(xpath));
//		scrollIntoViewSmoothly(element, driver);
//		waitForElementVisibility(element, "30", driver);
//		waitForElementClickable(element, "20", driver);
		System.out.println("click: Js ");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("click: js ");
		js.executeScript("arguments[0].click();", element);
		Waits.wait5s();

	}

	public static void scrollIntoViewSmoothly(WebElement Element, WebDriver driver) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})",
				Element);
	}

	public static void scrollToElement(WebElement element, WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		((JavascriptExecutor) driver).executeScript("window.scrollTo( 0, -150)");
		boolean isDisplay = isElementDisplayed(element, driver);
		if (!isDisplay) {
			((JavascriptExecutor) driver).executeScript("window.scrollTo( 0, -100)");
		}
	}
	
	public static void scrollToElement(String xpath, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		((JavascriptExecutor) driver).executeScript("window.scrollTo( 0, -150)");
		boolean isDisplay = isElementDisplayed(element, driver);
		if (!isDisplay) {
			((JavascriptExecutor) driver).executeScript("window.scrollTo( 0, -100)");
		}
	}

	public static boolean isElementDisplayed(String xpath, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		try {
			if (element.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public static boolean isElementDisplayed(WebElement element, WebDriver driver) {
		try {
			if (element.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public void verifyText(WebElement element, String expectedText) {
		String actualText = element.getText();
		if (actualText.equals(expectedText)) {
			System.out.println("Value Matches");
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	public static boolean isDisabeld(String xpath, WebDriver driver) {
		boolean isDisabeld;
		WebElement element = driver.findElement(By.xpath(xpath));
		isDisabeld = element.isEnabled();
		return isDisabeld;
	}
	
	public static boolean isDisplayed(String xpath, WebDriver driver) {
		boolean isDisplayed;
		WebElement element = driver.findElement(By.xpath(xpath));
		isDisplayed = element.isDisplayed();
		return isDisplayed;
	}
	
	

}
