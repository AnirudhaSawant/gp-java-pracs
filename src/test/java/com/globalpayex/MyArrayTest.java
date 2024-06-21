package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {


    @Test
    void testSetGet() {
        Integer[] arr = {5,7,10,50};
        var myArray = new MyArray<Integer>(arr);
        myArray.set(3,100);
        var expected = 100;
        var actual = myArray.get(3);

        assertEquals(expected,actual);

    }

    @Test
    void testSetGetStudent() {
        Student[] students = {
                new Student("Anirudha",58,'m',90),
                new Student("Jane",10,'f',50),
                new Student("Sheela",40,'f',80),
                new Student("Amit",6,'m',71),
        };
        var myArray = new MyArray<Student>(students);

        assertEquals("Anirudha",myArray.get(1).getName());

        myArray.set(3,new Student("Priya",20,'f',90));
        assertEquals("Priya",myArray.get(3).getName());

    }
}