package com.oem.framework.pages;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CompanyProfilePage extends CustomerDashboardPage {

	By saveBtn = By.id("submit");
	By saveSuccessMsg = By.xpath("//div[@id = 'global-message-text']");
    By companyName=By.id("Name");
    By companyRegisteredAddress=By.id("RegisteredAddress");
    By compPostCode=By.id("Postcode");
    By companyNameError = By.id("Name-error");
    By registeredAddressError=By.id("RegisteredAddress-error");
    By registeredAddressBlankError = By.id("RegisteredAddress-error");
    By postCodeError = By.id("Postcode-error");
    By phone = By.id("ContactPhone");
    By companyRegNum = By.id("CompanyRegistrationNumber");
    By companyRegNumError = By.id("CompanyRegistrationNumber-error");
    By CompanyLogo = By.id("CompanyLogo");
    By supplierInvoicingTo = By.id("InvoiceHeadOffice");
    By loaTemplate = By.xpath("//strong[text() = 'Letter of Authority Template']");
    By existingLOA = By.xpath("//strong[text() = 'Download Existing Letter Of Authority']");
    By LOAExpiresDate = By.id("LOAExpiresDate");
    By LOAExpiresDateDatePicker = By.xpath("//div[@id = 'ui-datepicker-div']");
      
    
    public void fillCompanyProfile(){
        setValue(companyName,"abc");
        setValue(companyRegisteredAddress,"Bangalore");      
    }

    @Override
    protected void isLoaded() throws Error {
        System.out.println("Executing isLoaded in CustomerDashboard Page");
        Assert.assertTrue(isElementPresent(companyRegisteredAddress),"Company profile Page didnt appear");        
    }

    public void setFieldValue(CompanyProfileFields field,String value){
           switch (field){
               case NAME:
                    setValue(companyName,value);
                    sendSpecialKeys(companyName,Keys.TAB);
                   break;
               case RegisteredAddress:
                   setValue(companyRegisteredAddress,value);
                   sendSpecialKeys(companyName,Keys.TAB);
                   break;
               case PostCode:
                   setValue(compPostCode,value);
                   break;
               case RegistrationNumber:
                   setValue(companyRegNum,value);
                   sendSpecialKeys(companyName,Keys.TAB);
                   break;
           }

    }

    public void verifyRegisteredAddressError(String value){
    	CompanyProfilePage companyProfilePage = new CompanyProfilePage();
    	companyProfilePage.setValue(companyRegisteredAddress, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it.");
        companyProfilePage.click(saveBtn);
    	Assert.assertTrue(StringUtils.isNoneBlank(getText(registeredAddressError)) &&
                getText(registeredAddressError).trim().contains(value),"Registered address error actual value: "+getText(registeredAddressError) +" but expected:"+value);
    }
    
    public void verifyBlankRegisteredAddressError(String value) {
    	CompanyProfilePage companyProfilePage = new CompanyProfilePage();
    	companyProfilePage.setValue(companyRegisteredAddress, "");
        companyProfilePage.click(saveBtn);
    	Assert.assertTrue(StringUtils.isNoneBlank(getText(registeredAddressBlankError)) &&
                getText(registeredAddressBlankError).trim().contains(value),"Registered address error actual value: "+getText(registeredAddressBlankError) +" but expected:"+value);
    }
    public void verifyRegisteredAddressErrorSpaceTestData() {
    	CompanyProfilePage companyProfilePage = new CompanyProfilePage();
    	companyProfilePage.setValue(companyRegisteredAddress, "       ");
        companyProfilePage.click(saveBtn);
        Assert.assertEquals(true, companyProfilePage.isElementPresent(registeredAddressBlankError));
    }

    public void verifyCompanyNameError(String value) {
    	CompanyProfilePage companyProfilePage = new CompanyProfilePage();
    	companyProfilePage.setValue(companyName, "");
        companyProfilePage.click(saveBtn);
    	Assert.assertTrue(StringUtils.isNoneBlank(getText(companyNameError)) &&
                getText(companyNameError).trim().contains(value),"Company Name error actual value: "+getText(companyNameError) +" but expected:"+value);
    }
    
    public void verifyBlankPostcodeError(String value) {
    	CompanyProfilePage companyProfilePage = new CompanyProfilePage();
    	//companyProfilePage.setValue(compPostCode, "");
    	companyProfilePage.setValue(compPostCode, "    ");
        companyProfilePage.click(saveBtn);
    	Assert.assertTrue(StringUtils.isNoneBlank(getText(postCodeError)) &&
                getText(postCodeError).trim().contains(value),"Postcode error actual value: "+getText(postCodeError) +" but expected:"+value);
    }
    
    public void verifyCompRegistrationNumberError(String value) {
    	CompanyProfilePage companyProfilePage = new CompanyProfilePage();
    	companyProfilePage.setValue(companyRegNum, "");
        companyProfilePage.click(saveBtn);
    	Assert.assertTrue(StringUtils.isNoneBlank(getText(companyRegNumError)) &&
                getText(companyRegNumError).trim().contains(value),"Company Registration Number error actual value: "+getText(companyRegNumError) +" but expected:"+value);
    }
    
    public void displayDropdownOptions(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> lst = sel.getOptions();
		for(WebElement wb : lst)
			System.out.println(wb.getText());
	}
    
    public void verifyLOATemplateDisplay(String value)
    {
    	Assert.assertTrue(StringUtils.isNoneBlank(getText(loaTemplate)) &&
                getText(loaTemplate).trim().contains(value),"Letter of Authority Template"+getText(loaTemplate) +" but expected:"+value);
    }
    public void verifyExistingLOADisplay(String value)
    {
    	Assert.assertTrue(StringUtils.isNoneBlank(getText(existingLOA)) &&
                getText(existingLOA).trim().contains(value),"Download Existing Letter Of Authority"+getText(existingLOA) +" but expected:"+value);
    }
    public void verifyDatePickerDisplayLOAExpiresDate()
    {   
    	CompanyProfilePage companyProfilePage = new CompanyProfilePage();
        companyProfilePage.click(LOAExpiresDate);
        companyProfilePage.isElementPresent(LOAExpiresDateDatePicker);
    	Assert.assertEquals(companyProfilePage.isElementPresent(LOAExpiresDateDatePicker), true);	
    }
    public void uploadLogo()
    {   
    	CompanyProfilePage companyProfilePage = new CompanyProfilePage();
    	companyProfilePage.setValue(CompanyLogo, "C:\\Users\\sowjanya\\Desktop\\Bank.jpg");
    	companyProfilePage.click(saveBtn);
    	boolean status = companyProfilePage.isElementPresent(saveSuccessMsg);
        Assert.assertEquals(true, status);
    }
    public void verifySupplierInvoiceTo()
    {
    	CompanyProfilePage companyProfilePage = new CompanyProfilePage();
    	Select sel = new Select((WebElement) supplierInvoicingTo);
		List<WebElement> lst = sel.getOptions();
		for(WebElement wb : lst)
			System.out.println(wb.getText());
    }
    public void validateProfileDiffDataSets(String compName, String addr, String postCode, String ph, String regdNo) throws InterruptedException
    {
    	CompanyProfilePage companyProfilePage = new CompanyProfilePage();
        companyProfilePage.setValue(companyName, compName);
        companyProfilePage.setValue(companyRegisteredAddress, addr);
        companyProfilePage.setValue(compPostCode, postCode);
        companyProfilePage.setValue(phone, ph);
        companyProfilePage.setValue(companyRegNum, regdNo);
        companyProfilePage.click(saveBtn);
        Thread.sleep(2000);
        boolean status = companyProfilePage.isElementPresent(saveSuccessMsg);
        Assert.assertEquals(true, status);   	
    }
    
    
    
    public enum CompanyProfileFields
    {
        NAME, RegisteredAddress,PostCode,Phone,RegistrationNumber,
    }
}
