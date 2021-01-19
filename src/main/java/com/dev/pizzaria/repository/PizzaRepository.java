package com.dev.pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.pizzaria.model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
