package com.kisit.course_web_491_2023.entity.aggregation;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine(1L, "BMW-3000", 2500);

        Car car = new Car(1L, "BMW-7", engine);

        Car car1 = new Car(2L, "BMW-9",engine);

        Engine engine1 = new Engine(2L, "BMW-5000", 3000);

        car.setEngine(engine1);


        System.out.println(car);

        System.out.println(car1);


    }
}
