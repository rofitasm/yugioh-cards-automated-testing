package com.rofitasm.utils;

public class DataProcessUtility {
    public static String filterAlphabets(String str) {
        str = str.replaceAll(
                "[^a-zA-Z]", "");
        return str;
    }
}
