package com.abstractPage;

import org.openqa.selenium.WebDriver;

import com.bankguru.BalanceEnquiryPage;
import com.bankguru.DeleteAccountPage;
import com.bankguru.DeleteCustomerPage;
import com.bankguru.DepositPage;
import com.bankguru.EditCustomerPage;
import com.bankguru.FundTransferPage;
import com.bankguru.HomePage;
import com.bankguru.LoginPage;
import com.bankguru.NewAccountPage;
import com.bankguru.NewCustomerPage;
import com.bankguru.RegisterPage;
import com.bankguru.WithDrawPage;
import com.ecommerce.AccountTVPage;
import com.ecommerce.Cart;
import com.ecommerce.DetailProduct;
import com.ecommerce.HomeGuru99;
import com.ecommerce.HomeMobile;
import com.ecommerce.TVHome;
import com.joomla.LoginJoomlaPage;
import com.sytner.AboutUsSytner;
import com.sytner.BusinessUsersSytner;
import com.sytner.CarMaintenanceSytner;
import com.sytner.CareerSytner;
import com.sytner.CustomerServiceSytner;
import com.sytner.DealerLocatorSytner;
import com.sytner.FinanceSytner;
import com.sytner.HomeSytner;
import com.sytner.NewCarSytner;
import com.sytner.NewsSytner;
import com.sytner.PromotionsSytner;
import com.sytner.SavedVehicleSytner;
import com.sytner.SellYourCarSytner;
import com.sytner.UsedCarSearchSytner;

public class PageFactory extends AbstractPage {
	private static LoginPage loginPage;
	private static RegisterPage registerPage;
	private static HomePage homePage;
	private static NewCustomerPage newCustomerPage;
	private static EditCustomerPage editCustomerPage;
	private static NewAccountPage newAccountPage;
	private static DepositPage depositPage;
	private static WithDrawPage withDrawPage;
	private static FundTransferPage fundTransferPage;
	private static BalanceEnquiryPage balanceEnquiryPage;
	private static DeleteAccountPage deleteAccountPage;
	private static DeleteCustomerPage deleteCustomerPage;
	private static HomeGuru99 homeGuru99;
	private static LoginJoomlaPage loginJoomlaPage;
	private static HomeSytner homeSytner;
	private static AboutUsSytner aboutUsSytner;
	private static NewsSytner newsSytner;
	private static CustomerServiceSytner customerServiceSytner;
	private static FinanceSytner financeSytner;
	private static SavedVehicleSytner savedVehicleSytner;
	private static UsedCarSearchSytner usedCarSearchSytner;
	private static NewCarSytner newCarSytner;
	private static CarMaintenanceSytner carMaintenanceSytner;
	private static CareerSytner careerSytner;
	private static BusinessUsersSytner businessUsersSytner;
	private static SellYourCarSytner sellYourCarSytner;
	private static DealerLocatorSytner dealerLocatorSytner;
	private static PromotionsSytner promotionsSytner;
	private static HomeMobile momeMobile;
	private static AccountTVPage accountTVPage;
	private static DetailProduct detailProduct;
	private static Cart cart;
	private static TVHome tVHome;

	public static Cart getCartPage(WebDriver driver) {
		if (cart == null)
			return new Cart(driver);
		return cart;
	}

	public static TVHome getTVHomePage(WebDriver driver) {
		if (tVHome == null)
			return new TVHome(driver);
		return tVHome;
	}

	public static DetailProduct getDetailProductPage(WebDriver driver) {
		if (detailProduct == null)
			return new DetailProduct(driver);
		return detailProduct;
	}

	public static AccountTVPage getAccountTVPage(WebDriver driver) {
		if (accountTVPage == null)
			return new AccountTVPage(driver);
		return accountTVPage;
	}

	public static HomeMobile getHomeMobilePage(WebDriver driver) {
		if (momeMobile == null)
			return new HomeMobile(driver);
		return momeMobile;
	}

	public static LoginPage getLoginPage(WebDriver driver) {
		if (loginPage == null)
			return new LoginPage(driver);
		return loginPage;
	}

	public static RegisterPage getRegisterPage(WebDriver driver) {
		if (registerPage == null)
			return new RegisterPage(driver);
		return registerPage;
	}

	public static HomePage getHomePage(WebDriver driver) {
		if (homePage == null)
			return new HomePage(driver);
		return homePage;
	}

	public static NewCustomerPage getNewCustomerPage(WebDriver driver) {
		if (newCustomerPage == null)
			return new NewCustomerPage(driver);
		return newCustomerPage;
	}

	public static EditCustomerPage getEditCustomerPage(WebDriver driver) {
		if (editCustomerPage == null)
			return new EditCustomerPage(driver);
		return editCustomerPage;
	}

	public static NewAccountPage getNewAccountPage(WebDriver driver) {
		if (newAccountPage == null)
			return new NewAccountPage(driver);
		return newAccountPage;
	}

	public static DepositPage getDepositPage(WebDriver driver) {
		if (depositPage == null)
			return new DepositPage(driver);
		return depositPage;
	}

	public static WithDrawPage getWithDrawPage(WebDriver driver) {
		if (withDrawPage == null)
			return new WithDrawPage(driver);
		return withDrawPage;
	}

	public static FundTransferPage getFundTransferPage(WebDriver driver) {
		if (fundTransferPage == null)
			return new FundTransferPage(driver);
		return fundTransferPage;
	}

	public static BalanceEnquiryPage getBalanceEnquiryPage(WebDriver driver) {
		if (balanceEnquiryPage == null)
			return new BalanceEnquiryPage(driver);
		return balanceEnquiryPage;
	}

	public static DeleteAccountPage getDeleteAccountPage(WebDriver driver) {
		if (deleteAccountPage == null)
			return new DeleteAccountPage(driver);
		return deleteAccountPage;
	}

	public static DeleteCustomerPage getDeleteCustomerPage(WebDriver driver) {
		if (deleteCustomerPage == null)
			return new DeleteCustomerPage(driver);
		return deleteCustomerPage;
	}

	public static HomeGuru99 getHomeGuru99(WebDriver driver) {
		if (homeGuru99 == null)
			return new HomeGuru99(driver);
		return homeGuru99;
	}

	public static LoginJoomlaPage getLoginJoomlaPage(WebDriver driver) {
		if (loginJoomlaPage == null)
			return new LoginJoomlaPage(driver);
		return loginJoomlaPage;
	}

	public static HomeSytner getHomeSytnerPage(WebDriver driver) {
		if (homeSytner == null)
			return new HomeSytner(driver);
		return homeSytner;
	}

	public static AboutUsSytner getAboutUsSytnerPage(WebDriver driver) {
		if (aboutUsSytner == null)
			return new AboutUsSytner(driver);
		return aboutUsSytner;
	}

	public static NewsSytner getNewsSytnerPage(WebDriver driver) {
		if (newsSytner == null)
			return new NewsSytner(driver);
		return newsSytner;
	}

	public static CustomerServiceSytner getCustomerServiceSytnerPage(WebDriver driver) {
		if (customerServiceSytner == null)
			return new CustomerServiceSytner(driver);
		return customerServiceSytner;
	}

	public static CareerSytner getCareerSytnerPage(WebDriver driver) {
		if (careerSytner == null)
			return new CareerSytner(driver);
		return careerSytner;
	}

	public static FinanceSytner getFinanceSytnerPage(WebDriver driver) {
		if (financeSytner == null)
			return new FinanceSytner(driver);
		return financeSytner;
	}

	public static SavedVehicleSytner getSavedVehicleSytnerPage(WebDriver driver) {
		if (savedVehicleSytner == null)
			return new SavedVehicleSytner(driver);
		return savedVehicleSytner;
	}

	public static UsedCarSearchSytner getUsedCarSearchSytnerPage(WebDriver driver) {
		if (usedCarSearchSytner == null)
			return new UsedCarSearchSytner(driver);
		return usedCarSearchSytner;
	}

	public static NewCarSytner getNewCarSytnerPage(WebDriver driver) {
		if (newCarSytner == null)
			return new NewCarSytner(driver);
		return newCarSytner;
	}

	public static CarMaintenanceSytner getCarMaintenanceSytnerPage(WebDriver driver) {
		if (carMaintenanceSytner == null)
			return new CarMaintenanceSytner(driver);
		return carMaintenanceSytner;
	}

	public static PromotionsSytner getPromotionsSytnerPage(WebDriver driver) {
		if (promotionsSytner == null)
			return new PromotionsSytner(driver);
		return promotionsSytner;
	}

	public static BusinessUsersSytner getBusinessUsersSytnerPage(WebDriver driver) {
		if (businessUsersSytner == null)
			return new BusinessUsersSytner(driver);
		return businessUsersSytner;
	}

	public static SellYourCarSytner getSellYourCarSytnerPage(WebDriver driver) {
		if (sellYourCarSytner == null)
			return new SellYourCarSytner(driver);
		return sellYourCarSytner;
	}

	public static DealerLocatorSytner getDealerLocatorSytnerPage(WebDriver driver) {
		if (dealerLocatorSytner == null)
			return new DealerLocatorSytner(driver);
		return dealerLocatorSytner;
	}
}
