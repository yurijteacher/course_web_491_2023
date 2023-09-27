package com.kisit.course_web_491_2023.entity.generalization;

public class Man extends People {

    public Man(Long id, String fullName, int age) {
        super(id, fullName, age);
    }

    @Override
    public void dance() {
        System.out.println("dance");
    }

    @Override
    public void print() {
        super.print();

        dance();
    }
}
