package com.oem.framework.pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class CompanyProfilePage extends CustomerDashboardPage {


    By companyName=By.id("Name");
    By companyRegisteredAddress=By.id("RegisteredAddress");
    By compPostCode=By.id("Postcode");
    By registeredAddressError=By.id("RegisteredAddress-error");

    public void fillCompanyProfile(){
        setValue(companyName,"abc");
        setValue(companyRegisteredAddress,"Bangalore");


    }


    @Override
    protected void isLoaded() throws Error {
        System.out.println("Executing isLoaded in CustomerDashboard Page");
        Assert.assertTrue(isElementPresent(companyRegisteredAddress),"Company profile Page didnt appear");


    }

    public void setFieldValue(CompanyProfileFields field,String value){
           switch (field){
               case NAME:
                    setValue(companyName,value);
                    sendSpecialKeys(companyName,Keys.TAB);
                   break;
               case RegisteredAddress:
                   setValue(companyRegisteredAddress,value);
                   sendSpecialKeys(companyName,Keys.TAB);
                   break;
               case PostCode:
                   setValue(compPostCode,value);
                   break;
           }

    }

    public void verifyRegisteredAddressError(String value){

        Assert.assertTrue(StringUtils.isNoneBlank(getText(registeredAddressError)) &&
                getText(registeredAddressError).trim().contains(value),"Registered address error actual value: "+getText(registeredAddressError) +" but expected:"+value);
    }

    public enum CompanyProfileFields
    {
        NAME, RegisteredAddress,PostCode,Phone,RegistrationNumber,
    }
}
