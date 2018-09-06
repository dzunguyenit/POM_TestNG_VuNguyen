package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_005_Ferrari extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private FerrariCarSytner ferrariCarSytner;
	String urlFerrariCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlFerrariCar = "https://www.sytner.co.uk/ferrari/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_022_JumpPoints_005_Ferrari() {
		verifyTrue(homeSytner.checkDisplayFerrariIcon(driver));
		ferrariCarSytner = homeSytner.clickFerrariIcon(driver);
		verifyEquals(urlFerrariCar, ferrariCarSytner.getUrlFerrariCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
