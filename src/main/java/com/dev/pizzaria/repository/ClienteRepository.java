package com.dev.pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.pizzaria.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	Cliente findByTelefone(String telefone);

	Cliente findByCelular(String celular);
}
