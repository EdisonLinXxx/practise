package com.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.demo.sale.SaleUtils;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testSaleUtils(){
        Integer res = SaleUtils.parseSaleType_Enums("JXX");
        System.err.println(res);
    }
}
