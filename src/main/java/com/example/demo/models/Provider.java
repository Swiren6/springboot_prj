package com.example.demo3.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class Provider extends User{



    private String matricule;
    private String service;
    private String company;

    @OneToMany(mappedBy = "provider")
    private List<Product> products;
}
