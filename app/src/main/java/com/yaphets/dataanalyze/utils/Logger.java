package com.yaphets.dataanalyze.utils;

import android.util.Log;

/**
 * Created by yaphets on 17-11-18.
 */

public class Logger {

    public static boolean a = true;
    private static String b = "dataAnalyze";

    public static void d(String s) {
        if (a) {
            Log.d(b, s);
        }
    }

}
