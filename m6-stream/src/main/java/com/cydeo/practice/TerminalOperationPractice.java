package com.cydeo.practice;

public class TerminalOperationPractice {
    public static void main(String[] args) {

        boolean isEligible=CourseDatabase.getAll().stream()
                .allMatch(course1 -> course1.getScore()<95);

        System.out.println(isEligible);

        boolean hasAnyMatch=CourseDatabase.getAll().stream()
                .anyMatch(course1 -> course1.getScore()<95);



        System.out.println(hasAnyMatch);


    }
}
