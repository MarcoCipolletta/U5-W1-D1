package it.epicode.pizzeria.configurations;

import it.epicode.pizzeria.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ToppingConfiguration {

    @Bean
    public Topping tomato() {
        Topping topping = new Topping();
        topping.setName("Tomato");
        topping.setPrice(0.5);
        topping.setCalories(50);
        return topping;
    }

    @Bean
    public Topping mozzarella() {
        Topping topping = new Topping();
        topping.setName("Mozzarella");
        topping.setPrice(1.0);
        topping.setCalories(100);
        return topping;
    }

    @Bean
    public Topping pineapple() {
        Topping topping = new Topping();
        topping.setName("Pineapple");
        topping.setPrice(2.0);
        topping.setCalories(50);
        return topping;
    }

    @Bean
    public Topping ham() {
        Topping topping = new Topping();
        topping.setName("Ham");
        topping.setPrice(3.0);
        topping.setCalories(200);
        return topping;
    }

    @Bean
    public Topping salami() {
        Topping topping = new Topping();
        topping.setName("Salami");
        topping.setPrice(4.0);
        topping.setCalories(300);
        return topping;
    }

    @Bean
    public Topping onions() {
        Topping topping = new Topping();
        topping.setName("Onions");
        topping.setPrice(0.5);
        topping.setCalories(50);
        return topping;
    }
}
