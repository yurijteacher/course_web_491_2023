package com.kisit.course_web_491_2023.entity.association.ManyToMany.version2;

import java.util.List;
import java.util.Set;

public class Roles {

    private Long id;
    private String name;

    private List<RolesHasClients> rolesHasClientsLists;

    public List<RolesHasClients> getRolesHasClientsLists() {
        return rolesHasClientsLists;
    }

    public void setRolesHasClientsLists(List<RolesHasClients> rolesHasClientsLists) {
        this.rolesHasClientsLists = rolesHasClientsLists;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Roles() {
    }

    public Roles(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
