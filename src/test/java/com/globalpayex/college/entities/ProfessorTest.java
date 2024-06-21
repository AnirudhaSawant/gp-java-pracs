package com.globalpayex.college.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @BeforeEach
    void init() {
        Professor.count = 0;
    }

    @Test
    void testProfessorCount() {
        assertEquals(0,Professor.count);
        String[] subject = {"english","Maths"};
        var p1 = new Professor("Amit",'m',subject);
        var p2 = new Professor("Amit",'m',subject);

        assertEquals(2,Professor.count);


        String expected = "Name: Amit\nGender: m";

        String actual = p1.getDetails();
        assertEquals(expected, actual);
    }
}