package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class NewCarSytner extends AbstractPage {
	WebDriver driver;

	public NewCarSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlNewCar() {
		return getCurrentUrl(driver);
	}
}
