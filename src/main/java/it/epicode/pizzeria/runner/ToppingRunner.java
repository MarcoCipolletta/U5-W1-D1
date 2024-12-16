package it.epicode.pizzeria.runner;

import it.epicode.pizzeria.entities.Topping;
import it.epicode.pizzeria.repository.ToppingRepo;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Order(1)
public class ToppingRunner implements ApplicationRunner {
    @Autowired
    private ToppingRepo toppingRepo;

    @Autowired
    private Topping tomato;

    @Autowired
    private Topping mozzarella;

    @Autowired
    private Topping pineapple;

    @Autowired
    private Topping ham;

    @Autowired
    private Topping salami;

    @Autowired
    private Topping onions;

    @Autowired
    private ObjectProvider<Topping> toppingProvider;


    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        toppingRepo.save(tomato);
        toppingRepo.save(mozzarella);
        toppingRepo.save(pineapple);
        toppingRepo.save(ham);
        toppingRepo.save(salami);
        toppingRepo.save(onions);
    }
}
