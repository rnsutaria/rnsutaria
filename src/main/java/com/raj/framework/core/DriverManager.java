package com.raj.framework.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager implements Base {

    public static WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", "/Users/rajeshvemula/Downloads/chromedriver");
        return new ChromeDriver();

    }
}
