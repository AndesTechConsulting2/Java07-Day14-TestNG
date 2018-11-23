package org.andestech.learning.rfb18.g2;

import org.testng.*;

public class MyTestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("+++ start Test:" + iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("--- finish Test:" + iTestContext.getName());
    }
}
