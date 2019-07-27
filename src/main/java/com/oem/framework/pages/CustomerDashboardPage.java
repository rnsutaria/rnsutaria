package com.oem.framework.pages;

import com.oem.framework.core.base.BasePage;
import org.openqa.selenium.By;

public class CustomerDashboardPage extends BasePage {

    By portfolioMgr= By.xpath("//*[@id=\"accordian-menu\"]//li[3]/h3");
    By companyProfile=By.linkText("Company Profile");

    By companyName=By.id("Name");
    By companyRegisteredAddress=By.id("RegisteredAddress");

       public void navigateTo(){
        click(portfolioMgr);
        click(companyProfile);

    }

    public void goToCompanyProfile(){
        click(portfolioMgr);
        click(companyProfile);
    }

    public void fillCompanyProfile(){
        setValue(companyName,"abc");
        setValue(companyRegisteredAddress,"Bangalore");


    }
}
