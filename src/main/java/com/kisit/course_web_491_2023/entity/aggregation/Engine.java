package com.kisit.course_web_491_2023.entity.aggregation;

public class Engine {

    private Long id;
    private String name;
    private int power;

    public Engine() {}

    public Engine(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Engine(Long id, String name, int power) {
        this.id = id;
        this.name = name;
        this.power = power;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
