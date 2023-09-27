package com.kisit.course_web_491_2023.entity.composition;

public class Car {

    private Long id;
    private String model;

    Engine engine;

    public Car() {
        this.engine = new Engine(1L, "BMW-3000",2344.23);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }



    public Car(Long id, String model) {
        this.id = id;
        this.model = model;
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
