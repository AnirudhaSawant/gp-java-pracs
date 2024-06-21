package com.globalpayex.college.entities;

import com.globalpayex.StudentOps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeEach
    void init() {
        Student.count = 0;
    }

    @Test
    void testObjectCreation() {

        assertEquals(0,Student.count);
        var s1 = new Student();
        var s2 = new Student();

        assertTrue(s1 != s2);
        assertNotNull(s1.name);
        assertNotNull(s2.name);
        assertEquals(-1, s1.roll);
        assertEquals(-1, s2.roll);

        s1.roll = 10;
        s2.roll = 13;
        assertEquals(10, s1.roll);
        assertEquals(13, s2.roll);
        assertEquals(2,Student.count);
    }

    @Test
    void testGetDetails() {
        var s1 = new Student("jane",10,'f',90);
//        s1.name = "jane";
//        s1.roll = 10;
//        s1.gender = 'f';
//        s1.marks = 90;
        String expected = "Name: jane\nGender: f\nRoll: 10\nMarks: 90";

        String actual = s1.getDetails();
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateGrade() {
        var s1 = new Student();
        s1.name = "jane";
        s1.roll = 10;
        s1.setGender('f');
        s1.marks = 65;
        char expected = 'B';

        char actual = s1.calculateGrade();
        assertEquals(expected, actual);

        int i = 10;
        System.out.println(i);
        System.out.println(s1);
    }

    @Test
    void testNewWayOfCreatingObject() {
        var s = Student.createInstance("jane",10,'f',90);

        String expected = "Name: jane\nGender: f\nRoll: 10\nMarks: 90";

        String actual = s.getDetails();
        assertEquals(expected, actual);
    }

    @Test
    void testValidTest() {
        var s = new Student();
        s.setGender('x');

        assertNotEquals('x',s.getGender());

        s.setGender('m');
        assertEquals('m',s.getGender());

        s.setGender('f');
        assertEquals('f',s.getGender());

        var s1 = Student.createInstance("jane",10,'x',90);
        assertNotEquals('x',s.getGender());
    }
}