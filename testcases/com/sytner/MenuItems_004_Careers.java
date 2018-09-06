package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_004_Careers extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private CareerSytner careerSytner;

	String urlCareer;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlCareer = "https://careers.sytner.co.uk/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_004_MenuItems_004_Careers() {
		careerSytner = homeSytner.openCareerSytnerPage(driver);
		verifyEquals(urlCareer, careerSytner.getUrlCareer());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
