package it.epicode.pizzeria.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "drinks")
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    private String name;
    private double price;
    private int calories;
}
