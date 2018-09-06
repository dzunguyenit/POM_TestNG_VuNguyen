package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_020_Volvo extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private VolvoCarSytner volvoCarSytner;
	String urlVolvoCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlVolvoCar = "https://www.sytner.co.uk/volvo/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_037_JumpPoints_020_Volvo() {
		verifyTrue(homeSytner.checkDisplayVolvoIcon(driver));
		volvoCarSytner = homeSytner.clickVolvoIcon(driver);
		verifyEquals(urlVolvoCar, volvoCarSytner.getUrlVolvoCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
