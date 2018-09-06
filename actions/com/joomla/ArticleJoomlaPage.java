package com.joomla;

import org.openqa.selenium.WebDriver;

import com.abstractPage.AbstractPage;
import com.joomla.ui.ArticleJoomlaUI;

public class ArticleJoomlaPage extends AbstractPage {
	WebDriver driver;

	public ArticleJoomlaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickNewArticle() {
		waitForControlVisible(driver, ArticleJoomlaUI.NEW_BTN);
		clickToElement(driver, ArticleJoomlaUI.NEW_BTN);
	}

	public void inputTitle(String titleArticle) {
		waitForControlVisible(driver, ArticleJoomlaUI.TITLE_TXT);
		sendKeyToElement(driver, ArticleJoomlaUI.TITLE_TXT, titleArticle);
	}

	public void selectCategory(String value) {
		waitForControlVisible(driver, ArticleJoomlaUI.CATEGORY_DROPDOWN);
		selectItemInDropdownSpecial(driver, ArticleJoomlaUI.CATEGORY_DROPDOWN, ArticleJoomlaUI.CATEGORY_VALUE_DROPDOWN,
				value);
	}

	public void selectStatusUnpublished(String status) {
		waitForControlVisible(driver, ArticleJoomlaUI.STATUS_DROPDOWN);
		selectItemInDropdownSpecial(driver, ArticleJoomlaUI.STATUS_DROPDOWN, ArticleJoomlaUI.STATUS_VALUE_DROPDOWN,
				status);
	}

	public void selectStatusPublished(String status) {
		waitForControlVisible(driver, ArticleJoomlaUI.STATUS_DROPDOWN);
		selectItemInDropdownSpecial(driver, ArticleJoomlaUI.STATUS_DROPDOWN, ArticleJoomlaUI.STATUS_VALUE_DROPDOWN,
				status);
	}

	public void selectAccess(String access) {
		waitForControlVisible(driver, ArticleJoomlaUI.ACCESS_DROPDOWN);
		selectItemInDropdownSpecial(driver, ArticleJoomlaUI.ACCESS_DROPDOWN, ArticleJoomlaUI.ACCESS_VALUE_DROPDOWN,
				access);
	}

	public void selectStatusFilterDropdown(String status) {
		waitForControlVisible(driver, ArticleJoomlaUI.STATUS_FILTER_DROPDOWN);
		selectItemInDropdownSpecial(driver, ArticleJoomlaUI.STATUS_FILTER_DROPDOWN,
				ArticleJoomlaUI.STATUS_FILTER_VALUE_DROPDOWN, status);
	}

	public void selectCategoryFilterDropdown(String category) {
		waitForControlVisible(driver, ArticleJoomlaUI.CATEGORY_FILTER_DROPDOWN);
		selectItemInDropdownSpecial(driver, ArticleJoomlaUI.CATEGORY_FILTER_DROPDOWN,
				ArticleJoomlaUI.CATEGORY_FILTER_VALUE_DROPDOWN, category);
	}

	public void selectAccessFilterDropdown(String access) {
		waitForControlVisible(driver, ArticleJoomlaUI.ACCESS_FILTER_DROPDOWN);
		selectItemInDropdownSpecial(driver, ArticleJoomlaUI.ACCESS_FILTER_DROPDOWN,
				ArticleJoomlaUI.ACCESS_VALUE_FILTER_DROPDOWN, access);
	}

	public void selectAuthorFilterDropdown(String author) {
		waitForControlVisible(driver, ArticleJoomlaUI.AUTHOR_FILTER_DROPDOWN);
		selectItemInDropdownSpecial(driver, ArticleJoomlaUI.AUTHOR_FILTER_DROPDOWN,
				ArticleJoomlaUI.AUTHOR_VALUE_FILTER_DROPDOWN, author);
	}

	public void selectPage(String page) {
		waitForControlVisible(driver, ArticleJoomlaUI.PAGE_DROPDOWN);
		selectItemInDropdownSpecial(driver, ArticleJoomlaUI.PAGE_DROPDOWN, ArticleJoomlaUI.PAGE_VALUE_DROPDOWN, page);
	}

	public void inputArticleText(String value) {
		switchToIframe(driver, ArticleJoomlaUI.ARTICLE_IFRAME);
		sendKeyToElement(driver, ArticleJoomlaUI.ARTICLE_TEXTAREA, value);
		switchToDefaultContent(driver);
	}

	public void clickSaveAndClose() {
		waitForControlVisible(driver, ArticleJoomlaUI.SAVEANDCLOSE_BTN);
		clickToElement(driver, ArticleJoomlaUI.SAVEANDCLOSE_BTN);
	}

	public String getTextArticleMsg() {
		waitForControlVisible(driver, ArticleJoomlaUI.SAVED_MSG);
		return getTextElement(driver, ArticleJoomlaUI.SAVED_MSG);
	}

	public void checkArticleRecently() {
		waitForControlVisible(driver, ArticleJoomlaUI.ARTICLE_CHCBOX);
		clickToElement(driver, ArticleJoomlaUI.ARTICLE_CHCBOX);
	}

	public void clickEditArticle() {
		waitForControlVisible(driver, ArticleJoomlaUI.EDIT_BTN);
		clickToElement(driver, ArticleJoomlaUI.EDIT_BTN);
	}

	public void clickPublishArticle() {
		waitForControlVisible(driver, ArticleJoomlaUI.PUBLISH_BTN);
		clickToElement(driver, ArticleJoomlaUI.PUBLISH_BTN);
	}

	public void clickUnPublishArticle() {
		waitForControlVisible(driver, ArticleJoomlaUI.UNPUBLISH_BTN);
		clickToElement(driver, ArticleJoomlaUI.UNPUBLISH_BTN);
	}

	public void clickArchive() {
		waitForControlVisible(driver, ArticleJoomlaUI.ARCHIVE_BTN);
		clickToElement(driver, ArticleJoomlaUI.ARCHIVE_BTN);
	}

	public void clickSearchTools() {
		waitForControlVisible(driver, ArticleJoomlaUI.SEARCHTOOLS_BTN);
		clickToElement(driver, ArticleJoomlaUI.SEARCHTOOLS_BTN);
	}

	public void selectStatusArchive(String status) {
		waitForControlVisible(driver, ArticleJoomlaUI.STATUS_ARCHIVE_DROPDOWN);
		selectItemInDropdownSpecial(driver, ArticleJoomlaUI.STATUS_ARCHIVE_DROPDOWN,
				ArticleJoomlaUI.ARCHIVE_VALUE_DROPDOWN, status);
	}

	public boolean checkDisplayArchiveArticle() {
		waitForControlVisible(driver, ArticleJoomlaUI.ARTICLE_ARCHIVE_LIST);
		return isControlDisplayed(driver, ArticleJoomlaUI.ARTICLE_ARCHIVE_LIST);
	}

	public String checkDisplay5Items() {
		waitForControlVisible(driver, ArticleJoomlaUI.ID_LIST);
		return Integer.toString(getSize(driver, ArticleJoomlaUI.ID_LIST));
	}

	public String getAllIdList() {
		waitForControlVisible(driver, ArticleJoomlaUI.ID_LIST);
		return Integer.toString(getSize(driver, ArticleJoomlaUI.ID_LIST));
	}

	public String getAllCheckbox() {
		waitForControlVisible(driver, ArticleJoomlaUI.ALL_CKCBX);
		return Integer.toString(getSize(driver, ArticleJoomlaUI.ALL_CKCBX));
	}

	public void clickCheckInArticle() {
		waitForControlVisible(driver, ArticleJoomlaUI.CHECKIN_BTN);
		clickToElement(driver, ArticleJoomlaUI.CHECKIN_BTN);
	}

	public void clickTrash() {
		waitForControlVisible(driver, ArticleJoomlaUI.TRASH_BTN);
		clickToElement(driver, ArticleJoomlaUI.TRASH_BTN);
	}

	public void clickHelpMenu() {
		waitForControlVisible(driver, ArticleJoomlaUI.HELP_MEMU);
		clickToElement(driver, ArticleJoomlaUI.HELP_MEMU);
	}

	public boolean checkDisplayHelpList() {
		waitForControlVisible(driver, ArticleJoomlaUI.HELP_lIST);
		return isControlDisplayed(driver, ArticleJoomlaUI.HELP_lIST);
	}

	public void inputTitleToFilter(String titleArticle) {
		waitForControlVisible(driver, ArticleJoomlaUI.SEARCH_TXT);
		sendKeyToElement(driver, ArticleJoomlaUI.SEARCH_TXT, titleArticle);
	}

	public void clickSearch() {
		waitForControlVisible(driver, ArticleJoomlaUI.SEARCH_BTN);
		clickToElement(driver, ArticleJoomlaUI.SEARCH_BTN);
	}

	public void clickArrowDown() {
		waitForControlVisible(driver, ArticleJoomlaUI.ARROWDOWN_BTN);
		clickToElement(driver, ArticleJoomlaUI.ARROWDOWN_BTN);
	}

	public void changePosition() {
		waitForControlVisible(driver, ArticleJoomlaUI.ID_LIST);
		swapElement(driver, ArticleJoomlaUI.ID_LIST);
	}

	public String getTextFilterTitleSearch() {
		waitForControlVisible(driver, ArticleJoomlaUI.TITLE_FILTER_LBL);
		return getTextElement(driver, ArticleJoomlaUI.TITLE_FILTER_LBL);
	}

	public String getTextFilterTitleSearchDropdown() {
		waitForControlVisible(driver, ArticleJoomlaUI.TITLE_FILTER_DROPDOWN_LBL);
		return getTextElement(driver, ArticleJoomlaUI.TITLE_FILTER_DROPDOWN_LBL);
	}

	public void clickSort() {
		waitForControlVisible(driver, ArticleJoomlaUI.SORT_ID_CBX);
		clickToElement(driver, ArticleJoomlaUI.SORT_ID_CBX);
	}

	public boolean verifyIDAscending() {
		waitForControlVisible(driver, ArticleJoomlaUI.ID_LIST);
		return sortElementAcsending(driver, ArticleJoomlaUI.ID_LIST);

	}

	public boolean verifyIDDescending() {
		waitForControlVisible(driver, ArticleJoomlaUI.ID_LIST);
		return sortElementDescending(driver, ArticleJoomlaUI.ID_LIST);

	}

	public void clickClear() {
		waitForControlVisible(driver, ArticleJoomlaUI.CLEAR_BTN);
		clickToElement(driver, ArticleJoomlaUI.CLEAR_BTN);
	}

	public void clickImage() {
		waitForControlVisible(driver, ArticleJoomlaUI.IMAGE_BTN);
		clickToElement(driver, ArticleJoomlaUI.IMAGE_BTN);
	}

	public void clickSelectImage() {
		waitForControlVisible(driver, ArticleJoomlaUI.SELECT_IMAGE_BTN);
		clickToElement(driver, ArticleJoomlaUI.SELECT_IMAGE_BTN);
	}

	public void Upload(String value) {
		waitForIframeVisible(driver, ArticleJoomlaUI.PARENT_IFRAME);
		switchToIframe(driver, ArticleJoomlaUI.PARENT_IFRAME);
		// waitForIframeVisible(driver, ArticleJoomlaUI.CHILD_IFRAME);
		// switchToIframe(driver, ArticleJoomlaUI.CHILD_IFRAME);
		executeJavascriptToBrowser(driver,
				"$('iframe[name=field-media-modal]').contents().on('click', ImageManager.populateFields('image.png'))");

		// waitForControlVisible(driver, ArticleJoomlaUI.POWERBY_IMAGE);
		// clickToElement(driver, ArticleJoomlaUI.POWERBY_IMAGE);
		// switchToDefaultContent(driver);
		// waitForControlVisible(driver, ArticleJoomlaUI.UPLOAD_BTN);
		// sendKeyToElement(driver, ArticleJoomlaUI.UPLOAD_BTN, value);
		// clickToElement(driver, ArticleJoomlaUI.STARTUPLOAD_BTN);
	}

	public void clickInsertImage() {
		switchToIframe(driver, ArticleJoomlaUI.CHILD_IFRAME);
		waitForControlVisible(driver, ArticleJoomlaUI.INSERT_BTN);
		clickToElement(driver, ArticleJoomlaUI.INSERT_BTN);
		switchToDefaultContent(driver);
	}

	public void clickPublishedStatus() {
		waitForControlVisible(driver, ArticleJoomlaUI.PUBLISH_STATUS_BTN);
		clickToElement(driver, ArticleJoomlaUI.PUBLISH_STATUS_BTN);
	}

	public void clickUnPublishedStatus() {
		waitForControlVisible(driver, ArticleJoomlaUI.UNPUBLISH_STATUS_BTN);
		clickToElement(driver, ArticleJoomlaUI.UNPUBLISH_STATUS_BTN);
	}

	public void clickFeature() {
		waitForControlVisible(driver, ArticleJoomlaUI.UNFEATURE_BTN);
		clickToElement(driver, ArticleJoomlaUI.UNFEATURE_BTN);
	}

	public void clickUnFeature() {
		waitForControlVisible(driver, ArticleJoomlaUI.FEATURE_BTN);
		clickToElement(driver, ArticleJoomlaUI.FEATURE_BTN);
	}
}
