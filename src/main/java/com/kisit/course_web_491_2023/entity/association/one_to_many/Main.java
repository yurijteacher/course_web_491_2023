package com.kisit.course_web_491_2023.entity.association.one_to_many;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // psvm
    public static void main(String[] args) {
        Category categoryCar = new Category(1L, "car", "asda");

        Product car1 = new Product(1L, "BMW-7","asdsa",20000, categoryCar);
        Product car2 = new Product(2L, "BMW-5","asfasa",25000, categoryCar);
        Product car3 = new Product(3L, "BMW-3","wqeee",15000, categoryCar);

        System.out.println(car1 + ", " +car2 + ", " + car3);


        List<Product> productList = new ArrayList<>();
        productList.add(car1);
        productList.add(car2);
        productList.add(car3);

        System.out.println(productList);





    }
}
