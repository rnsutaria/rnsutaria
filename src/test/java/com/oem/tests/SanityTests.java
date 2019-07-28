package com.oem.tests;

import com.oem.framework.core.base.BaseTest;
import com.oem.framework.core.listener.TestNGAnnotationsListener;
import com.oem.framework.pages.AdminDashboardPage;
import com.oem.framework.pages.CustomerDashboardPage;
import com.oem.framework.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class SanityTests extends BaseTest {




    @Test
    public void loginUserTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage= (LoginPage) loginPage.loginUsing("anitha.bt@simpro.co.in","oemstaging123");
      //  adminDashboardPage.impersonate("testcustomer012@openenergymarket.com");

    }


    @Test
    public void register2() throws InterruptedException {

        LoginPage loginPage=new LoginPage();
        CustomerDashboardPage customerDashboardPage=new CustomerDashboardPage();

        AdminDashboardPage adminDashboardPage= (AdminDashboardPage) loginPage.loginUsing("anitha.bt@simpro.co.in","oemstaging123");
        adminDashboardPage.impersonate("testcustomer012@openenergymarket.com");
        customerDashboardPage.goToCompanyProfile();
        customerDashboardPage.fillCompanyProfile();
        System.out.println("");
        // Thread.sleep(5000);

    }

}
