package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_003_CustomerService extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private CustomerServiceSytner customerServiceSytner;

	String urlCustomerService;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlCustomerService = "https://www.sytner.co.uk/customer-service/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_003_MenuItems_003_CustomerService() {
		customerServiceSytner = homeSytner.openCustomerServiceSytnerPage(driver);
		verifyEquals(urlCustomerService, customerServiceSytner.getUrlCustomerService());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
