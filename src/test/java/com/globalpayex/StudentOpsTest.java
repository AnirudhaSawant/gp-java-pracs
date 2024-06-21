package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentOpsTest {
    @Test
    void testGetDetails() {
        String name = "mehul";
        char gender = 'm';
        int roll = 10;
        int marks = 75;
        String expected = "Name: mehul\nGender: m\nRoll: 10\nMarks: 75";

        String actual = StudentOps.getDetails(name, gender, roll, marks);
        assertEquals(expected, actual);
    }
}