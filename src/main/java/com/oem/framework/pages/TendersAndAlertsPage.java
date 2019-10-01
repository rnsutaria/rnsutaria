package com.oem.framework.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class TendersAndAlertsPage extends SupplierDashboardPage{
	
	By tendersAndAlertsLink = By.xpath("//li[@data-action = 'Requests']/a/h3");
	By quoteRequestStatusDropdown = By.id("SelectedStatus");
	//By 
	
	
	
	@Override
    protected void isLoaded() throws Error {
        System.out.println("Executing isLoaded in Supplier Dashboard Page");
        Assert.assertTrue(isElementPresent(tendersAndAlertsLink),"Supplier Dashboard Page didnt appear");
        
    }
	public void validateQuoteRequestStatusDropdown()	{
		SoftAssert softAssertion = new SoftAssert();
		boolean inProgressOptionPresenceStatus = isElementExistInDropDown(quoteRequestStatusDropdown, "In Progress");
		Reporter.log("Checked if 'In Progress' option is present in the dropdown", true);
		softAssertion.assertTrue(inProgressOptionPresenceStatus, "In Progress option is not present in the dropdown");
		boolean acceptedOptionPresenceStatus = isElementExistInDropDown(quoteRequestStatusDropdown, "Accepted");
		Reporter.log("Checked if 'Accepted' option is present in the dropdown", true);
		softAssertion.assertTrue(acceptedOptionPresenceStatus, "Accepted option is not present in the dropdown");
		boolean expiredOptionPresenceStatus = isElementExistInDropDown(quoteRequestStatusDropdown, "Expired");
		Reporter.log("Checked if 'Expired' option is present in the dropdown", true);
		softAssertion.assertTrue(expiredOptionPresenceStatus, "Expired option is not present in the dropdown");
		softAssertion.assertAll();
	}
}
