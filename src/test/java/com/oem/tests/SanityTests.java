package com.oem.tests;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CompanyProfilePage;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.PortfolioCalendarPage;
import com.oem.framework.pages.PropertyPortfolioMeterPage;
import com.oem.framework.pages.PropertyPortfolioPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SanityTests extends BaseTest {

	/*@Test
	public void PortfolioManagerDisplaysTest() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.login();
		customerDashboardPage.verifyPortfolioManagerElementExists();

	}

	@Test
	public void TC_003_4() {

		LoginPage loginPage = new LoginPage();

		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.login();
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.fillCompanyProfile();
	}*/

	@Test(dataProvider = "getHHdata")
	public void addHHMeterUsingDataProviderTest(String meterNoSecondField, String meterNoThirdField, String meterNoFourthField, 
			String meterNoFifthField, String meterNoSixthField, String meterNoSeventhField, String expectedConsumption, 
			String capacity) throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterTest = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterTest.addHHMeterUsingDifferentTestData(meterNoSecondField, meterNoThirdField, 
				meterNoFourthField, meterNoFifthField, meterNoSixthField, meterNoSeventhField, expectedConsumption, capacity); 
	}
	@DataProvider
	public Object[][] getHHdata() {
		Object[][] data = {{"", "", "", "", "", "", "", ""}, 									/*PM_PP_TC_016*/
				{"234", "456", "", "", "", "", "", ""},											/*PM_PP_TC_017*/
				{"", "", "10", "1270", "8070", "869", "", ""},									/*PM_PP_TC_018*/
				{"456", "564", "10", "1270", "8070", "869", "", ""},							/*PM_PP_TC_019*/
				{"456", "564", "10", "1270", "8070", "869", "3500", ""},						/*PM_PP_TC_020*/
				{"456", "564", "10", "1270", "8070", "869", "", "5200"},						/*PM_PP_TC_022*/
				{"456", "564", "10", "1270", "8070", "869", "4000", "7000"}};					/*PM_PP_TC_024*/					
		return data;
	}
}
