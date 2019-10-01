package com.oem.framework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class RequestQuotePage extends CustomerDashboardPage {
	
	By requestAQuoteLink = By.xpath("//li[@id = 'sidebar-request-quote']/a");
	By reviewQuotesLink = By.xpath("//li[@data-action = 'QuoteOverview']/a");
	
	By filterByHHutility = By.id("request-electricity-hh-quote-a");
	By filterByNHHutility = By.id("request-electricity-nhh-quote-a");
	By filterByGasUtility = By.id("request-gas-quote-a");
	By filterByWaterUtility = By.id("request-water-quote-a");
	
	By contractDurationHHutility = By.id("ElectricityQuoteHh_ContractDurationInMonths");
	By contractDurationNHHutility = By.id("ElectricityQuoteNhh_ContractDurationInMonths");
	By contractDurationGasUtility = By.id("GasQuote_ContractDurationInMonths");
	By contractDurationWaterUtility = By.id("WaterQuote_ContractDurationInMonths");
	
	
	By submit = By.xpath("btn btn-primary pull-right");
	By deleteSites = By.xpath("//hgroup[@class = 'site-overview-item']/table/tbody/tr/td[5]/a[2]");
	By okBtn = By.xpath("//button[text() = 'OK']");
	
	@Override
    protected void isLoaded() throws Error {
        System.out.println("Executing isLoaded in Request a Quote Page");
        Assert.assertTrue(isElementPresent(filterByHHutility),"Request a Quote Page didnt appear.");        
    }
	
	public void validatePresenceOfRequestQuoteAndReviewQuotes() {
		SoftAssert softAssertion = new SoftAssert();
		boolean requestQuotePresenceStatus = isElementPresent(requestAQuoteLink);
		softAssertion.assertTrue(requestQuotePresenceStatus, "Request a quote option is not displaying in 'Quotes and Tenders' section.");
		boolean reviewQuotePresenceStatus = isElementPresent(reviewQuotesLink);
		softAssertion.assertTrue(reviewQuotePresenceStatus, "Review quote option is not displaying in 'Quotes and Tenders' section.");
		softAssertion.assertAll();
	}
	public void deleteAllSites() throws Throwable {
		List<WebElement> allElements = driver.findElements(deleteSites);
		for (WebElement element: allElements) {
			click((By) element);
			click(okBtn);
			Thread.sleep(2000);
		}
	}
	public void validatePresenceAllUtilities() {
		SoftAssert softAssertion = new SoftAssert();
		boolean hhUtilityPresenceStatus = isElementPresent(filterByHHutility);
		softAssertion.assertTrue(hhUtilityPresenceStatus, "HH Utility is not displaying in 'Request a Quote' page.");
		boolean nhhUtilityPresenceStatus = isElementPresent(filterByNHHutility);
		softAssertion.assertTrue(nhhUtilityPresenceStatus, "NHH Utility is not displaying in 'Request a Quote' page.");
		boolean gasUtilityPresenceStatus = isElementPresent(filterByGasUtility);
		softAssertion.assertTrue(nhhUtilityPresenceStatus, "Gas Utility is not displaying in 'Request a Quote' page.");
		boolean waterUtilityPresenceStatus = isElementPresent(filterByWaterUtility);
		softAssertion.assertTrue(waterUtilityPresenceStatus, "Water Utility is not displaying in 'Request a Quote' page.");
		softAssertion.assertAll();
	}
	public void validateContractDurationValuesForAllUtilities() {
		SoftAssert softAssertion = new SoftAssert();
		click(filterByHHutility);
		Reporter.log("Clicked on filter for HH Utility.", true);
		boolean contractEndDate6monthsPresenceStatusHHUtility = isElementExistInDropDown(contractDurationHHutility, "6 months");
		softAssertion.assertTrue(contractEndDate6monthsPresenceStatusHHUtility, "6 months is not displaying in contract end date dropdown for HH Utility");
		Reporter.log("Checked if 6 months is displaying in contract end date dropdown for HH Utility", true);
		boolean contractEndDate12monthsPresenceStatusHHUtility = isElementExistInDropDown(contractDurationHHutility, "12 months");
		softAssertion.assertTrue(contractEndDate12monthsPresenceStatusHHUtility, "12 months is not displaying in contract end date dropdown for HH Utility");
		Reporter.log("Checked if 12 months is displaying in contract end date dropdown for HH Utility", true);
		boolean contractEndDate18monthsPresenceStatusHHUtility = isElementExistInDropDown(contractDurationHHutility, "18 months");
		softAssertion.assertTrue(contractEndDate18monthsPresenceStatusHHUtility, "18 months is not displaying in contract end date dropdown for HH Utility");
		Reporter.log("Checked if 18 months is displaying in contract end date dropdown for HH Utility", true);
		boolean contractEndDate24monthsPresenceStatusHHUtility = isElementExistInDropDown(contractDurationHHutility, "24 months");
		softAssertion.assertTrue(contractEndDate24monthsPresenceStatusHHUtility, "24 months is not displaying in contract end date dropdown for HH Utility");
		Reporter.log("Checked if 24 months is displaying in contract end date dropdown for HH Utility", true);
		boolean contractEndDate30monthsPresenceStatusHHUtility = isElementExistInDropDown(contractDurationHHutility, "30 months");
		softAssertion.assertTrue(contractEndDate30monthsPresenceStatusHHUtility, "30 months is not displaying in contract end date dropdown for HH Utility");
		Reporter.log("Checked if 30 months is displaying in contract end date dropdown for HH Utility", true);
		boolean contractEndDate36monthsPresenceStatusHHUtility = isElementExistInDropDown(contractDurationHHutility, "36 months");
		softAssertion.assertTrue(contractEndDate36monthsPresenceStatusHHUtility, "36 months is not displaying in contract end date dropdown for HH Utility");
		Reporter.log("Checked if 36 months is displaying in contract end date dropdown for HH Utility", true);
		boolean contractEndDate60monthsPresenceStatusHHUtility = isElementExistInDropDown(contractDurationHHutility, "60 months");
		softAssertion.assertTrue(contractEndDate60monthsPresenceStatusHHUtility, "60 months is not displaying in contract end date dropdown for HH Utility");
		Reporter.log("Checked if 60 months is displaying in contract end date dropdown for HH Utility", true);
		
		click(filterByNHHutility);
		Reporter.log("Clicked on filter for NHH Utility.", true);
		boolean contractEndDate6monthsPresenceStatusNHHUtility = isElementExistInDropDown(contractDurationNHHutility, "6 months");
		softAssertion.assertTrue(contractEndDate6monthsPresenceStatusNHHUtility, "6 months is not displaying in contract end date dropdown for NHH Utility");
		Reporter.log("Checked if 6 months is displaying in contract end date dropdown for NHH Utility", true);
		boolean contractEndDate12monthsPresenceStatusNHHUtility = isElementExistInDropDown(contractDurationNHHutility, "12 months");
		softAssertion.assertTrue(contractEndDate12monthsPresenceStatusNHHUtility, "12 months is not displaying in contract end date dropdown for NHH Utility");
		Reporter.log("Checked if 12 months is displaying in contract end date dropdown for NHH Utility", true);
		boolean contractEndDate18monthsPresenceStatusNHHUtility = isElementExistInDropDown(contractDurationNHHutility, "18 months");
		softAssertion.assertTrue(contractEndDate18monthsPresenceStatusNHHUtility, "18 months is not displaying in contract end date dropdown for NHH Utility");
		Reporter.log("Checked if 18 months is displaying in contract end date dropdown for NHH Utility", true);
		boolean contractEndDate24monthsPresenceStatusNHHUtility = isElementExistInDropDown(contractDurationNHHutility, "24 months");
		softAssertion.assertTrue(contractEndDate24monthsPresenceStatusNHHUtility, "24 months is not displaying in contract end date dropdown for NHH Utility");
		Reporter.log("Checked if 24 months is displaying in contract end date dropdown for NHH Utility", true);
		boolean contractEndDate30monthsPresenceStatusNHHUtility = isElementExistInDropDown(contractDurationNHHutility, "30 months");
		softAssertion.assertTrue(contractEndDate30monthsPresenceStatusNHHUtility, "30 months is not displaying in contract end date dropdown for NHH Utility");
		Reporter.log("Checked if 30 months is displaying in contract end date dropdown for NHH Utility", true);
		boolean contractEndDate36monthsPresenceStatusNHHUtility = isElementExistInDropDown(contractDurationNHHutility, "36 months");
		softAssertion.assertTrue(contractEndDate36monthsPresenceStatusNHHUtility, "36 months is not displaying in contract end date dropdown for NHH Utility");
		Reporter.log("Checked if 36 months is displaying in contract end date dropdown for NHH Utility", true);
		boolean contractEndDate60monthsPresenceStatusNHHUtility = isElementExistInDropDown(contractDurationNHHutility, "60 months");
		softAssertion.assertTrue(contractEndDate60monthsPresenceStatusNHHUtility, "60 months is not displaying in contract end date dropdown for NHH Utility");
		Reporter.log("Checked if 60 months is displaying in contract end date dropdown for NHH Utility", true);
		
		click(filterByGasUtility);
		Reporter.log("Clicked on filter for Gas Utility.", true);
		boolean contractEndDate6monthsPresenceStatusGasUtility = isElementExistInDropDown(contractDurationGasUtility, "6 months");
		softAssertion.assertTrue(contractEndDate6monthsPresenceStatusGasUtility, "6 months is not displaying in contract end date dropdown for Gas Utility");
		Reporter.log("Checked if 6 months is displaying in contract end date dropdown for Gas Utility", true);
		boolean contractEndDate12monthsPresenceStatusGasUtility = isElementExistInDropDown(contractDurationGasUtility, "12 months");
		softAssertion.assertTrue(contractEndDate12monthsPresenceStatusGasUtility, "12 months is not displaying in contract end date dropdown for Gas Utility");
		Reporter.log("Checked if 12 months is displaying in contract end date dropdown for Gas Utility", true);
		boolean contractEndDate18monthsPresenceStatusGasUtility = isElementExistInDropDown(contractDurationGasUtility, "18 months");
		softAssertion.assertTrue(contractEndDate18monthsPresenceStatusGasUtility, "18 months is not displaying in contract end date dropdown for Gas Utility");
		Reporter.log("Checked if 18 months is displaying in contract end date dropdown for Gas Utility", true);
		boolean contractEndDate24monthsPresenceStatusGasUtility = isElementExistInDropDown(contractDurationGasUtility, "24 months");
		softAssertion.assertTrue(contractEndDate24monthsPresenceStatusGasUtility, "24 months is not displaying in contract end date dropdown for Gas Utility");
		Reporter.log("Checked if 24 months is displaying in contract end date dropdown for Gas Utility", true);
		boolean contractEndDate30monthsPresenceStatusGasUtility = isElementExistInDropDown(contractDurationGasUtility, "30 months");
		softAssertion.assertTrue(contractEndDate30monthsPresenceStatusGasUtility, "30 months is not displaying in contract end date dropdown for Gas Utility");
		Reporter.log("Checked if 30 months is displaying in contract end date dropdown for Gas Utility", true);
		boolean contractEndDate36monthsPresenceStatusGasUtility = isElementExistInDropDown(contractDurationGasUtility, "36 months");
		softAssertion.assertTrue(contractEndDate36monthsPresenceStatusGasUtility, "36 months is not displaying in contract end date dropdown for Gas Utility");
		Reporter.log("Checked if 36 months is displaying in contract end date dropdown for Gas Utility", true);
		boolean contractEndDate60monthsPresenceStatusGasUtility = isElementExistInDropDown(contractDurationGasUtility, "60 months");
		softAssertion.assertTrue(contractEndDate60monthsPresenceStatusGasUtility, "60 months is not displaying in contract end date dropdown for Gas Utility");
		Reporter.log("Checked if 60 months is displaying in contract end date dropdown for Gas Utility", true);
		
		click(filterByWaterUtility);
		Reporter.log("Clicked on filter for Water Utility.", true);
		/*boolean contractEndDate6monthsPresenceStatusWaterUtility = isElementExistInDropDown(contractDurationWaterUtility, "6 months");
		softAssertion.assertFalse(contractEndDate6monthsPresenceStatusWaterUtility, "6 months is displaying in contract end date dropdown for Water Utility");
		Reporter.log("Checked if 6 months is displaying in contract end date dropdown for Water Utility", true);*/
		boolean contractEndDate12monthsPresenceStatusWaterUtility = isElementExistInDropDown(contractDurationWaterUtility, "12 months");
		softAssertion.assertTrue(contractEndDate12monthsPresenceStatusWaterUtility, "12 months is not displaying in contract end date dropdown for Water Utility");
		Reporter.log("Checked if 12 months is displaying in contract end date dropdown for Water Utility", true);
		boolean contractEndDate18monthsPresenceStatusWaterUtility = isElementExistInDropDown(contractDurationWaterUtility, "18 months");
		softAssertion.assertTrue(contractEndDate18monthsPresenceStatusWaterUtility, "18 months is not displaying in contract end date dropdown for Water Utility");
		Reporter.log("Checked if 18 months is displaying in contract end date dropdown for Water Utility", true);
		boolean contractEndDate24monthsPresenceStatusWaterUtility = isElementExistInDropDown(contractDurationWaterUtility, "24 months");
		softAssertion.assertTrue(contractEndDate24monthsPresenceStatusWaterUtility, "24 months is not displaying in contract end date dropdown for Water Utility");
		Reporter.log("Checked if 24 months is displaying in contract end date dropdown for Water Utility", true);
		boolean contractEndDate30monthsPresenceStatusWaterUtility = isElementExistInDropDown(contractDurationWaterUtility, "30 months");
		softAssertion.assertTrue(contractEndDate30monthsPresenceStatusWaterUtility, "30 months is not displaying in contract end date dropdown for Water Utility");
		Reporter.log("Checked if 30 months is displaying in contract end date dropdown for Water Utility", true);
		boolean contractEndDate36monthsPresenceStatusWaterUtility = isElementExistInDropDown(contractDurationWaterUtility, "36 months");
		softAssertion.assertTrue(contractEndDate36monthsPresenceStatusWaterUtility, "36 months is not displaying in contract end date dropdown for Water Utility");
		Reporter.log("Checked if 36 months is displaying in contract end date dropdown for Water Utility", true);
		boolean contractEndDate60monthsPresenceStatusWaterUtility = isElementExistInDropDown(contractDurationWaterUtility, "60 months");
		softAssertion.assertTrue(contractEndDate60monthsPresenceStatusWaterUtility, "60 months is not displaying in contract end date dropdown for Water Utility");
		Reporter.log("Checked if 60 months is displaying in contract end date dropdown for Water Utility", true);
		
		softAssertion.assertAll();
	}
}
