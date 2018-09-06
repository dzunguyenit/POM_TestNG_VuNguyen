package com.bankguru.payment;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;
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

import commons.AbstractTest;

public class Payment_01_MainWorkflow extends AbstractTest {

	WebDriver driver;
	String email, usernameCustomer, loginURL, usernameLogin, passwordLogin, emailUpdate, userID, accountID,
			addressUpdate, cityUpdate, stateUpdate, PINUpdate, mobileNumberUpdate, accoutID, accountType, deposit,
			depositAdd, descriptionTranferMonney, descriptionWithDrawMonney, descriptionTranferOtherAccount,
			monneyWithDraw, payeeNo, amount, createCustomerSuccesMsg, editCustomerSuccesMsg, addNewAccountMsg,
			addDepositMsg, withDrawMsg, fundTransferMsg, deleteAccountMsg, deleteCustomerMsg;
	int depositInit, sumDeposit, balanceMonney, currentBalance;
	private LoginPage loginPage;
	private RegisterPage registerPage;
	private HomePage homePage;
	private NewCustomerPage newCustomerPage;
	private EditCustomerPage editCustomerPage;
	private NewAccountPage newAccountPage;
	private DepositPage depositPage;
	private WithDrawPage withDrawPage;
	private FundTransferPage fundTransferPage;
	private BalanceEnquiryPage balanceEnquiryPage;
	private DeleteAccountPage deleteAccountPage;
	private DeleteCustomerPage deleteCustomerPage;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {
		// PRE-CONDITION
		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		loginPage = PageFactory.getLoginPage(driver);
		email = "automation" + randomEmail() + "@gmail.com";
		emailUpdate = "testing" + randomEmail() + "@gmail.com";
		// Edit Customer
		addressUpdate = "1883 Cursus Avenue";
		cityUpdate = "Houston";
		stateUpdate = "Texas";
		PINUpdate = "166455";
		mobileNumberUpdate = "4779728081";

		accoutID = "64289";
		accountType = "Current";
		deposit = "50000";
		depositAdd = "5000";

		descriptionTranferMonney = "Deposit";
		descriptionWithDrawMonney = "Withdraw";
		descriptionTranferOtherAccount = "Transfer";
		monneyWithDraw = "15000";
		payeeNo = "37890";
		amount = "10000";

		createCustomerSuccesMsg = "Customer Registered Successfully!!!";
		editCustomerSuccesMsg = "Customer details updated Successfully!!!";
		addNewAccountMsg = "Account Generated Successfully!!!";
		addDepositMsg = "Transaction details of Deposit for Account ";
		withDrawMsg = "Transaction details of Withdrawal for Account ";
		fundTransferMsg = "Fund Transfer Details";
		deleteAccountMsg = "Account Deleted Sucessfully";
		deleteCustomerMsg = "Customer deleted Successfully";

		log.info("Pre-condition Step 01 - Get login page URL");
		loginURL = loginPage.getLoginPageUrl();
		log.info("Pre-condition Step 02 - Click Here link");
		registerPage = loginPage.clickHereLink();
		log.info("Pre-condition Step 03 - Input email");
		registerPage.inputEmail(email);
		log.info("Pre-condition Step 04 - Click Submit button");
		registerPage.clickSubmitButton();
		usernameLogin = registerPage.getUserIDInfo();
		passwordLogin = registerPage.getPasswordIDInfo();
		loginPage = registerPage.openLoginPage(loginURL);

		loginPage.inputEmail(usernameLogin);
		loginPage.inputPassword(passwordLogin);
		homePage = loginPage.clickSubmitButton();

	}

	@Test
	public void TC_01_CreateNewCustomer() {
		log.info("Payment_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
		log.info("Payment_01 Step 02 - Input Customer Name");
		newCustomerPage.inputCustomerName(getJsonValue(".\\Data\\BankGuru.json", "customerName"));
		log.info("Payment_01 Step 03 - Input Date Of Birth");
		newCustomerPage.inputDateOfBirth(getJsonValue(".\\Data\\BankGuru.json", "dateOfBirth"));
		log.info("Payment_01 Step 04 - Input Address");
		newCustomerPage.inputAddress(getJsonValue(".\\Data\\BankGuru.json", "address"));
		log.info("Payment_01 Step 05 - Input City");
		newCustomerPage.inputCity(getJsonValue(".\\Data\\BankGuru.json", "city"));
		log.info("Payment_01 Step 06 - Input State");
		newCustomerPage.inputState(getJsonValue(".\\Data\\BankGuru.json", "state"));
		log.info("Payment_01 Step 07 - Input PIN");
		newCustomerPage.inputPIN(getJsonValue(".\\Data\\BankGuru.json", "PIN"));
		log.info("Payment_01 Step 08 - Input Mobile Number");
		newCustomerPage.inputMobileNumber(getJsonValue(".\\Data\\BankGuru.json", "mobileNumber"));
		log.info("Payment_01 Step 09 - Input Email");
		newCustomerPage.inputEmail(email);
		log.info("Payment_01 Step 10 - Input Password Customer");
		newCustomerPage.inputPassword(getJsonValue(".\\Data\\BankGuru.json", "passwordCustomer"));
		log.info("Payment_01 Step 11 - Click Submit button");
		newCustomerPage.clickSubmit();
		log.info("Payment_01 Step 12 - Verify Message Create Customer Success");
		verifyEquals(createCustomerSuccesMsg, newCustomerPage.getTextMessageCreateCustomerSucces());

	}

	@Test
	public void TC_02_EditCustomer() {
		userID = newCustomerPage.getTextUserID();
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
		log.info("Payment_02 Step 01 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Payment_02 Step 02 - Click Submit To Edit Infor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Payment_02 Step 03 - Input Address");
		editCustomerPage.inputAddress(addressUpdate);
		log.info("Payment_02 Step 04 - Input City");
		editCustomerPage.inputCity(cityUpdate);
		log.info("Payment_02 Step 05 - Input State");
		editCustomerPage.inputState(stateUpdate);
		log.info("Payment_02 Step 06 - Input PIN");
		editCustomerPage.inputPIN(PINUpdate);
		log.info("Payment_02 Step 07 - Input Mobile");
		editCustomerPage.inputMobileNumber(mobileNumberUpdate);
		log.info("Payment_02 Step 08 - Input Email");
		editCustomerPage.inputEmail(emailUpdate);
		log.info("Payment_02 Step 09 - Click Submit To Update");
		editCustomerPage.clickSubmitToUpdateInfor();
		log.info("Payment_02 Step 10 - Verify Message Edit Customer Success");
		verifyEquals(editCustomerSuccesMsg, editCustomerPage.getTextMessageEditCustomerSucces());

	}

	@Test
	public void TC_03_AddNewAccount() {
		log.info("Payment_03 Step 01 - Open New Account Page");
		newAccountPage = editCustomerPage.openNewAccountPage(driver);
		log.info("Payment_03 Step 02 - Input IdCustomer");
		newAccountPage.inputIdCustomer(userID);
		log.info("Payment_03 Step 03 - Select Acount Type");
		newAccountPage.selectAcountType(accountType);
		log.info("Payment_03 Step 04 - Input Deposit");
		newAccountPage.inputDeposit(deposit);
		log.info("Payment_03 Step 05 - Click Submit");
		newAccountPage.clickSubmit();
		accountID = newAccountPage.getAccountID();
		log.info("Payment_03 Step 06 - Verify Message Edit Customer Success");
		verifyEquals(addNewAccountMsg, newAccountPage.getTextMessageNewAccoutSucces());
		log.info("Payment_03 Step 06 - Verify Deposit");
		verifyEquals(deposit, newAccountPage.getTextDeposit());
		depositInit = Integer.parseInt(deposit);

	}

	@Test
	public void TC_04_AddDeposit() {
		log.info("Payment_04 Step 01 - Open Deposit Page");
		depositPage = newAccountPage.openDepositPage(driver);
		log.info("Payment_04 Step 02 - Input Account No");
		depositPage.inputAccountNo(accountID);
		log.info("Payment_04 Step 03 - Input Amount");
		depositPage.inputAmount(depositAdd);
		sumDeposit = depositInit + Integer.parseInt(depositAdd);
		log.info("Payment_04 Step 04 - Input Description");
		depositPage.inputDescription(descriptionTranferMonney);
		log.info("Payment_04 Step 05 - Click Submit");
		depositPage.clickSubmit();
		log.info("Payment_04 Step 06 - Verify Message Deposit Success");
		verifyEquals(addDepositMsg + accountID, depositPage.getTextMessageDepositSucces());
		log.info("Payment_04 Step 07 - Verify Message Current Balance");
		verifyEquals(Integer.toString(sumDeposit), depositPage.getTextCurrentBalance());
	}

	@Test
	public void TC_05_WithDraw() {
		log.info("Payment_05 Step 01 - Open WithDraw Page");
		withDrawPage = depositPage.openWithDrawPage(driver);
		log.info("Payment_05 Step 02 - Input AccountNo");
		withDrawPage.inputAccountNo(accountID);
		log.info("Payment_05 Step 03 - Input Amount");
		withDrawPage.inputAmount(monneyWithDraw);
		balanceMonney = sumDeposit - Integer.parseInt(monneyWithDraw);
		log.info("Payment_05 Step 04 - Input Description");
		withDrawPage.inputDescription(descriptionWithDrawMonney);
		log.info("Payment_05 Step 05 - Click Submit");
		withDrawPage.clickSubmit();
		log.info("Payment_05 Step 06 - Verify Message Withdraw Success");
		verifyEquals(withDrawMsg + accountID, withDrawPage.getTextMessageWithdrawSucces());
		log.info("Payment_05 Step 07 - Verify Message Current Balance");
		verifyEquals(Integer.toString(balanceMonney), withDrawPage.getTextCurrentBalance());
	}

	@Test
	public void TC_06_FundTransfer() {
		log.info("Payment_06 Step 01 - Open Fund Transfer Page");
		fundTransferPage = withDrawPage.openFundTransferPage(driver);
		log.info("Payment_06 Step 02 - Input Account No");
		fundTransferPage.inputPayerNo(accountID);
		log.info("Payment_06 Step 03 - Input Payee No");
		fundTransferPage.inputPayeeNo(payeeNo);
		log.info("Payment_06 Step 04 - Input Amount");
		fundTransferPage.inputAmount(amount);
		currentBalance = balanceMonney - Integer.parseInt(amount);
		log.info("Payment_06 Step 05 - Input Description");
		fundTransferPage.inputDescription(descriptionTranferOtherAccount);
		log.info("Payment_06 Step 06 - Click Submit");
		fundTransferPage.clickSubmit();
		log.info("Payment_06 Step 06 - Verify Message Withdraw Success");
		verifyEquals(fundTransferMsg, fundTransferPage.getTextMessageWithdrawSucces());
		log.info("Payment_06 Step 07 - Verify Message Current Balance");
		verifyEquals(amount, fundTransferPage.getTextCurrentBalance());
	}

	@Test
	public void TC_07_BalanceEnquiry() {
		log.info("Payment_07 Step 01 - Open Balance Enquiry Page");
		balanceEnquiryPage = fundTransferPage.openBalanceEnquiryPage(driver);
		log.info("Payment_07 Step 02 - Input Account No");
		balanceEnquiryPage.inputAccountNo(accountID);
		log.info("Payment_07 Step 03 - Click Submit");
		balanceEnquiryPage.clickSubmit();
		log.info("Payment_07 Step 04 - Verify Message Current Balance");
		verifyEquals(Integer.toString(currentBalance), balanceEnquiryPage.getTextCurrentBalance());
	}

	@Test
	public void TC_08_DeleteAccount() {
		log.info("Payment_08 Step 01 - openDeleteAccountPage");
		deleteAccountPage = balanceEnquiryPage.openDeleteAccountPage(driver);
		log.info("Payment_08 Step 02 - Input Account No");
		deleteAccountPage.inputAccountNo(accountID);
		log.info("Payment_08 Step 03 - Click Submit");
		deleteAccountPage.clickSubmit();
		log.info("Payment_08 Step 04 - Accept Alert 1");
		deleteAccountPage.acceptAlert();
		log.info("Payment_08 Step 05 - Verify Account Delete Success");
		verifyEquals(deleteAccountMsg, deleteAccountPage.getTextAlert());
		log.info("Payment_08 Step 06 - Accept Alert 2");
		deleteAccountPage.acceptAlert();
	}

	@Test
	public void TC_09_DeleteCustomer() {
		log.info("Payment_09 Step 01 - Open Delete Customer Page");
		deleteCustomerPage = deleteAccountPage.openDeleteCustomerPage(driver);
		log.info("Payment_09 Step 02 - Input Account No");
		deleteCustomerPage.inputAccountNo(userID);
		log.info("Payment_09 Step 03 - Click Submit");
		deleteCustomerPage.clickSubmit();
		log.info("Payment_09 Step 04 - Accept Alert 1");
		deleteCustomerPage.acceptAlert();
		log.info("Payment_09 Step 05 - Verify Customer Delete Success");
		verifyEquals(deleteCustomerMsg, deleteCustomerPage.getTextAlert());
		log.info("Payment_09 Step 06 - Accept Alert 2");
		deleteCustomerPage.acceptAlert();

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
