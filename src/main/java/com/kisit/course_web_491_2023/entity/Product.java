package com.kisit.course_web_491_2023.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categories;

}
