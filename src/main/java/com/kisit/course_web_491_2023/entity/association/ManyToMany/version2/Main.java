package com.kisit.course_web_491_2023.entity.association.ManyToMany.version2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Roles role1 = new Roles(1L, "user");
        Roles role2 = new Roles(2L, "admin");
        Roles role3 = new Roles(2L, "manager");

        Clients client1 = new Clients(1L, "Vasya","1234");
        Clients client2 = new Clients(2L, "Ivanka","4321");

        RolesHasClients rolesHasClients1 =  new RolesHasClients(role1,client1);
        RolesHasClients rolesHasClients2 =  new RolesHasClients(role2,client1);

        RolesHasClients rolesHasClients3 = new RolesHasClients(role3, client2);
        RolesHasClients rolesHasClients4 = new RolesHasClients(role2, client2);


        List<RolesHasClients> rolesHasClientsList = new ArrayList<>();

        rolesHasClientsList.add(rolesHasClients1);
        rolesHasClientsList.add(rolesHasClients2);
        rolesHasClientsList.add(rolesHasClients3);
        rolesHasClientsList.add(rolesHasClients4);

        System.out.println(rolesHasClientsList);



    }
}
