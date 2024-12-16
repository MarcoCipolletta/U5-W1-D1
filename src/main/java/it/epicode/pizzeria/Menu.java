package it.epicode.pizzeria;


import it.epicode.pizzeria.entities.Drink;
import it.epicode.pizzeria.entities.Pizza;
import it.epicode.pizzeria.entities.Topping;
import lombok.Data;

import java.util.List;

@Data
public class Menu {

    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;
}
