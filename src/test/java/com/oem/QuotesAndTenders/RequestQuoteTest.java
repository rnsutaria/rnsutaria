package com.oem.QuotesAndTenders;

import org.testng.annotations.Test;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.PropertyPortfolioPage;
import com.oem.framework.pages.RequestQuotePage;

public class RequestQuoteTest extends BaseTest {

	@Test
	public void QT_RAQ_TC_003() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatePresenceOfRequestQuoteAndReviewQuotes();
	}

	/*
	 * @Test public void QT_RAQ_TC_004() throws Throwable { LoginPage loginPage
	 * = new LoginPage(); CustomerDashboardPage customerDashboardPage =
	 * (CustomerDashboardPage)loginPage.login(); PropertyPortfolioPage
	 * propertyPortfolioPage =
	 * (PropertyPortfolioPage)customerDashboardPage.goToPropertyPortfolio();
	 * //RequestQuotePage requestQuotePage = (RequestQuotePage)
	 * customerDashboardPage.goToPropertyPortfolio();//.goToRequestQuote();
	 * propertyPortfolioPage.deleteAllSites(); //requestQuotePage.(); }
	 */
	@Test
	public void QT_RAQ_TC_007() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatePresenceAllUtilities();
	}

	@Test
	public void QT_RAQ_TC_008() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validateContractDurationValuesForAllUtilities();
	}

	@Test
	public void QT_RAQ_TC_010() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatealertErrormessage_IfNotSelectedAndempty();
	}

	@Test
	public void QT_RAQ_TC_011() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatealertErrormessagewhenOnlyOneMeterisSelected();
	}

	@Test
	public void QT_RAQ_TC_012() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatealertErrormessagewhenMoreThanOneMeterisSelected();
	}

	 @Test
	public void QT_RAQ_TC_013() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatealertErrormessagewhenOneContractDurationisSelected();
	}

	 @Test
	public void QT_RAQ_TC_014() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatealertErrormessagewhenMoreThanOneContractDurationisSelected();
	}

	@Test
	public void QT_RAQ_TC_015() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validateAlertMessageWhen2ContractDurationsAreSame();
	}
	
	@Test
	public void QT_RAQ_TC_016() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatealertErrormessageAfterSelectingOneSuplier();
	}
	@Test
	public void QT_RAQ_TC_017() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatealertErrormessageAfterSelectingAllSuplier();
	}
	@Test
	public void QT_RAQ_TC_018() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatealertErrormessageAfterSelecting1meter1contractDuration();
	}
	@Test
	public void QT_RAQ_TC_019() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatealertErrormessageAfterSelecting1meterMultiplecontractDuration();
	}
	@Test
	public void QT_RAQ_TC_020() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatealertErrormessageAfterSelectingMultiplemeterMultiplecontractDuration();
	}
	@Test
	public void QT_RAQ_TC_021() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingErrorMessageAfterSelecting1contractDurationAndMultipleSuppliers();
	}
	@Test
	public void QT_RAQ_TC_022() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingErrorMessageAfterSelectingMultiplecontractDurationAndSingleSupplier();
	}
	@Test
	public void QT_RAQ_TC_023() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingErrorMessageAfterSelectingsinglecontractDurationAndmultipleSupplier();
	}
	@Test
	public void QT_RAQ_TC_024() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingAvailablityToVerfyAfterSelecting1Meter1Contract1Supplier();
	}
	@Test
	public void QT_RAQ_TC_025() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingAvailablityToVerfyAfterSelectingMultipleMeter1Contract1Supplier();
	}
	@Test
	public void QT_RAQ_TC_026() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingAvailablityToVerfyAfterSelecting1MeterMultipleContract1Supplier();
	}
	@Test
	public void QT_RAQ_TC_027() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingAvailablityToVerfyAfterSelecting1Meter1ContractMultipleSupplier();
	}
	@Test
	public void QT_RAQ_TC_028() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingAvailablityToVerfyAfterSelectingMultipleMeterMultipleContract1Supplier();
	}
	@Test
	public void QT_RAQ_TC_029() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingAvailablityToVerfyAfterSelectingMultipleMeter1ContractMultipleSupplier();
	}
	@Test
	public void QT_RAQ_TC_030() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingAvailablityToVerfyAfterSelectingSingleMeterMultipleContractMultipleSupplier();
	}
	@Test
	public void QT_RAQ_TC_032() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingAvailablityToVerfyAfterSelectingMultipleMeterMultipleContractMultipleSupplier();
	}
	@Test
	public void QT_RAQ_TC_033() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingAvailablityToVerfyAfterSelectingAllMeterAllContractAllSupplierAndRenewableEnergy();
	}
	@Test
	public void QT_RAQ_TC_034() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingErrorMessageAfterSelectingAllMeterAllContractAllSupplierAndSettingDate5daysBefore();
	}
	@Test
	public void QT_RAQ_TC_035() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatingAvailablityToVerfyAfterSelectingAllMeterAllContractAllSupplierAndSettingDatetoFuture();
	}
	/*@Test
	public void QT_RAQ_TC_037() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.verifyAlertMessageWhenNometerNocontractnosupplierSelectedIn_nHHUtility();
	}*/
}
