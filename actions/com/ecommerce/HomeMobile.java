package com.ecommerce;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.abstractPage.PageFactory;
import com.ecommerce.ui.HomeMobileUI;

public class HomeMobile extends AbstractPage {
	WebDriver driver;

	public HomeMobile(WebDriver driver) {
		this.driver = driver;
	}

	public DetailProduct clickSonyXperiaImage() {
		waitForControlVisible(driver, HomeMobileUI.SONYXPERIA_IMAGE);
		clickToElement(driver, HomeMobileUI.SONYXPERIA_IMAGE);
		return PageFactory.getDetailProductPage(driver);
	}

	public String getCostSonyXperia(String dynamicXpath) {
		waitForControlVisible(driver, HomeMobileUI.COST_SONYXPERIA_LBL, dynamicXpath);
		return getTextElement(driver, HomeMobileUI.COST_SONYXPERIA_LBL, dynamicXpath);
	}

	public Cart clickAddToCartIPhone() {
		waitForControlVisible(driver, HomeMobileUI.IPHONE_ADDTOCART_BTN);
		clickToElement(driver, HomeMobileUI.IPHONE_ADDTOCART_BTN);
		return PageFactory.getCartPage(driver);
	}

	public Cart clickAddToCartSonyXperia() {
		waitForControlVisible(driver, HomeMobileUI.SONY_ADDTOCART_BTN);
		clickToElement(driver, HomeMobileUI.SONY_ADDTOCART_BTN);
		return new Cart(driver);
	}

	public void clickSonyCompare() {
		waitForControlVisible(driver, HomeMobileUI.ADDTOCOMPARE_SONY_LBL);
		clickToElement(driver, HomeMobileUI.ADDTOCOMPARE_SONY_LBL);
	}

	public void clickIPhoneCompare() {
		waitForControlVisible(driver, HomeMobileUI.ADDTOCOMPARE_IPHONE_LBL);
		clickToElement(driver, HomeMobileUI.ADDTOCOMPARE_IPHONE_LBL);
	}

	public void clickCompareBtn() {
		waitForControlVisible(driver, HomeMobileUI.COMPARE_BTN);
		clickToElement(driver, HomeMobileUI.COMPARE_BTN);
	}

	public String getWindowParent() {
		return getWindowParentID(driver);
	}

	public void switchtoProductCompareWindow(String title) {
		switchWindowByTitle(driver, title);
	}

	public String getTextCompareProduct() {
		return getTextElement(driver, HomeMobileUI.COMPAREPRODUCT_LBL);
	}

	public void closeProductCompareWindow(String parent) {
		closeAllWindowsWithoutParent(driver, parent);
	}

}
