package com.oem.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class PropertyPortfolioMeterPage extends CustomerDashboardPage {
	
	By siteFirstRecord = By.xpath("//div[@id = 'divSitesOverview']/hgroup[1]/table/tbody/tr/td[1]");
	By addMeter = By.id("add-meter-button");
	By meterUtilitiesInAddMeterDropdown = By.xpath("//div[@id = 'add-meter-button']/ul/li[*]");
	By addHHMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[1]");
	By addnHHMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[2]");
	By addGasMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[3]");
	By addWaterMeter = By.xpath("//div[@id = 'add-meter-button']/ul/li[4]");
	By saveMeterBtn = By.id("save-meter-button");
	/*Add HH & nHH Meter popup*/
	By meterNumDropdownField = By.id("profileClass");
	By meterNumSecondField = By.id("meterTimeSwitchCode");
	By meterNumThirdField = By.id("lineLossFactor");
	By meterNumFourthField = By.id("distributionId");
	By meterNumFifthField = By.id("meterPointIdNumber1");
	By meterNumSixthField = By.id("meterPointIdNumber2");
	By meterNumSeventhField = By.id("checkDigit");
	By invalidMPANNumberIcon = By.id("checksum-fail");
	By verifiedMPANNumberIcon = By.id("checksum-pass");
	
	By procurementType = By.id("procurementType");
	By expectedConsumption = By.id("expectedConsumption");
	By currentSupplier = By.id("electricitySuppliers");
	By contractEndDate = By.id("contractEndDateForMeterModel");
	By capacity = By.id("capacity");
	By currentAnnualSpend = By.id("currentAnnualSpend");
	By includeClimateChangeLevy = By.id("isCCLInclusive");
	By currentMeterOperator = By.id("meterOperator");
	By meterOperatorEndDate = By.id("meterOperatorEndDateForMeterModel");
	By currentDataCollector = By.id("dataCollector");
	By dataCollectorEndDate = By.id("dataCollectorEndDateForMeterModel");
	/*Add Gas Meter popup*/
	By gasMeterNumber = By.id("gasMeterNumber");
	By gasCurrentSuppliers = By.id("gasSuppliers");
	/*popup after saving meter*/
	By meterSavedPopup = By.xpath("//div[text() = 'The meter data was saved successfully.']");
	By invalidMPANPopup = By.xpath("//div[text() = 'MPAN failed check digit validation, please review the number and try again']");
	By okBtn = By.xpath("//button[text() = 'OK']");
	/*Meter List*/	
	By allMeterList = By.xpath("//div[@id = 'meters']/div/div/div/table/tbody/tr/td[2]/div[2]");
	By allHHMeterList = By.xpath("//div[@id = 'meters']/div[@id = 'meters-1']/div/div/table/tbody/tr/td[2]/div[2]");
	By allnHHMeterList = By.xpath("//div[@id = 'meters']/div[@id = 'meters-3']/div/div/table/tbody/tr/td[2]/div[2]");
	By allGasMeterList = By.xpath("//div[@id = 'meters']/div[@id = 'meters-2']/div/div/table/tbody/tr/td[2]/div[2]");
	By allWaterMeterList = By.xpath("//div[@id = 'meters']/div[@id = 'meters-4']/div/div/table/tbody/tr/td[2]/div[2]");
	
	By totalHHMetersCountInFilter = By.id("spanUtility-1");
	By totalnHHMetersCountInFilter = By.id("spanUtility-3");
	By totalGasMetersCountInFilter = By.id("spanUtility-2");
	By totalWaterMetersCountInFilter = By.id("spanUtility-4");
							 
							 
	@Override
    protected void isLoaded() throws Error {
        System.out.println("Executing isLoaded in Site Meters Page");
        Assert.assertTrue(isElementPresent(addMeter),"Site Meters page didnt appear");
    }
	
	public void addGasMeterUsingValidTestData() throws Throwable {
		SoftAssert softAssertion = new SoftAssert();
		int gasMetersCount = Integer.parseInt(getText(totalGasMetersCountInFilter));
		Reporter.log("Stored total number of gas meters as displayed in filter before adding a gas meter", true);
		click(addMeter);
		Reporter.log("Clicked on 'Add Meter' dropdown", true);
		click(addGasMeter);
		Reporter.log("Clicked on 'Gas' in Add Meter dropdown", true);
		Thread.sleep(1000);
		setValue(gasMeterNumber, readExcelData("Sheet3",4,2));
		Reporter.log("Entered in MPRN number in Add Gas Meter dropdown", true);
		selectByVisibleText(procurementType, readExcelData("Sheet3",4,3));
		Reporter.log("Selected procurement type in Add Gas Meter dropdown", true);
		setValue(expectedConsumption, readExcelData("Sheet3",4,4));
		Reporter.log("Entered 'Expected Consumption' in Add Gas Meter dropdown", true);
		selectByVisibleText(gasCurrentSuppliers, readExcelData("Sheet3",4,5));
		Reporter.log("Selected 'Current Supplier' in Add Gas Meter dropdown", true);
		click(contractEndDate);
		Reporter.log("Clicked on 'Contract End Date' to show date picker in Add Gas Meter dropdown", true);
		selectFutureDateCalender(Integer.parseInt(readExcelData("Sheet3",4,6)), Integer.parseInt(readExcelData("Sheet3",4,7)), Integer.parseInt(readExcelData("Sheet3",4,8)));
		Reporter.log("Selected 'Contract End Date' from the date picker in Add Gas Meter dropdown", true);
		setValue(currentAnnualSpend, readExcelData("Sheet3",4,9));
		Reporter.log("Entered 'Current Annual Spend' in Add Gas Meter dropdown", true);
		click(saveMeterBtn);
		Reporter.log("Clicked on 'Save Meter Data' button", true);
		softAssertion.assertTrue(isElementPresent(meterSavedPopup), "Meter saved successfully is not displaying");
		click(okBtn);
		Reporter.log("Clicked Ok button in popup after adding meter successfully", true);
		Thread.sleep(2000);
		int newGasMetersCount = Integer.parseInt(getText(totalGasMetersCountInFilter));
		Reporter.log("Stored total number of gas meters as displayed in filter after adding a gas meter", true);
		softAssertion.assertEquals(newGasMetersCount, gasMetersCount + 1, "Gas meter count in filter is getting increased");
		softAssertion.assertAll();
	}
	
	public void addGasMeterUsingDifferentTestData(String gasMeterNumber, String procurementType, String expectedConsumption, 
			String currentSupplier, int dayOfMonthOfContractEndDate, int monthNumberOfContractEndDate, int yearOfContractEndDate, 
			String currentAnnualSpend) throws Throwable
	{
		SoftAssert softAssertion = new SoftAssert();
		click(addMeter);
		Reporter.log("Clicked on 'Add Meter' dropdown", true);
		click(addGasMeter);
		Reporter.log("Clicked on 'Gas' in Add Meter dropdown", true);
		Thread.sleep(1000);
		setValue(this.gasMeterNumber, gasMeterNumber);
		Reporter.log("Entered in MPRN number in Add Gas Meter dropdown", true);
		selectByVisibleText(this.procurementType, procurementType);
		Reporter.log("Selected procurement type in Add Gas Meter dropdown", true);
		setValue(this.expectedConsumption, expectedConsumption);
		Reporter.log("Entered 'Expected Consumption' in Add Gas Meter dropdown", true);
		selectByVisibleText(gasCurrentSuppliers, currentSupplier);
		Reporter.log("Selected 'Current Supplier' in Add Gas Meter dropdown", true);
		click(contractEndDate);
		Reporter.log("Clicked on 'Contract End Date' to show date picker in Add Gas Meter dropdown", true);
		//selectFutureDateCalender(dayOfMonthOfContractEndDate, monthNumberOfContractEndDate, yearOfContractEndDate);
		Reporter.log("Selected 'Contract End Date' from the date picker in Add Gas Meter dropdown", true);
		setValue(this.currentAnnualSpend, currentAnnualSpend);
		Reporter.log("Entered 'Current Annual Spend' in Add Gas Meter dropdown", true);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("save-meter-button"))).click().build().perform();
		
		//actionsClick(saveMeterBtn);
		Reporter.log("Clicked on 'Save Meter Data' button", true);
		if(getAttribute(this.gasMeterNumber, "value").isEmpty()) {
			String gasMeterNumberErrorStatus = getAttribute(this.gasMeterNumber, "aria-invalid");
			System.out.println("value of aria invalid: " + gasMeterNumberErrorStatus);
			softAssertion.assertTrue(gasMeterNumberErrorStatus.isEmpty(), "Mandatory expression while validating 'Gas Meter Number' is not displaying");
			Reporter.log("Checked if error expression is displaying for 'Gas Meter Number'", true);
		}
		if(getAttribute(this.expectedConsumption, "value").isEmpty()) {
			String expectedConsumptionErrorStatus = getAttribute(this.expectedConsumption, "aria-invalid");
			softAssertion.assertTrue(expectedConsumptionErrorStatus.equals("true"), "Mandatory expression while validating 'Expected Consumption' field is not displaying");
			Reporter.log("Checked if error expression is displaying for 'Expected Consumption' Field", true);
		}
		if(getAttribute(this.contractEndDate, "value").isEmpty()) {
			String contractEndDateErrorStatus = getAttribute(this.contractEndDate, "aria-invalid");
			softAssertion.assertTrue(contractEndDateErrorStatus.equals("true"), "Mandatory expression while validating 'Contract End Date' field is not displaying");
			Reporter.log("Checked if error expression is displaying for 'Contract End Date' Field", true);
		}
		boolean meterSuccessfullyAddedMsgStatus = isElementPresent(meterSavedPopup);
		if(meterSuccessfullyAddedMsgStatus) {
			click(okBtn);
			Reporter.log("Clicked Ok button in popup after adding meter successfully", true);
			boolean meterNumDisplayedGasMeterListStatus = isElementExistInDropDown(allGasMeterList, gasMeterNumber);
			Reporter.log("Checked if meter number is displaying meter list.", true);
			softAssertion.assertTrue(meterNumDisplayedGasMeterListStatus, "The meter number is not displaying gas meter list. Meter not added");
		}
		softAssertion.assertAll();
	}
	
	public void addHHMeterUsingDifferentTestData(String meterNoDropdownFieldValue, String meterNoSecondField, String meterNoThirdField, String meterNoFourthField, 
			String meterNoFifthField, String meterNoSixthField, String meterNoSeventhField, String procurementType,	
			String expectedConsumption, String currentSupplier, String capacity, String currentAnnualSpend, 
			String currentMeterOperator, String currentDataCollector) throws Throwable
	{
		SoftAssert softAssertion = new SoftAssert();
		click(addMeter);
		click(addHHMeter);
		selectByVisibleText(meterNumDropdownField, meterNoDropdownFieldValue);		
		setValue(meterNumSecondField, meterNoSecondField);
		setValue(meterNumThirdField, meterNoThirdField);
		setValue(meterNumFourthField, meterNoFourthField);
		setValue(meterNumFifthField, meterNoFifthField);
		setValue(meterNumSixthField, meterNoSixthField);
		setValue(meterNumSeventhField, meterNoSeventhField);
		selectByVisibleText(this.procurementType, procurementType);
		
		boolean verifiedMPANNumberIconDisplayStatus = isElementPresent(verifiedMPANNumberIcon);
		if(verifiedMPANNumberIconDisplayStatus) {
			softAssertion.assertTrue(verifiedMPANNumberIconDisplayStatus, "Incorrect MPAN number entered");
			Reporter.log("Checked if symbol for valid MPAN number is displaying", true);
		}
		else {
			boolean invalidMPANNumberIconDisplayStatus = isElementPresent(invalidMPANNumberIcon);
			softAssertion.assertTrue(invalidMPANNumberIconDisplayStatus, "Icon for invalid MPAN number is not displaying");
			Reporter.log("Checked if symbol for invalid MPAN number is displaying", true);
		}
		
		setValue(this.expectedConsumption, expectedConsumption);
		selectByVisibleText(this.currentSupplier, currentSupplier);
		setValue(this.capacity, capacity);
		setValue(this.currentAnnualSpend, currentAnnualSpend);
		selectByVisibleText(this.currentMeterOperator, currentMeterOperator);
		selectByVisibleText(this.currentDataCollector, currentDataCollector);
		Reporter.log("Entered data in various fields in Add HH Meter popup", true);
		
		click(saveMeterBtn);
		Reporter.log("Clicked on 'Save Meter Data' button", true);
		if(getAttribute(meterNumSecondField, "value").equals("")) {
			String meterNumSecondFieldErrorStatus = getAttribute(meterNumSecondField, "aria-invalid");
			softAssertion.assertTrue(meterNumSecondFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumSecondField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumSecondField", true);
		}
		if(getAttribute(meterNumThirdField, "value").equals("")) {
			String meterNumThirdFieldErrorStatus = getAttribute(meterNumThirdField, "aria-invalid");
			softAssertion.assertTrue(meterNumThirdFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumThirdField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumThirdField", true);
		}
		if(getAttribute(meterNumFourthField, "value").equals("")) {
			String meterNumFourthFieldErrorStatus = getAttribute(meterNumFourthField, "aria-invalid");
			softAssertion.assertTrue(meterNumFourthFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumFourthField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumFourthField", true);
		}
		if(getAttribute(meterNumFifthField, "value").equals("")) {
			String meterNumFifthFieldErrorStatus = getAttribute(meterNumFifthField, "aria-invalid");
			softAssertion.assertTrue(meterNumFifthFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumFifthField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumFifthField", true);
		}
		if(getAttribute(meterNumSixthField, "value").equals("")) {
			String meterNumSixthFieldErrorStatus = getAttribute(meterNumSixthField, "aria-invalid");
			softAssertion.assertTrue(meterNumSixthFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumSixthField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumSixthField", true);
		}
		if(getAttribute(meterNumSeventhField, "value").equals("")) {
			String meterNumSeventhFieldErrorStatus = getAttribute(meterNumSeventhField, "aria-invalid");
			softAssertion.assertTrue(meterNumSeventhFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumSeventhField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumSeventhField", true);
		}
		if(getAttribute(this.expectedConsumption, "value").equals("")) {
			String expectedConsumptionFieldErrorStatus = getAttribute(this.expectedConsumption, "aria-invalid");
			softAssertion.assertTrue(expectedConsumptionFieldErrorStatus.equals("true"), "Mandatory expression while validating Expected Consumption is not displaying");
			Reporter.log("Checked if error expression is displaying for Expected Consumption", true);
		}
		if(getAttribute(this.contractEndDate, "value").equals("")) {
			String contractEndDateFieldErrorStatus = getAttribute(this.contractEndDate, "aria-invalid");
			softAssertion.assertTrue(contractEndDateFieldErrorStatus.equals("true"), "Mandatory expression while validating Contract End Date is not displaying");
			Reporter.log("Checked if error expression is displaying for Contract End Date", true);
		}
		if(getAttribute(this.capacity, "value").equals("")) {
			String capacityErrorStatus = getAttribute(this.capacity, "aria-invalid");
			softAssertion.assertTrue(capacityErrorStatus.equals("true"), "Mandatory expression while validating Capacity field is not displaying");
			Reporter.log("Checked if error expression is displaying for Capacity", true);
		}
		
		/*if(getAttribute(meterNumSecondField, "aria-invalid").equals("false") && 
				getAttribute(meterNumThirdField, "aria-invalid").equals("false") && 
				getAttribute(meterNumFourthField, "aria-invalid").equals("false") &&
				getAttribute(meterNumFifthField, "aria-invalid").equals("false") &&
				getAttribute(meterNumSixthField, "aria-invalid").equals("false") &&
				getAttribute(meterNumSeventhField, "aria-invalid").equals("false")) {
			boolean validMPANStatus = isElementPresent();
		}*/
		
		boolean meterDataSaveStatus = isElementPresent(meterSavedPopup);
		softAssertion.assertTrue(meterDataSaveStatus, "Meter data was not saved");
		Reporter.log("Checked if pop for saving meter data successfully is displayed", true);
		
		softAssertion.assertAll();
	}
	
	
	public void addNHHMeterUsingDifferntTestData(String meterNoDropdownFieldValue, String meterNoSecondField, String meterNoThirdField, String meterNoFourthField, 
			String meterNoFifthField, String meterNoSixthField, String meterNoSeventhField, String procurementType,	
			String expectedConsumption, String currentSupplier, String currentAnnualSpend) throws Throwable	{
		SoftAssert softAssertion = new SoftAssert();
		click(addMeter);
		click(addnHHMeter);
		selectByVisibleText(meterNumDropdownField, meterNoDropdownFieldValue);		
		setValue(meterNumSecondField, meterNoSecondField);
		setValue(meterNumThirdField, meterNoThirdField);
		setValue(meterNumFourthField, meterNoFourthField);
		setValue(meterNumFifthField, meterNoFifthField);
		setValue(meterNumSixthField, meterNoSixthField);
		setValue(meterNumSeventhField, meterNoSeventhField);
		selectByVisibleText(this.procurementType, procurementType);
		
		boolean verifiedMPANNumberIconDisplayStatus = isElementPresent(verifiedMPANNumberIcon);
		if(verifiedMPANNumberIconDisplayStatus) {
			softAssertion.assertTrue(verifiedMPANNumberIconDisplayStatus, "Invalid MPAN number entered");
			Reporter.log("Checked if symbol for valid MPAN number is displaying", true);
		}
		else {
			boolean invalidMPANNumberIconDisplayStatus = isElementPresent(invalidMPANNumberIcon);
			softAssertion.assertTrue(invalidMPANNumberIconDisplayStatus, "Icon for invalid MPAN number is not displaying");
			Reporter.log("Checked if symbol for invalid MPAN number is displaying", true);
		}
		
		setValue(this.expectedConsumption, expectedConsumption);
		selectByVisibleText(this.currentSupplier, currentSupplier);
		setValue(this.currentAnnualSpend, currentAnnualSpend);
		Reporter.log("Entered data in various fields in Add nHH Meter popup", true);
		
		click(saveMeterBtn);
		Reporter.log("Clicked on 'Save Meter Data' button", true);
		if(getAttribute(meterNumSecondField, "value").equals("")) {
			String meterNumSecondFieldErrorStatus = getAttribute(meterNumSecondField, "aria-invalid");
			softAssertion.assertTrue(meterNumSecondFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumSecondField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumSecondField", true);
		}
		if(getAttribute(meterNumThirdField, "value").equals("")) {
			String meterNumThirdFieldErrorStatus = getAttribute(meterNumThirdField, "aria-invalid");
			softAssertion.assertTrue(meterNumThirdFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumThirdField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumThirdField", true);
		}
		if(getAttribute(meterNumFourthField, "value").equals("")) {
			String meterNumFourthFieldErrorStatus = getAttribute(meterNumFourthField, "aria-invalid");
			softAssertion.assertTrue(meterNumFourthFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumFourthField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumFourthField", true);
		}
		if(getAttribute(meterNumFifthField, "value").equals("")) {
			String meterNumFifthFieldErrorStatus = getAttribute(meterNumFifthField, "aria-invalid");
			softAssertion.assertTrue(meterNumFifthFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumFifthField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumFifthField", true);
		}
		if(getAttribute(meterNumSixthField, "value").equals("")) {
			String meterNumSixthFieldErrorStatus = getAttribute(meterNumSixthField, "aria-invalid");
			softAssertion.assertTrue(meterNumSixthFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumSixthField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumSixthField", true);
		}
		if(getAttribute(meterNumSeventhField, "value").equals("")) {
			String meterNumSeventhFieldErrorStatus = getAttribute(meterNumSeventhField, "aria-invalid");
			softAssertion.assertTrue(meterNumSeventhFieldErrorStatus.equals("true"), "Mandatory expression while validating meterNumSeventhField is not displaying");
			Reporter.log("Checked if error expression is displaying for meterNumSeventhField", true);
		}
		if(getAttribute(this.expectedConsumption, "value").equals("")) {
			String expectedConsumptionFieldErrorStatus = getAttribute(this.expectedConsumption, "aria-invalid");
			softAssertion.assertTrue(expectedConsumptionFieldErrorStatus.equals("true"), "Mandatory expression while validating Expected Consumption is not displaying");
			Reporter.log("Checked if error expression is displaying for Expected Consumption", true);
		}
		if(getAttribute(this.contractEndDate, "value").equals("")) {
			String contractEndDateFieldErrorStatus = getAttribute(this.contractEndDate, "aria-invalid");
			softAssertion.assertTrue(contractEndDateFieldErrorStatus.equals("true"), "Mandatory expression while validating Contract End Date is not displaying");
			Reporter.log("Checked if error expression is displaying for Contract End Date", true);
		}
		boolean invalidMPANPopupDisplayStatus = isElementPresent(invalidMPANPopup);
		softAssertion.assertTrue(invalidMPANPopupDisplayStatus, "Invalid MPAN popup is not displaying");
		Reporter.log("Checked if pop for invalid popup is displayed", true);
		
		boolean meterDataSaveStatus = isElementPresent(meterSavedPopup);
		softAssertion.assertTrue(meterDataSaveStatus, "Meter data was not saved");
		Reporter.log("Checked if pop for saving meter data successfully is displayed", true);
		
		softAssertion.assertAll();
		
	}
	
	
	
	
	public void validateAddMeterDropdown() throws Throwable
	{
		SoftAssert softAssertion = new SoftAssert();
		click(addMeter);
		Reporter.log("Clicked on Add Meter dropdown");
		boolean hhElectricPresenceStatus = isElementExistInDropDown(meterUtilitiesInAddMeterDropdown, "HH Electric");
		softAssertion.assertTrue(hhElectricPresenceStatus, "HH Electric is not displaying in 'Add Meter' dropdown");
		Reporter.log("Checked if HH Electric is displaying in 'Add Meter' dropdown", true);
		boolean nHHElectricPresenceStatus = isElementExistInDropDown(meterUtilitiesInAddMeterDropdown, "nHH Electric");
		softAssertion.assertTrue(nHHElectricPresenceStatus, "nHH Electric is not displaying in 'Add Meter' dropdown");
		Reporter.log("Checked if nHH Electric is displaying in 'Add Meter' dropdown", true);
		boolean gasPresenceStatus = isElementExistInDropDown(meterUtilitiesInAddMeterDropdown, "Gas");
		softAssertion.assertTrue(gasPresenceStatus, "Gas utility is not displaying in 'Add Meter' dropdown");
		Reporter.log("Checked if 'Gas' utility is displaying in 'Add Meter' dropdown", true);
		boolean waterPresenceStatus = isElementExistInDropDown(meterUtilitiesInAddMeterDropdown, "Water");
		softAssertion.assertTrue(waterPresenceStatus, "Water utility is not displaying in 'Add Meter' dropdown");
		Reporter.log("Checked if 'Water' utility is displaying in 'Add Meter' dropdown", true);
		softAssertion.assertAll();
	}
	public void validateAddHHMeterPopup() throws Throwable
	{
		click(addMeter);
		Reporter.log("Clicked on Add Meter dropdown", true);
		Thread.sleep(1000);
		click(addHHMeter);
		Reporter.log("Clicked on HH Electric", true);
		Assert.assertTrue(isElementPresent(currentMeterOperator), "Popup for adding new HH Electric meter didn't appear");
	}
	public void validateAddnHHMeterPopup() throws Throwable
	{
		click(addMeter);
		Reporter.log("Clicked on Add Meter dropdown", true);
		Thread.sleep(1000);
		click(addnHHMeter);
		Reporter.log("Clicked on nHH Electric meter", true);
		Assert.assertTrue(isElementPresent(procurementType), "Popup for adding new nHH Electric meter didn't appear");
	}
	public void validateAddGasMeterPopup()
	{
		click(addMeter);
		Reporter.log("Clicked on Add Meter dropdown", true);
		click(addGasMeter);
		Reporter.log("Clicked on Gas meter", true);
		Assert.assertTrue(isElementPresent(gasMeterNumber), "Popup for adding new nHH Electric meter didn't appear");
	}
}
