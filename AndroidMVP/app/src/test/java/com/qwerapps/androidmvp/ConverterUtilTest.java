package com.qwerapps.androidmvp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by IT02106 on 19/04/2018.
 */

public class ConverterUtilTest {
    @Test
    public void testConverterFahrenheitToCelcius()
    {
        float actual = ConverterUtil.convertCelciusToFahrenheit(100);
        float expected = 212;

        assertEquals("Conversion from celcius to fahrenheit failed",expected, actual,0.001);
    }


}
