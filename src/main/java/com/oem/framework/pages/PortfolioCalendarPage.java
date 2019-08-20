package com.oem.framework.pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class PortfolioCalendarPage extends CustomerDashboardPage {
	
	By addCalendarEntry = By.id("new-entry-btn");
	By portfolioCalendarEntryPopUp = By.xpath("//h3[text() = 'Add new portfolio calendar entry']");
	By close_PortfolioCalendarEntryPopup = By.xpath("//div[@id='add-calendar-entry']//button[@class='close icon-close']");
	
	
	@Override
    protected void isLoaded() throws Error {
        System.out.println("Executing isLoaded in CustomerDashboard Page");
        Assert.assertTrue(isElementPresent(addCalendarEntry),"Portfolio Calendar Page didnt appear");
        
    }
	public void verifyPortfolioCalendarEntrypopup(String value){
		
        Assert.assertTrue(StringUtils.isNoneBlank(getText(portfolioCalendarEntryPopUp)) &&
                getText(portfolioCalendarEntryPopUp).trim().contains(value),"Portfolio Calendar Entry Popup heading actual value: "+getText(portfolioCalendarEntryPopUp) +" but expected:"+value);
    }
	public void verifyCloseBtnPortfolioCalendarEntrypopup(){
		
		boolean status = driver.findElement(By.xpath("//h3[text() = 'Add new portfolio calendar entry']")).isDisplayed();
		Assert.assertEquals(status, false);
    }
}
