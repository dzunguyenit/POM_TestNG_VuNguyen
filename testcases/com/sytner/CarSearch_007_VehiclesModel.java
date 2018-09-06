package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class CarSearch_007_VehiclesModel extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_046_CarSearch_007_VehiclesModel() {
		homeSytner.chooseValueMakeDropdown(driver);
		verifyTrue(homeSytner.checkDisplayModelLabel(driver));
		verifyTrue(homeSytner.checkDisplayAllLabel(driver));

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
