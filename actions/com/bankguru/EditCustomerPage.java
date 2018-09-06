package com.bankguru;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.bankguru.ui.CustomerPageUI;

public class EditCustomerPage extends AbstractPage {
	WebDriver driver;

	public EditCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputIdCustomer(String IdCustomer) {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERID_TXT);
		sendKeyToElement(driver, CustomerPageUI.CUSTOMERID_TXT, IdCustomer);
	}

	public void clickSubmitToEditInfor() {
		waitForControlVisible(driver, CustomerPageUI.SUBMITOEDIT_BTN);
		clickToElement(driver, CustomerPageUI.SUBMITOEDIT_BTN);
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

	public void clickSubmitToUpdateInfor() {
		waitForControlVisible(driver, CustomerPageUI.SUBMIT_BTN);
		clickToElement(driver, CustomerPageUI.SUBMIT_BTN);
	}

	public String getTextMessageEditCustomerSucces() {
		waitForControlVisible(driver, CustomerPageUI.UPDATESUCCESS_LBL);
		return getTextElement(driver, CustomerPageUI.UPDATESUCCESS_LBL);
	}

	// Edit customer TestCase
	// Field CustomerID
	public void pressTabCustomerIdField() {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERID_TXT);
		sendKeyPress(driver, CustomerPageUI.CUSTOMERID_TXT, Keys.TAB);
	}

	public String getTextCustomerIdErr() {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERID_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.CUSTOMERID_ERRORMSG);
	}

	public void enterNummericCustomerIdField(String nummericValueIdCustomer) {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERID_TXT);
		sendKeyToElement(driver, CustomerPageUI.CUSTOMERID_TXT, nummericValueIdCustomer);
	}

	public void enterSpecialCharacterCustomerIdField(String specialCharacterCustomerId) {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERID_TXT);
		sendKeyToElement(driver, CustomerPageUI.CUSTOMERID_TXT, specialCharacterCustomerId);
	}

	public String getUrlEditCustomer() {
		return getCurrentUrl(driver);
	}

	// Field Name
	public void pressTabNameField() {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERNAME_TXT);
		removeAttributeInDOM(driver, CustomerPageUI.CUSTOMERNAME_TXT, "disabled");
		clearAndSendKeyPress(driver, CustomerPageUI.CUSTOMERNAME_TXT, Keys.TAB);
	}

	public String getTextUsernameErr() {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERNAME_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.CUSTOMERNAME_ERRORMSG);
	}

	public void enterNummericNameField(String nummericValueNameUpdate) {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERNAME_TXT);
		removeAttributeInDOM(driver, CustomerPageUI.CUSTOMERNAME_TXT, "disabled");
		sendKeyToElement(driver, CustomerPageUI.CUSTOMERNAME_TXT, nummericValueNameUpdate);
	}

	public void enterSpecialCharacterNameField(String specialCharacterNameUpdate) {
		waitForControlVisible(driver, CustomerPageUI.CUSTOMERNAME_TXT);
		removeAttributeInDOM(driver, CustomerPageUI.CUSTOMERNAME_TXT, "disabled");
		sendKeyToElement(driver, CustomerPageUI.CUSTOMERNAME_TXT, specialCharacterNameUpdate);
	}

	// Field Address
	public void pressTabAddressField() {
		waitForControlVisible(driver, CustomerPageUI.ADDRESS_TXTAREA);
		clearAndSendKeyPress(driver, CustomerPageUI.ADDRESS_TXTAREA, Keys.TAB);
	}

	public String getTextAddressErr() {
		waitForControlVisible(driver, CustomerPageUI.ADDRESS_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.ADDRESS_ERRORMSG);
	}

	// Field City
	public void pressTabCityField() {
		waitForControlVisible(driver, CustomerPageUI.CITY_TXT);
		clearAndSendKeyPress(driver, CustomerPageUI.CITY_TXT, Keys.TAB);
	}

	public String getTextCityErr() {
		waitForControlVisible(driver, CustomerPageUI.CITY_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.CITY_ERRORMSG);
	}

	public void enterNummericCityField(String nummericCityField) {
		waitForControlVisible(driver, CustomerPageUI.CITY_TXT);
		sendKeyToElement(driver, CustomerPageUI.CITY_TXT, nummericCityField);
	}

	public void enterSpecialCharacterCityField(String specialCharacterCityUpdate) {
		waitForControlVisible(driver, CustomerPageUI.CITY_TXT);
		sendKeyToElement(driver, CustomerPageUI.CITY_TXT, specialCharacterCityUpdate);
	}

	// Field State
	public void pressTabStateField() {
		waitForControlVisible(driver, CustomerPageUI.STATE_TXT);
		clearAndSendKeyPress(driver, CustomerPageUI.STATE_TXT, Keys.TAB);
	}

	public String getTextStateErr() {
		waitForControlVisible(driver, CustomerPageUI.STATE_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.STATE_ERRORMSG);
	}

	public void enterNummericStateField(String nummericStateField) {
		waitForControlVisible(driver, CustomerPageUI.STATE_TXT);
		sendKeyToElement(driver, CustomerPageUI.STATE_TXT, nummericStateField);
	}

	public void enterSpecialCharacterStateField(String specialCharacterStateUpdate) {
		waitForControlVisible(driver, CustomerPageUI.STATE_TXT);
		sendKeyToElement(driver, CustomerPageUI.STATE_TXT, specialCharacterStateUpdate);
	}

	// Field PIN
	public void enterCharPinField(String pinNumberic) {
		waitForControlVisible(driver, CustomerPageUI.PIN_TXT);
		sendKeyToElement(driver, CustomerPageUI.PIN_TXT, pinNumberic);
	}

	public String getTextPinErr() {
		waitForControlVisible(driver, CustomerPageUI.PIN_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.PIN_ERRORMSG);
	}

	public void pressTabPinField() {
		waitForControlVisible(driver, CustomerPageUI.PIN_TXT);
		clearAndSendKeyPress(driver, CustomerPageUI.PIN_TXT, Keys.TAB);
	}

	public void enterDigit(String digitUpdate) {
		waitForControlVisible(driver, CustomerPageUI.PIN_TXT);
		sendKeyToElement(driver, CustomerPageUI.PIN_TXT, digitUpdate);
	}

	public void enterSpecialCharacterPinField(String specialCharacterPinUpdate) {
		waitForControlVisible(driver, CustomerPageUI.PIN_TXT);
		sendKeyToElement(driver, CustomerPageUI.PIN_TXT, specialCharacterPinUpdate);
	}

	// Field Telephone
	public void pressTabTelephoneField() {
		waitForControlVisible(driver, CustomerPageUI.MOBILENUMBER_TXT);
		clearAndSendKeyPress(driver, CustomerPageUI.MOBILENUMBER_TXT, Keys.TAB);
	}

	public String getTextTelephoneErr() {
		waitForControlVisible(driver, CustomerPageUI.TELEPHONE_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.TELEPHONE_ERRORMSG);
	}

	public void enterSpecialCharacterTelephoneField(String specialCharacterTelephoneUpdate) {
		waitForControlVisible(driver, CustomerPageUI.MOBILENUMBER_TXT);
		sendKeyToElement(driver, CustomerPageUI.MOBILENUMBER_TXT, specialCharacterTelephoneUpdate);
	}

	// Field Email
	public void pressTabEmailField() {
		waitForControlVisible(driver, CustomerPageUI.EMAIL_TXT);
		clearAndSendKeyPress(driver, CustomerPageUI.EMAIL_TXT, Keys.TAB);
	}

	public String getTextEmailErr() {
		waitForControlVisible(driver, CustomerPageUI.EMAIL_ERRORMSG);
		return getTextElement(driver, CustomerPageUI.EMAIL_ERRORMSG);
	}

	public void enterInvalidEmail(String invalidEmail) {
		waitForControlVisible(driver, CustomerPageUI.EMAIL_TXT);
		sendKeyToElement(driver, CustomerPageUI.EMAIL_TXT, invalidEmail);
	}

	public void pressSpaceEmailField() {
		waitForControlVisible(driver, CustomerPageUI.EMAIL_TXT);
		clearAndSendKeyPress(driver, CustomerPageUI.EMAIL_TXT, Keys.SPACE);
	}
}
