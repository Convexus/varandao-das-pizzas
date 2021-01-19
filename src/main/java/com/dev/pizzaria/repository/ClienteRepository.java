package com.dev.pizzaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.pizzaria.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	Cliente findByTelefone(Long telefone);

	Cliente findByCelular(Long celular);
	
	@Query(value = "SELECT * FROM Cliente c JOIN Endereco e WHERE e.logradouro LIKE %?1% AND e.cliente_id = c.id", nativeQuery = true)
	List<Cliente> findByEndereco(String logradouro);

}
