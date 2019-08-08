package com.oem.tests;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CompanyProfilePage;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SanityTests extends BaseTest {

	@Test
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

	}
	
	@Test
	public void RegisteredAddressMaxLimitTest() {

		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.setFieldValue(CompanyProfilePage.CompanyProfileFields.RegisteredAddress,
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it.");
		companyProfilePage.verifyRegisteredAddressError(
				"The field Registered address must be a string with a maximum length of 200");

	}
	
	@Test
	public void CompanyNameBlankTest()
	{
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.setFieldValue(CompanyProfilePage.CompanyProfileFields.NAME, "");
		companyProfilePage.click(By.id("submit"));
		companyProfilePage.verifyCompanyNameError(
				"The Company name field is required.");
		
	}
	
	@Test
	public void RegisteredAddressBlankTest()
	{
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.setFieldValue(CompanyProfilePage.CompanyProfileFields.RegisteredAddress, "");
		companyProfilePage.click(By.id("submit"));
		companyProfilePage.verifyBlankRegisteredAddressError(
				"Registered address field is required");
		
	}
	
	@Test
	public void PostCodeErrMsgTest()
	{
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.setFieldValue(CompanyProfilePage.CompanyProfileFields.PostCode, "");
		companyProfilePage.click(By.id("submit"));
		companyProfilePage.verifyBlankPostcodeError(
				"Postcode field is required");
	}
	@Test
	public void RegisteredAddressSpaceTestDataTest()
	{
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.setFieldValue(CompanyProfilePage.CompanyProfileFields.RegisteredAddress, "     ");
		companyProfilePage.click(By.id("submit"));
		companyProfilePage.verifyBlankRegisteredAddressError(
				"Registered address field is required");		
	}
	@Test
	public void PostCodeSpaceTestDataTest()
	{
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.setFieldValue(CompanyProfilePage.CompanyProfileFields.PostCode, "     ");
		companyProfilePage.click(By.id("submit"));
		companyProfilePage.verifyBlankPostcodeError(
				"Postcode field is required");
	}
	@Test
	public void CompanyRegistrationNumberErrorMsgTest()
	{
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.setFieldValue(CompanyProfilePage.CompanyProfileFields.RegistrationNumber, "");
		companyProfilePage.click(By.id("submit"));
		companyProfilePage.verifyCompRegistrationNumberError(
				"Company registration number field is required");
	}
	
//	
}
