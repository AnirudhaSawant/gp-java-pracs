package com.globalpayex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayArrayList {

    public static void main(String[] args) {
        var nos = Arrays.asList(10,4,1,9,8,7);
//        for(Integer n : nos) {
//            if(n > 4 && n % 2 == 0) {
//                System.out.println(n);
//            }
//        }
        nos.forEach(element -> {
            if(element % 2 == 0 && element > 4) {
                System.out.println(element);
            }
        });

        var names = Arrays.asList("anirudha","amit","aman","tanmay","yash");

        names.forEach(element -> {
            if(element.length() <= 5) {
                System.out.println(element.toLowerCase());
            }
            else {
                System.out.println(element.toUpperCase());
            }
        });
    }
}
