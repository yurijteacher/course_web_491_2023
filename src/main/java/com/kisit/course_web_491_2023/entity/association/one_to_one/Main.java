package com.kisit.course_web_491_2023.entity.association.one_to_one;

public class Main {

    public static void main(String[] args) {
        Client client = new Client(1L, "vasya", "1234");
        Customer customer = new Customer(1L, "Vasya", "Pypkin", 18, client);


        System.out.println(customer);



    }
}
