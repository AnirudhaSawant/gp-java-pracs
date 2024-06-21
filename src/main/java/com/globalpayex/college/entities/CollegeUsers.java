package com.globalpayex.college.entities;

public class CollegeUsers {

    protected String name;
    protected char gender;


    public CollegeUsers(String name, char gender) {
        this.name = name;
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'm' || gender == 'f') {
            this.gender = gender;
        }
    }

    @Override
    public String toString() {
        return "CollegeUsers{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public String getDetails() {
        return String.format("Name: %s\nGender: %s",this.name,this.gender);
    }

}
