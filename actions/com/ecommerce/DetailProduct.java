package com.ecommerce;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.ecommerce.ui.DetailProductUI;

public class DetailProduct extends AbstractPage {
	WebDriver driver;

	public DetailProduct(WebDriver driver) {
		this.driver = driver;
	}

	public String getCostSonyXperiaDetail(String dynamicXpath) {
		waitForControlVisible(driver, DetailProductUI.COST_SONYXPERIA_DETAIL_LBL, dynamicXpath);
		return getTextElement(driver, DetailProductUI.COST_SONYXPERIA_DETAIL_LBL, dynamicXpath);
	}

}
