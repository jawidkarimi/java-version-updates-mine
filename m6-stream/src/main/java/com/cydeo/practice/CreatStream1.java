package com.cydeo.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatStream1 {

    public static void main(String[] args) {

       String[] course = {"Java", "Spring", "Agile"};

        Stream<String> courseSteam=Arrays.stream(course);
        courseSteam.forEach(s -> System.out.println(s));

        List<String> courseList= Arrays.asList("Java", "Spring", "Agile");
        Stream<String> courseListStream=courseList.stream();

        Stream<Integer> streamOfNumber = Stream.of(1,2,3,4,5,6);




    }
}
