package com.oem.framework.core;

import com.oem.framework.core.base.Base;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.HashMap;

public class TestExecutionContext implements Base {
    private final String testName;
    private final WebDriver driver;
    HashMap<String, String> configForExecutionEnvironment;

    public TestExecutionContext(String testName) throws IOException {
        this.testName = testName;
        this.driver = DriverManager.getDriver();
        configForExecutionEnvironment=Globals.configForExecutionEnvironment;
        Globals.addContext(Thread.currentThread().getId(), this);

        getLogger().debug(String.format("%s - TestExecution context created", testName));
    }

    public String getTestName() {
        return testName;
    }


    public WebDriver getDriver() {
        return driver;
    }


    public String getConfig(String key){
        return configForExecutionEnvironment.get(key);
    }


}
