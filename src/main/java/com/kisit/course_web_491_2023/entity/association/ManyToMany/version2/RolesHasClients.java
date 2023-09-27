package com.kisit.course_web_491_2023.entity.association.ManyToMany.version2;

public class RolesHasClients {

    private Roles roles;
    private Clients clients;

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public RolesHasClients() {
    }

    public RolesHasClients(Roles roles, Clients clients) {
        this.roles = roles;
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "RolesHasClients{" +
                "roles=" + roles +
                ", clients=" + clients +
                '}';
    }
}
