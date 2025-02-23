package com.osiris.utilities;

public class BrowserUtils {

    public static void  sleep(int secons){


        try {
            Thread.sleep(secons*1000);
        } catch (InterruptedException e) {

        }

    }
}
