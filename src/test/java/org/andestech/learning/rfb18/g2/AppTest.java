package org.andestech.learning.rfb18.g2;


import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AppTest
{

    @Test
    public void shouldAnswerWithTrue()
    {

        Object[][] testO =
                Utils.getData("src/test/resources/testdata1.txt");
        assertTrue( true );
    }
}
