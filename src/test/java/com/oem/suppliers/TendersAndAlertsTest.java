package com.oem.suppliers;

import org.testng.annotations.Test;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.AdminDashboardPage;
import com.oem.framework.pages.LoginPage;
import com.oem.framework.pages.SupplierDashboardPage;
import com.oem.framework.pages.TendersAndAlertsPage;

public class TendersAndAlertsTest extends BaseTest {
	
	@Test
	public void QT_RAQ_TC_003() throws Throwable
	{
		LoginPage loginPage = new LoginPage();
		AdminDashboardPage adminDashboardPage = (AdminDashboardPage)loginPage.loginAsAdmin();
		SupplierDashboardPage supplierDashboardPage = (SupplierDashboardPage)adminDashboardPage.impersonateSupplier();
		TendersAndAlertsPage tendersAndAlertsPage = (TendersAndAlertsPage)supplierDashboardPage.goToTendersAndAlerts();
		tendersAndAlertsPage.validateQuoteRequestStatusDropdownPresence();
	}
	@Test
	public void QT_RAQ_TC_004() throws Throwable
	{
		LoginPage loginPage = new LoginPage();
		AdminDashboardPage adminDashboardPage = (AdminDashboardPage)loginPage.loginAsAdmin();
		SupplierDashboardPage supplierDashboardPage = (SupplierDashboardPage)adminDashboardPage.impersonateSupplier();
		TendersAndAlertsPage tendersAndAlertsPage = (TendersAndAlertsPage)supplierDashboardPage.goToTendersAndAlerts();
		tendersAndAlertsPage.validatingPresenceOfUtilities();
	}
	@Test
	public void QT_RAQ_TC_005() throws Throwable
	{
		LoginPage loginPage = new LoginPage();
		AdminDashboardPage adminDashboardPage = (AdminDashboardPage)loginPage.loginAsAdmin();
		SupplierDashboardPage supplierDashboardPage = (SupplierDashboardPage)adminDashboardPage.impersonateSupplier();
		TendersAndAlertsPage tendersAndAlertsPage = (TendersAndAlertsPage)supplierDashboardPage.goToTendersAndAlerts();
		tendersAndAlertsPage.validateQuoteRequestStatusDropdown();
	}
	
	/*public void QT_RAQ_TC_019() throws Throwable
	{
		LoginPage loginPage = new LoginPage();
		AdminDashboardPage adminDashboardPage = (AdminDashboardPage)loginPage.loginAsAdmin();
		SupplierDashboardPage supplierDashboardPage = (SupplierDashboardPage)adminDashboardPage.impersonateSupplier();
		TendersAndAlertsPage tendersAndAlertsPage = (TendersAndAlertsPage)supplierDashboardPage.goToTendersAndAlerts();
		tendersAndAlertsPage.validateSubmitPricePage();
	}*/
	
}
