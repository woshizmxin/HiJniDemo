package com.test.hijni.hijni;

/**
 * Created by zhoumao on 15/8/21.
 */
public class NdkJniUtils {
    public native String getCLanguageString();
    static{
        System.loadLibrary("jnitest");
    }
}
