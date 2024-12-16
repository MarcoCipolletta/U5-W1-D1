package it.epicode.pizzeria.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Data
@Entity
@Table(name = "pizze")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @ManyToMany
    private ArrayList<Topping> toppings = new ArrayList<>();
    private double price;
    private int calories;

}
