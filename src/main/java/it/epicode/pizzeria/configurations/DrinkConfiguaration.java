package it.epicode.pizzeria.configurations;

import it.epicode.pizzeria.entities.Drink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DrinkConfiguaration {

    @Bean
    public Drink cocaCola() {
        Drink drink = new Drink();
        drink.setName("Coca-Cola");
        drink.setPrice(2.5);
        drink.setCalories(140);
        return drink;
    }

    @Bean
    public Drink water() {
        Drink drink = new Drink();
        drink.setName("Water");
        drink.setPrice(1.0);
        drink.setCalories(0);
        return drink;
    }

    @Bean
    public Drink lemonade() {
        Drink drink = new Drink();
        drink.setName("Lemonade");
        drink.setPrice(3.0);
        drink.setCalories(150);
        return drink;
    }

    @Bean
    public Drink wine() {
        Drink drink = new Drink();
        drink.setName("Wine");
        drink.setPrice(5.0);
        drink.setCalories(200);
        return drink;
    }
}
