package com.kisit.course_web_491_2023.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
@Table(name = "customer")
public class Customer {

    @Id // PK NN
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AI
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private int age;
    private String phone;
    private String email;

    @OneToOne
    @MapKey
    @MapsId
    @JoinColumn(name = "id")
    private Users user;
}
