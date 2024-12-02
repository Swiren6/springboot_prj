package com.example.demo3.Services;


import com.example.demo3.Models.Subcategory;
import com.example.demo3.Repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubcategoryService {

    private final SubcategoryRepository subcategoryRepository;

    @Autowired
    public SubcategoryService(SubcategoryRepository subcategoryRepository) {
        this.subcategoryRepository = subcategoryRepository;
    }

    public Subcategory createSubcategory(Subcategory subcategory) {
        return subcategoryRepository.save(subcategory);
    }

    public List<Subcategory> getAllSubcategories() {
        return subcategoryRepository.findAll();
    }

    public Optional<Subcategory> getSubcategoryById(Long id) {
        return subcategoryRepository.findById(id);
    }
    public Subcategory updateSubcategory(Subcategory subcategory) {
        return subcategoryRepository.save(subcategory);
    }
    public void deleteSubcategoryById(Long id) {
        subcategoryRepository.deleteById(id);
    }
}
