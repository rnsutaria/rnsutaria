package com.oem.framework.pages;

import com.oem.framework.core.base.BasePage;
import org.openqa.selenium.By;

public class AdminDashboardPage extends BasePage {

    By impersonateUsername=By.id("ImpersonateUserName");
    By impersonateBtn=By.id("impersonateBtn");



    public void impersonate(String email){
        setValue(impersonateUsername,email);
        click(impersonateBtn);
    }
}
