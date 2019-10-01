package com.oem.QuotesAndTenders;

import org.testng.annotations.Test;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.PropertyPortfolioPage;
import com.oem.framework.pages.RequestQuotePage;

public class RequestQuoteTest extends BaseTest {

	// @Test
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
	//@Test
	public void QT_RAQ_TC_007() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatePresenceAllUtilities();
	}

	//@Test
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
}
