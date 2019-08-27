package com.oem.tests;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CompanyProfilePage;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.PortfolioCalendarPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SanityTests extends BaseTest {

	/*@Test
	public void PortfolioManagerDisplaysTest() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		customerDashboardPage.verifyPortfolioManagerElementExists();

	}

	@Test
	public void TC_003_4() {

		LoginPage loginPage = new LoginPage();

		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.fillCompanyProfile();
	}*/
	
	@Test
	public void PM_PC_TC_008() throws Exception {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.validateEventDescriptionPortfolioCaledarEntryPopup("The Event Description * field is required.");
	}
	
}
