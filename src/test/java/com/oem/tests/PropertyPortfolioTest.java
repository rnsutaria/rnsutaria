package com.oem.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.PortfolioCalendarPage;
import com.oem.framework.pages.PropertyPortfolioPage;

public class PropertyPortfolioTest extends BaseTest {
	
	/*@Test
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
	public void PM_PP_TC_006() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PropertyPortfolioPage propertyPortfolioTest = (PropertyPortfolioPage) customerDashboardPage.goToPropertyPortfolio();
		propertyPortfolioTest.validateAddressPostcodeMandatoryFieldsAddSitePopup();
	}
	@Test
	public void PM_PP_TC_007() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PropertyPortfolioPage propertyPortfolioTest = (PropertyPortfolioPage) customerDashboardPage.goToPropertyPortfolio();
		propertyPortfolioTest.validateMandatorySiteNamePostcodeFieldsInAddSitePopup();
	}
	@Test
	public void PM_PP_TC_008() throws InterruptedException  {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PropertyPortfolioPage propertyPortfolioTest = (PropertyPortfolioPage) customerDashboardPage.goToPropertyPortfolio();
		propertyPortfolioTest.validateMandatorySiteNameAddressFieldsInAddSitePopup();
	}*/
	@Test(dataProvider = "getData")
	public void addSiteUsingDataProvider(String name, String addr1, String postCode, String siteContactNAME, String contactPHONENo, String contactEMAIL, String site_ID, String addr2, String addr3, String addr4, String siteArea) throws Throwable  {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PropertyPortfolioPage propertyPortfolioTest = (PropertyPortfolioPage) customerDashboardPage.goToPropertyPortfolio();
		propertyPortfolioTest.validateAddSitePopupDataProvider(name, addr1, postCode, 
				siteContactNAME, contactPHONENo, contactEMAIL, site_ID, addr2, addr3, addr4, siteArea);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = 
			{{"", "", "", "Henricks", "9823948232", "andola.amitav@gmail.com", "8125", "GR Complex", "Domlur", "Karnataka", "2000"}};
				
		return data;
	}
	/*@Test
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
	}*/

}
