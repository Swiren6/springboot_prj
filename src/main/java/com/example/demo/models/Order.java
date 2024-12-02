package com.example.demo3.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)



    private int id;
    private int ref;
    private double price;
    private String date;

    @ManyToOne()
    private Customer customer;
    @ManyToMany
    private List<Product> products;
}
