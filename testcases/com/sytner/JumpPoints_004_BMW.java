package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_004_BMW extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private BMWCarSytner bmwCarSytner;
	String urlBMWCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlBMWCar = "https://www.sytner.co.uk/bmw/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_021_JumpPoints_004_BMW() {
		verifyTrue(homeSytner.checkDisplayBMWIcon(driver));
		bmwCarSytner = homeSytner.clickBMWIcon(driver);
		verifyEquals(urlBMWCar, bmwCarSytner.getUrlBMWCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
