package it.epicode.pizzeria.repository;

import it.epicode.pizzeria.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepo extends JpaRepository<Drink, Long> {
}
