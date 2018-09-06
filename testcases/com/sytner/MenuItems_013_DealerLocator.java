package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_013_DealerLocator extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private DealerLocatorSytner dealerLocatorSytner;
	String urlDealerLocator;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlDealerLocator = "https://www.sytner.co.uk/dealer-locator/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_013_MenuItems_013_DealerLocator() {
		dealerLocatorSytner = homeSytner.openDealerLocatorSytnerPage(driver);
		verifyEquals(urlDealerLocator, dealerLocatorSytner.getUrlDealerLocator());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
