package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SearchStudent {
    public static void main(String[] args) {
//        var students = Arrays.asList(
//                new Student("Anirudha",58,'m',90),
//                new Student("Jane",10,'f',50),
//                new Student("Sheela",40,'f',80),
//                new Student("Amit",6,'m',71)
//        );

        HashMap<Integer, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(58,new Student("anirudha",58,'m',90));
        studentHashMap.put(10,new Student("Jane",10,'f',50));
        studentHashMap.put(40,new Student("Sheela",40,'f',80));
        studentHashMap.put(6,new Student("Amit",6,'m',71));

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the roll no");
        int r = sc.nextInt();

//        var studentDetail = students.stream()
//                .filter(student -> student.roll == r)
//                .findFirst();
//
//        if(studentDetail.isPresent()) {
//            System.out.println(studentDetail);
//        }
//        else{
//            System.out.println("No Student found");
//        }


//        boolean isFound = false;
//        for(Student student: students) {
//            if(student.roll == r) {
//                isFound = true;
//                System.out.println(student);
//                break;
//            }
//        }
//
//        if(!isFound) {
//            System.out.println("Not Found");
//        }

//        if(students.contains(new Student("",r,'m',0))) {
//            System.out.println("Found");
//        }
//        else{
//            System.out.println("Not Found");
//        }

        if(studentHashMap.get(r) != null) {
            System.out.println(studentHashMap.get(r));
        }
        else{
            System.out.println("Not Found");
        }
    }
}
