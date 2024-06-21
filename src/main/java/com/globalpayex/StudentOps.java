package com.globalpayex;

public class StudentOps {
    public static String getDetails(String name, char gender, int roll, int marks) {
        return "Name: " + name + "\nGender: " + gender + "\nRoll: " + roll + "\nMarks: " + marks;
    }

    public static char calculateGrade(int marks) {
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