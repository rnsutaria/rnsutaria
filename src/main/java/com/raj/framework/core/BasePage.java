package com.raj.framework.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;

public abstract class BasePage implements Base {
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
        driver.findElement(by).sendKeys(value);
    }

    public void click(By by){
        waitForElementPresent(by);
        driver.findElement(by).click();
    }


    public void waitForElementPresent(By locatn) {
        WebElement ele = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.presenceOfElementLocated(locatn));

        } catch (Exception e) {

        }
    }
    

}

