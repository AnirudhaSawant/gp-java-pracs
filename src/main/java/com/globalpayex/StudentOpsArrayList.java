package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.ArrayList;

public class StudentOpsArrayList {

    public static double average(ArrayList<Student> students) {
        double sum = 0;
        for (Student element: students) {
            sum += element.marks;
        }
        return sum / students.size();
    }
}
