package com.raj.framework.core;

import org.slf4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;


public abstract class BaseTest implements Base {

    protected Logger logger=getLogger();

    @BeforeMethod(alwaysRun = true)
    public void baseInit(Method method, ITestContext ctx) {
        System.out.println("Executing BaseTest before method");
        System.out.println("**************** Starting test : " + method.getName()
                + " ****************" +getClass().getSimpleName());

        //testName = method.getName();
        new TestExecutionContext(method.getName());


    }


    @AfterMethod(alwaysRun = true)
    public void afterMethod(Method method, ITestContext ctx, ITestResult result){

        String testName = method.getName();
        System.out.println(String.format("**********************************************************************************"));
        System.out.println(String.format("%s::%s - afterMethod", getClass().getSimpleName(), testName));
        System.out.println(String.format(">> Finished - %s::%s", getClass().getSimpleName()
                , testName));

        System.out.println(String.format("Finished Test (%s) execution :: Is execution successful? : %s", testName,
                result.isSuccess()));

        System.out.println(String.format("Completed afterMethod processing for test: %s", testName));
        System.out.println(String.format("**********************************************************************************"));

        cleanUpThread(Thread.currentThread().getId());

    }

    private void cleanUpThread(long threadId){

        Globals.getTestExecutionContext(threadId).getDriver().close();

        Globals.remove(threadId);

    }
}
