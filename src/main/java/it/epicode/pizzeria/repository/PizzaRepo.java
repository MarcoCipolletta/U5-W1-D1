package it.epicode.pizzeria.repository;

import it.epicode.pizzeria.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepo extends JpaRepository<Pizza, Long> {
}
