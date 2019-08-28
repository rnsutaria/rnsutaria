package com.oem.tests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.PortfolioCalendarPage;

public class PortfolioCalendarTest extends BaseTest{
	@Test
	public void PM_PC_TC_003() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		customerDashboardPage.verifyPortfolioManagerElementExists();
	}
	@Test
	public void PM_PC_TC_004() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.verifyPortfolioCalendarEntrypopup(
				"Add new portfolio calendar entry");
	}
	@Test
	public void PM_PC_TC_005() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.verifyCloseBtnPortfolioCalendarEntrypopup();
	}
	@Test(dataProvider = "getData")
	public void PM_PC_TC_006(String description) throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.verifyspaceDataPortfolioCaledarEntryPopup(description);
	}
	@Test
	public void PM_PC_TC_008() throws Exception {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.validateEventDescriptionPortfolioCaledarEntryPopup("The Event Description * field is required.");
	}
	@Test
	public void PM_PC_TC_009() throws Exception {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.validateDeleteEventPopup("Are you sure you want to delete this event?");
	}
	@Test
	public void PM_PC_TC_010() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.validateCancelBtnDeleteEventPopup();
	}
	@Test
	public void PM_PC_TC_011() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.validateDeleteEvent();
	}
	@Test
	public void PM_PC_TC_012() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.validateEditEventPopup("Edit portfolio calendar entry");
	}
	@Test
	public void PM_PC_TC_013() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.validateCloseIconEditEventPopup();
	}
	@Test
	public void PM_PC_TC_014() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.validateEditEventChangingDate();
	}
	@Test
	public void PM_PC_TC_015() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.validateEditEventChangingDescription();
	}
	@DataProvider
	public Object[][] getData() {
		Object data[][] = new Object[7][1];
		data[0][0] = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
		data[1][0] = "";
		data[2][0] = "123456";
		data[3][0] = "!@#$%";
		data[4][0] = "Lorem Ipsum123456";
		data[5][0] = "</html>";
		data[6][0] = "      ";
		return data;
	}

}
