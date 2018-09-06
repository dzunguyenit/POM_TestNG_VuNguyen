package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_011_Maserati extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private MaseratiCarSytner maseratiCarSytner;
	String urlMaseratiCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlMaseratiCar = "https://www.sytner.co.uk/maserati/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_028_JumpPoints_011_Maserati() {
		verifyTrue(homeSytner.checkDisplayMaseratiIcon(driver));
		maseratiCarSytner = homeSytner.clickMaseratiIcon(driver);
		verifyEquals(urlMaseratiCar, maseratiCarSytner.getUrlMaseratiCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
