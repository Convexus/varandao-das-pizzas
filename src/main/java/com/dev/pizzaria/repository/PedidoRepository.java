package com.dev.pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.pizzaria.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
