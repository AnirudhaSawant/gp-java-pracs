package com.globalpayex;

public class ArrayOps {
    public static int calculateAverage(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        return sum / arr.length;
    }

    public static int calculateMax(int[] arr) {
        int max = arr[0];

        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static int nextGenSum(int... elements) {
        int sum = 0;
        for(int ele : elements) {
            sum += ele;
        }
        return sum;
    }
}
