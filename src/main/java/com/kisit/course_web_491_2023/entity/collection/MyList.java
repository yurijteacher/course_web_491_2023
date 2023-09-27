package com.kisit.course_web_491_2023.entity.collection;

import com.kisit.course_web_491_2023.entity.Roles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {

    public static void main(String[] args) {

        List<String> roles = List.of("User", "Manager", "Admin");

        //        roles.add("asd");

        System.out.println(roles);

        List<String> roles1 = new ArrayList<>();
        roles1.add("User");
        roles1.add("Admin");
        roles1.add("Manager");

        roles1.add("User1");
        roles1.add("User");

        System.out.println(roles1);

    }

}
