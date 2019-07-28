package com.oem.tests;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.pages.CompanyProfilePage;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;

import org.testng.annotations.Test;


public class SanityTests extends BaseTest {




    @Test
    public void TC_001_2()  {
        LoginPage loginPage = new LoginPage();
        CustomerDashboardPage customerDashboardPage= (CustomerDashboardPage) loginPage.loginUsing("ando.laamitav@gmail.com","amitav123");
        customerDashboardPage.verifyPortfolioManagerElementExists();

    }

    //"anitha.bt@simpro.co.in","oemstaging123"

    @Test
    public void TC_003_4() {

        LoginPage loginPage=new LoginPage();

        CustomerDashboardPage customerDashboardPage= (CustomerDashboardPage) loginPage.loginUsing("ando.laamitav@gmail.com","amitav123");
        CompanyProfilePage companyProfilePage= (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
        companyProfilePage.fillCompanyProfile();

    }

    @Test
    public void TC_005() {

        LoginPage loginPage=new LoginPage();
        CustomerDashboardPage customerDashboardPage= (CustomerDashboardPage) loginPage.loginUsing("ando.laamitav@gmail.com","amitav123");
        CompanyProfilePage companyProfilePage= (CompanyProfilePage) customerDashboardPage.goToCompanyProfile();
        companyProfilePage.setFieldValue(CompanyProfilePage.CompanyProfileFields.RegisteredAddress,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it.");
        companyProfilePage.verifyRegisteredAddressError("The field Registered address must be a string with a maximum length of 200");


    }
}
