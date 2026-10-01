package com.example;

public class StudentApp {

    public static String getStudentDetails() {
        return "Student Name: Shri\n" +
               "Course: B.Tech\n" +
               "Department: Computer Science";
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Student Management App!");
        System.out.println(getStudentDetails());
    }
}