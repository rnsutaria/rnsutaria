package com.oem.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.PropertyPortfolioMeterPage;
import com.oem.framework.pages.PropertyPortfolioPage;

public class PropertyPortfolioMeterTest extends BaseTest {
	
	//@Test
	public void PM_PP_TC_065() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterTest = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterTest.validateAddnHHMeterPopup();
	}
	//@Test
	public void PM_PP_TC_0689() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterTest = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterTest.addValidNHHMeterGeneric();
	}
	@Test(dataProvider = "getNHHdata")
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
		Object[][] data = {{"03", "", "", "", "", "", "", "Fixed", "", "Ecotricity", 11, 7, 2020, "4500"},
				{"04", "234", "456", "75", "2346", "7454", "345", "Combined Flexible", "4000", "Haven Power", 12, 5, 2020, "3500"},
				{"05", "345", "462", "12", "0005", "2005", "514", "Flexible", "4800", "D-ENERGi", 02, 3, 2020, "5500"}};
		return data;
	}
	//@Test(dataProvider = "getGasMeterData")
	public void addGasMeterUsingDataProviderTest(String gasMeterNumber, String procurementType, String expectedConsumption, 
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
	//@Test
	public void PM_PP_TC_086() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterPage = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterPage.addGasMeterUsingValidTestData();
	}
	//@Test 
	public void PM_PP_TC_087() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterPage = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterPage.addExpiredGasMeter();
	}
	//@Test 
	public void PM_PP_TC_088() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterPage = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterPage.checkSavedDetailsAfterAddingGasMeter();
	}
	//@Test 
	public void PM_PP_TC_089() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterPage = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterPage.validateEditGasMeterPopup();
	}
	//@Test 
	public void PM_PP_TC_090() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterPage = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterPage.validateEditGasMeter();
	}
	//@Test 
	public void PM_PP_TC_091() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterPage = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterPage.validateDeleteMeterPopup();
	}
	//@Test 
	public void PM_PP_TC_092() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterPage = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterPage.validateDeleteMeter();
	}
	//@Test 
	public void PM_PP_TC_106() throws Throwable {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage.login();
		PropertyPortfolioMeterPage propertyPortfolioMeterPage = (PropertyPortfolioMeterPage) customerDashboardPage.goToPropertyPortfolioMeterPage();
		propertyPortfolioMeterPage.validateMeterRevertDeletion();
	}
}
