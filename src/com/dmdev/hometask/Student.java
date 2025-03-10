package com.dmdev.hometask;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String surname;
    private int courseNumber;
    List<Integer> estimate = new ArrayList<>();

    public Student(String name, String surname, int courseNumber, List<Integer> grades) {
        this.name = name;
        this.surname = surname;
        this.courseNumber = courseNumber;
        this.estimate = grades;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public List<Integer> getEstimate() {
        return estimate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setEstimate(List<Integer> estimate) {
        this.estimate = estimate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", courseNumber=" + courseNumber +
                ", grades=" + estimate +
                '}';
    }


}
