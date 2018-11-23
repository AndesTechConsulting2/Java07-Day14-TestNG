package org.andestech.learning.rfb18.g2;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class AppTest2 {

    @Test
    public void testCase01(ITestContext ctx){

        System.out.println("Suit: " + ctx.getSuite().getName()  +
                  ", Test: " + ctx.getCurrentXmlTest().getName() +
                  ", Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        Assert.assertTrue(true);
    }

    @Test
    public void testCase02(ITestContext ctx){

        System.out.println("Suit: " + ctx.getSuite().getName()  +
                ", Test: " + ctx.getCurrentXmlTest().getName() +
                ", Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        Assert.assertTrue(true);
    }

}
