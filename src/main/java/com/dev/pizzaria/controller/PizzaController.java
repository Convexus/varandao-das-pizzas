package com.dev.pizzaria.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dev.pizzaria.model.Pizza;
import com.dev.pizzaria.repository.PizzaRepository;

@RestController
@RequestMapping("/pizza")
public class PizzaController implements Serializable{
	private static final long serialVersionUID = 1L;

	@Autowired PizzaRepository pizzaRepository;
	
	@GetMapping("/all")
	public List<Pizza> all(){
		return pizzaRepository.findAll();
	}
	
	@PostMapping("/new")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void newPizza(@RequestBody Pizza pizza) {
		pizzaRepository.save(pizza);
	}
}
