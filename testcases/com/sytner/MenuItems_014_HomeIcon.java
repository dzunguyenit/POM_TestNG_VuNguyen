package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_014_HomeIcon extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private DealerLocatorSytner dealerLocatorSytner;
	String urlHomePage;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlHomePage = "https://www.sytner.co.uk/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_014_MenuItems_014_HomeIcon() {
		dealerLocatorSytner = homeSytner.openDealerLocatorSytnerPage(driver);
		homeSytner = dealerLocatorSytner.clickHomeIcon();
		verifyEquals(urlHomePage, homeSytner.getUrlHomePage(driver));

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
