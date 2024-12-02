package com.example.demo3.Repository;

import com.example.demo3.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByTitle(String title);
    List<Category> findCategoryByDescriptionAndTitle(String description,String title);


}
