package com.raj.framework.core.listener;

import com.raj.framework.core.Globals;
import com.raj.framework.core.TestExecutionContext;
import com.raj.framework.core.utils.WaitUtils;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class TestNGAnnotationsListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
       /* String testName = method.getTestMethod().getMethodName();
        new TestExecutionContext(testName);
        System.out.println(String.format("**********************************************************************************"));
        System.out.println(String.format(">> Started - %s::%s", method.getTestMethod()
                                                            .getRealClass()
                                                            .getName(), testName));

        System.out.println(String.format("%s - Completed beforeMethod processing for test", testName));
        System.out.println(String.format("**********************************************************************************"));
        WaitUtils.waitFor(3, "");*/
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
      /*  String testName = method.getTestMethod().getMethodName();
        System.out.println(String.format("**********************************************************************************"));
        System.out.println(String.format("%s::%s - afterMethod", getClass().getSimpleName(), testName));
        System.out.println(String.format(">> Finished - %s::%s", method.getTestMethod()
                                                             .getRealClass()
                                                             .getName(), testName));

        System.out.println(String.format("Finished Test (%s) execution :: Is execution successful? : %s", testName,
                               testResult.isSuccess()));

        System.out.println(String.format("Completed afterMethod processing for test: %s", testName));
        System.out.println(String.format("**********************************************************************************"));
        WaitUtils.waitFor(3, "");
        Globals.remove(Thread.currentThread().getId());*/
    }
}
