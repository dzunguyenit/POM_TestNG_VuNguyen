package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_011_BusinessUsers extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private BusinessUsersSytner businessUsersSytner;
	String urlBusinessUsers;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlBusinessUsers = "https://www.sytner.co.uk/business-users/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_011_MenuItems_011_BusinessUsers() {
		businessUsersSytner = homeSytner.openBusinessUsersSytnerPage(driver);
		verifyEquals(urlBusinessUsers, businessUsersSytner.getUrlBusinessUsers());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
