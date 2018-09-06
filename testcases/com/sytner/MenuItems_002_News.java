package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class MenuItems_002_News extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;
	private NewsSytner newsSytner;

	String urlNews;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		urlNews = "https://www.sytner.co.uk/news/";

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_002_MenuItems_002_News() {
		newsSytner = homeSytner.openNewsSytnerPage(driver);
		verifyEquals(urlNews, newsSytner.getUrlNewsSytner());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
