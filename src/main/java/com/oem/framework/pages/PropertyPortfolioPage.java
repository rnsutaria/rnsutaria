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
	By siteContactName = By.id("NewSite_ContactName");
	By contactPhoneNo = By.id("NewSite_PhoneNo");
	By contactEmail = By.id("NewSite_Email");
	By siteID = By.id("NewSite_SiteId");
	By address2 = By.id("NewSite_Address2");
	By address3 = By.id("NewSite_Address3");
	By address4 = By.id("NewSite_Address4");
	By siteArea = By.id("NewSite_SiteArea");
	
	
	
	By siteFirstRecord = By.xpath("//div[@id = 'divSitesOverview']/hgroup[1]/table/tbody/tr/td[1]");
	By addMeter = By.id("add-meter-button");
	By addMeterUtilities = By.xpath("//div[@id = 'add-meter-button']/ul/li[*]");
	By addHHMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[1]");
	By addnHHMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[2]");
	By addGasMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[3]");
	By addWaterMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[4]");
	By saveMeter = By.id("save-meter-button");
	
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
		boolean siteNameErrorStatus = isElementPresent(siteName_Error);
		boolean address1ErrorStatus = isElementPresent(address1Error);
		boolean postcodeErrorStatus = isElementPresent(postcodeError);
		Assert.assertTrue(siteNameErrorStatus && address1ErrorStatus && postcodeErrorStatus, 
				"Validation messages for mandatory fields are not displaying");
	}
	public void validateAddressPostcodeMandatoryFieldsAddSitePopup() throws Throwable 
	{
		click(addSite);
		//Thread.sleep(1000);
		setValue(siteName, "Patia");
		click(saveSiteDataBtn);
		//Thread.sleep(1000);
		boolean address1ErrorStatus = isElementPresent(address1Error);
		boolean postcodeErrorStatus = isElementPresent(postcodeError);
		Assert.assertTrue(address1ErrorStatus && postcodeErrorStatus, 
				"Validation messages for mandatory fields are not displaying");
	}
	public void validateMandatorySiteNamePostcodeFieldsInAddSitePopup() {
		click(addSite);
		setValue(address1, "Patia");
		click(saveSiteDataBtn);
		boolean siteNameErrorStatus = isElementPresent(siteName_Error);
		boolean postcodeErrorStatus = isElementPresent(postcodeError);
		Assert.assertTrue(siteNameErrorStatus && postcodeErrorStatus, 
				"Validation messages for mandatory fields are not displaying");
	}
	public void validateMandatorySiteNameAddressFieldsInAddSitePopup() throws InterruptedException {
		click(addSite);
		Thread.sleep(2000);
		setValue(postcode, "8723423");
		Thread.sleep(1000);
		System.out.println("Value in the textbox is " + driver.findElement(By.id("NewSite_Postcode")).getAttribute("value"));
		/*click(saveSiteDataBtn);
		boolean siteNameErrorStatus = isElementPresent(siteName_Error);
		boolean address1ErrorStatus = isElementPresent(address1Error);
		Assert.assertTrue(siteNameErrorStatus && address1ErrorStatus, 
				"Validation messages for mandatory fields are not displaying");*/
	}
	public void validateAddSitePopupDataProvider(String name, String addr1, String postCode, String siteContactNAME, 
			String contactPHONENo, String contactEMAIL, String site_ID, String addr2, String addr3, String addr4, String siteAREA) throws Throwable
	{
		click(addSite);
		Thread.sleep(2000);
		setValue(siteName, name);
		setValue(address1, addr1);
		setValue(postcode, postCode);
		setValue(siteContactName, siteContactNAME);
		setValue(contactPhoneNo, contactPHONENo);
		setValue(contactEmail, contactEMAIL);
		setValue(siteID, site_ID);
		setValue(address2, addr2);
		setValue(address3, addr3);
		setValue(address4, addr4);
		setValue(siteArea, siteAREA);
		
		click(saveSiteDataBtn);
		
		if(getAttribute(siteName, "value").equals("")) {
			verifyElementPresent(siteName_Error);
			boolean siteNameErr = isElementPresent(siteName_Error);
		}
		if(getAttribute(address1, "value").equals("")) {
			verifyElementPresent(address1Error);
		}
		if(getAttribute(address1, "value").equals("")) {
			verifyElementPresent(address1Error);
		}
			
		
	}
	public void validateAddMeterDropdown() throws Throwable
	{
		click(siteFirstRecord);
		Reporter.log("Clicked on the first site present in the Property Portfolio page");
		//Thread.sleep(2000);
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
