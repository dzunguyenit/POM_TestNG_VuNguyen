package com.ecommerce;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.ecommerce.ui.TVHomeUI;

public class TVHome extends AbstractPage {
	WebDriver driver;

	public TVHome(WebDriver driver) {
		this.driver = driver;
	}

	public AccountTVPage LGLCDAddtoWishList() {
		waitForControlVisible(driver, TVHomeUI.LGLCD_ADDTOWISHLIST_LBL);
		clickToElement(driver, TVHomeUI.LGLCD_ADDTOWISHLIST_LBL);
		return new AccountTVPage(driver);
	}

	public String getTextRegisterSuccess() {
		waitForControlVisible(driver, TVHomeUI.REGISTERSUCCESS_LBL);
		return getTextElement(driver, TVHomeUI.REGISTERSUCCESS_LBL);
	}

	public void clickTVmenu() {
		waitForControlVisible(driver, TVHomeUI.TVMENU_LBL);
		clickToElement(driver, TVHomeUI.TVMENU_LBL);
	}

	public void clickAddToWishListLG_LCD() {
		waitForControlVisible(driver, TVHomeUI.LGLCD_ADDTOWISHLIST_LBL);
		clickToElement(driver, TVHomeUI.LGLCD_ADDTOWISHLIST_LBL);
	}

	public void clickShareToWishList() {
		waitForControlVisible(driver, TVHomeUI.SHAREWISHLIST_BTN);
		clickToElement(driver, TVHomeUI.SHAREWISHLIST_BTN);
	}

	public void inputEmailShare(String emailShare) {
		waitForControlVisible(driver, TVHomeUI.EMAIL_TXTAREA);
		sendKeyToElement(driver, TVHomeUI.EMAIL_TXTAREA, emailShare);
	}

	public void inputMessage(String message) {
		waitForControlVisible(driver, TVHomeUI.MESSAGE_TXTAREA);
		sendKeyToElement(driver, TVHomeUI.MESSAGE_TXTAREA, message);
	}

	public void clickShareWishListInfor() {
		waitForControlVisible(driver, TVHomeUI.SHAREWITHLIST_INFOR_BTN);
		clickToElement(driver, TVHomeUI.SHAREWITHLIST_INFOR_BTN);
	}

	public String getTextWishListShared() {
		waitForControlVisible(driver, TVHomeUI.SHARESUCCESS_LBL);
		return getTextElement(driver, TVHomeUI.SHARESUCCESS_LBL);
	}

	public void clickAccount() {
		waitForControlVisible(driver, TVHomeUI.ACCOUNT_LBL);
		clickToElement(driver, TVHomeUI.ACCOUNT_LBL);
	}

	public void clickLogout() {
		waitForControlVisible(driver, TVHomeUI.LOGOUT_LBL);
		clickToElement(driver, TVHomeUI.LOGOUT_LBL);
	}

	public void clickMyWishListMenu() {
		waitForControlVisible(driver, TVHomeUI.MYWISHLISTMENU_LBL);
		clickToElement(driver, TVHomeUI.MYWISHLISTMENU_LBL);
	}

	public void clickAddToCartMyWishList() {
		waitForControlVisible(driver, TVHomeUI.ADDTOCART_MYWISHLIST_BTN);
		clickToElement(driver, TVHomeUI.ADDTOCART_MYWISHLIST_BTN);
	}

	public void selectCountry(String country) {
		waitForControlVisible(driver, TVHomeUI.COUNTRY_DROPDOWN);
		selectItemInDropdown(driver, TVHomeUI.COUNTRY_DROPDOWN, country);
	}

	public void selectState(String state) {
		waitForControlVisible(driver, TVHomeUI.STATE_DROPDOWN);
		selectItemInDropdown(driver, TVHomeUI.STATE_DROPDOWN, state);
	}

	public void inputZip(String zip) {
		waitForControlVisible(driver, TVHomeUI.ZIP_TXT);
		sendKeyToElement(driver, TVHomeUI.ZIP_TXT, zip);
	}

	public void clickEstimate() {
		waitForControlVisible(driver, TVHomeUI.ESTIMATE_LBL);
		clickToElement(driver, TVHomeUI.ESTIMATE_LBL);
	}

	public String getTextShippingCost(String dynamicXpath) {
		waitForControlVisible(driver, TVHomeUI.FLATRATE_LBL, dynamicXpath);
		return getTextElement(driver, TVHomeUI.FLATRATE_LBL, dynamicXpath);
	}

	public void clickRadioFlatRate() {
		waitForControlVisible(driver, TVHomeUI.FLATRATE_RADIO);
		clickToElement(driver, TVHomeUI.FLATRATE_RADIO);
	}

	public void clickUpdateTotal() {
		waitForControlVisible(driver, TVHomeUI.UPDATETOTAL_BTN);
		clickToElement(driver, TVHomeUI.UPDATETOTAL_BTN);
	}

	public String getTextShippingAndHandling() {
		waitForControlVisible(driver, TVHomeUI.FLATRATE_LBL);
		return getTextElement(driver, TVHomeUI.FLATRATE_LBL);
	}

	public void clickProceedToCheckout() {
		waitForControlVisible(driver, TVHomeUI.PROCEEDCHECKOUT_BTN);
		clickToElement(driver, TVHomeUI.PROCEEDCHECKOUT_BTN);
	}

	public void inputAddress(String address) {
		waitForControlVisible(driver, TVHomeUI.ADDRESS_TXT);
		sendKeyToElement(driver, TVHomeUI.ADDRESS_TXT, address);
	}

	public void inputCity(String city) {
		waitForControlVisible(driver, TVHomeUI.CITY_TXT);
		sendKeyToElement(driver, TVHomeUI.CITY_TXT, city);
	}

	public void selectStateBill(String state) {
		waitForControlVisible(driver, TVHomeUI.STATEBILLING_DROPDOWN);
		selectItemInDropdown(driver, TVHomeUI.STATEBILLING_DROPDOWN, state);
	}

	public void inputZipBilling(String zip) {
		waitForControlVisible(driver, TVHomeUI.ZIPBILLING_TXT);
		sendKeyToElement(driver, TVHomeUI.ZIPBILLING_TXT, zip);
	}

	public void selectCountryBilling(String country) {
		waitForControlVisible(driver, TVHomeUI.COUNTRYBILLING_DROPDOWN);
		selectItemInDropdown(driver, TVHomeUI.COUNTRYBILLING_DROPDOWN, country);
	}

	public void inputTelephone(String telephone) {
		waitForControlVisible(driver, TVHomeUI.TELEPHONEBILLING_TXT);
		sendKeyToElement(driver, TVHomeUI.TELEPHONEBILLING_TXT, telephone);
	}

	public void clickContinue() {
		waitForControlVisible(driver, TVHomeUI.CONTINUE_BTN);
		clickToElement(driver, TVHomeUI.CONTINUE_BTN);
	}

	public void clickContinueFlatRate() {
		waitForControlVisible(driver, TVHomeUI.CONTINUEFLATRATE_BTN);
		clickToElement(driver, TVHomeUI.CONTINUEFLATRATE_BTN);
	}

	public void clickRadioMoneyOrder() {
		waitForControlVisible(driver, TVHomeUI.MONEYORDER_RADIO);
		clickToElement(driver, TVHomeUI.MONEYORDER_RADIO);
	}

	public void clickPaymentSave() {
		waitForControlVisible(driver, TVHomeUI.PAYMENTSAVE_BTN);
		clickToElement(driver, TVHomeUI.PAYMENTSAVE_BTN);
	}

	public void clickPlaceOrder() {
		waitForControlVisible(driver, TVHomeUI.PLACEORDER_BTN);
		clickToElement(driver, TVHomeUI.PLACEORDER_BTN);
	}

	public String getTextOrderSuccess() {
		waitForControlVisible(driver, TVHomeUI.ORDERSUCCESS_LBL);
		return getTextElement(driver, TVHomeUI.ORDERSUCCESS_LBL);
	}
}
