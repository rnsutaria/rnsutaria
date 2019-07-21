package com.raj.framework.pages;

import com.raj.framework.core.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    By username=By.id("Email");
    By pwd=By.id("Password");
    By signInBtn=By.xpath("//input[@value='Sign in']");

    public static LoginPage getInstance(){
        return new LoginPage();
    }

    public void loginUsing(String userName, String password){
        driver.get("https://portal.oem-testing.com/Account/Login");
        setValue(username,userName);
        setValue(pwd,password);
        click(signInBtn);
    }


}
