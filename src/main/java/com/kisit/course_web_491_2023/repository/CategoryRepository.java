package com.kisit.course_web_491_2023.repository;

import com.kisit.course_web_491_2023.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// CRUD
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    Category findByName(String name);

}
