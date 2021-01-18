package com.dev.pizzaria.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dev.pizzaria.model.Endereco;
import com.dev.pizzaria.repository.ClienteRepository;
import com.dev.pizzaria.repository.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecoController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Autowired EnderecoRepository enderecoRepository;
	@Autowired ClienteRepository clienteRepository;

	@PostMapping("/new/{idCliente}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void newEndereco(@RequestBody Endereco endereco, @PathVariable Integer idCliente){
		endereco.setCliente(clienteRepository.findById(idCliente).orElseThrow());
		enderecoRepository.save(endereco);
	}
}	
