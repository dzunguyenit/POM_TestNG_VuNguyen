package com.ecommerce;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class ECommerce extends AbstractTest {

	WebDriver driver;
	String costXperia, codeCoupon, qty, titleProductCompare, mobileWindow, firstName, middleName, lastName, email,
			password, confirmPassword, emailShare, message, country, state, zip, address, city, telephone, discountMsg,
			maxProductMsg, emptyCartMsg, compareProductMsg, registerSuccesMsg, withListSharedMsg, shippingCost,
			orderSuccessMsg, shippingCostDynamic, discountDynamic, costXperiaDynamic, costXperiaDetailDynamic;
	private HomeGuru99 homeGuru99;
	private HomeMobile homeMobile;
	private DetailProduct detailProduct;
	private Cart cart;
	private TVHome tvhome;
	private AccountTVPage accountTVPage;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {
		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeGuru99 = PageFactory.getHomeGuru99(driver);
		codeCoupon = "GURU50";
		qty = "1000";
		titleProductCompare = "Products Comparison List - Magento Commerce";
		firstName = "Vu";
		middleName = "Huynh Thanh";
		lastName = "Nguyen";
		email = "automation" + randomEmail() + "@gmail.com";
		password = "123456";
		confirmPassword = "123456";
		emailShare = "testing" + randomEmail() + "@gmail.com";
		message = "Share your wishlist";
		country = "United States";
		state = "New York";
		zip = "543432";
		address = "ABC";
		city = "New York";
		telephone = "123123123";
		discountMsg = "-$25.00";
		discountDynamic = "-$25.00";
		maxProductMsg = "* The maximum quantity allowed for purchase is 500.";
		emptyCartMsg = "SHOPPING CART IS EMPTY";
		compareProductMsg = "COMPARE PRODUCTS";
		registerSuccesMsg = "Thank you for registering with Main Website Store.";
		withListSharedMsg = "Your Wishlist has been shared.";
		shippingCost = "$5.00";
		shippingCostDynamic = "$5.00";
		orderSuccessMsg = "YOUR ORDER HAS BEEN RECEIVED.";
		costXperiaDynamic = "$100.00";
		costXperiaDetailDynamic = "$100.00";
	}

	@Test
	public void TC_01_VerifyCost() {
		log.info("Ecommerce_01 Step 01 - Go to Home Mobile Page");
		homeMobile = homeGuru99.clickMobileMenu();
		log.info("Ecommerce_01 Step 02 - Get Cost Sony Xperia");
		costXperia = homeMobile.getCostSonyXperia(costXperiaDynamic);
		log.info("Ecommerce_01 Step 03 - Click Sony Xperia Image");
		detailProduct = homeMobile.clickSonyXperiaImage();
		log.info("Ecommerce_01 Step 04 - Verify Cost Sony Xperia Detail");
		verifyEquals(costXperia, detailProduct.getCostSonyXperiaDetail(costXperiaDetailDynamic));

	}

	@Test
	public void TC_02_VerifyDiscount() {
		log.info("Ecommerce_01 Step 01 - Go to Home Mobile Page");
		homeMobile = homeGuru99.clickMobileMenu();
		log.info("Ecommerce_01 Step 02 - Click Add To Cart IPhone");
		cart = homeMobile.clickAddToCartIPhone();
		log.info("Ecommerce_01 Step 03 - Input Code Coupon");
		cart.inputCodeCoupon(codeCoupon);
		log.info("Ecommerce_01 Step 04 - Click Apply Label");
		cart.clickApplyLabel();
		log.info("Ecommerce_01 Step 05 - Verify Discount");
		verifyEquals(discountMsg, cart.getDiscount(discountDynamic));

	}

	@Test
	public void TC_03_CannotAddMoreProduct() {
		log.info("Ecommerce_01 Step 01 - Go to Home Mobile Page");
		homeMobile = homeGuru99.clickMobileMenu();
		log.info("Ecommerce_01 Step 02 - Click Add To Cart Sony");
		cart = homeMobile.clickAddToCartSonyXperia();
		log.info("Ecommerce_01 Step 03 - Input Qty");
		cart.inputQty(qty);
		log.info("Ecommerce_01 Step 04 - Click Update Button");
		cart.clickUpdateBtn();
		log.info("Ecommerce_01 Step 05 - Verify Maximum Quantity");
		verifyEquals(maxProductMsg, cart.getMaxquantityErr());
		log.info("Ecommerce_01 Step 06 - click Empty Cart Button");
		cart.clickEmptyCartBtn();
		log.info("Ecommerce_01 Step 07 - Verify Empty Cart");
		verifyEquals(emptyCartMsg, cart.getEmptyLbl());

	}

	@Test
	public void TC_04_CompareProduct() {
		log.info("Ecommerce_01 Step 01 - Go to Home Mobile Page");
		homeMobile = homeGuru99.clickMobileMenu();
		log.info("Ecommerce_01 Step 02 - Click Sony Compare");
		homeMobile.clickSonyCompare();
		log.info("Ecommerce_01 Step 03 - Click Iphone Compare");
		homeMobile.clickIPhoneCompare();
		log.info("Ecommerce_01 Step 04 - Click Compare Button");
		homeMobile.clickCompareBtn();
		mobileWindow = homeMobile.getWindowParent();
		log.info("Ecommerce_01 Step 05 - Switch To Product Compare Window");
		homeMobile.switchtoProductCompareWindow(titleProductCompare);
		log.info("Ecommerce_01 Step 06 - Verify Text Compare Product");
		verifyEquals(compareProductMsg, homeMobile.getTextCompareProduct());
		log.info("Ecommerce_01 Step 07 - Close Product Compare Window");
		homeMobile.closeProductCompareWindow(mobileWindow);

	}

	@Test
	public void TC_05_ShareWishList() {
		log.info("Ecommerce_01 Step 01 - Go to accountTV Page");
		accountTVPage = homeGuru99.clickMyAccount();
		log.info("Ecommerce_01 Step 02 - Click Create Account Button");
		accountTVPage.clickCreateAccountBtn();
		log.info("Ecommerce_01 Step 03 - Input First Name");
		accountTVPage.inputFirstName(firstName);
		log.info("Ecommerce_01 Step 04 - Input Middle Name");
		accountTVPage.inputMiddleName(middleName);
		log.info("Ecommerce_01 Step 05 - Input Last Name");
		accountTVPage.inputLastName(lastName);
		log.info("Ecommerce_01 Step 06 - Input Email");
		accountTVPage.inputEmail(email);
		log.info("Ecommerce_01 Step 07 - Input Password");
		accountTVPage.inputPassword(password);
		log.info("Ecommerce_01 Step 08 - Input Confirm Password");
		accountTVPage.inputConfirmPassword(confirmPassword);
		log.info("Ecommerce_01 Step 09 - Click Register Button");
		tvhome = accountTVPage.clickRegisterBtn();
		log.info("Ecommerce_01 Step 10 - Verify Text Register Success");
		verifyEquals(registerSuccesMsg, tvhome.getTextRegisterSuccess());
		log.info("Ecommerce_01 Step 11 - Click TV Menu");
		tvhome.clickTVmenu();
		log.info("Ecommerce_01 Step 12 - Click Add To WishList LG_LCD");
		tvhome.clickAddToWishListLG_LCD();
		log.info("Ecommerce_01 Step 13 - Click Share To WishList");
		tvhome.clickShareToWishList();
		log.info("Ecommerce_01 Step 14 - Input Email Share");
		tvhome.inputEmailShare(emailShare);
		log.info("Ecommerce_01 Step 15 - Input Message Share");
		tvhome.inputMessage(message);
		log.info("Ecommerce_01 Step 16 - Click Share Wish List Infor");
		tvhome.clickShareWishListInfor();
		log.info("Ecommerce_01 Step 17 - Verify Text WishList Shared");
		verifyEquals(withListSharedMsg, tvhome.getTextWishListShared());
		log.info("Ecommerce_01 Step 18 - Click Account");
		tvhome.clickAccount();
		log.info("Ecommerce_01 Step 19 - Click Logout");
		tvhome.clickLogout();
	}

	@Test
	public void TC_06_PurchaseProduct() {
		log.info("Ecommerce_01 Step 01 - Go to accountTV Page");
		accountTVPage = homeGuru99.clickMyAccount();
		log.info("Ecommerce_01 Step 02 - Input Email Register");
		accountTVPage.inputEmailRegister(email);
		log.info("Ecommerce_01 Step 03 - Input Password Register");
		accountTVPage.inputPasswordRegistered(password);
		log.info("Ecommerce_01 Step 04 - Click Login Button");
		tvhome = accountTVPage.clickLoginBtn();
		log.info("Ecommerce_01 Step 05 - Click My WishList Menu");
		tvhome.clickMyWishListMenu();
		log.info("Ecommerce_01 Step 06 - Click Add To Cart My WishList");
		tvhome.clickAddToCartMyWishList();
		log.info("Ecommerce_01 Step 07 - Select Country");
		tvhome.selectCountry(country);
		log.info("Ecommerce_01 Step 08 - Select State");
		tvhome.selectState(state);
		log.info("Ecommerce_01 Step 09 - Input Zip");
		tvhome.inputZip(zip);
		log.info("Ecommerce_01 Step 10 - Click Estimate");
		tvhome.clickEstimate();
		log.info("Ecommerce_01 Step 11 - Verify Text Shipping Cost");
		verifyEquals(shippingCost, tvhome.getTextShippingCost(shippingCostDynamic));
		log.info("Ecommerce_01 Step 12 - Click Radio Flat Rate");
		tvhome.clickRadioFlatRate();
		log.info("Ecommerce_01 Step 13 - Click Update Total");
		tvhome.clickUpdateTotal();
		log.info("Ecommerce_01 Step 14 - Click Proceed To Checkout");
		tvhome.clickProceedToCheckout();
		log.info("Ecommerce_01 Step 15 - Input Address");
		tvhome.inputAddress(address);
		log.info("Ecommerce_01 Step 16 - Input City");
		tvhome.inputCity(city);
		log.info("Ecommerce_01 Step 17 - Select State Bill");
		tvhome.selectStateBill(state);
		log.info("Ecommerce_01 Step 18 - Input Zip Billing");
		tvhome.inputZipBilling(zip);
		log.info("Ecommerce_01 Step 19 - Select Country Billing");
		tvhome.selectCountryBilling(country);
		log.info("Ecommerce_01 Step 20 - Input Telephone");
		tvhome.inputTelephone(telephone);
		log.info("Ecommerce_01 Step 21 - Click Continue");
		tvhome.clickContinue();
		log.info("Ecommerce_01 Step 22 - Click Continue FlatRate");
		tvhome.clickContinueFlatRate();
		log.info("Ecommerce_01 Step 23 - Click Radio Money Order");
		tvhome.clickRadioMoneyOrder();
		log.info("Ecommerce_01 Step 24 - Click Payment Save");
		tvhome.clickPaymentSave();
		log.info("Ecommerce_01 Step 25 - Click Place Order");
		tvhome.clickPlaceOrder();
		log.info("Ecommerce_01 Step 26 - Verify Text Order Success");
		verifyEquals(orderSuccessMsg, tvhome.getTextOrderSuccess());
	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
