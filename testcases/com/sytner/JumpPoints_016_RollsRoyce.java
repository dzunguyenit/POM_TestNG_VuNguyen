package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_016_RollsRoyce extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private RollsRoyceCarSytner rollsRoyceCarSytner;
	String urlRollsRoyceCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlRollsRoyceCar = "https://www.sytner.co.uk/rolls-royce/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_033_JumpPoints_016_RollsRoyce() {
		verifyTrue(homeSytner.checkDisplayRollsRoyceIcon(driver));
		rollsRoyceCarSytner = homeSytner.clickRollsRoyceCarIcon(driver);
		verifyEquals(urlRollsRoyceCar, rollsRoyceCarSytner.getUrlRollsRoyceCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
