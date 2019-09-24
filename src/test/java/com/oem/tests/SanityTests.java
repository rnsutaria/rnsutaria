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

	/*@Test(dataProvider = "getNHHdata")
	public void addnHHMeterUsingDataProvider(String meterNoDropdownFieldValue, String meterNoSecondField, String meterNoThirdField, String meterNoFourthField, 
			String meterNoFifthField, String meterNoSixthField, String meterNoSeventhField, String procurementType, String expectedConsumption, 
			String currentSupplier, int dayOfMonthOfContractEndDate, int monthNumberOfContractEndDate, int yearOfContractEndDate, 
			String currentAnnualSpend) throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterTest = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterTest.validateAddnHHMeterPopupUsingDifferentTestData(meterNoDropdownFieldValue, meterNoSecondField, 
				meterNoThirdField, meterNoFourthField, meterNoFifthField, meterNoSixthField, meterNoSeventhField, procurementType, 
				expectedConsumption, currentSupplier, dayOfMonthOfContractEndDate, monthNumberOfContractEndDate, yearOfContractEndDate, 
				currentAnnualSpend); 
	}
	@DataProvider
	public Object[][] getNHHdata() {
		Object[][] data = {{"03", "", "", "", "", "", "", "Fixed", "", "Ecotricity", 11, 7, 2020, "4500"}};
				{"04", "234", "456", "75", "2346", "7454", "345", "Combined Flexible", "4000", "Haven Power", 12, 5, 2020, "3500"},
				{"05", "345", "462", "12", "0005", "2005", "514", "Flexible", "4800", "D-ENERGi", 02, 3, 2020, "5500"}};
		return data;
	}*/
	@Test(dataProvider = "getNHHdata")
	public void addnHHMeterUsingDataProvider(String meterNoDropdownFieldValue, String meterNoSecondField, String meterNoThirdField, String meterNoFourthField, 
			String meterNoFifthField, String meterNoSixthField, String meterNoSeventhField, String procurementType, String expectedConsumption, 
			String currentSupplier, String currentAnnualSpend) throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterTest = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterTest.validateAddnHHMeterPopupUsingDifferentTestData(meterNoDropdownFieldValue, meterNoSecondField, 
				meterNoThirdField, meterNoFourthField, meterNoFifthField, meterNoSixthField, meterNoSeventhField, procurementType, 
				expectedConsumption, currentSupplier, currentAnnualSpend); 
	}
	@DataProvider
	public Object[][] getNHHdata() {
		Object[][] data = {{"03", "", "", "", "", "", "", "Fixed", "", "Ecotricity", ""}, 			/*PM_PP_TC_066*/
				{"04", "234", "456", "", "", "", "", "Fixed", "", "Haven Power", ""},				/*PM_PP_TC_067*/
				{"05", "", "", "10", "1270", "8070", "869", "Fixed", "", "D-ENERGi", ""},			/*PM_PP_TC_068*/
				{"02", "456", "564", "10", "1270", "8070", "869", "Fixed", "", "Ecotricity", ""},	/*PM_PP_TC_069*/
				{"02", "456", "564", "10", "1270", "8070", "869", "Fixed", "3500", "Haven Power", ""},/*PM_PP_TC_070*/
				{"02", "456", "564", "10", "1270", "8070", "869", "Fixed", "3500", "Haven Power", ""}};			
		return data;
	}
}
