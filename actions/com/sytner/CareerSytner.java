package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class CareerSytner extends AbstractPage {
	WebDriver driver;

	public CareerSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlCareer() {
		return getCurrentUrl(driver);
	}

}
