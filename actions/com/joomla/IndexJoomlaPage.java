package com.joomla;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.joomla.ui.IndexJoomlaUI;

public class IndexJoomlaPage extends AbstractPage {
	WebDriver driver;

	public IndexJoomlaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickContentMenu() {
		waitForControlVisible(driver, IndexJoomlaUI.CONTENT_MENU);
		clickToElement(driver, IndexJoomlaUI.CONTENT_MENU);
	}

	public ArticleJoomlaPage hoverAndClickArticleMenu() {
		hoverMouse(driver, IndexJoomlaUI.ARTICLES_MENU);
		waitForControlVisible(driver, IndexJoomlaUI.ARTICLES_MENU);
		clickToElement(driver, IndexJoomlaUI.ARTICLES_MENU);
		return new ArticleJoomlaPage(driver);
	}
	public void hoverContentMenu() {
		waitForControlVisible(driver, IndexJoomlaUI.CONTENT_MENU);
		hoverMouse(driver, IndexJoomlaUI.CONTENT_MENU);
	}
}
