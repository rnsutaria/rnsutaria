package com.oem.framework.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class PropertyPortfolioPage extends CustomerDashboardPage {
	
	By addSite = By.xpath("//button[@id = 'add-site-btn'][1]");
	By addNewSitePopup = By.xpath("//h3[text() = 'Add New Site']");
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
	
	
}
