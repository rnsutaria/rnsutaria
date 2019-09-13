package com.oem.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.PropertyPortfolioMeterPage;
import com.oem.framework.pages.PropertyPortfolioPage;

public class PropertyPortfolioMeterTest extends BaseTest {
	
	//@Test(dataProvider = "getGasMeterData")
	public void executeAddGasMeterUsingDataProvider(String gasMeterNumber, String procurementType, String expectedConsumption, 
			String currentSupplier, int dayOfMonthOfContractEndDate, int monthNumberOfContractEndDate, int yearOfContractEndDate, 
			String currentAnnualSpend) throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage)loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterPage = (PropertyPortfolioMeterPage)customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterPage.addGasMeterUsingDifferentTestData(gasMeterNumber, procurementType, expectedConsumption, 
				currentSupplier, dayOfMonthOfContractEndDate, monthNumberOfContractEndDate, 
				yearOfContractEndDate, currentAnnualSpend);
	}
	@DataProvider
	public Object[][] getGasMeterData() {
		Object[][] data = {{"", "Fund", "", "British Gas Business", 20, 4, 2021, ""}, /*PM_PP_TC_081*/
				{"2642342754", "Fixed", "", "D-ENERGi", 20, 5, 2020, ""}, /*PM_PP_TC_082*/
				{"6786342454", "Fixed Pass Through", "2200", "Corona Energy", 10, 3, 2020, ""}, /*PM_PP_TC_083*/
				{"2842342254", "Combined Flexible", "", "Corona Energy", 10, 3, 2020, ""},/*PM_PP_TC_084*/
				{"2842342254", "Fixed", "3500", "Corona Energy", 10, 9, 2020, ""}}; /*PM_PP_TC_085*/
		return data;
	}
	//@Test
	public void PM_PP_TC_080() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterPage = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterPage.validateAddGasMeterPopup();
	}
	@Test
	public void PM_PP_TC_086() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterPage = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterPage.addGasMeterUsingValidTestData();
	}
}
