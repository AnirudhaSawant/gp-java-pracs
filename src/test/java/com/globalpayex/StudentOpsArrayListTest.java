package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class StudentOpsArrayListTest {

    @Test
    void testAverage() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Anirudha",58,'m',90));
        students.add(new Student("Jane",10,'f',50));
        students.add(new Student("Sheela",40,'f',80));
        students.add(new Student("Amit",6,'m',71));

        double expected = 72.75;
        double actual = StudentOpsArrayList.average(students);

        assertEquals(expected,actual);
    }

}