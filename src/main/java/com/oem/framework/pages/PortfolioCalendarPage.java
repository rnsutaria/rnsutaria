package com.oem.framework.pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PortfolioCalendarPage extends CustomerDashboardPage {
	
	By addCalendarEntry = By.id("new-entry-btn");
	By portfolioCalendarEntryPopUp = By.xpath("//h3[text() = 'Add new portfolio calendar entry']");
	By close_PortfolioCalendarEntryPopup = By.xpath("//div[@id='add-calendar-entry']//button[@class='close icon-close']");
	By eventDate = By.id("NewCalendarEntry_EventDate");
	By eventDescription = By.id("NewCalendarEntry_EventDescription");
	By saveBtn = By.xpath("//button[text() = 'Save entry']");
	By eventDescriptionErrorMessage = By.id("NewCalendarEntry_EventDescription-error");
	
	@Override
    protected void isLoaded() throws Error {
        System.out.println("Executing isLoaded in CustomerDashboard Page");
        Assert.assertTrue(isElementPresent(addCalendarEntry),"Portfolio Calendar Page didnt appear");
        
    }
	public void verifyPortfolioCalendarEntrypopup(String value) throws InterruptedException{
		PortfolioCalendarPage pc = new PortfolioCalendarPage();
		pc.click(addCalendarEntry);
		Thread.sleep(1000);
        Assert.assertTrue(StringUtils.isNoneBlank(getText(portfolioCalendarEntryPopUp)) &&
                getText(portfolioCalendarEntryPopUp).trim().contains(value),"Portfolio Calendar Entry Popup heading actual value: "+getText(portfolioCalendarEntryPopUp) +" but expected:"+value);
    }
	public void verifyCloseBtnPortfolioCalendarEntrypopup() throws InterruptedException{
		PortfolioCalendarPage pc = new PortfolioCalendarPage();
		pc.click(addCalendarEntry);
		Thread.sleep(1000);
		pc.click(close_PortfolioCalendarEntryPopup);
		Thread.sleep(1000);
		boolean status = driver.findElement(By.xpath("//h3[text() = 'Add new portfolio calendar entry']")).isDisplayed();
		Assert.assertEquals(status, false);
    }
	public void verifyspaceDataPortfolioCaledarEntryPopup(String data) throws InterruptedException
	{
		PortfolioCalendarPage pc = new PortfolioCalendarPage();
		pc.click(addCalendarEntry);
		Thread.sleep(2000);
		pc.click(eventDate);
		pc.selectFutureDateCalender();
		pc.setValue(eventDescription, data);
		pc.click(saveBtn);
	}
	public void validateEventDescriptionPortfolioCaledarEntryPopup(String value) throws InterruptedException
	{
		PortfolioCalendarPage pc = new PortfolioCalendarPage();
		pc.click(addCalendarEntry);
		Thread.sleep(2000);
		pc.click(eventDate);
		pc.selectFutureDateCalender();
		
		String str = driver.findElement(By.xpath("NewCalendarEntry_EventDate")).getAttribute(value);
		System.out.println("value at date field "+ str);
		
		pc.setValue(eventDescription, "lorem ipsum");
		
		str = driver.findElement(By.id("NewCalendarEntry_EventDescription")).getAttribute(value);
		System.out.println("value at description : " + str);
		
		//pc.click(saveBtn);
		Assert.assertTrue(StringUtils.isNoneBlank(getText(eventDescriptionErrorMessage)) &&
                getText(eventDescriptionErrorMessage).trim().contains(value),"Event Description Error message actual value: "+getText(eventDescriptionErrorMessage) +" but expected:"+value);
	}
}
