package com.kisit.course_web_491_2023.entity.aggregation;

public class Car {

    private Long id;
    private String model;
    private Engine engine;

    public Car(Engine engine) {
        this.engine=engine;
    }

    public Car() {
    }

    public Car(Long id, String model, Engine engine) {
        this.id = id;
        this.model = model;
        this.engine = engine;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
