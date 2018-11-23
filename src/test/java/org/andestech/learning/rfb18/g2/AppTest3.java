
package org.andestech.learning.rfb18.g2;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;


public class AppTest3 {

    @BeforeMethod
    public void beforeMeth(){
        System.out.println("+++ Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @Test
    public void testCase03(ITestContext ctx){

        System.out.println("Suit: " + ctx.getSuite().getName()  +
                ", Test: " + ctx.getCurrentXmlTest().getName() +
                ", Method: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        Assert.assertTrue(true);
    }

//    @BeforeSuite
//    public void initSuite(ITestContext ctx)
//    {
//        System.out.println("+++ Init suite: " + ctx.getSuite().getName() + ", sobject: " + ctx.getSuite());
//    }
//
//    @AfterSuite
//    public void afterSuite(ITestContext ctx)
//    {
//        System.out.println("--- Exit suite: " + ctx.getSuite().getName() + ", sobject: " + ctx.getSuite());
//    }

//    @BeforeTest
//    public void beforeTest(ITestContext ctx)
//    {
//        System.out.println("+++ Test init: " + ctx.getCurrentXmlTest().getName() + ", sobject: " + ctx.getCurrentXmlTest());
//    }
//
//    @AfterTest
//    public void afterTest(ITestContext ctx)
//    {
//        System.out.println("--- Test exit: " + ctx.getCurrentXmlTest().getName() + ", sobject: " + ctx.getCurrentXmlTest());
//    }

}
