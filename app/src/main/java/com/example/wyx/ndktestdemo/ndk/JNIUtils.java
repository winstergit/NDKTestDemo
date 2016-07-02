package com.example.wyx.ndktestdemo.ndk;

/**
 * Created by wyx on 2016/7/2.
 */
public class JNIUtils {
    public static native String getStringFormC();
    static {
        System.loadLibrary("NDKJNIDemo");
    }
}
