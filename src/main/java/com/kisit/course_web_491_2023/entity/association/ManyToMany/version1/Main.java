package com.kisit.course_web_491_2023.entity.association.ManyToMany.version1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Role role =  new Role(1L, "user");
        Role role1 = new Role(2L, "admin");
        Role role2 = new Role(3L, "manager");

        Clients clients = new Clients();
        clients.setId(1L);
        clients.setLogin("Vasya");
        clients.setPass("1234");

        Set<Role> roleList = new HashSet<>();
        roleList.add(role);
        roleList.add(role1);

        clients.setRoles(roleList);

        System.out.println(clients);

    }
}
