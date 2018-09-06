package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class FinanceSytner extends AbstractPage {
	WebDriver driver;

	public FinanceSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlFinance() {
		return getCurrentUrl(driver);
	}
}
