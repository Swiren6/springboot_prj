package com.example.demo3.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter

public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name="id_category")
    private Category category;

    @OneToMany
    private List<Product>Products;

}
