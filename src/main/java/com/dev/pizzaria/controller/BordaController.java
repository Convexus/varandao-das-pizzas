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

import com.dev.pizzaria.model.Borda;
import com.dev.pizzaria.repository.BordaRepository;

@RestController
@RequestMapping("/borda")
public class BordaController implements Serializable{
	private static final long serialVersionUID = 1L;

	@Autowired BordaRepository bordaRepository;
	
	@GetMapping("/all")
	public List<Borda> all(){
		return bordaRepository.findAll();
	}

	@PostMapping("/new")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void newBorda(@RequestBody Borda borda) {
		bordaRepository.save(borda);
	}
}
