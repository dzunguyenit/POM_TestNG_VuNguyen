package com.sytner;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;

public class CustomerServiceSytner extends AbstractPage {
	WebDriver driver;

	public CustomerServiceSytner(WebDriver driver) {
		this.driver = driver;
	}

	public String getUrlCustomerService() {
		return getCurrentUrl(driver);
	}
}
