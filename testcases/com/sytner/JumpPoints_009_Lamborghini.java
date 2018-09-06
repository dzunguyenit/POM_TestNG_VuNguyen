package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class JumpPoints_009_Lamborghini extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private LamborghiniCarSytner lamborghiniCarSytner;
	String urlLamborghiniCar;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlLamborghiniCar = "https://www.sytner.co.uk/lamborghini/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_026_JumpPoints_009_Lamborghini() {
		verifyTrue(homeSytner.checkDisplayLandRoverIcon(driver));
		lamborghiniCarSytner = homeSytner.clickLamborghiniIcon(driver);
		verifyEquals(urlLamborghiniCar, lamborghiniCarSytner.getUrlLamborghiniCar());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
