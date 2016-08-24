package com.edwincobos.subscribersapp.commons.utils;

import android.util.Log;

/**
 * @author edwin.cobos
 * @since 19/08/2016
 */
public class Utils {

    public static void debugLog(String msg){
        if(Constants.DEBUG_LOGS) {
            Log.i(Constants.DEBUG_PREFIX, msg);
        }
    }

}
