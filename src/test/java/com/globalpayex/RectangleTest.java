package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void perimeter() {
        // test data
        var length = 10;
        var breadth = 4;
        var expected = 28.0;

        // test steps
        var actual = Rectangle.perimeter(length, breadth);

        // test assertions
        assertEquals(expected, actual);
    }

    @Test
    void area() {
        // test data
        var length = 10;
        var breadth = 4;
        var expected = 40.0;

        // test steps
        var actual = Rectangle.area(length, breadth);

        // test assertions
        assertEquals(expected, actual);
    }
}