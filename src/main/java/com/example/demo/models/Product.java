package com.example.demo3.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    private double price;
    private String description;

    @ManyToOne
    private Provider provider;

    @OneToMany
    private List<Subcategory> subcategories;

    @ManyToMany
    private List<Order> Orders;
}
