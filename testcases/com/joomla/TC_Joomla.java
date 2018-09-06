package com.joomla;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class TC_Joomla extends AbstractTest {

	WebDriver driver;
	String username, password, categoryNew, categoryUpdate, articleTextNew, articleTextUpdate, articleAddToImage,
			textArticleMsg, titleArticleNew, titleArticleUpdate, statusUnpublished, statusPublished, statusArchive,
			access, titleArticleUnpublished, titleArticlePublished, titleMoveArticle, titleArticleCheckIn,
			titleArticleTrash, titleArticleSearch, titleArticleSearchDropdown, titleArticleAddToImage,
			titleArticleFirst, titleArticleSecond, titleArticleChangeStatus, titleArticleFeature, titleArticleFitler,
			articleTextUnpublished, articleTextPublished, articleTextMoveArticle, articleTextCheckIn, articleTextTrash,
			articleTextSearch, articleTextSearchDropdown, articleTextFirst, articleTextSecond, articleTextChangeStatus,
			articleTextFeature, textArticlePublishedMsg, textArticleUnPublishedMsg, textArticleArchiveMsg,
			textArticleCheckinMsg, textArticleTrashMsg, textArticleFeatureMsg, textArticleUnFeatureMsg, author, page,
			allpage, fileUpload;
	private LoginJoomlaPage loginJoomlaPage;
	private IndexJoomlaPage indexJoomlaPage;
	private ArticleJoomlaPage articleJoomlaPage;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		username = "automationfc";
		password = "automationfc";
		titleArticleNew = "New Title ";
		titleArticleUpdate = "Update Title ";
		titleArticleUnpublished = "Unpublished Article ";
		titleArticlePublished = "Published Article ";
		titleMoveArticle = "Move An Article to Archive ";
		titleArticleCheckIn = "Check In Article ";
		titleArticleTrash = "Trash Article ";

		titleArticleAddToImage = "Add To Image Article ";
		titleArticleFirst = "Change Article 1  ";
		titleArticleSecond = "Change Article 2  ";
		titleArticleFitler = "Change Article";
		titleArticleChangeStatus = "Change Status Title ";
		titleArticleFeature = "Feature Title ";

		categoryNew = "Blog";
		categoryUpdate = "Uncategorised";
		statusUnpublished = "Unpublished";
		statusPublished = "Published";
		statusArchive = "Archived";
		access = "Registered";

		articleTextNew = "New blog";
		articleTextUpdate = "Update blog";
		articleTextUnpublished = "Unpublished blog";
		articleTextPublished = "Published blog";
		articleTextMoveArticle = "Move blog";
		articleTextCheckIn = "Check In blog";
		articleTextTrash = "Track blog";
		articleTextSearch = "Search blog";
		articleTextSearchDropdown = "Search Dropdown blog";
		articleAddToImage = "Add To Image";
		articleTextFirst = "First Blog";
		articleTextSecond = "Second Blog";
		articleTextChangeStatus = "Change Status Blog";
		articleTextFeature = "Feature Blog";

		textArticleMsg = "Article saved.";
		textArticlePublishedMsg = "1 article published.";
		textArticleUnPublishedMsg = "1 article unpublished.";
		textArticleArchiveMsg = "1 article archived.";
		textArticleCheckinMsg = "1 article checked in.";
		textArticleTrashMsg = "1 article trashed.";
		textArticleFeatureMsg = "1 article featured.";
		textArticleUnFeatureMsg = "1 article unfeatured.";

		author = "Automation FC";
		page = "5";
		allpage = "All";
		fileUpload = "C:\\image.png";
		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		loginJoomlaPage = PageFactory.getLoginJoomlaPage(driver);
		loginJoomlaPage.inputUsername(username);
		loginJoomlaPage.inputPassword(password);
		indexJoomlaPage = loginJoomlaPage.clickLogin();

	}

	@Test
	public void TC_01_CreateArticle() {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleArticleNew + randomEmail());
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.inputArticleText(articleTextNew);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());

	}

	@Test
	public void TC_02_EditArticle() {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.checkArticleRecently();
		articleJoomlaPage.clickEditArticle();
		articleJoomlaPage.inputTitle(titleArticleUpdate + randomEmail());
		articleJoomlaPage.selectCategory(categoryUpdate);
		articleJoomlaPage.inputArticleText(articleTextUpdate);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());

	}

	@Test
	public void TC_03_AnUnpublishedArticle() {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleArticleUnpublished + randomEmail());
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.selectStatusUnpublished(statusUnpublished);
		articleJoomlaPage.inputArticleText(articleTextUnpublished);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.checkArticleRecently();
		articleJoomlaPage.clickPublishArticle();
		verifyEquals(textArticlePublishedMsg, articleJoomlaPage.getTextArticleMsg());
	}

	@Test
	public void TC_04_UnpublishAPublishedArticle() {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleArticlePublished + randomEmail());
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.selectStatusPublished(statusPublished);
		articleJoomlaPage.inputArticleText(articleTextPublished);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.checkArticleRecently();
		articleJoomlaPage.clickUnPublishArticle();
		verifyEquals(textArticleUnPublishedMsg, articleJoomlaPage.getTextArticleMsg());
	}

	@Test
	public void TC_05_MoveArticleToArchive() {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleMoveArticle + randomEmail());
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.inputArticleText(articleTextMoveArticle);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.checkArticleRecently();
		articleJoomlaPage.clickArchive();
		verifyEquals(textArticleArchiveMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.clickSearchTools();
		articleJoomlaPage.selectStatusArchive(statusArchive);
		verifyTrue(articleJoomlaPage.checkDisplayArchiveArticle());
	}

	@Parameters({ "browser", "url", "version" })

	@Test
	public void TC_06_CheckInArticle(String browser, String url, String version) {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleArticleCheckIn + randomEmail());
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.selectStatusPublished(statusPublished);
		articleJoomlaPage.inputArticleText(articleTextCheckIn);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
		closeBrowser();
		driver = openMultiBrowser(browser, url, version);
		loginJoomlaPage = PageFactory.getLoginJoomlaPage(driver);
		loginJoomlaPage.inputUsername(username);
		loginJoomlaPage.inputPassword(password);
		indexJoomlaPage = loginJoomlaPage.clickLogin();
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.checkArticleRecently();
		articleJoomlaPage.clickCheckInArticle();
		verifyEquals(textArticleCheckinMsg, articleJoomlaPage.getTextArticleMsg());
	}

	@Test
	public void TC_07_MoveArticleToTrash() {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleArticleTrash + randomEmail());
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.selectStatusPublished(statusPublished);
		articleJoomlaPage.inputArticleText(articleTextTrash);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.checkArticleRecently();
		articleJoomlaPage.clickTrash();
		verifyEquals(textArticleTrashMsg, articleJoomlaPage.getTextArticleMsg());
	}

	@Test
	public void TC_08_AccessHelpSection() {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickHelpMenu();
		articleJoomlaPage.checkDisplayHelpList();
	}

	@Test
	public void TC_09_SearchArticleUsingFilter() {
		titleArticleSearch = "Search Article Filter " + randomEmail();
		indexJoomlaPage.hoverContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleArticleSearch);
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.selectStatusPublished(statusPublished);
		articleJoomlaPage.inputArticleText(articleTextSearch);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.inputTitleToFilter(titleArticleSearch);
		articleJoomlaPage.clickSearch();
		verifyEquals(titleArticleSearch, articleJoomlaPage.getTextFilterTitleSearch());
	}

	@Test
	public void TC_10_SearchArticleUsingDropdown() {
		titleArticleSearchDropdown = "Search Article Dropdown " + randomEmail();
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleArticleSearchDropdown);
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.selectStatusPublished(statusPublished);
		articleJoomlaPage.selectAccess(access);
		articleJoomlaPage.inputArticleText(articleTextSearchDropdown);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.inputTitleToFilter(titleArticleSearchDropdown);
		articleJoomlaPage.clickSearchTools();
		articleJoomlaPage.selectStatusFilterDropdown(statusPublished);
		articleJoomlaPage.selectCategoryFilterDropdown(categoryNew);
		articleJoomlaPage.selectAccessFilterDropdown(access);
		articleJoomlaPage.selectAuthorFilterDropdown(author);
		verifyEquals(titleArticleSearchDropdown, articleJoomlaPage.getTextFilterTitleSearchDropdown());

	}

	@Test
	public void TC_11_SortArticleById() {
		articleJoomlaPage.clickClear();
		articleJoomlaPage.clickSort();
		verifyTrue(articleJoomlaPage.verifyIDAscending());
		articleJoomlaPage.clickSort();
		verifyTrue(articleJoomlaPage.verifyIDDescending());
	}

	@Test
	public void TC_12_PagingTheArticle() {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.selectPage(page);
		verifyEquals(page, articleJoomlaPage.checkDisplay5Items());
		articleJoomlaPage.selectPage(allpage);
		verifyEquals(articleJoomlaPage.getAllCheckbox(), articleJoomlaPage.getAllIdList());
	}

	// @Test
	// public void TC_13_AddImageToArticle() {
	// indexJoomlaPage.clickContentMenu();
	// articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
	// articleJoomlaPage.clickNewArticle();
	// articleJoomlaPage.inputTitle(titleArticleAddToImage);
	// articleJoomlaPage.selectCategory(categoryNew);
	// articleJoomlaPage.inputArticleText(articleAddToImage);
	// articleJoomlaPage.clickImage();
	// articleJoomlaPage.clickSelectImage();
	// articleJoomlaPage.Upload(fileUpload);
	// // articleJoomlaPage.clickInsertImage();
	// // articleJoomlaPage.clickSaveAndClose();
	// // verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
	// }
	@Test
	public void TC_14_CreateArticle() {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleArticleFirst + randomEmail());
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.inputArticleText(articleTextFirst);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleArticleSecond + randomEmail());
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.inputArticleText(articleTextSecond);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.inputTitleToFilter(titleArticleFitler);
		articleJoomlaPage.clickSearch();
		articleJoomlaPage.clickArrowDown();
		articleJoomlaPage.changePosition();

	}

	@Test
	public void TC_15_ChangeStatusArticle() {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleArticleChangeStatus + randomEmail());
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.selectStatusPublished(statusPublished);
		articleJoomlaPage.inputArticleText(articleTextChangeStatus);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.checkArticleRecently();
		articleJoomlaPage.clickPublishedStatus();
		verifyEquals(textArticleUnPublishedMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.clickUnPublishedStatus();
		verifyEquals(textArticlePublishedMsg, articleJoomlaPage.getTextArticleMsg());
	}

	@Test
	public void TC_16_ChangeFeatureArticle() {
		indexJoomlaPage.clickContentMenu();
		articleJoomlaPage = indexJoomlaPage.hoverAndClickArticleMenu();
		articleJoomlaPage.clickNewArticle();
		articleJoomlaPage.inputTitle(titleArticleFeature + randomEmail());
		articleJoomlaPage.selectCategory(categoryNew);
		articleJoomlaPage.selectStatusPublished(statusPublished);
		articleJoomlaPage.inputArticleText(articleTextFeature);
		articleJoomlaPage.clickSaveAndClose();
		verifyEquals(textArticleMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.checkArticleRecently();
		articleJoomlaPage.clickFeature();
		verifyEquals(textArticleFeatureMsg, articleJoomlaPage.getTextArticleMsg());
		articleJoomlaPage.clickUnFeature();
		verifyEquals(textArticleUnFeatureMsg, articleJoomlaPage.getTextArticleMsg());
	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
