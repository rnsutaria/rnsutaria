package com.raj.framework.pages;

import com.raj.framework.core.BasePage;
import org.openqa.selenium.By;

public class CustomerDashboardPage extends BasePage {

    By portfolioMgr= By.xpath("//span[text()='Portfolio Manager']");
    By companyProfile=By.linkText("Company Profile");

    public void navigateTo(){
        click(portfolioMgr);
        click(companyProfile);

    }
}
