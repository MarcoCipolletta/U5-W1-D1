package it.epicode.pizzeria.configurations;

import it.epicode.pizzeria.entities.Pizza;
import it.epicode.pizzeria.entities.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class PizzaConfiguration {

    @Bean
    public Pizza margherita(Topping mozzarella,Topping tomato ){
        Pizza pizza = new Pizza();
        pizza.setName("Margherita");
        pizza.getToppings().add(tomato);
        pizza.getToppings().add(mozzarella);
        pizza.setPrice(7.99);
        pizza.setCalories(800);
        return pizza;
    }

    @Bean
    public Pizza hawaiian(Topping tomato,Topping mozzarella,Topping pineapple, Topping ham) {
      Pizza pizza = new Pizza();
      pizza.setName("Hawaiian");
      pizza.getToppings().add(tomato);
      pizza.getToppings().add(mozzarella);
      pizza.getToppings().add(pineapple);
      pizza.getToppings().add(ham);
      pizza.setPrice(9.99);
      pizza.setCalories(1000);
      return pizza;
    }

    @Bean
    public Pizza pizzasalami(Topping tomato,Topping mozzarella, Topping salami) {
        Pizza pizza = new Pizza();
        pizza.setName("Salami");
        pizza.getToppings().add(tomato);
        pizza.getToppings().add(mozzarella);
        pizza.getToppings().add(salami);
        pizza.setPrice(8.99);
        pizza.setCalories(900);
        return pizza;
    }
}
