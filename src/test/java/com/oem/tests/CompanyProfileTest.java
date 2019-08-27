package com.oem.tests;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CompanyProfilePage;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
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
	public void PM_CP_TC_017() {

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
		companyProfilePage.verifyRegisteredAddressError(
				"The field Registered address must be a string with a maximum length of 200");
	}

	@Test
	public void PM_CP_TC_007() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.verifyCompanyNameError("The Company name field is required.");
	}

	@Test
	public void PM_CP_TC_006() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.verifyBlankRegisteredAddressError("Registered address field is required");

	}

	@Test
	public void PM_CP_TC_009() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.verifyBlankPostcodeError("Postcode field is required");
	}

	@Test
	public void PM_CP_TC_015() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.verifyCompRegistrationNumberError("Company registration number field is required");
	}

	@Test
	public void PM_CP_TC_018() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.uploadLogo();
	}

	@Test
	public void PM_CP_TC_019()
	{
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		//companyProfilePage
	}

	@Test
	public void PM_CP_TC_026() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.verifyLOATemplateDisplay("Letter of Authority Template");
	}

	@Test
	public void PM_CP_TC_027() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.verifyExistingLOADisplay("Download Existing Letter Of Authority");
	}

	@Test
	public void PM_CP_TC_028() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		// companyProfilePage.click(By.id("LOAExpiresDate"));
		companyProfilePage.verifyDatePickerDisplayLOAExpiresDate();
	}

	@Test
	public void PM_CP_TC_029() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.click(By.id("LOAExpiresDate"));
		companyProfilePage.selectFutureDateCalender();
	}

	@Test
	public void PM_CP_TC_030() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.click(By.id("LOAExpiresDate"));
		companyProfilePage.selectPrevDateCalender();
	}

	@Test
	public void PM_CP_TC_031() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.setFieldValue(CompanyProfilePage.CompanyProfileFields.RegisteredAddress, "     ");
		companyProfilePage.click(By.id("submit"));
		companyProfilePage.verifyBlankRegisteredAddressError("Registered address field is required");
	}

	@Test
	public void PM_CP_TC_032() {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.setFieldValue(CompanyProfilePage.CompanyProfileFields.PostCode, "     ");
		companyProfilePage.verifyBlankPostcodeError("Postcode field is required");
	}

	@Test(dataProvider = "getData")
	public void dataDriven(String compName, String addr, String postCode, String ph, String regdNo)
			throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		CustomerDashboardPage customerDashboardPage = (CustomerDashboardPage) loginPage
				.loginUsing("ando.laamitav@gmail.com", "amitav123");
		CompanyProfilePage companyProfilePage = (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
		companyProfilePage.validateProfileDiffDataSets(compName, addr, postCode, ph, regdNo);
	}

	@DataProvider
	public Object[][] getData() {
		 Object[][] data = new Object[7][5];
				
		// set 1 : all valid
		data[0][0] = "Tibco Inc";// comp name
		data[0][1] = "Bangalore";// address
		data[0][2] = "123456";// postcode
		data[0][3] = "7234823423";// phone
		data[0][4] = "123456";// regd number

		// set 2 : company name alphanumeric
		data[1][0] = "Tibco12345";// comp name
		data[1][1] = "G R Complex, No. 31, Ground & 1st Floor, Kempegowda Service Rd, Domlur, Bengaluru, Karnataka";// address
		data[1][2] = "123456";// postcode
		data[1][3] = "7234823423";// phone
		data[1][4] = "123456";// regd number

		// set 3 : company name symbolic
		data[2][0] = "!@#$%^&";// comp name
		data[2][1] = "G R Complex, No. 31, Ground & 1st Floor, Kempegowda Service Rd, Domlur, Bengaluru, Karnataka";// address
		data[2][2] = "123456";// postcode
		data[2][3] = "7234823423";// phone
		data[2][4] = "123456";// regd number

		// set 4 : company name space data
		data[3][0] = "      ";// comp name
		data[3][1] = "G R Complex, No. 31, Ground & 1st Floor, Kempegowda Service Rd, Domlur, Bengaluru, Karnataka";// address
		data[3][2] = "123456";// postcode
		data[3][3] = "7234823423";// phone
		data[3][4] = "123456";// regd number

		// set 5 : company name symbolic
		data[4][0] = "</html>";// comp name
		data[4][1] = "G R Complex, No. 31, Ground & 1st Floor, Kempegowda Service Rd, Domlur, Bengaluru, Karnataka";// address
		data[4][2] = "123456";// postcode
		data[4][3] = "7234823423";// phone
		data[4][4] = "123456";// regd number

		// set 6 : Registered address numeric
		data[5][0] = "AGB3";// comp name
		data[5][1] = "123456789";// address
		data[5][2] = "123456";// postcode
		data[5][3] = "7234823423";// phone
		data[5][4] = "123456";// regd number

		// set 7 : Registered address
		data[6][0] = "AGB3";// comp name
		data[6][1] = "!@#$%^&*";// address
		data[6][2] = "123456";// postcode
		data[6][3] = "7234823423";// phone
		data[6][4] = "123456";// regd number

		return data;
	}
}
