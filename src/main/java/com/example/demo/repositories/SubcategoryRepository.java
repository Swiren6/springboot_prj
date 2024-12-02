package com.example.demo3.Repository;


import com.example.demo3.Models.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {
    List<Subcategory> findByTitle(String title);
    List<Subcategory> findByCategory_Id(Long categoryId);
}

