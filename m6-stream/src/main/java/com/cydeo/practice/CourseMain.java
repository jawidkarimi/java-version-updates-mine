package com.cydeo.practice;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.util.Comparator;
import java.util.Optional;

import static java.util.Comparator.comparing;

public class CourseMain {
    public static void main(String[] args) {

//        CourseDatabase.getAll().stream()
//                .filter(c->c.getCourseId().equals("102"))
//                .map(Course1::getCourseName)
//                .forEach(System.out::println);
//
//        CourseDatabase.getAll().stream()
//                .map(Course1::getCourseName)
//                .map(String::length)
//                .limit(2)
//                .forEach(System.out::println);
//
//        CourseDatabase.getAll().stream()
//                .map(Course1::getCourseName)
//                .distinct()
//                .sorted((String::compareTo))
//                .forEach(System.out::println);

        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories()<=1000);
        System.out.println(isHealthy);

        boolean isHealthy2=DishData.getAll().stream()
                .anyMatch(Dish::isVegetarian);
        System.out.println(isHealthy2);

        boolean isHealthy3=DishData.getAll().stream()
                .noneMatch(dish -> dish.getType().equals(Type.FISH));
        System.out.println(isHealthy3);

        Optional<Dish> dishMax=DishData.getAll().stream()
                .max(Comparator.comparing(dish -> dish.getCalories()));
        System.out.println(dishMax.get());

        Optional<Dish> dishMin=DishData.getAll().stream()
                .min(Comparator.comparing(dish -> dish.getCalories()));
        System.out.println(dishMin.get());

        Optional<Dish> findAnyDish=DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .findAny();
        System.out.println(findAnyDish.get());

        Optional<Dish> findFirstDish=DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .findFirst();
        System.out.println(findFirstDish.get());


        Optional<Dish> findAnyDish1=DishData.getAll().parallelStream()
                .filter(dish -> dish.getCalories()>300)
                .findAny();
        System.out.println(findAnyDish1.get());

        Optional<Dish> findFirstDish2=DishData.getAll().parallelStream()
                .filter(dish -> dish.getCalories()>300)
                .findFirst();
        System.out.println(findFirstDish2.get());









    }
}
