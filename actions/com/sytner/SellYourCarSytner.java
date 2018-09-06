package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class SellYourCarSytner extends AbstractPage {
	WebDriver driver;

	public SellYourCarSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlSellYourCar() {
		return getCurrentUrl(driver);
	}
}
