package com.oem.QuotesAndTenders;

import org.testng.annotations.Test;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.PropertyPortfolioPage;
import com.oem.framework.pages.RequestQuotePage;

public class RequestQuoteTest extends BaseTest {
	
	//@Test
	public void QT_RAQ_TC_003() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage)loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatePresenceOfRequestQuoteAndReviewQuotes();
	}
	/*@Test
	public void QT_RAQ_TC_004() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage)loginPage.login();
		PropertyPortfolioPage propertyPortfolioPage = (PropertyPortfolioPage)customerDashboardPage.goToPropertyPortfolio();
		//RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToPropertyPortfolio();//.goToRequestQuote();
		propertyPortfolioPage.deleteAllSites();
		//requestQuotePage.();
	}*/
	//@Test
	public void QT_RAQ_TC_007() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage)loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatePresenceAllUtilities();
	}
	//@Test
	public void QT_RAQ_TC_008() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage)loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validatePresenceAllUtilities();
	}
	@Test
	public void QT_RAQ_TC_009() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage)loginPage.login();
		RequestQuotePage requestQuotePage = (RequestQuotePage) customerDashboardPage.goToRequestQuote();
		requestQuotePage.validateContractDurationValuesForAllUtilities();
	}
	
	
}
