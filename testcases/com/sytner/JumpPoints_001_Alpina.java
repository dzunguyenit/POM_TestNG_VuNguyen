package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_001_Alpina extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private AlpinaCarSytner alpinaCarSytner;
	String urlAlpinaCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlAlpinaCar = "https://www.sytner.co.uk/bmw/alpina-range/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_018_JumpPoints_001_Alpina() {
		verifyTrue(homeSytner.checkDisplayAlpinaIcon(driver));
		alpinaCarSytner = homeSytner.clickAlpinaIcon(driver);
		verifyEquals(urlAlpinaCar, alpinaCarSytner.getUrlAlpinaCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
