package com.oem.tests;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CompanyProfilePage;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CompanyProfileTest extends BaseTest {

	@Test
	public void PM_CP_TC_003() {
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
	public void PM_CP_TC_005() {

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
	public void PM_CP_TC_007()
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
	public void PM_CP_TC_006()
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
	public void PM_CP_TC_009()
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
	public void PM_CP_TC_031()
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
	public void PM_CP_TC_032()
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
	public void PM_CP_TC_015()
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
	@Test
	public void PM_CP_TC_026()
	{
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.verifyLOATemplateDisplay("Letter of Authority Template");
	}
	@Test
	public void PM_CP_TC_027()
	{
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.verifyExistingLOADisplay("Download Existing Letter Of Authority");
	}
	@Test
	public void PM_CP_TC_028()
	{
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.click(By.id("LOAExpiresDate"));
		//companyProfilePage.verifyElementPresent(By.xpath("//div[@id = 'ui-datepicker-div']"));
		companyProfilePage.verifyExistingLOADisplay("Download Existing Letter Of Authority");
	}
	
}
