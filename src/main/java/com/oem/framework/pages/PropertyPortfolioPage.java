package com.oem.framework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class PropertyPortfolioPage extends CustomerDashboardPage {
	
	By addSite = By.xpath("//button[@id = 'add-site-btn'][1]");
	By addNewSitePopup = By.xpath("//h3[text() = 'Add New Site']");
	By saveSiteDataBtn = By.id("save-btn");
	By siteName = By.id("NewSite_Name");
	By siteName_Error = By.id("NewSite_Name-error");
	By address1 = By.id("NewSite_Address1");
	By address1Error = By.id("NewSite_Address1-error");
	By postcode = By.id("NewSite_Postcode");
	By postcodeError = By.id("NewSite_Postcode-error");
	
	By siteFirstRecord = By.xpath("//div[@id = 'divSitesOverview']/hgroup[1]/table/tbody/tr/td[1]");
	By addMeter = By.id("add-meter-button");
	By addMeterUtilities = By.xpath("//div[@id = 'add-meter-button']/ul/li[*]");
	By addHHMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[1]");
	By addnHHMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[2]");
	By addGasMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[3]");
	By addWaterMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[4]");
	
	By currentMeterOperator_HH = By.id("meterOperator");
	By procurementType = By.id("procurementType");
	
	By portfolioMeterDataUpload = By.xpath("//button[@id = 'add-site-btn'][2]");
	By forecastingBtn = By.xpath("//div[@class = 'text-right']/a[1]");
	By portfolioBtn = By.xpath("//div[@class = 'text-right']/a[2]");
	By filterByAllUtilities = By.xpath("//td[contains(text(), 'Filter by Utility')]/../td[2]/div[1]");
	By filterBy_HH_Utility = By.xpath("//td[contains(text(), 'Filter by Utility')]/../td[2]/div[2]");
	By filterBy_nHH_Utility = By.xpath("//td[contains(text(), 'Filter by Utility')]/../td[2]/div[3]");
	By filterBy_gas_Utility = By.xpath("//td[contains(text(), 'Filter by Utility')]/../td[2]/div[4]");
	By filterBy_water_Utility = By.xpath("//td[contains(text(), 'Filter by Utility')]/../td[2]/div[5]");
	
	
	@Override
    protected void isLoaded() throws Error {
        System.out.println("Executing isLoaded in CustomerDashboard Page");
        Assert.assertTrue(isElementPresent(addSite),"Property Portfolio Page didnt appear");
        
    }
	public void validatePresenceAddSitePopup() throws Throwable
	{
		click(addSite);
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(addNewSitePopup), "Add site popup is not displaying");
	}
	public void validateMandatoryFieldsAddSitePopup() throws Throwable 
	{
		click(addSite);
		Thread.sleep(1000);
		click(saveSiteDataBtn);
		Thread.sleep(1000);
		boolean status = isElementPresent(siteName_Error) && isElementPresent(address1Error) && isElementPresent(postcodeError);
		Assert.assertEquals(status, true);
	}
	public void validateAddSite() throws Throwable 
	{
		click(addSite);
		Thread.sleep(1000);
		click(saveSiteDataBtn);
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(siteName_Error) && isElementPresent(address1Error) && isElementPresent(postcodeError), 
				"Validation messages for mandatory fields are not displaying");
	}
	public void validateAddMeterDropdown() throws Throwable
	{
		click(siteFirstRecord);
		Reporter.log("Clicked on the first site present in the Property Portfolio page");
		Thread.sleep(2000);
		click(addMeter);
		Reporter.log("Clicked on Add Meter dropdown");
		boolean status = isElementExistInDropDown(addMeterUtilities, "HH Electric") &&
				isElementExistInDropDown(addMeterUtilities, "nHH Electric") &&
				isElementExistInDropDown(addMeterUtilities, "Gas") &&
				isElementExistInDropDown(addMeterUtilities, "Water");
		Reporter.log("Checked if the dropdown contains all utilities");
	}
	public void validateAddHHMeterPopup() throws Throwable
	{
		click(siteFirstRecord);
		Reporter.log("Clicked on the first site present in the Property Portfolio page");
		Thread.sleep(2000);
		click(addMeter);
		Reporter.log("Clicked on Add Meter dropdown");
		Thread.sleep(1000);
		click(addHHMeter);
		Reporter.log("Clicked on HH Electric meter");
		Assert.assertTrue(isElementPresent(currentMeterOperator_HH), 
				"Popup for adding new HH Electric meter didn't appear");
		Reporter.log("Checked if popup is displaying");
	}
	public void validateAddnHHMeterPopup() throws Throwable
	{
		click(siteFirstRecord);
		Reporter.log("Clicked on the first site present in the Property Portfolio page");
		Thread.sleep(2000);
		click(addMeter);
		Reporter.log("Clicked on Add Meter dropdown");
		Thread.sleep(1000);
		click(addnHHMeter);
		Reporter.log("Clicked on nHH Electric meter");
		Assert.assertTrue(isElementPresent(procurementType), 
				"Popup for adding new nHH Electric meter didn't appear");
		Reporter.log("Checked if popup is displaying");
	}
	public void validateAddGasMeter()
	{
		click(siteFirstRecord);
		Reporter.log("Clicked on the first site present in the Property Portfolio page");
		click(addMeter);
		Reporter.log("Clicked on Add Meter dropdown");
		click(addGasMeter);
		Reporter.log("Clicked on Gas meter");
		
	}
}
