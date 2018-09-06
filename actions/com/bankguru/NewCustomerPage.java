package com.bankguru;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.bankguru.ui.CustomerPageUI;

public class NewCustomerPage extends AbstractPage {
	WebDriver driver;

	public NewCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputCustomerName(String customerName) {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERNAME_TXT);
		sendKeyToElement(driver, CustomerPageUI.CUSTOMERNAME_TXT, customerName);
	}

	public void inputDateOfBirth(String dateOfBirth) {
		waitForControlVisible(driver, CustomerPageUI.DATEOFBIRTH_TXT);
		sendKeyToElement2(driver, CustomerPageUI.DATEOFBIRTH_TXT, dateOfBirth);
	}

	public void inputAddress(String address) {
		waitForControlVisible(driver, CustomerPageUI.ADDRESS_TXTAREA);
		sendKeyToElement(driver, CustomerPageUI.ADDRESS_TXTAREA, address);
	}

	public void inputCity(String city) {
		waitForControlVisible(driver, CustomerPageUI.CITY_TXT);
		sendKeyToElement(driver, CustomerPageUI.CITY_TXT, city);
	}

	public void inputState(String state) {
		waitForControlVisible(driver, CustomerPageUI.STATE_TXT);
		sendKeyToElement(driver, CustomerPageUI.STATE_TXT, state);
	}

	public void inputPIN(String pin) {
		waitForControlVisible(driver, CustomerPageUI.PIN_TXT);
		sendKeyToElement(driver, CustomerPageUI.PIN_TXT, pin);
	}

	public void inputMobileNumber(String mobileNumber) {
		waitForControlVisible(driver, CustomerPageUI.MOBILENUMBER_TXT);
		sendKeyToElement(driver, CustomerPageUI.MOBILENUMBER_TXT, mobileNumber);
	}

	public void inputEmail(String email) {
		waitForControlVisible(driver, CustomerPageUI.EMAIL_TXT);
		sendKeyToElement(driver, CustomerPageUI.EMAIL_TXT, email);
	}

	public void inputPassword(String password) {
		waitForControlVisible(driver, CustomerPageUI.PASSWORD_TXT);
		sendKeyToElement(driver, CustomerPageUI.PASSWORD_TXT, password);
	}

	public void clickSubmit() {
		waitForControlVisible(driver, CustomerPageUI.SUBMIT_BTN);
		clickToElement(driver, CustomerPageUI.SUBMIT_BTN);
	}

	public String getTextMessageCreateCustomerSucces() {
		waitForControlVisible(driver, CustomerPageUI.REGISTERSUCCESS_LBL);
		return getTextElement(driver, CustomerPageUI.REGISTERSUCCESS_LBL);
	}

	public String getTextUserID() {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERID_LBL);
		return getTextElement(driver, CustomerPageUI.CUSTOMERID_LBL);
	}

	// Field Name
	public void pressTabNameField() {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERNAME_TXT);
		sendKeyPress(driver, CustomerPageUI.CUSTOMERNAME_TXT, Keys.TAB);
	}

	public String getTextUsernameErr() {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERNAME_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.CUSTOMERNAME_ERRORMSG);
	}

	public void enterNummericNameField(String nummericValue) {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERNAME_TXT);
		sendKeyToElement(driver, CustomerPageUI.CUSTOMERNAME_TXT, nummericValue);
	}

	public void enterSpecialCharacterNameField(String nummericValue) {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERNAME_TXT);
		sendKeyToElement(driver, CustomerPageUI.CUSTOMERNAME_TXT, nummericValue);
	}

	public void pressSpaceNameField() {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERNAME_TXT);
		sendKeyPress(driver, CustomerPageUI.CUSTOMERNAME_TXT, Keys.SPACE);
	}

	// Field Address
	public void pressTabAddressField() {
		waitForControlVisible(driver, CustomerPageUI.ADDRESS_TXTAREA);
		sendKeyPress(driver, CustomerPageUI.ADDRESS_TXTAREA, Keys.TAB);
	}

	public String getTextAddressErr() {
		waitForControlVisible(driver, CustomerPageUI.ADDRESS_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.ADDRESS_ERRORMSG);
	}

	public void pressSpaceAddressField() {
		waitForControlVisible(driver, CustomerPageUI.ADDRESS_TXTAREA);
		sendKeyPress(driver, CustomerPageUI.ADDRESS_TXTAREA, Keys.SPACE);
	}

	// Field City
	public void pressTabCityField() {
		waitForControlVisible(driver, CustomerPageUI.CITY_TXT);
		sendKeyPress(driver, CustomerPageUI.CITY_TXT, Keys.TAB);
	}

	public String getTextCityErr() {
		waitForControlVisible(driver, CustomerPageUI.CITY_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.CITY_ERRORMSG);
	}

	public void enterNummericCityField(String nummericCity) {
		waitForControlVisible(driver, CustomerPageUI.CITY_TXT);
		sendKeyToElement(driver, CustomerPageUI.CITY_TXT, nummericCity);
	}

	public void enterSpecialCharacterCityField(String specialValue) {
		waitForControlVisible(driver, CustomerPageUI.CITY_TXT);
		sendKeyToElement(driver, CustomerPageUI.CITY_TXT, specialValue);
	}

	public void pressSpaceCityField() {
		waitForControlVisible(driver, CustomerPageUI.CITY_TXT);
		sendKeyPress(driver, CustomerPageUI.CITY_TXT, Keys.SPACE);
	}

	// Field State
	public void pressTabStateField() {
		waitForControlVisible(driver, CustomerPageUI.STATE_TXT);
		sendKeyPress(driver, CustomerPageUI.STATE_TXT, Keys.TAB);
	}

	public String getTextStateErr() {
		waitForControlVisible(driver, CustomerPageUI.STATE_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.STATE_ERRORMSG);
	}

	public void enterNummericStateField(String nummericState) {
		waitForControlVisible(driver, CustomerPageUI.STATE_TXT);
		sendKeyToElement(driver, CustomerPageUI.STATE_TXT, nummericState);
	}

	public void enterSpecialCharacterStateField(String specialValue) {
		waitForControlVisible(driver, CustomerPageUI.STATE_TXT);
		sendKeyToElement(driver, CustomerPageUI.STATE_TXT, specialValue);
	}

	public void pressSpaceStateField() {
		waitForControlVisible(driver, CustomerPageUI.STATE_TXT);
		sendKeyPress(driver, CustomerPageUI.STATE_TXT, Keys.SPACE);
	}

	// Field PIN
	public void enterCharPinField(String CharValueState) {
		waitForControlVisible(driver, CustomerPageUI.PIN_TXT);
		sendKeyToElement(driver, CustomerPageUI.PIN_TXT, CharValueState);
	}

	public String getTextPinErr() {
		waitForControlVisible(driver, CustomerPageUI.PIN_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.PIN_ERRORMSG);
	}

	public void pressTabPinField() {
		waitForControlVisible(driver, CustomerPageUI.PIN_TXT);
		sendKeyPress(driver, CustomerPageUI.PIN_TXT, Keys.TAB);
	}

	public void enterDigit(String digit) {
		waitForControlVisible(driver, CustomerPageUI.PIN_TXT);
		sendKeyToElement(driver, CustomerPageUI.PIN_TXT, digit);
	}

	public void enterSpecialCharacterPinField(String specialValue) {
		waitForControlVisible(driver, CustomerPageUI.PIN_TXT);
		sendKeyToElement(driver, CustomerPageUI.PIN_TXT, specialValue);
	}

	public void pressSpacePinField() {
		waitForControlVisible(driver, CustomerPageUI.PIN_TXT);
		sendKeyPress(driver, CustomerPageUI.PIN_TXT, Keys.SPACE);
	}

	public void enterBlankSpacePinField(String pinBlankSpace) {
		waitForControlVisible(driver, CustomerPageUI.PIN_TXT);
		sendKeyToElement(driver, CustomerPageUI.PIN_TXT, pinBlankSpace);
	}

	// Telephone Field
	public void pressTabTelephoneField() {
		waitForControlVisible(driver, CustomerPageUI.MOBILENUMBER_TXT);
		sendKeyPress(driver, CustomerPageUI.MOBILENUMBER_TXT, Keys.TAB);
	}

	public String getTextTelePhoneErr() {
		waitForControlVisible(driver, CustomerPageUI.TELEPHONE_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.TELEPHONE_ERRORMSG);
	}

	public void pressSpaceTelePhoneField() {
		waitForControlVisible(driver, CustomerPageUI.MOBILENUMBER_TXT);
		sendKeyPress(driver, CustomerPageUI.MOBILENUMBER_TXT, Keys.SPACE);
	}

	public void enterSpecialCharacterTelePhoneField(String specialValue) {
		waitForControlVisible(driver, CustomerPageUI.MOBILENUMBER_TXT);
		sendKeyToElement(driver, CustomerPageUI.MOBILENUMBER_TXT, specialValue);
	}

	public void enterBlankSpaceTelephoneField(String telephoneBlankSpace) {
		waitForControlVisible(driver, CustomerPageUI.MOBILENUMBER_TXT);
		sendKeyToElement(driver, CustomerPageUI.MOBILENUMBER_TXT, telephoneBlankSpace);
	}

	// Email Field
	public void pressEmaileField() {
		waitForControlVisible(driver, CustomerPageUI.EMAIL_TXT);
		sendKeyPress(driver, CustomerPageUI.EMAIL_TXT, Keys.TAB);
	}

	public String getTextEmailErr() {
		waitForControlVisible(driver, CustomerPageUI.EMAIL_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.EMAIL_ERRORMSG);
	}

	public void enterIncorrectEmail(String incorrectEmail) {
		waitForControlVisible(driver, CustomerPageUI.EMAIL_TXT);
		sendKeyToElement(driver, CustomerPageUI.EMAIL_TXT, incorrectEmail);
	}

	public void pressSpaceEmailField() {
		waitForControlVisible(driver, CustomerPageUI.EMAIL_TXT);
		sendKeyPress(driver, CustomerPageUI.EMAIL_TXT, Keys.SPACE);
	}

}
