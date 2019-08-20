package com.oem.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.PortfolioCalendarPage;

public class PortfolioCalendarTest extends BaseTest{
	@Test
	public void PM_CP_TC_003() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		customerDashboardPage.verifyPortfolioManagerElementExists();
	}
	@Test
	public void PM_CP_TC_004() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.click(By.id("new-entry-btn"));
		Thread.sleep(3000);
		portfolioCalendarPage.verifyPortfolioCalendarEntrypopup(
				"Add new portfolio calendar entry");
	}
	@Test
	public void PM_CP_TC_005() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		PortfolioCalendarPage portfolioCalendarPage = (PortfolioCalendarPage) customerDashboardPage.goToPortfolioCalendar();
		portfolioCalendarPage.click(By.id("new-entry-btn"));
		Thread.sleep(1000);
		portfolioCalendarPage.click(By.xpath("//div[@id='add-calendar-entry']//button[@class='close icon-close']"));
		Thread.sleep(1000);
		portfolioCalendarPage.verifyCloseBtnPortfolioCalendarEntrypopup();
	}

}
