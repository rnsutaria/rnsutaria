package com.raj.framework.tests;

import com.raj.framework.core.BaseTest;
import com.raj.framework.core.listener.TestNGAnnotationsListener;
import com.raj.framework.pages.AdminDashboardPage;
import com.raj.framework.pages.LoginPage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGAnnotationsListener.class)
public class LoginTest extends BaseTest {


    public LoginTest(){
        System.out.println("LoginTest constructor");
    }
    @Test
    public void registerNewUserTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        AdminDashboardPage adminDashboardPage=null;

        loginPage=new LoginPage();
        adminDashboardPage=new AdminDashboardPage();
        loginPage.loginUsing("anitha.bt@simpro.co.in","oemstaging123");
      //  adminDashboardPage.impersonate("testcustomer012@openenergymarket.com");
       //
        // Thread.sleep(5000);

    }


    @Test
    public void register2() throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        AdminDashboardPage adminDashboardPage=null;

        loginPage=new LoginPage();
        adminDashboardPage=new AdminDashboardPage();
        loginPage.loginUsing("anitha.bt@simpro.co.in","oemstaging123");
        adminDashboardPage.impersonate("testcustomer012@openenergymarket.com");
        //
        // Thread.sleep(5000);

    }

}
