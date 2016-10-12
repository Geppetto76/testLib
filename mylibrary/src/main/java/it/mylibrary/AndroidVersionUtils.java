package it.mylibrary;

import android.os.Build;

/**
 * Created by andrea.ferri on 30/09/2016.
 */

public class AndroidVersionUtils {

    private static AndroidVersionUtils instance;


    public static AndroidVersionUtils get() {
        if (instance == null)
            instance = new AndroidVersionUtils();
        return instance;
    }

    private AndroidVersionUtils() {
    }

//alzata compatibilita a 16
//    public boolean hasJellyBean() {
//        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN;
//    }

    public boolean hasJellyBeanMR1() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1;
    }
    public boolean hasKitKat() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    }

    public boolean hasLollipop() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }


    public boolean hasMarshmallow() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
    }

    public boolean hasNougat() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N;
    }

}
