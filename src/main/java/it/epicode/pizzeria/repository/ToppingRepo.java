package it.epicode.pizzeria.repository;

import it.epicode.pizzeria.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepo extends JpaRepository<Topping,Long> {
}
