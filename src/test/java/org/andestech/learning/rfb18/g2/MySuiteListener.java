package org.andestech.learning.rfb18.g2;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListener implements ISuiteListener {
    @Override
    public void onStart(ISuite iSuite) {
        System.out.println("+++ Init suite: " + iSuite.getName() + ", sobject: " + iSuite);
    }

    @Override
    public void onFinish(ISuite iSuite) {
        System.out.println("--- Exit suite: " + iSuite.getName() + ", sobject: " + iSuite);
    }
}
