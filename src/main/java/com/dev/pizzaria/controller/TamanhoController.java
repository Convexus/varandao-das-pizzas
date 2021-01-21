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
import com.dev.pizzaria.model.Tamanho;
import com.dev.pizzaria.repository.TamanhoRepository;

@RestController
@RequestMapping("/tamanho")
public class TamanhoController implements Serializable{
	private static final long serialVersionUID = 1L;

	@Autowired TamanhoRepository tamanhoRepository;
	
	@GetMapping("/all")
	public List<Tamanho> all(){
		return tamanhoRepository.findAll();
	}

	@GetMapping("/allAcompanhamento")
	public List<Tamanho> allAcompanhamento(){
		List<Tamanho> tamanhos = tamanhoRepository.findAll();
		tamanhos.forEach(tamanho->{
			List<Acompanhamento> acompanhamentos = tamanho.getAcompanhamentos();
			acompanhamentos.forEach(acompanhamento->{
				acompanhamento.setValor(0.00);
			});
			tamanho.setAcompanhamentos(acompanhamentos);
		});
		System.out.println(tamanhos);
		return tamanhos;
	}

	@PostMapping("/new")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void newTamanho(@RequestBody Tamanho tamanho) {
		tamanhoRepository.save(tamanho);
	}
}
