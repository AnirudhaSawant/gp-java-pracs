package com.globalpayex;

public class Grader {
    public static char calculate(int marks) {
        char result;
        if (marks > 100 || marks < 0) {
            result = 'I';
        } else if (marks >= 70) {
            result = 'A';
        } else if (marks >= 60) {
            result = 'B';
        } else if (marks >= 40) {
            result = 'C';
        } else {
            result = 'F';
        }

        return result;
    }
}