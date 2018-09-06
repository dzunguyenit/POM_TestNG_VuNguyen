package com.bankguru.customer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;
import com.bankguru.EditCustomerPage;
import com.bankguru.HomePage;
import com.bankguru.LoginPage;
import com.bankguru.NewCustomerPage;
import com.bankguru.RegisterPage;

import commons.AbstractTest;

public class EditCustomer extends AbstractTest {

	WebDriver driver;
	String email, usernameCustomer, loginURL, usernameLogin, passwordLogin, emailUpdate, userID,
			nummericValueIdCustomer, specialCharacterCustomerId, nummericCityField, specialCharacterCityUpdate,
			nummericStateField, specialCharacterStateUpdate, pinNumberic, digitUpdate, specialCharacterPinUpdate,
			specialCharacterTelephoneUpdate, invalidEmail, customerName, dateOfBirth, address, city, state, PIN,
			mobileNumber, passwordCustomer, cannotBeNumbericMsg, cannotSpecialCharacterMsg,
			cannotFirstCharacterBlankSpaceMsg, mustBeNumbericMsg, cityCannotEmptyMsg, addressCannotEmptyMsg,
			stateCannotEmptyMsg, pinCannotEmptyMsg, pinMustHave6DigitsMsg, telephoneCannotEmptyMsg, emailCannotEmptyMsg,
			emailIncorrectFormatMsg;
	private LoginPage loginPage;
	private RegisterPage registerPage;
	private HomePage homePage;
	private NewCustomerPage newCustomerPage;
	private EditCustomerPage editCustomerPage;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {
		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		loginPage = PageFactory.getLoginPage(driver);
		email = "automation" + randomEmail() + "@gmail.com";
		emailUpdate = "testing" + randomEmail() + "@gmail.com";

		customerName = "AUTOMATION TESTING";
		dateOfBirth = "01/01/1989";
		address = "PO Box 911 8331 Duis Avenue";
		city = "Tampa";
		state = "FL";
		PIN = "466250";
		mobileNumber = "4555442476";
		passwordCustomer = "automation";
		nummericValueIdCustomer = "1236Acc";
		specialCharacterCustomerId = "^%$^";
		nummericCityField = "city123";
		specialCharacterCityUpdate = "*^##";
		nummericStateField = "1234";
		specialCharacterStateUpdate = "*^#";
		pinNumberic = "PIN123";
		digitUpdate = "321";
		specialCharacterPinUpdate = "@@@";
		specialCharacterTelephoneUpdate = "8877@@@";
		invalidEmail = "Guru99@";

		cannotBeNumbericMsg = "Numbers are not allowed";
		cannotSpecialCharacterMsg = "Special characters are not allowed";
		cannotFirstCharacterBlankSpaceMsg = "First character can not have space";
		mustBeNumbericMsg = "Characters are not allowed";
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
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.inputCustomerName(customerName);
		newCustomerPage.inputDateOfBirth(dateOfBirth);
		newCustomerPage.inputAddress(address);
		newCustomerPage.inputCity(city);
		newCustomerPage.inputState(state);
		newCustomerPage.inputPIN(PIN);
		newCustomerPage.inputMobileNumber(mobileNumber);
		newCustomerPage.inputEmail(email);
		newCustomerPage.inputPassword(passwordCustomer);
		newCustomerPage.clickSubmit();
		verifyEquals("Customer Registered Successfully!!!", newCustomerPage.getTextMessageCreateCustomerSucces());
		userID = newCustomerPage.getTextUserID();

	}

	@Test
	public void TC_01_CustomerIdCanotEmpty() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Press Tab CustomerId Field");
		editCustomerPage.pressTabCustomerIdField();
		log.info("Edit Customer_01 Step 03 - Verify Text Error CustomerID");
		verifyEquals("Customer ID is required", editCustomerPage.getTextCustomerIdErr());

	}

	@Test
	public void TC_02_CustomerIdCannotBeNumberic() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = homePage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Enter Nummeric CustomerId Field");
		editCustomerPage.enterNummericCustomerIdField(nummericValueIdCustomer);
		log.info("Edit Customer_01 Step 03 - Verify Text Error CustomerID");
		verifyEquals(mustBeNumbericMsg, editCustomerPage.getTextCustomerIdErr());

	}

	@Test
	public void TC_03_CustomerIdCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = homePage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Enter Special Character CustomerId Field");
		editCustomerPage.enterSpecialCharacterCustomerIdField(specialCharacterCustomerId);
		log.info("Edit Customer_01 Step 03 - Verify Text Error CustomerID");
		verifyEquals(cannotSpecialCharacterMsg, editCustomerPage.getTextCustomerIdErr());

	}

	@Test
	public void TC_04_ValidCustomerId() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Verify Navigate Edit Customer");
		verifyEquals("http://demo.guru99.com/v4/manager/editCustomerPage.php", editCustomerPage.getUrlEditCustomer());

	}

	// Testcas 05, 06, 07: Skip

	// @Test
	// public void TC_05_NameCannotEmpty() {
	// editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
	// editCustomerPage.inputIdCustomer(userID);
	// editCustomerPage.clickSubmitToEditInfor();
	// editCustomerPage.pressTabNameField();
	// verifyEquals("Customer name must not be blank",
	// editCustomerPage.getTextUsernameErr());
	//
	// }
	//
	// @Parameters({ "nummericValueNameUpdate" })
	// @Test
	// public void TC_06_NameCannotBeNumberic(String nummericValueNameUpdate) {
	// editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
	// editCustomerPage.inputIdCustomer(userID);
	// editCustomerPage.clickSubmitToEditInfor();
	// editCustomerPage.enterNummericNameField(nummericValueNameUpdate);
	// verifyEquals("Numbers are not allowed",
	// editCustomerPage.getTextUsernameErr());
	//
	// }
	//
	// @Parameters({ "specialCharacterNameUpdate" })
	// @Test
	// public void TC_07_NameCannotHaveSpecialCharacter(String
	// specialCharacterNameUpdate) {
	// editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
	// editCustomerPage.inputIdCustomer(userID);
	// editCustomerPage.clickSubmitToEditInfor();
	// editCustomerPage.enterSpecialCharacterNameField(specialCharacterNameUpdate);
	// verifyEquals(cannotSpecialCharacterMsg,
	// editCustomerPage.getTextUsernameErr());
	//
	// }

	@Test
	public void TC_08_AddressCannotEmpty() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab Addres sField");
		editCustomerPage.pressTabAddressField();
		log.info("Edit Customer_01 Step 05 - Verify Text Address Error");
		verifyEquals(addressCannotEmptyMsg, editCustomerPage.getTextAddressErr());

	}

	@Test
	public void TC_09_CityCannotEmpty() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab City Field");
		editCustomerPage.pressTabCityField();
		log.info("Edit Customer_01 Step 05 - Verify Text City Error");
		verifyEquals(cityCannotEmptyMsg, editCustomerPage.getTextCityErr());

	}

	@Test
	public void TC_10_CityCannotBeNumberic() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Nummeric City Field");
		editCustomerPage.enterNummericCityField(nummericCityField);
		log.info("Edit Customer_01 Step 05 - Verify Text City Error");
		verifyEquals(cannotBeNumbericMsg, editCustomerPage.getTextCityErr());

	}

	@Test
	public void TC_11_CityCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character City Field");
		editCustomerPage.enterSpecialCharacterCityField(specialCharacterCityUpdate);
		log.info("Edit Customer_01 Step 05 - Verify Text City Error");
		verifyEquals(cannotSpecialCharacterMsg, editCustomerPage.getTextCityErr());

	}

	@Test
	public void TC_12_StateCannotEmpty() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab State Field");
		editCustomerPage.pressTabStateField();
		log.info("Edit Customer_01 Step 05 - Verify Text State Error");
		verifyEquals(stateCannotEmptyMsg, editCustomerPage.getTextStateErr());

	}

	@Test
	public void TC_13_StateCannotBeNumberic() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Nummeric State Field");
		editCustomerPage.enterNummericStateField(nummericStateField);
		log.info("Edit Customer_01 Step 05 - Verify Text State Error");
		verifyEquals(cannotBeNumbericMsg, editCustomerPage.getTextStateErr());

	}

	@Test
	public void TC_14_StateCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character State Field");
		editCustomerPage.enterSpecialCharacterStateField(specialCharacterStateUpdate);
		log.info("Edit Customer_01 Step 05 - Verify Text State Error");
		verifyEquals(cannotSpecialCharacterMsg, editCustomerPage.getTextStateErr());

	}

	@Test
	public void TC_15_PinMustBeNumeric() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Char Pin Field");
		editCustomerPage.enterCharPinField(pinNumberic);
		log.info("Edit Customer_01 Step 05 - Verify Text Pin Error");
		verifyEquals(mustBeNumbericMsg, editCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_16_PinCannotEmpty() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab Pin Field");
		editCustomerPage.pressTabPinField();
		log.info("Edit Customer_01 Step 05 - Verify Text Pin Error");
		verifyEquals(pinCannotEmptyMsg, editCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_17_PinMustHave6Digits() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Digit");
		editCustomerPage.enterDigit(digitUpdate);
		log.info("Edit Customer_01 Step 05 - Verify Text Pin Error");
		verifyEquals(pinMustHave6DigitsMsg, editCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_18_PinCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character Pin Field");
		editCustomerPage.enterSpecialCharacterPinField(specialCharacterPinUpdate);
		log.info("Edit Customer_01 Step 05 - Verify Text Pin Error");
		verifyEquals(cannotSpecialCharacterMsg, editCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_19_TelephoneCannotEmpty() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab Telephone Field");
		editCustomerPage.pressTabTelephoneField();
		log.info("Edit Customer_01 Step 05 - Verify Text Telephone Error");
		verifyEquals(telephoneCannotEmptyMsg, editCustomerPage.getTextTelephoneErr());

	}

	@Test
	public void TC_20_TelephoneCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character Telephone Field");
		editCustomerPage.enterSpecialCharacterTelephoneField(specialCharacterTelephoneUpdate);
		log.info("Edit Customer_01 Step 05 - Verify Text Telephone Error");
		verifyEquals(cannotSpecialCharacterMsg, editCustomerPage.getTextTelephoneErr());

	}

	@Test
	public void TC_21_EmailCannotEmpty() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab Email Field");
		editCustomerPage.pressTabEmailField();
		log.info("Edit Customer_01 Step 05 - Verify Text Email Error");
		verifyEquals(emailCannotEmptyMsg, editCustomerPage.getTextEmailErr());

	}

	@Test
	public void TC_22_EmailIncorrectFormat() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Invalid Email");
		editCustomerPage.enterInvalidEmail(invalidEmail);
		log.info("Edit Customer_01 Step 05 - Verify Text Email Error");
		verifyEquals(emailIncorrectFormatMsg, editCustomerPage.getTextEmailErr());

	}

	@Test
	public void TC_23_EmailCannotHaveBlankSpace() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Space Email Field");
		editCustomerPage.pressSpaceEmailField();
		log.info("Edit Customer_01 Step 05 - Verify Text Email Error");
		verifyEquals(cannotFirstCharacterBlankSpaceMsg, editCustomerPage.getTextEmailErr());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
