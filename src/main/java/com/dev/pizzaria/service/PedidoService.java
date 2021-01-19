package com.dev.pizzaria.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.pizzaria.model.Pedido;
import com.dev.pizzaria.model.Pizza;
import com.dev.pizzaria.model.Sabor;

@Service
public class PedidoService implements Serializable{
	private static final long serialVersionUID = 1L;

	private Double novoTotal = 0.00;
	
	public Pedido calcularTotal(Pedido pedido) {
		List<Pizza> pizzas = pedido.getPizza();
		pizzas.forEach(pizza -> {
			List<Sabor> sabores = pizza.getSabor();
			sabores.forEach(sabor -> {
				novoTotal = novoTotal + sabor.getValor();
			});
		});
		
		pedido.setDataPedido(new Date());
		pedido.setTotal(novoTotal);
		
		return pedido;
	}
}
