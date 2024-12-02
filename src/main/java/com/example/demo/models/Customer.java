package com.example.demo3.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer extends User{


   private String adress;
    private String city;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
