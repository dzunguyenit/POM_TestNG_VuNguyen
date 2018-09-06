package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_017_Seat extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private SeatCarSytner seatCarSytner;
	String urlSeatCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlSeatCar = "https://www.sytner.co.uk/seat/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_034_JumpPoints_017_Seat() {
		verifyTrue(homeSytner.checkDisplaySeatIcon(driver));
		seatCarSytner = homeSytner.clickSeatCarIcon(driver);
		verifyEquals(urlSeatCar, seatCarSytner.getUrlSeatCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
