package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class BusinessUsersSytner extends AbstractPage {
	WebDriver driver;

	public BusinessUsersSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlBusinessUsers() {
		return getCurrentUrl(driver);
	}
}
