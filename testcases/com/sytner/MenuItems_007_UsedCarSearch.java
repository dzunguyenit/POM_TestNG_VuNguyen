package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_007_UsedCarSearch extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private UsedCarSearchSytner usedCarSearchSytner;

	String urlUsedCarSearch;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlUsedCarSearch = "https://supersearch.sytner.co.uk/#/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_007_MenuItems_007_UsedCarSearch() {
		usedCarSearchSytner = homeSytner.openUsedCarSearchSytnerPage(driver);
		verifyEquals(urlUsedCarSearch, usedCarSearchSytner.getUrlUsedCarSearch());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
