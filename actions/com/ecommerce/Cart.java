package com.ecommerce;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.ecommerce.ui.CartUI;

public class Cart extends AbstractPage {
	WebDriver driver;

	public Cart(WebDriver driver) {
		this.driver = driver;
	}

	public void inputCodeCoupon(String codeCoupon) {
		waitForControlVisible(driver, CartUI.CODECOUPON_TXT);
		sendKeyToElement(driver, CartUI.CODECOUPON_TXT, codeCoupon);
	}

	public void clickApplyLabel() {
		waitForControlVisible(driver, CartUI.APPLY_LBL);
		clickToElement(driver, CartUI.APPLY_LBL);
	}

	public String getDiscount(String dynamicXpath) {
		waitForControlVisible(driver, CartUI.DISCOUNT_LBL, dynamicXpath);
		return getTextElement(driver, CartUI.DISCOUNT_LBL, dynamicXpath);
	}

	public void inputQty(String qty) {
		waitForControlVisible(driver, CartUI.QTY_TXT);
		sendKeyToElement(driver, CartUI.QTY_TXT, qty);
	}

	public void clickUpdateBtn() {
		waitForControlVisible(driver, CartUI.UPDATE_BTN);
		clickToElement(driver, CartUI.UPDATE_BTN);
	}

	public String getMaxquantityErr() {
		waitForControlVisible(driver, CartUI.MAXQUANTITY_ERR);
		return getTextElement(driver, CartUI.MAXQUANTITY_ERR);
	}

	public void clickEmptyCartBtn() {
		waitForControlVisible(driver, CartUI.EMPTYCART_BTN);
		clickToElement(driver, CartUI.EMPTYCART_BTN);
	}

	public String getEmptyLbl() {
		waitForControlVisible(driver, CartUI.EMPTY_LBL);
		return getTextElement(driver, CartUI.EMPTY_LBL);
	}
}
