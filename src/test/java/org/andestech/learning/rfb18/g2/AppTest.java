package org.andestech.learning.rfb18.g2;


import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AppTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
//        Object[][] testO =
//                Utils.getData("src/test/resources/testdata1.txt");
        assertTrue( true );
    }

   @DataProvider(name = "data")
   public static Object[][] getData1(ITestContext ctx)
    {
        String fname = ctx.getCurrentXmlTest().getParameter("fname");
        return Utils.getData(fname);
    }


    @Test(dataProvider = "data", groups = {"positiveTest"})
    public void positiveTestCase01(double a, double b, double res)
    {
        Assert.assertEquals(res,Utils.summa(a,b),1e-15 );
    }


    @Test(dataProvider = "data", groups = {"negativeTest"})
    public void negativeTestCase01(double a, double b, double res)
    {
        Assert.assertNotEquals(res,Utils.summa(a,b),1e-15 );
    }


}
