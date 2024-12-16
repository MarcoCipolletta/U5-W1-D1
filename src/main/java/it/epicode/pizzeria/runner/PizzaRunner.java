package it.epicode.pizzeria.runner;

import it.epicode.pizzeria.entities.Pizza;
import it.epicode.pizzeria.repository.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class PizzaRunner implements ApplicationRunner {

    @Autowired
    private PizzaRepo pizzaRepo;

    @Autowired
    private Pizza margherita;

    @Autowired
    private Pizza pizzasalami;

    @Autowired
    private Pizza hawaiian;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        pizzaRepo.save(margherita);
        pizzaRepo.save(pizzasalami);
        pizzaRepo.save(hawaiian);
    }
}
