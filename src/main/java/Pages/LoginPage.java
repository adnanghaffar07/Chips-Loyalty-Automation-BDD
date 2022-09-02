package Pages;

import Constants.Constants;
import Utils.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	private WebDriver podriver = null;

	String loginPageTitle = "//img[contains(@class,'img-')]";
	String loginUserNameTxt = "//input[@name='username']";
	String loginPasswordTxt = "//input[@name='password']";
	String loginCancelBtn = "//button[text()='CANCEL'] | //button[text()='Cancel']";
	String loginBtn = "//button[text()='LOGIN']";
	String loginAssistanceLink = "//a[text()='Login Assistance']";
	String atlasMainPageLogo = "//img[@class='logo']";
	String profileNameDropDown = "//li[@class='nav-item dropdown profile-name'][last()]";
	String dropDownLogoutOption = "//a[text()='Logout']";
	String logoImage = "//img[@src='https://stagingatlas.pharma.solutions/theme/build/images/logo.svg']";
	String invalidUsernamePasswordErrorMsg = "//p[text()[contains(.,'Invalid Username or Password . Please try again')]]";
	String usernameValidationMsg = "//input[@id='username'and//@required]";
	String passwordValidationMsg = "//input[@id='password'and//@required]";
	String yourDeviceOrNetworkIsNotRecognizedPopup = "//div[@id='text_error']";
	String enterValidationCode = "//input[@placeholder='Enter Validation Code'] | //input[@id='verificationCode']";
	String waitLoadingPagePopup = "//div[@class='col text-center company'] | //div[contains(text(),'Loading Please Wait..')]";
	String changePasswordOkBtn = "//a[@id='modal-danger-ok']";
	String newPasswordTxt = "//input[@name='new_password']";
	String confirmPasswordTxt = "//input[@name='confirm_password']";
	String cancelChangePasswordBtn = "//button[text()='CANCEL'] | //button[text()='Cancel']";
	String verificationCodeSubmitBtn = "//button[@id='verificationcode__submit']";






	public LoginPage(WebDriver driverParam) {
		this.podriver = driverParam;
		PageFactory.initElements(this.podriver, this);
	}

	public void navigateToUrl(WebDriver driver, String Url) throws InterruptedException {
		driver.get(Url);

	}

	public void enterUserName(WebDriver driver, String username) {
		waitForElementVisibility(loginUserNameTxt, "30", driver);
		type(loginUserNameTxt, username, driver);
	}

	public void enterPassword(WebDriver driver, String password) {
		waitForElementVisibility(loginPasswordTxt, "30", driver);
		type(loginPasswordTxt, password, driver);
	}
	
	public void enterUserName(WebDriver driver) {
		waitForElementVisibility(loginUserNameTxt, "30", driver);
		type(loginUserNameTxt, Constants.Username, driver);
	}

	public void enterPassword(WebDriver driver) {
		waitForElementVisibility(loginPasswordTxt, "30", driver);
		type(loginPasswordTxt, Constants.Password, driver);
	}

	public Boolean verifyLoginPageTitle(WebDriver driver) {
		try {
			waitForElementVisibility(loginPageTitle, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public Boolean verifyUserNameTextField(WebDriver driver) {
		try {
			waitForElementVisibility(loginUserNameTxt, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public Boolean verifyPasswordTextField(WebDriver driver) {
		try {
			waitForElementVisibility(loginPasswordTxt, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public Boolean verifyLoginButton(WebDriver driver) {
		try {
			waitForElementVisibility(loginBtn, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public Boolean verifyCancelButton(WebDriver driver) {
		try {
			waitForElementVisibility(loginCancelBtn, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public Boolean verifyLoginAssistanceLink(WebDriver driver) {
		try {
			waitForElementVisibility(loginAssistanceLink, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public void clickOnLoginButton(WebDriver driver) {
		waitForElementVisibility(loginBtn, "30", driver);
		click(loginBtn, driver);
	}

	public Boolean verifyAtlasMainPage(WebDriver driver) {
		try {
			try {
				driver.switchTo().alert().dismiss();
			} catch (Exception e) {
				// TODO: handle exception
			}
			waitForElementVisibility(atlasMainPageLogo, "30", driver);
			isElementDisplayed(atlasMainPageLogo, driver);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void clickOnProfileNameDropDown(WebDriver driver) {
		waitTime(10000);
		waitForElementVisibility(profileNameDropDown, "30", driver);
		click(profileNameDropDown, driver);
	}

	public void clickOnLogoutOption(WebDriver driver) {
		waitForElementVisibility(dropDownLogoutOption, "30", driver);
		click(dropDownLogoutOption, driver);
	}

	public void enterValuesInInputFieldsbuttonsLinkAreClickable(WebDriver driver) {
		waitForElementVisibility(loginUserNameTxt, "30", driver);
		type(loginUserNameTxt, "username", driver);
		String userNamevalue = getValue(loginUserNameTxt, driver);
		boolean userNameEqual = (userNamevalue.equals("username"));
		Assert.assertTrue(userNameEqual);

		type(loginPasswordTxt, "password", driver);
		String passwordValue = getValue(loginPasswordTxt, driver);
		boolean equal = (passwordValue.equals("password"));
		Assert.assertTrue(equal);

		Assert.assertTrue(isClickable(loginCancelBtn, driver));

		Assert.assertTrue(isClickable(loginBtn, driver));

		Assert.assertTrue(isClickable(loginAssistanceLink, driver));

	}

	public void LogoAndBackgroundImageShouldBeVisibleProperly(WebDriver driver) {
		waitForElementVisibility(logoImage, "30", driver);
		}

	public void browserTabNameShouldDisplayedWithTheTabNameLogin(WebDriver driver) {
		waitForElementVisibility(logoImage, "30", driver);
		String titleText = driver.getTitle();
		boolean equal = (titleText.equals("Login"));
		Assert.assertTrue(equal);
	}

	public void inputFieldsShouldHaveAProperPlaceHolderName(WebDriver driver) {
		waitForElementVisibility(loginUserNameTxt, "30", driver);
		String userNamevalue = getPlaceHolder(loginUserNameTxt, driver);
		boolean userNameEqual = (userNamevalue.equals(userNamevalue));
		Assert.assertTrue(userNameEqual);

		type(loginPasswordTxt, "password", driver);
		String passwordValue = getPlaceHolder(loginPasswordTxt, driver);
		boolean equal = (passwordValue.equals(passwordValue));
		Assert.assertTrue(equal);
	}

	public Boolean verifyinvalidUsernamePasswordPleaseTryAgainLabel(WebDriver driver) {
		try {
			waitForElementVisibility(invalidUsernamePasswordErrorMsg, "30", driver);
			isElementDisplayed(invalidUsernamePasswordErrorMsg, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyPasswordValuedisplayedDotsOrAsterisksCharacters(WebDriver driver) {
		try {
			type(loginPasswordTxt, "password", driver);
			String passwordValue = getValue(loginPasswordTxt, driver);
			boolean equal = (passwordValue.equals("password"));
			Assert.assertTrue(equal);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyUsernameValidationMsg(WebDriver driver) {
		try {
			waitForElementVisibility(usernameValidationMsg, "30", driver);
			clearTextField(passwordValidationMsg, driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyPasswordValidationMsg(WebDriver driver) {
		try {
			waitForElementVisibility(passwordValidationMsg, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnLoginButtonWithoutValuesInUsernameAndPasswordFields(WebDriver driver) {
		waitForElementVisibility(loginBtn, "30", driver);
		clearTextField(passwordValidationMsg, driver);
		clearTextField(usernameValidationMsg, driver);
		click(loginBtn, driver);
	}
	
	public void clickOnSessionPopupCancelButton(WebDriver driver) throws InterruptedException {
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
		}
		
		WaitForElementDisapper(waitLoadingPagePopup, driver);
	}

	public Boolean verifyProfileNameDropDown(WebDriver driver) {
		try {
			waitForElementVisibility(profileNameDropDown, "30", driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Boolean verifyTemporaryPasswordChangeMsg(WebDriver driver) {
		try {
			waitForElementVisibility(yourDeviceOrNetworkIsNotRecognizedPopup, "30", driver);
			System.out.println("temporary password change Msg : ");
			click(changePasswordOkBtn,driver);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void enterNewPassword(WebDriver driver, String password) {
		waitForElementVisibility(newPasswordTxt, "30", driver);
		type(newPasswordTxt, password, driver);
	}

	public void enterConfirmPassword(WebDriver driver, String password) {
		waitForElementVisibility(confirmPasswordTxt, "30", driver);
		type(confirmPasswordTxt, password, driver);
	}

	public void clickOnCancelPasswordChangeButton(WebDriver driver) {
		waitForElementVisibility(cancelChangePasswordBtn, "30", driver);
		click(cancelChangePasswordBtn, driver);
	}
	public Boolean verifyVerificationCodeMsg(WebDriver driver) {
		try {
			waitForElementVisibility(yourDeviceOrNetworkIsNotRecognizedPopup, "30", driver);
			System.out.println("Verification message : ");
			Assert.assertTrue(getValue(yourDeviceOrNetworkIsNotRecognizedPopup,driver).contains("For security reasons, we have sent a Validation Code to your email id. Please enter the Validation Code to proceed"));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnPopUpOkButton(WebDriver driver){
		waitForElementVisibility(changePasswordOkBtn,"30",driver);
		click(changePasswordOkBtn,driver);
	}

	public void enterValidationCode(WebDriver driver, String code) {
		waitForElementVisibility(enterValidationCode, "30", driver);
		type(enterValidationCode, code, driver);
	}

	public void clickOnSubmitVerificationCodeSubmitButton(WebDriver driver) {
		waitForElementVisibility(verificationCodeSubmitBtn, "30", driver);
		click(verificationCodeSubmitBtn, driver);
	}
}
