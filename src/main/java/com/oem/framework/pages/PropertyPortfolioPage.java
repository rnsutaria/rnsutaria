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
		PropertyPortfolioPage propertyPortfolioPage = new PropertyPortfolioPage();
		propertyPortfolioPage.click(addSite);
		Thread.sleep(1000);
		boolean status = propertyPortfolioPage.isElementPresent(addNewSitePopup);
		Assert.assertEquals(status, true);
	}
	public void validateMandatoryFieldsAddSitePopup() throws Throwable 
	{
		PropertyPortfolioPage propertyPortfolioPage = new PropertyPortfolioPage();
		propertyPortfolioPage.click(addSite);
		Thread.sleep(1000);
		propertyPortfolioPage.click(saveSiteDataBtn);
		Thread.sleep(1000);
		boolean status = propertyPortfolioPage.isElementPresent(siteName_Error) && propertyPortfolioPage.isElementPresent(address1Error) && propertyPortfolioPage.isElementPresent(postcodeError);
		Assert.assertEquals(status, true);
	}
	public void validateAddSite() throws Throwable 
	{
		PropertyPortfolioPage propertyPortfolioPage = new PropertyPortfolioPage();
		propertyPortfolioPage.click(addSite);
		Thread.sleep(1000);
		propertyPortfolioPage.click(saveSiteDataBtn);
		Thread.sleep(1000);
		boolean status = propertyPortfolioPage.isElementPresent(siteName_Error) && propertyPortfolioPage.isElementPresent(address1Error) && propertyPortfolioPage.isElementPresent(postcodeError);
		Assert.assertEquals(status, true);
	}
	public void validateAddMeterDropdown() throws Throwable
	{
		PropertyPortfolioPage propertyPortfolioPage = new PropertyPortfolioPage();
		propertyPortfolioPage.click(siteFirstRecord);
		Reporter.log("Clicked on the first site present in the Property Portfolio page");
		Thread.sleep(2000);
		propertyPortfolioPage.click(addMeter);
		Reporter.log("Clicked on Add Meter dropdown");
		Thread.sleep(1000);
		boolean status = propertyPortfolioPage.dropdowncontains(addMeterUtilities, "HH Electric") &&
		propertyPortfolioPage.dropdowncontains(addMeterUtilities, "nHH Electric") &&
		propertyPortfolioPage.dropdowncontains(addMeterUtilities, "Gas") &&
		propertyPortfolioPage.dropdowncontains(addMeterUtilities, "Water");
		Reporter.log("Checked if the dropdown contains all utilities");
	}
	
}
