package com.qwerapps.androidmvp;

import android.util.Log;

/**
 * Created by IT02106 on 19/04/2018.
 */

public class ConverterUtil {


    public static float convertCelciusToFahrenheit(float cel)
    {
        //Log.e("asda", Float.toString(cel * (9/5) + 32));
        return cel * (9f/5) + 32;
    }

}
