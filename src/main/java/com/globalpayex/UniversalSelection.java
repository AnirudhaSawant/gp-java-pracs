package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.Random;

public class UniversalSelection {

    public static <T>T surpriseMe(T[] elements) {
        Random random = new Random();
        int n = random.nextInt(elements.length);

        return elements[n];
    }

    public static void main(String[] args) {
        String[] movies = {"3 idiots","Avatar","Terminator","Robot"};
        String movie = surpriseMe(movies);

        System.out.println(movie);

        Student[] students = {
                new Student("Anirudha",58,'m',90),
                new Student("Jane",10,'f',50),
                new Student("Sheela",40,'f',80),
                new Student("Amit",6,'m',71),
        };

        Student monitor = surpriseMe(students);
        System.out.println(monitor);
    }
}
