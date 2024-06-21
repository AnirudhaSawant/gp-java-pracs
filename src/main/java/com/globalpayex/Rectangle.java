package com.globalpayex;

public class Rectangle {
    public static double perimeter(double length, double breadth) {
        var p = 2 * (length + breadth);
        return p;
    }

    public static double area(double length, double breadth) {
        var a = length * breadth;
        return a;
    }
}