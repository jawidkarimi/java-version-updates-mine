package com.cydeo.practice;

import com.cydeo.Course;

import java.util.Arrays;
import java.util.List;

public class CourseDatabase {

        public static List<Course1> getAll(){
            return  Arrays.asList(
                    new Course1("Java", "100", 70),
                    new Course1("Python", "101", 86),
                    new Course1("C#", "102", 99),
                    new Course1("C#", "103", 95)
            );
        }
    }

