package com.oem.tests;

import org.testng.annotations.Test;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.PortfolioCalendarPage;
import com.oem.framework.pages.PropertyPortfolioPage;

public class PropertyPortfolioTest extends BaseTest {
	
	@Test
	public void PM_PP_TC_004() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PropertyPortfolioPage propertyPortfolioTest = (PropertyPortfolioPage) customerDashboardPage.goToPropertyPortfolio();
		propertyPortfolioTest.validatePresenceAddSitePopup();
	}
	@Test
	public void PM_PP_TC_005() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PropertyPortfolioPage propertyPortfolioTest = (PropertyPortfolioPage) customerDashboardPage.goToPropertyPortfolio();
		propertyPortfolioTest.validateMandatoryFieldsAddSitePopup();
	}
	@Test
	public void PM_PP_TC_014() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PropertyPortfolioPage propertyPortfolioTest = (PropertyPortfolioPage) customerDashboardPage.goToPropertyPortfolio();
		propertyPortfolioTest.validateAddMeterDropdown();
	}
	@Test
	public void PM_PP_TC_015() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PropertyPortfolioPage propertyPortfolioTest = (PropertyPortfolioPage) customerDashboardPage.goToPropertyPortfolio();
		propertyPortfolioTest.validateAddHHMeterPopup();
	}
	@Test
	public void validateAddnHHMeterPopup1() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PropertyPortfolioPage propertyPortfolioTest = (PropertyPortfolioPage) customerDashboardPage.goToPropertyPortfolio();
		propertyPortfolioTest.validateAddnHHMeterPopup();
	}
	@Test
	public void validateAddnHHMeterPopup2() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PropertyPortfolioPage propertyPortfolioTest = (PropertyPortfolioPage) customerDashboardPage.goToPropertyPortfolio();
		propertyPortfolioTest.validateAddnHHMeterPopup();
	}

}
