package com.kisit.course_web_491_2023.entity.association.ManyToMany.version1;

import java.util.Set;

public class Role {

    private Long id;
    private String name;
    private Set<Clients> clientsSet;

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

    public Set<Clients> getClientsSet() {
        return clientsSet;
    }

    public void setClientsSet(Set<Clients> clientsSet) {
        this.clientsSet = clientsSet;
    }

    public Role() {
    }

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
