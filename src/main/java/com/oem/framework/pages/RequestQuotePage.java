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
	
	//day 01/10/2019 added 
	
	By SelectAllChoosemeter = By.xpath("//div[@id='request-electricity-hh-quote']//a[@id='selectall']");
	By MeterFirstElement = By.xpath("//div[@id='collapseElectricityQuoteHh_SiteMeters_0_']");//this will change continuously
	By MeterSecondElement = By.xpath("//div[@id='collapseElectricityQuoteHh_SiteMeters_1_']");
	By MeterThridElement = By.xpath("//div[@id='collapseElectricityQuoteHh_SiteMeters_2_']");
	By MeterFourElement = By.xpath("//div[@id='collapseElectricityQuoteHh_SiteMeters_3_']");
	
	By ContractDuration = By.xpath("//select[@id='ElectricityQuoteHh_ContractDurationInMonths']");
	By AddNewContractDuration = By.xpath("//div[@id='request-electricity-hh-quote']//p[@class='add-duration'][contains(text(),'Add new contract duration')]");
	By ContractDuration2 = By.xpath("//select[@id='ElectricityQuoteHh_Duration2']");
	By ContractDuration3=By.xpath("//select[@id='ElectricityQuoteHh_Duration3']");
	By ContractDuration4=By.xpath("//select[@id='ElectricityQuoteHh_Duration4']");
	
	By SelectAllChooseSupplier = By.xpath("//div[@id='request-electricity-hh-quote']//div[@id='selectall']");
	By FirstSupplier = By.xpath("//div[@id='request-electricity-hh-quote']//section[@id='suppliers']//li[1]//label[1]");
	By ThirdrdSupplier=By.xpath("//div[@id='request-electricity-hh-quote']//li[3]//label[1]");
	By FourthSupplier=By.xpath("//div[@id='request-electricity-hh-quote']//li[4]//label[1]");
	By FifthSupplier=By.xpath("//div[@id='request-electricity-hh-quote']//li[5]//label[1]");
	By SixthSupplier = By.xpath("//div[@id='request-electricity-hh-quote']//li[6]//label[1]");
	
	By HHElectricity = By.xpath("//a[@id='request-electricity-hh-quote-a']");
	
	By Date =By.xpath("//input[@id='ElectricityQuoteHh_TenderDate']");
	By RenewableEnergy=By.xpath("//div[@id='request-electricity-hh-quote']//label[contains(text(),'Renewable energy')]");
	
	By TopSubmit = By.xpath("//input[@class='btn btn-primary pull-right']");
	By OkAlert = By.xpath("//button[@class='vex-dialog-button-primary vex-dialog-button vex-first vex-last']");
	By OkAlertTextwhen2sameContractDurationSected =By.xpath("//div[@class='vex-dialog-message']");
	By OkAlert2=By.xpath("//button[@class='vex-dialog-button-primary vex-dialog-button vex-first vex-last']");
	
	By message =By.xpath("//div[@class='alert alert-error']");
	By tenderRequestSummary=By.xpath("//h1[contains(text(),'Tender Request Summary')]");
	/*By AlertMessageText =By.xpath("//li[contains(text(),'Please select at least one meter for a quote reque')]");
	By contractErrormessage = By.xpath("//li[contains(text(),'Please select contract duration')]");
	By supplierErrorMessage = By.xpath("//li[contains(text(),'Please select at least one supplier for a quote re')]");*/
	
	
	By submit = By.xpath("btn btn-primary pull-right");
	By deleteSites = By.xpath("//hgroup[@class = 'site-overview-item']/table/tbody/tr/td[5]/a[2]");
	By okBtn = By.xpath("//button[text() = 'OK']");
	
	public void SelectingZeroMeters(){
		click(SelectAllChoosemeter);
		Reporter.log("Clicked on Choose Meter All.", true);
	}
	public void SelectingSingleMeter(){
		click(SelectAllChoosemeter);
		Reporter.log("Clicked on Choose Meter All.", true);
		
		click(MeterFirstElement);
		Reporter.log("Clicked on First Meter.", true);
	}
	public void SelectingMultipleMeter(){
		click(SelectAllChoosemeter);
		Reporter.log("Clicked on Choose Meter All.", true);
		
		click(MeterFirstElement);
		Reporter.log("Clicked on First Meter.", true);
		click(MeterSecondElement);
		Reporter.log("Clicked on Second Meter.", true);
		click(MeterThridElement);
		Reporter.log("Clicked on Third Meter.", true);
		
	}
	public void SelectingSingleContractDuration(){
		selectByIndex(ContractDuration,02);
		Reporter.log("Selected First Contract Duration.", true);
	}
	public void SelectingMultipleContractDuration(){
		selectByIndex(ContractDuration,02);
		Reporter.log("Selected First Contract Duration.", true);
		
		click(AddNewContractDuration);
		Reporter.log("Clicked Add Contract Duration. ", true);
		selectByIndex(ContractDuration2,03);
		Reporter.log("Selected second Contract Duration.", true);
		
		click(AddNewContractDuration);
		Reporter.log("Clicked Add Contract Duration. ", true);
		selectByIndex(ContractDuration3,04);
		Reporter.log("Selected Third Contract Duration.", true);
	}
	public void SelectingZeroSuppliers(){
		click(SelectAllChooseSupplier);
		Reporter.log("Clicked Choose Supplier All.", true);
	}
	public void SelectingSingleSupplier(){
		click(SelectAllChooseSupplier);
		Reporter.log("Clicked Choose Supplier All.", true);
		
		click(FirstSupplier);
		Reporter.log("Clicked First Supplier.", true);
	}
	
	public void SelectingMultipleSupplier(){
		click(SelectAllChooseSupplier);
		Reporter.log("Clicked Choose Supplier All.", true);
		
		click(FirstSupplier);
		Reporter.log("Clicked 1st Supplier.", true);
		click(ThirdrdSupplier);
		Reporter.log("Clicked 3rd Supplier.", true);
		click(FourthSupplier);
		Reporter.log("Clicked 4th Supplier.", true);
		click(FifthSupplier);
		Reporter.log("Clicked 5th Supplier.", true);
		
	}
	public void ClickTopSubmitButton(){
		click(TopSubmit);
		Reporter.log("Clicked Submit Button.", true);
	}
	public void SelectElectricity_HHUtility(){
		click(HHElectricity);
		Reporter.log("Clicked HH ElectricityUtility. ", true);
		
		
	}
	public void SelectElectricity_nHHUtility(){
		click(filterByNHHutility);
		Reporter.log("Clicked nHH ElectricityUtility. ", true);
		
		
	}
	public void SelectGasUtility(){
		click(filterByGasUtility);
		Reporter.log("Clicked GasUtility. ", true);
		
		
	}
	public void SelectWaterUtility(){
		click(filterByWaterUtility);
		Reporter.log("Clicked WaterUtility. ", true);
		
		
	}
	public void EnterDate(String value){
		clearValue(Date);
		Reporter.log("Cleared Date. ", true);
		setValue(Date,value);
		Reporter.log("Enterd Date. ", true);
	}
	public void ClickRenewableEnergy(){
		click(RenewableEnergy);
		Reporter.log("Clicked Renewable Energy. ", true);
	}
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
	public void validatealertErrormessage_IfNotSelectedAndempty(){
		SoftAssert softAssertion = new SoftAssert();
		click(HHElectricity);
		click(SelectAllChoosemeter);
		clearValue(Date);
		click(SelectAllChooseSupplier);
		click(TopSubmit);
		boolean errorMessageDisplayStatusForNotSelectingMeter = getText(message).contains("Please select at least one meter for a quote request.");
		Reporter.log("Checked if error message for not selecting any meter is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingMeter, "Error message is not displaying for not selecting any meter.");
		
		boolean errorMessageDisplayStatusForNotSelectingContractDuration = getText(message).contains("Please select contract duration");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingContractDuration, "Error message is not displaying for not entering contract duration.");	
		
		boolean errorMessageDisplayStatusForNotSelectingSuplier = getText(message).contains("Please select at least one supplier for a quote request.");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingSuplier, "Error message is not displaying for not selecting any supplier.");
		//Assert.assertEquals(actual, expected)
		
		softAssertion.assertAll();
	}
	public void validatealertErrormessagewhenOnlyOneMeterisSelected(){
		SoftAssert softAssertion = new SoftAssert();
		click(HHElectricity);
		click(SelectAllChoosemeter);
		//click(MeterFirstElement);i am not able to find this element
		clearValue(Date);
		click(SelectAllChooseSupplier);
		click(TopSubmit);
		click(OkAlert);
		boolean errorMessageDisplayStatusForNotSelectingContractDuration = getText(message).contains("Please select contract duration");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingContractDuration, "Error message is not displaying for not entering contract duration.");	
		
		boolean errorMessageDisplayStatusForNotSelectingSuplier = getText(message).contains("Please select at least one supplier for a quote request.");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingSuplier, "Error message is not displaying for not selecting any supplier.");
		//Assert.assertEquals(actual, expected)
		
		softAssertion.assertAll();
	}
	public void validatealertErrormessagewhenMoreThanOneMeterisSelected(){
		SoftAssert softAssertion = new SoftAssert();
		click(HHElectricity);
		clearValue(Date);
		click(SelectAllChooseSupplier);
		click(TopSubmit);
		click(OkAlert);
		
		boolean errorMessageDisplayStatusForNotSelectingContractDuration = getText(message).contains("Please select contract duration");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingContractDuration, "Error message is not displaying for not entering contract duration.");	
		
		boolean errorMessageDisplayStatusForNotSelectingSuplier = getText(message).contains("Please select at least one supplier for a quote request.");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingSuplier, "Error message is not displaying for not selecting any supplier.");
		//Assert.assertEquals(actual, expected)
		
		softAssertion.assertAll();
		
	}
	
	public void validatealertErrormessagewhenOneContractDurationisSelected(){
		SoftAssert softAssertion = new SoftAssert();
		click(HHElectricity);
		click(SelectAllChoosemeter);
		selectByIndex(ContractDuration,01);
		clearValue(Date);
		click(SelectAllChooseSupplier);
		click(TopSubmit);
		
		
		boolean errorMessageDisplayStatusForNotSelectingMeter = getText(message).contains("Please select at least one meter for a quote request.");
		Reporter.log("Checked if error message for not selecting any meter is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingMeter, "Error message is not displaying for not selecting any meter.");
		
		boolean errorMessageDisplayStatusForNotSelectingSuplier = getText(message).contains("Please select at least one supplier for a quote request.");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingSuplier, "Error message is not displaying for not selecting any supplier.");
		//Assert.assertEquals(actual, expected)
		
		softAssertion.assertAll();
		
	}
	
	public void validatealertErrormessagewhenMoreThanOneContractDurationisSelected(){
		SoftAssert softAssertion = new SoftAssert();
		click(HHElectricity);
		click(SelectAllChoosemeter);
		selectByIndex(ContractDuration,01);
		click(AddNewContractDuration);
		selectByIndex(ContractDuration2,02);
		clearValue(Date);
		click(SelectAllChooseSupplier);
		click(TopSubmit);
		
		
		boolean errorMessageDisplayStatusForNotSelectingMeter = getText(message).contains("Please select at least one meter for a quote request.");
		Reporter.log("Checked if error message for not selecting any meter is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingMeter, "Error message is not displaying for not selecting any meter.");
		
		boolean errorMessageDisplayStatusForNotSelectingSuplier = getText(message).contains("Please select at least one supplier for a quote request.");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingSuplier, "Error message is not displaying for not selecting any supplier.");
		//Assert.assertEquals(actual, expected)
		
		softAssertion.assertAll();
		}
	public void validateAlertMessageWhen2ContractDurationsAreSame(){
		SoftAssert softAssertion = new SoftAssert();
		//click(SelectAllChoosemeter);
		selectByIndex(ContractDuration,02);
		click(AddNewContractDuration);
		selectByIndex(ContractDuration2,02);
		boolean errorMessageDisplayStatusForSelecting2SameContractDurations = getText(OkAlertTextwhen2sameContractDurationSected).contains("You have already selected that duration");
		Reporter.log("Checked if error message for selecting 2 same Contract Durations", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForSelecting2SameContractDurations, "Error message is not displaying for selecting 2 same Contract Durations");
		softAssertion.assertAll();
		click(OkAlert2);
	}
	public void validatealertErrormessageAfterSelectingOneSuplier(){
		SoftAssert softAssertion = new SoftAssert();
		click(HHElectricity);
		click(SelectAllChoosemeter);
		clearValue(Date);
		click(TopSubmit);
		boolean errorMessageDisplayStatusForNotSelectingMeter = getText(message).contains("Please select at least one meter for a quote request.");
		Reporter.log("Checked if error message for not selecting any meter is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingMeter, "Error message is not displaying for not selecting any meter.");
		
		boolean errorMessageDisplayStatusForNotSelectingContractDuration = getText(message).contains("Please select contract duration");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingContractDuration, "Error message is not displaying for not entering contract duration.");	
		
		
		//Assert.assertEquals(actual, expected)
		
		softAssertion.assertAll();
	}
	
	public void validatealertErrormessageAfterSelectingAllSuplier(){
		SoftAssert softAssertion = new SoftAssert();
		click(HHElectricity);
		click(SelectAllChoosemeter);
		clearValue(Date);
		click(TopSubmit);
		boolean errorMessageDisplayStatusForNotSelectingMeter = getText(message).contains("Please select at least one meter for a quote request.");
		Reporter.log("Checked if error message for not selecting any meter is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingMeter, "Error message is not displaying for not selecting any meter.");
		
		boolean errorMessageDisplayStatusForNotSelectingContractDuration = getText(message).contains("Please select contract duration");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingContractDuration, "Error message is not displaying for not entering contract duration.");	
		
		
		//Assert.assertEquals(actual, expected)
		
		softAssertion.assertAll();
	}
	
	public void validatealertErrormessageAfterSelecting1meter1contractDuration(){
		SoftAssert softAssertion = new SoftAssert();
		click(HHElectricity);
		click(SelectAllChoosemeter);
		click(MeterFirstElement);
		selectByIndex(ContractDuration,02);
		clearValue(Date);
		click(SelectAllChooseSupplier);
		click(TopSubmit);
		//click(OkAlert2);
		boolean errorMessageDisplayStatusForNotSelectingSuplier = getText(message).contains("Please select at least one supplier for a quote request.");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingSuplier, "Error message is not displaying for not selecting any supplier.");
		//Assert.assertEquals(actual, expected)
		softAssertion.assertAll();
	}
	public void validatealertErrormessageAfterSelecting1meterMultiplecontractDuration(){
		SoftAssert softAssertion = new SoftAssert();
		click(HHElectricity);
		click(SelectAllChoosemeter);
		click(MeterFirstElement);
		selectByIndex(ContractDuration,02);
		click(AddNewContractDuration);
		selectByIndex(ContractDuration2,03);
		click(AddNewContractDuration);
		selectByIndex(ContractDuration3,04);
		click(AddNewContractDuration);
		selectByIndex(ContractDuration4,05);
		click(SelectAllChooseSupplier);
		click(TopSubmit);
		
		boolean errorMessageDisplayStatusForNotSelectingSuplier = getText(message).contains("Please select at least one supplier for a quote request.");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingSuplier, "Error message is not displaying for not selecting any supplier.");
		//Assert.assertEquals(actual, expected)
		softAssertion.assertAll();
	}
	public void validatealertErrormessageAfterSelectingMultiplemeterMultiplecontractDuration(){
		SoftAssert softAssertion = new SoftAssert();
		click(HHElectricity);
		Reporter.log("Clicked on  HHE Electricity.", true);
		
		click(SelectAllChoosemeter);
		Reporter.log("Clicked on ChooseMeter All.", true);
		
		click(MeterFirstElement);
		Reporter.log("Clicked First Meter.", true);
		click(MeterSecondElement);
		Reporter.log("Clicked second Meter.", true);
		click(MeterThridElement);
		Reporter.log("Clicked Third Meter.", true);
		click(MeterFourElement);
		Reporter.log("Clicked fourth Meter.", true);
		
		selectByIndex(ContractDuration,02);
		Reporter.log("Selected 1st contract duration.", true);
		click(AddNewContractDuration);
		Reporter.log("Clicked on Add New Contract Duration.", true);
		selectByIndex(ContractDuration2,03);
		Reporter.log("Selected 2nd contract duration.", true);
		click(AddNewContractDuration);
		Reporter.log("Clicked on Add New Contract Duration.", true);
		selectByIndex(ContractDuration3,04);
		Reporter.log("Selected 3rd contract duration.", true);
		click(AddNewContractDuration);
		Reporter.log("Clicked on Add New Contract Duration.", true);
		selectByIndex(ContractDuration4,05);
		Reporter.log("Selected 4th contract duration.", true);
		click(SelectAllChooseSupplier);
		Reporter.log("Clicked on Choose Supplier All.", true);
		click(TopSubmit);
		Reporter.log("Clicked Submit Button.", true);
		
		boolean errorMessageDisplayStatusForNotSelectingSuplier = getText(message).contains("Please select at least one supplier for a quote request.");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingSuplier, "Error message is not displaying for not selecting any supplier.");
		//Assert.assertEquals(actual, expected)
		softAssertion.assertAll();
	}
	public void validatingErrorMessageAfterSelecting1contractDurationAndMultipleSuppliers(){
		SoftAssert softAssertion=new SoftAssert();
		
		click(HHElectricity);
		Reporter.log("Clicked on  HHE Electricity.", true);
		
		click(SelectAllChoosemeter);
		Reporter.log("Clicked on ChooseMeter All.", true);
		
		selectByIndex(ContractDuration,02);
		Reporter.log("Selected 1st contract duration.", true);
		
		click(SelectAllChooseSupplier);
		Reporter.log("Clicked on Choose Supplier All.", true);
		click(ThirdrdSupplier);
		Reporter.log("Clicked on 3rd Supplier.",true);
		click(FourthSupplier);
		Reporter.log("Clicked on 4th Supplier.", true);
		click(FifthSupplier);
		Reporter.log("Clicked on 5th Supplier.", true);
		
		click(TopSubmit);
		Reporter.log("Clicked Submit Button.", true);
		
		
		boolean errorMessageDisplyStatusForNotSelectingMeter=getText(message).contains("Please select at least one meter for a quote request.");
		Reporter.log("Checked if error message for not selecting Meter is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplyStatusForNotSelectingMeter, "Error message is not displaying for not selecting any Meter.");
		//Assert.assertEquals(actual, expected)
		softAssertion.assertAll();
	}
	public void validatingErrorMessageAfterSelectingMultiplecontractDurationAndSingleSupplier(){
		SoftAssert softAssertion=new SoftAssert();
		SelectElectricity_HHUtility();
		SelectingZeroMeters();
		SelectingMultipleContractDuration();
		SelectingSingleSupplier();
		ClickTopSubmitButton();
		boolean errorMessageDisplyStatusForNotSelectingMeter=getText(message).contains("Please select at least one meter for a quote request.");
		Reporter.log("Checked if error message for not selecting Meter is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplyStatusForNotSelectingMeter, "Error message is not displaying for not selecting any Meter.");
		//Assert.assertEquals(actual, expected)
		softAssertion.assertAll();
		
	}
	public void validatingErrorMessageAfterSelectingsinglecontractDurationAndmultipleSupplier(){
		SoftAssert softAssertion=new SoftAssert();
		SelectElectricity_HHUtility();
		SelectingZeroMeters();
		SelectingSingleContractDuration();
		SelectingMultipleSupplier();
		ClickTopSubmitButton();
		boolean errorMessageDisplyStatusForNotSelectingMeter=getText(message).contains("Please select at least one meter for a quote request.");
		Reporter.log("Checked if error message for not selecting Meter is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplyStatusForNotSelectingMeter, "Error message is not displaying for not selecting any Meter.");
		//Assert.assertEquals(actual, expected)
		softAssertion.assertAll();
		
	}
	public void validatingAvailablityToVerfyAfterSelecting1Meter1Contract1Supplier(){
		SelectElectricity_HHUtility();
		SelectingSingleMeter();
		SelectingSingleContractDuration();
		SelectingSingleSupplier();
		ClickTopSubmitButton();
		//need to write further script to verify is it present at admin portal
	}
	public void validatingAvailablityToVerfyAfterSelectingMultipleMeter1Contract1Supplier(){
		SelectElectricity_HHUtility();
		SelectingMultipleMeter();
		SelectingSingleContractDuration();
		SelectingSingleSupplier();
		ClickTopSubmitButton();
		//need to write further script to verify is it present at admin portal
	}
	public void validatingAvailablityToVerfyAfterSelecting1MeterMultipleContract1Supplier(){
		SelectElectricity_HHUtility();
		SelectingSingleMeter();
		SelectingMultipleContractDuration();
		SelectingSingleSupplier();
		ClickTopSubmitButton();
		//need to write further script to verify is it present at admin portal
	}
	public void validatingAvailablityToVerfyAfterSelecting1Meter1ContractMultipleSupplier(){
		SelectElectricity_HHUtility();
		SelectingSingleMeter();
		SelectingSingleContractDuration();
		SelectingMultipleSupplier();
		ClickTopSubmitButton();
		//need to write further script to verify is it present at admin portal
	}
	public void validatingAvailablityToVerfyAfterSelectingMultipleMeterMultipleContract1Supplier(){
		SelectElectricity_HHUtility();
		SelectingMultipleMeter();
		SelectingMultipleContractDuration();
		SelectingSingleSupplier();
		ClickTopSubmitButton();
		//need to write further script to verify is it present at admin portal
	}
	public void validatingAvailablityToVerfyAfterSelectingMultipleMeter1ContractMultipleSupplier(){
		SelectElectricity_HHUtility();
		SelectingMultipleMeter();
		SelectingSingleContractDuration();
		SelectingMultipleSupplier();
		ClickTopSubmitButton();
		//need to write further script to verify is it present at admin portal
	}
	public void validatingAvailablityToVerfyAfterSelectingSingleMeterMultipleContractMultipleSupplier(){
		SelectElectricity_HHUtility();
		SelectingSingleMeter();
		SelectingMultipleContractDuration();
		SelectingMultipleSupplier();
		ClickTopSubmitButton();
		//need to write further script to verify is it present at admin portal
	}
	public void validatingAvailablityToVerfyAfterSelectingMultipleMeterMultipleContractMultipleSupplier(){
		SelectElectricity_HHUtility();
		SelectingMultipleMeter();
		SelectingMultipleContractDuration();
		SelectingMultipleSupplier();
		ClickTopSubmitButton();
		//need to write further script to verify is it present at admin portal
	}
	public void validatingAvailablityToVerfyAfterSelectingAllMeterAllContractAllSupplierAndRenewableEnergy(){
		SelectElectricity_HHUtility();
		ClickRenewableEnergy();
		SelectingMultipleContractDuration();
		ClickTopSubmitButton();
		
	}
	public void validatingErrorMessageAfterSelectingAllMeterAllContractAllSupplierAndSettingDate5daysBefore(){
		SoftAssert softAssertion=new SoftAssert();
		SelectElectricity_HHUtility();
		SelectingMultipleContractDuration();
		EnterDate("27/09/2019");
		ClickTopSubmitButton();
		
		boolean errorMessageDisplyStatusForEnteringwrongDate=getText(message).contains("Tender date must be at least five days in the future");
		Reporter.log("Checked if error message for Entering wrong Date is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplyStatusForEnteringwrongDate, "Error message is not displaying for Entring Wrong Date.");
		//Assert.assertEquals(actual, expected)
		softAssertion.assertAll();
		
	}
	public void validatingAvailablityToVerfyAfterSelectingAllMeterAllContractAllSupplierAndSettingDatetoFuture(){
		
		SelectElectricity_HHUtility();
		SelectingMultipleContractDuration();
		EnterDate("05/10/2019");
		ClickTopSubmitButton();
	}
	public void options(String meter,String contractDuration,String supplier){
		switch(meter) 
        { 
            case "zero": 
            	SelectingZeroMeters();
                break; 
            case "single": 
            	SelectingSingleMeter();
                break; 
            case "multiple": 
            	SelectingMultipleMeter();
                break; 
            default: 
                System.out.println("no match in meter"); 
        }
		switch(contractDuration) 
        { 
        case "zero": 
        	click(ContractDuration);
        	click(ContractDuration);
            break; 
            case "single": 
            	SelectingSingleContractDuration();
                break; 
            case "multiple": 
            	SelectingMultipleContractDuration();
                break; 
            default: 
                System.out.println("no match in contractDuration"); 
        } 
		switch(supplier) 
        { 
            case "zero": 
            	SelectingZeroSuppliers();
                break; 
            case "single": 
            	SelectingSingleSupplier();
                break; 
            case "multiple": 
            	SelectingMultipleSupplier();
                break; 
            default: 
                System.out.println("no match in Suppliers"); 
        }
		
	}
	
	public void verifyAlertMessageWhenNometerNocontractnosupplierSelectedIn_nHHUtility(){
		SoftAssert softAssertion = new SoftAssert();
		SelectElectricity_nHHUtility();
		options("zero","zero","zero");
		ClickTopSubmitButton();
		
		boolean errorMessageDisplayStatusForNotSelectingMeter = getText(message).contains("Please select at least one meter for a quote request.");
		Reporter.log("Checked if error message for not selecting any meter is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingMeter, "Error message is not displaying for not selecting any meter.");
		
		boolean errorMessageDisplayStatusForNotSelectingContractDuration = getText(message).contains("Please select contract duration");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingContractDuration, "Error message is not displaying for not entering contract duration.");	
		
		boolean errorMessageDisplayStatusForNotSelectingSuplier = getText(message).contains("Please select at least one supplier for a quote request.");
		Reporter.log("Checked if error message for not selecting contract duration is displaying.", true);
		softAssertion.assertTrue(errorMessageDisplayStatusForNotSelectingSuplier, "Error message is not displaying for not selecting any supplier.");
		//Assert.assertEquals(actual, expected)
		
		softAssertion.assertAll();
	}
}

