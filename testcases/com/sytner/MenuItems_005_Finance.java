package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_005_Finance extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private FinanceSytner financeSytner;

	String urlFinanceSytner;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlFinanceSytner = "https://www.sytner.co.uk/finance/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_005_MenuItems_005_Finance() {
		financeSytner = homeSytner.openFinanceSytnerPage(driver);
		verifyEquals(urlFinanceSytner, financeSytner.getUrlFinance());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
