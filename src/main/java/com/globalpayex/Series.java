package com.globalpayex;

public class Series {
    public static String evenSeries(int n) {
        String result = "";
        for (var i = 0; i <=n; i = i + 2) {
            result += i;
            if (i < n - 1) {
                result += ",";
            }
        }
        return result;
    }
}