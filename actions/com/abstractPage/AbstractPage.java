package com.abstractPage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.bankguru.BalanceEnquiryPage;
import com.bankguru.DeleteAccountPage;
import com.bankguru.DeleteCustomerPage;
import com.bankguru.DepositPage;
import com.bankguru.EditCustomerPage;
import com.bankguru.FundTransferPage;
import com.bankguru.NewAccountPage;
import com.bankguru.NewCustomerPage;
import com.bankguru.WithDrawPage;
import com.bankguru.ui.AbstractPageUI;
import com.sytner.AboutUsSytner;
import com.sytner.BusinessUsersSytner;
import com.sytner.CarMaintenanceSytner;
import com.sytner.CareerSytner;
import com.sytner.CustomerServiceSytner;
import com.sytner.DealerLocatorSytner;
import com.sytner.FinanceSytner;
import com.sytner.NewCarSytner;
import com.sytner.NewsSytner;
import com.sytner.PromotionsSytner;
import com.sytner.SavedVehicleSytner;
import com.sytner.SellYourCarSytner;
import com.sytner.UsedCarSearchSytner;

public class AbstractPage {
	private int timeouts = 20;

	// Web Browser
	public void openUrl(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public String getPageSource(WebDriver driver) {
		return driver.getPageSource();
	}

	public void backToPage(WebDriver driver) {
		driver.navigate().back();
	}

	public void forwardToPage(WebDriver driver) {
		driver.navigate().forward();
	}

	public void refreshPage(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void waitForIEBrowser(int Timeouts) {
		try {
			Thread.sleep(Timeouts);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Web Element
	public void clickToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.click();
	}

	public void clickToElement(WebDriver driver, String locator, String value) {
		String dynamicLocator = String.format(locator, value);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		element.click();
	}

	public void clickToElement(WebDriver driver, String locator, String value1, String value2) {
		String dynamicLocator = String.format(locator, value1, value2);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		element.click();
	}

	public String getTextElement(WebDriver driver, String locator, String value) {
		String dynamicLocator = String.format(locator, value);
		return getTextElement(driver, dynamicLocator);
	}

	// Clear and sendkey
	public void sendKeyToElement(WebDriver driver, String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(value);
	}

	public void sendKeyToElement2(WebDriver driver, String locator, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(value);
	}

	public void selectItemInDropdown(WebDriver driver, String locator, String value) {
		Select element = new Select(driver.findElement(By.xpath(locator)));
		element.selectByVisibleText(value);
	}

	public void selectItemInDropdownSpecial(WebDriver driver, String locatorDropdown, String locator, String value) {
		WebElement dropdown = driver.findElement(By.xpath(locatorDropdown));
		dropdown.click();
		List<WebElement> list = driver.findElements(By.xpath(locator));
		for (WebElement element : list) {
			if (element.getText().equalsIgnoreCase(value)) {
				element.click();
				break;
			}
		}

	}

	public String getFirstItemSelected(WebDriver driver, String locator) {
		Select element = new Select(driver.findElement(By.xpath(locator)));
		return element.getFirstSelectedOption().getText();
	}

	public String getAtribute(WebDriver driver, String locator, String attribute) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getAttribute(attribute);
	}

	public String getTextElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.getText();
	}

	public int getSize(WebDriver driver, String locator) {
		List<WebElement> element = driver.findElements(By.xpath(locator));
		return element.size();
	}

	public void uncheckTheCheckbox(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		if (element.isSelected())
			element.click();
	}

	public boolean isControlDisplayed(WebDriver driver, String locator, String value) {
		String dynamicLocator = String.format(locator, value);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		return element.isDisplayed();
	}

	public boolean isControlDisplayed(WebDriver driver, String locator, String value1, String value2) {
		String dynamicLocator = String.format(locator, value1, value2);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		return element.isDisplayed();
	}

	public boolean isControlDisplayed(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isDisplayed();
	}

	public boolean isControlSelected(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isSelected();
	}

	public boolean isControlEnabled(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		return element.isEnabled();
	}
	// Alert

	public void acceptAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void cancelAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String getTextAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void sendKeyAlert(WebDriver driver, String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}

	// Windows
	public void switchWindowByID(WebDriver driver, String parent) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String childWindows : allWindows) {
			if (!childWindows.equals(parent)) {
				driver.switchTo().window(childWindows);
				break;
			}
		}
	}

	public void switchWindowByTitle(WebDriver driver, String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String childWindows : allWindows) {
			driver.switchTo().window(childWindows);
			String childTitle = driver.getTitle();
			if (childTitle.equals(title)) {
				break;
			}
		}
	}

	// Bonus
	public boolean closeAllWindowsWithoutParent(WebDriver driver, String parent) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String childWindows : allWindows) {
			if (!childWindows.equals(parent)) {
				driver.switchTo().window(childWindows);
				driver.close();
			}
		}
		driver.switchTo().window(parent);

		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}

	public String getWindowParentID(WebDriver driver) {
		return driver.getWindowHandle();
	}

	// Iframe
	public void switchToIframe(WebDriver driver, String locator) {
		WebElement iframe = driver.findElement(By.xpath(locator));
		driver.switchTo().frame(iframe);
	}

	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	// Actions
	public void doubleClick(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	public void hoverMouse(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void hoverMouse(WebDriver driver, String locator, String value1, String value2) {
		String dynamicLocator = String.format(locator, value1, value2);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void rightClick(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public void dragAndDrop(WebDriver driver, String locatorFrom, String locatorTarget) {
		WebElement dragFrom = driver.findElement(By.xpath(locatorFrom));
		WebElement target = driver.findElement(By.xpath(locatorTarget));
		Actions builder = new Actions(driver);
		Action dragAndDropAction = builder.clickAndHold(dragFrom).moveToElement(target).release(target).build();
		dragAndDropAction.perform();
	}

	// Bonus
	public void clickAndHold(WebDriver driver, int itemFrom, int itemTarget, String locator) {
		List<WebElement> listItems = driver.findElements(By.xpath(locator));
		Actions action = new Actions(driver);
		action.clickAndHold(listItems.get(itemFrom)).clickAndHold(listItems.get(itemTarget)).click().perform();
		action.release();
	}

	// Key Press
	public void keyDownElement(WebDriver driver, String locator, Keys pressKeyDown) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.keyDown(element, pressKeyDown);
	}

	public void keyUpElement(WebDriver driver, String locator, Keys pressKeyUp) {
		WebElement element = driver.findElement(By.xpath(locator));
		Actions action = new Actions(driver);
		action.keyUp(element, pressKeyUp);
	}

	public void sendKeyPress(WebDriver driver, String locator, Keys key) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(key);
	}

	public void clearAndSendKeyPress(WebDriver driver, String locator, Keys key) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.clear();
		element.sendKeys(key);
	}

	// Upload
	public void uploadFile(WebDriver driver, String locator, String firePath) {
		WebElement element = driver.findElement(By.xpath(locator));
		element.sendKeys(firePath);
	}

	// Javascript
	public Object executeJavascriptToBrowser(WebDriver driver, String javaSript) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript(javaSript);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object executeJavascriptToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object executeJavascriptToElement(WebDriver driver, String locator, String value1, String value2) {
		String dynamicLocator = String.format(locator, value1, value2);
		WebElement element = driver.findElement(By.xpath(dynamicLocator));
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object scrollToBottomPage(WebDriver driver) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	public Object scrollToElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	// Bonus
	public void highlightElement(WebDriver driver, String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='6px groove red'", element);
	}

	// Bonus
	public Object removeAttributeInDOM(WebDriver driver, String locator, String attribute) {
		WebElement element = driver.findElement(By.xpath(locator));
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			return js.executeScript("arguments[0].removeAttribute('" + attribute + "');", element);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}

	// Wait
	public void waitForControlPresence(WebDriver driver, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public void waitForControlVisible(WebDriver driver, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitForIframeVisible(WebDriver driver, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
	}

	public void waitForControlVisible(WebDriver driver, String locator, String value) {
		String dynamicLocator = String.format(locator, value);
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(dynamicLocator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitForControlVisible(WebDriver driver, String locator, String value1, String value2) {
		String dynamicLocator = String.format(locator, value1, value2);
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(dynamicLocator);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitForControlClickable(WebDriver driver, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public void waitForControlInvisible(WebDriver driver, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		By by = By.xpath(locator);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public void waitForAlertPresence(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, timeouts);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public boolean sortElementAcsending(WebDriver driver, String locator) {

		List<WebElement> list = driver.findElements(By.xpath(locator));
		int length = list.size();
		for (int i = 0; i < length; i++) {
			if (Integer.parseInt(list.get(i).getText()) <= Integer.parseInt(list.get(i + 1).getText())) {
				return true;
			}
		}
		return false;
	}

	public boolean sortElementDescending(WebDriver driver, String locator) {

		List<WebElement> list = driver.findElements(By.xpath(locator));
		int length = list.size();
		for (int i = 0; i < length; i++) {
			if (Integer.parseInt(list.get(i).getText()) >= Integer.parseInt(list.get(i + 1).getText())) {
				return true;
			}
		}
		return false;
	}

	public void swapElement(WebDriver driver, String locator) {

		List<WebElement> list = driver.findElements(By.xpath(locator));
		int temp;
		int position1 = Integer.parseInt(list.get(0).getText());
		int position2 = Integer.parseInt(list.get(1).getText());
		temp = position1;
		position1 = position2;
		position2 = temp;

	}

	protected boolean verifyEquals(Object actual, Object expected, boolean flag) {
		boolean pass = true;
		if (flag == false) {
			try {
				Assert.assertEquals(actual, expected);
			} catch (Throwable e) {
				pass = false;
				Reporter.getCurrentTestResult().setThrowable(e);
			}
		} else {
			Assert.assertEquals(actual, expected);
		}
		return pass;
	}

	protected boolean verifyEquals(Object actual, Object expected) {
		return verifyEquals(actual, expected, false);
	}

	public NewCustomerPage openNewCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGES, "New Customer");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGES, "New Customer");
		return PageFactory.getNewCustomerPage(driver);
	}

	public EditCustomerPage openEditCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGES, "Edit Customer");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGES, "Edit Customer");
		return PageFactory.getEditCustomerPage(driver);
	}

	public NewAccountPage openNewAccountPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGES, "New Account");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGES, "New Account");
		return PageFactory.getNewAccountPage(driver);
	}

	public DepositPage openDepositPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGES, "Deposit");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGES, "Deposit");
		return PageFactory.getDepositPage(driver);
	}

	public WithDrawPage openWithDrawPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGES, "Withdrawal");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGES, "Withdrawal");
		return PageFactory.getWithDrawPage(driver);
	}

	public FundTransferPage openFundTransferPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGES, "Fund Transfer");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGES, "Fund Transfer");
		return PageFactory.getFundTransferPage(driver);
	}

	public BalanceEnquiryPage openBalanceEnquiryPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGES, "Balance Enquiry");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGES, "Balance Enquiry");
		return PageFactory.getBalanceEnquiryPage(driver);
	}

	public DeleteAccountPage openDeleteAccountPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGES, "Delete Account");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGES, "Delete Account");
		return PageFactory.getDeleteAccountPage(driver);
	}

	public DeleteCustomerPage openDeleteCustomerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_PAGES, "Delete Customer");
		clickToElement(driver, AbstractPageUI.DYNAMIC_PAGES, "Delete Customer");
		return PageFactory.getDeleteCustomerPage(driver);
	}

	public AboutUsSytner openAboutUsSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "About Us");
		clickToElement(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "About Us");
		return PageFactory.getAboutUsSytnerPage(driver);
	}

	public NewsSytner openNewsSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "News");
		clickToElement(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "News");
		return PageFactory.getNewsSytnerPage(driver);
	}

	public CustomerServiceSytner openCustomerServiceSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "Customer Service");
		clickToElement(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "Customer Service");
		return PageFactory.getCustomerServiceSytnerPage(driver);
	}

	public CareerSytner openCareerSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "Careers");
		clickToElement(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "Careers");
		return PageFactory.getCareerSytnerPage(driver);
	}

	public FinanceSytner openFinanceSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "Finance");
		clickToElement(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "Finance");
		return PageFactory.getFinanceSytnerPage(driver);
	}

	public SavedVehicleSytner openSavedVehicleSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "Saved Vehicles");
		clickToElement(driver, AbstractPageUI.DYNAMIC_SYTNER_PAGES, "Saved Vehicles");
		return PageFactory.getSavedVehicleSytnerPage(driver);
	}

	public UsedCarSearchSytner openUsedCarSearchSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Used Car Search");
		clickToElement(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Used Car Search");
		return PageFactory.getUsedCarSearchSytnerPage(driver);
	}

	public NewCarSytner openNewCarSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "New Cars");
		clickToElement(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "New Cars");
		return PageFactory.getNewCarSytnerPage(driver);
	}

	public CarMaintenanceSytner openCarMaintenanceSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Car Maintenance");
		clickToElement(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Car Maintenance");
		return PageFactory.getCarMaintenanceSytnerPage(driver);
	}

	public PromotionsSytner openPromotionsSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Promotions");
		clickToElement(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Promotions");
		return PageFactory.getPromotionsSytnerPage(driver);
	}

	public BusinessUsersSytner openBusinessUsersSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Business Users");
		clickToElement(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Business Users");
		return PageFactory.getBusinessUsersSytnerPage(driver);
	}

	public SellYourCarSytner openSellYourCarSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Sell your car");
		clickToElement(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Sell your car");
		return PageFactory.getSellYourCarSytnerPage(driver);
	}

	public DealerLocatorSytner openDealerLocatorSytnerPage(WebDriver driver) {
		waitForControlVisible(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Dealer Locator");
		clickToElement(driver, AbstractPageUI.DYNAMIC_MENU_SYTNER_PAGES, "Dealer Locator");
		return PageFactory.getDealerLocatorSytnerPage(driver);
	}

}
