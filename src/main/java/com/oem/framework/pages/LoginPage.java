package com.oem.framework.pages;

import com.oem.framework.core.base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;


public class LoginPage extends BasePage {

    By username=By.id("Email");
    By pwd=By.id("Password");
    By signInBtn=By.xpath("//input[@value='Sign in']");

   /* static {
        threadLocalPage.set(new LoginPage());
    }*/

   /* public static LoginPage getInstance(){
        return (LoginPage) threadLocalPage.get();
    }*/

    public BasePage loginUsing(String userName, String password){
        driver.get("https://portal.oem-testing.com/Account/Login");
        setValue(username,userName);
        setValue(pwd,password);
        click(signInBtn);

        //Failed login
        if(isElementPresent(signInBtn))
            return this;

        return new AdminDashboardPage();
    }


    @Override
    protected void isLoaded() throws Error {
        Assert.assertTrue(isElementPresent(pwd),"Login page didnt appear");
    }
}
