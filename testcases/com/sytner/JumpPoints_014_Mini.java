package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_014_Mini extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private MiniCarSytner miniCarSytner;
	String urlMiniCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlMiniCar = "https://www.sytner.co.uk/mini/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_031_JumpPoints_014_Mini() {
		verifyTrue(homeSytner.checkDisplayMiniIcon(driver));
		miniCarSytner = homeSytner.clickMiniCarIcon(driver);
		verifyEquals(urlMiniCar, miniCarSytner.getUrlMiniCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
