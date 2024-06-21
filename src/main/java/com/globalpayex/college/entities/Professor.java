package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;

public class Professor extends CollegeUsers implements SalariedIndividual {

    private String[] subjects;
    private int numberOfWork;
    private int costPerDay;
    static int count;


    public Professor(String name, char gender, String[] subjects, int numberOfWork, int costPerDay) {
        super(name, gender);
        Professor.count++;
        this.subjects = subjects;
        this.numberOfWork = numberOfWork;
        this.costPerDay = costPerDay;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public int getDaysWorkedInMonth() {
        return this.numberOfWork;
    }

    @Override
    public int getCommercialsPerDay() {
        return this.costPerDay;
    }
}
