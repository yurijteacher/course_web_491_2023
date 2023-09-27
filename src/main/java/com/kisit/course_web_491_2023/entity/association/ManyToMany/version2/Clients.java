package com.kisit.course_web_491_2023.entity.association.ManyToMany.version2;

import java.util.List;
import java.util.Set;

public class Clients {

    private Long id;
    private String login;
    private String pass;

    private List<RolesHasClients> rolesHasClientsList;
    public List<RolesHasClients> getRolesHasClientsList() {
        return rolesHasClientsList;
    }

    public void setRolesHasClientsList(List<RolesHasClients> rolesHasClientsList) {
        this.rolesHasClientsList = rolesHasClientsList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public Clients(Long id, String login, String pass) {
        this.id = id;
        this.login = login;
        this.pass = pass;
    }
}
