package com.oem.framework.core.base;

import com.oem.framework.core.Globals;
import com.oem.framework.core.TestExecutionContext;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.testng.Assert;

public abstract class BasePage<T extends BasePage<T>> extends LoadableComponent<T> implements Base {

   // protected static ThreadLocal threadLocalPage=new ThreadLocal<>();
    protected final WebDriver driver;
    protected final String testName;
    protected TestExecutionContext testExecutionContext;
    protected Logger logger=getLogger();

    public BasePage() {
        testExecutionContext = Globals.getTestExecutionContext(Thread.currentThread().getId());
        driver = testExecutionContext.getDriver();
        testName = testExecutionContext.getTestName();
    }

    public void setValue(By by, String value){
        waitForElementPresent(by);
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(value);
    }
    
    //clearValue
    public void clearValue(By by) {
    	waitForElementPresent(by);
        driver.findElement(by).clear();
    }
    

    public void click(By by){
        waitForElementPresent(by);
        driver.findElement(by).click();
    }


    public void waitForElementPresent(By locatn) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(locatn));

        } catch (Exception e) {

        }
    }


    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        int i = 0;
        while (true) {
            if (driver.findElement(locator).isDisplayed())
                break;
            else if (i < 5) {
                logger.info("searching element by scroll up");
                ((JavascriptExecutor) driver).executeScript("scroll(0,100)");
                i++;
            } else if (i < 10) {
                logger.info("searching element by scroll down");
                ((JavascriptExecutor) driver).executeScript("scroll(0,100)");
                i++;
            } else {
                logger.info("not able to find element by scrolling up and down");
                break;
            }
        }
    }

    public String getText(By locator){
        waitForElementPresent(locator);
        return driver.findElement(locator).getText();
    }
    public String getAttribute(By locator, String attributeName) {
        String attribute = "";
        waitForElementPresent(locator);
        try {
            attribute = driver.findElement(locator).getAttribute(attributeName);
            logger.info("Attribute value is: " + attribute);
        } catch (Exception e) {
            logger.info("Not able to fetch attribute value- " + e.getMessage());
        }
        return attribute;
    }


    public void selectByVisibleText(By locator, String value){
        waitForElementPresent(locator);
        new Select(driver.findElement(locator)).selectByVisibleText(value);
    }

    public void selectByIndex(By locator, int index){
        waitForElementPresent(locator);
        new Select(driver.findElement(locator)).selectByIndex(index);
    }

    public void selectByValue(By locator, String value){
        waitForElementPresent(locator);
        new Select(driver.findElement(locator)).selectByValue(value);
    }

    public boolean isElementPresent(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            if (element == null)
                return false;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    @Override
    protected void load() {

    }

    protected boolean isCustomerDashboardPage(){
        if(driver.getCurrentUrl().contains("CustomerDashboard"))
            return true;
        return false;
    }

    protected boolean isSignInPage(){
        if(driver.getCurrentUrl().contains("Account/Login"))
            return true;
        return false;

    }

    protected boolean isAdminDashboardPage(){
        if(driver.getCurrentUrl().contains("AdminDashboard"))
            return true;
        return false;
    }

    protected void verifyElementPresent(By element){
        Assert.assertTrue(isElementPresent(element),"Element "+element +" doesn't exit");
    }

    public void sendSpecialKeys(By locator,Keys keys){
        driver.findElement(locator).clear();
    	driver.findElement(locator).sendKeys(keys);
    }
}

