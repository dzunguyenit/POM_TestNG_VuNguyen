package com.bankguru.customer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;
import com.bankguru.HomePage;
import com.bankguru.LoginPage;
import com.bankguru.NewCustomerPage;
import com.bankguru.RegisterPage;

import commons.AbstractTest;

public class NewCustomer extends AbstractTest {

	WebDriver driver;
	String email, usernameCustomer, loginURL, usernameLogin, passwordLogin, emailUpdate, nummericValueName,
			specialCharacterName, nummericValueCity, specialCharacterCity, nummericValueState, specialCharacterState,
			CharValueState, digit, specialCharacterPin, pinBlankSpace, specialCharacterTelephone, telephoneBlankSpace,
			incorrectEmail, nameCannotEmptyMsg, cannotBeNumbericMsg, cannotSpecialCharacterMsg, mustBeNumbericMsg,
			cannotFirstCharacterBlankSpaceMsg, cityCannotEmptyMsg, addressCannotEmptyMsg, stateCannotEmptyMsg,
			pinCannotEmptyMsg, pinMustHave6DigitsMsg, emailCannotEmptyMsg, telephoneCannotEmptyMsg,
			emailIncorrectFormatMsg, namemustBeNumbericMsg, firstCharacterBlankSpaceMsg;
	private LoginPage loginPage;
	private RegisterPage registerPage;
	private HomePage homePage;
	private NewCustomerPage newCustomerPage;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {
		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		loginPage = PageFactory.getLoginPage(driver);
		email = "automation" + randomEmail() + "@gmail.com";
		emailUpdate = "testing" + randomEmail() + "@gmail.com";

		nummericValueName = "123456";
		specialCharacterName = "name!@#";
		nummericValueCity = "1234";
		specialCharacterCity = "!@#";
		nummericValueState = "4567";
		specialCharacterState = "!@#**";
		CharValueState = "ABC";
		digit = "123";
		specialCharacterPin = "@#";
		pinBlankSpace = "12 345";
		specialCharacterTelephone = "@#98";
		telephoneBlankSpace = "012 11122";
		incorrectEmail = "Guru99@";

		nameCannotEmptyMsg = "Customer name must not be blank";
		cannotBeNumbericMsg = "Numbers are not allowed";
		cannotSpecialCharacterMsg = "Special characters are not allowed";
		firstCharacterBlankSpaceMsg = "First character can not have space";
		mustBeNumbericMsg = "Characters are not allowed";
		namemustBeNumbericMsg = "Numbers are not allowed";
		cityCannotEmptyMsg = "City Field must not be blank";
		addressCannotEmptyMsg = "Address Field must not be blank";
		stateCannotEmptyMsg = "State must not be blank";

		pinCannotEmptyMsg = "PIN Code must not be blank";
		pinMustHave6DigitsMsg = "PIN Code must have 6 Digits";
		telephoneCannotEmptyMsg = "Mobile no must not be blank";
		emailCannotEmptyMsg = "Email-ID must not be blank";
		emailIncorrectFormatMsg = "Email-ID is not valid";

		log.info("Pre-condition Step 01 - Get login page URL");
		loginURL = loginPage.getLoginPageUrl();
		log.info("Pre-condition Step 02 - Click Here link");
		registerPage = loginPage.clickHereLink();
		log.info("Pre-condition Step 03 - Input email");
		registerPage.inputEmail(email);
		log.info("Pre-condition Step 04 - Click Submit button");
		registerPage.clickSubmitButton();
		usernameLogin = registerPage.getUserIDInfo();
		passwordLogin = registerPage.getPasswordIDInfo();

		loginPage = registerPage.openLoginPage(loginURL);
		loginPage.inputEmail(usernameLogin);
		loginPage.inputPassword(passwordLogin);
		homePage = loginPage.clickSubmitButton();

	}

	@Test
	public void TC_01_NameCannotEmpty() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Button Tab Name Field");
		newCustomerPage.pressTabNameField();
		log.info("New Customer_01 Step 03 - Verify Text Username Error");
		verifyEquals(nameCannotEmptyMsg, newCustomerPage.getTextUsernameErr());

	}

	@Test
	public void TC_02_NameCannotBeNumberic() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Nummeric Name Field");
		newCustomerPage.enterNummericNameField(nummericValueName);
		log.info("New Customer_01 Step 03 - Verify Text Username Error");
		verifyEquals(namemustBeNumbericMsg, newCustomerPage.getTextUsernameErr());

	}

	@Test
	public void TC_03_NameCannotHaveSpecialCharacter() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Special Character Name Field");
		newCustomerPage.enterSpecialCharacterNameField(specialCharacterName);
		log.info("New Customer_01 Step 03 - Verify Text Username Error");
		verifyEquals(cannotSpecialCharacterMsg, newCustomerPage.getTextUsernameErr());

	}

	@Test
	public void TC_04_NameCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Space Character Name Field");
		newCustomerPage.pressSpaceNameField();
		log.info("New Customer_01 Step 03 - Verify Text Username Error");
		verifyEquals(firstCharacterBlankSpaceMsg, newCustomerPage.getTextUsernameErr());

	}

	@Test
	public void TC_05_AddressCannotEmpty() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Button Tab Addres sField");
		newCustomerPage.pressTabAddressField();
		log.info("New Customer_01 Step 03 - Verify Text Address Error");
		verifyEquals(addressCannotEmptyMsg, newCustomerPage.getTextAddressErr());

	}

	@Test
	public void TC_06_AddressCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Space Address Field");
		newCustomerPage.pressSpaceAddressField();
		log.info("New Customer_01 Step 03 - Verify Text Address Error");
		verifyEquals(firstCharacterBlankSpaceMsg, newCustomerPage.getTextAddressErr());

	}

	@Test
	public void TC_07_CityCannotEmpty() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Button Tab City Field");
		newCustomerPage.pressTabCityField();
		log.info("New Customer_01 Step 03 - Verify Text City Error");
		verifyEquals(cityCannotEmptyMsg, newCustomerPage.getTextCityErr());

	}

	@Test
	public void TC_08_CityCannotBeNumberic() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Nummeric City Field");
		newCustomerPage.enterNummericCityField(nummericValueCity);
		log.info("New Customer_01 Step 03 - Verify Text City Error");
		verifyEquals(cannotBeNumbericMsg, newCustomerPage.getTextCityErr());

	}

	@Test
	public void TC_09_NameCannotHaveSpecialCharacter() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Special Character City Field");
		newCustomerPage.enterSpecialCharacterCityField(specialCharacterCity);
		log.info("New Customer_01 Step 03 - Verify Text City Error");
		verifyEquals(cannotSpecialCharacterMsg, newCustomerPage.getTextCityErr());

	}

	@Test
	public void TC_10_CityCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Space Address Field");
		newCustomerPage.pressSpaceAddressField();
		log.info("New Customer_01 Step 03 - Verify Text Address Error");
		verifyEquals(firstCharacterBlankSpaceMsg, newCustomerPage.getTextAddressErr());

	}

	@Test
	public void TC_11_StateCannotEmpty() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Tab State Field");
		newCustomerPage.pressTabStateField();
		log.info("New Customer_01 Step 03 - Verify Text State Error");
		verifyEquals(stateCannotEmptyMsg, newCustomerPage.getTextStateErr());

	}

	@Test
	public void TC_12_StateCannotBeNumberic() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Nummeric State Field");
		newCustomerPage.enterNummericStateField(nummericValueState);
		log.info("New Customer_01 Step 03 - Verify Text State Error");
		verifyEquals(cannotBeNumbericMsg, newCustomerPage.getTextStateErr());

	}

	@Test
	public void TC_13_StateCannotHaveSpecialCharacter() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Special Character State Field");
		newCustomerPage.enterSpecialCharacterStateField(specialCharacterState);
		log.info("New Customer_01 Step 03 - Verify Text State Error");
		verifyEquals(cannotSpecialCharacterMsg, newCustomerPage.getTextStateErr());

	}

	@Test
	public void TC_14_StateCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Space State Field");
		newCustomerPage.pressSpaceStateField();
		log.info("New Customer_01 Step 03 - Verify Text State Error");
		verifyEquals(firstCharacterBlankSpaceMsg, newCustomerPage.getTextStateErr());

	}

	@Test
	public void TC_15_PinMustBeNumeric() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Char Pin Field");
		newCustomerPage.enterCharPinField(CharValueState);
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(mustBeNumbericMsg, newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_16_PinCannotEmpty() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Tab Pin Field");
		newCustomerPage.pressTabPinField();
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(pinCannotEmptyMsg, newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_17_PinMustHave6Digits() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Digit");
		newCustomerPage.enterDigit(digit);
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(pinMustHave6DigitsMsg, newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_18_PinCannotHaveSpecialCharacter() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Special Character Pin Field");
		newCustomerPage.enterSpecialCharacterPinField(specialCharacterPin);
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(cannotSpecialCharacterMsg, newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_19_PinCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Space Pin Field");
		newCustomerPage.pressSpacePinField();
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(firstCharacterBlankSpaceMsg, newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_20_PinCannotHaveBlankSpace() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Blank Space Pin Field");
		newCustomerPage.enterBlankSpacePinField(pinBlankSpace);
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(mustBeNumbericMsg, newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_21_TelephoneCannotEmpty() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Tab Telephone Field");
		newCustomerPage.pressTabTelephoneField();
		log.info("New Customer_01 Step 03 - Verify Text Telephone Error");
		verifyEquals(telephoneCannotEmptyMsg, newCustomerPage.getTextTelePhoneErr());

	}

	@Test
	public void TC_22_TelephoneCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Space TelePhone Field");
		newCustomerPage.pressSpaceTelePhoneField();
		log.info("New Customer_01 Step 03 - Verify Text Telephone Error");
		verifyEquals(firstCharacterBlankSpaceMsg, newCustomerPage.getTextTelePhoneErr());

	}

	@Test
	public void TC_23_TelephoneCannotHaveBlankSpace() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Blank Space Telephone Field");
		newCustomerPage.enterBlankSpaceTelephoneField(telephoneBlankSpace);
		log.info("New Customer_01 Step 03 - Verify Text Telephone Error");
		verifyEquals(mustBeNumbericMsg, newCustomerPage.getTextTelePhoneErr());

	}

	@Test
	public void TC_24_TelephoneCannotHaveSpecialCharacter() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Special Character TelePhone Field");
		newCustomerPage.enterSpecialCharacterTelePhoneField(specialCharacterTelephone);
		log.info("New Customer_01 Step 03 - Verify Text Telephone Error");
		verifyEquals(cannotSpecialCharacterMsg, newCustomerPage.getTextTelePhoneErr());

	}

	@Test
	public void TC_25_EmailCannotEmpty() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Emaile Field");
		newCustomerPage.pressEmaileField();
		log.info("New Customer_01 Step 03 - Verify Text Email Error");
		verifyEquals(emailCannotEmptyMsg, newCustomerPage.getTextEmailErr());

	}

	@Test
	public void TC_26_EmailIncorrectFormat() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Enter Incorrect Email");
		newCustomerPage.enterIncorrectEmail(incorrectEmail);
		log.info("New Customer_01 Step 03 - Verify Text Email Error");
		verifyEquals(emailIncorrectFormatMsg, newCustomerPage.getTextEmailErr());

	}

	@Test
	public void TC_27_EmailCannotHaveBlankSpace() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("New Customer_01 Step 02 - Press Space Email Field");
		newCustomerPage.pressSpaceEmailField();
		log.info("New Customer_01 Step 03 - Verify Text Email Error");
		verifyEquals(firstCharacterBlankSpaceMsg, newCustomerPage.getTextEmailErr());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
