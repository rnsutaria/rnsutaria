package com.oem.framework.pages;

import com.oem.framework.core.base.BasePage;
import org.openqa.selenium.By;

import java.lang.invoke.MethodHandles;

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

    public void loginUsing(String userName, String password){
        driver.get("https://portal.oem-testing.com/Account/Login");
        setValue(username,userName);
        setValue(pwd,password);
        click(signInBtn);
    }


}
