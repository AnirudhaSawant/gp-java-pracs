package com.globalpayex.college.entities;

import com.abc.salary.SalaryCalculator;
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
        var p1 = new Professor("Amit",'m',subject,15,5000);
        var p2 = new Professor("Amit",'m',subject,22,6000);

        assertEquals(2,Professor.count);


        String expected = "Name: Amit\nGender: m";

        String actual = p1.getDetails();
        assertEquals(expected, actual);
    }

    @Test
    void testProfessorDetails() {
        String[] subject = {"english","Maths"};
        var p1 = new Professor("Amit",'m',subject,15,5000);

        String expected = "Name: Amit\nGender: m";

        String actual = p1.getDetails();
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateProfessorSalary() {
        String[] subject = {"english","Maths"};
        var p1 = new Professor("Amit",'m',subject,15,5000);

        var expected = 67320.0;
        var actual = SalaryCalculator.calculate(p1);

        assertEquals(expected,actual);

        // Using interface
        actual = p1.calculate();
        assertEquals(expected,actual);

    }
}