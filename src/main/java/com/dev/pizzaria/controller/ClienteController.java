package com.dev.pizzaria.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dev.pizzaria.model.Cliente;
import com.dev.pizzaria.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClienteController implements Serializable{
	private static final long serialVersionUID = 1L;

	@Autowired ClienteRepository clienteRepository;

	@GetMapping("/all")
	public List<Cliente> all() {
		return clienteRepository.findAll();
	}

	@GetMapping("/id/{id}")
	public Optional<Cliente> byId(@PathVariable Integer id) {
		return clienteRepository.findById(id);
	}
	
	@GetMapping("/telefone/{telefone}")
	public Cliente byTelefone(@PathVariable Long telefone) {
		return clienteRepository.findByTelefone(telefone);
	}

	@GetMapping("/celular/{celular}")
	public Cliente byCelular(@PathVariable Long celular) {
		return clienteRepository.findByCelular(celular);
	}
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/new")
	public void novo(@RequestBody Cliente cliente) {	
	 	clienteRepository.save(cliente);
	}
}
