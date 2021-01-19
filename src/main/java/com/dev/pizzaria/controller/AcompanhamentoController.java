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

import com.dev.pizzaria.model.Acompanhamento;
import com.dev.pizzaria.repository.AcompanhamentoRepository;

@RestController
@RequestMapping("/acompanhamento")
public class AcompanhamentoController implements Serializable{
	private static final long serialVersionUID = 1L;

	@Autowired AcompanhamentoRepository acompanhamentoRepository;
	
	@GetMapping("/all")
	public List<Acompanhamento> all(){
		return acompanhamentoRepository.findAll();
	}
	
	@PostMapping("/new")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void newAcompanhamento(@RequestBody Acompanhamento acompanhamento) {
		acompanhamentoRepository.save(acompanhamento);
	}
}
