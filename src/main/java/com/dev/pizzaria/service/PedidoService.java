package com.dev.pizzaria.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dev.pizzaria.model.Acompanhamento;
import com.dev.pizzaria.model.Pedido;
import com.dev.pizzaria.model.Pizza;

@Service
public class PedidoService implements Serializable{
	private static final long serialVersionUID = 1L;

	private Double total = 0.00;

	public Pedido calcularTotal(Pedido pedido) {
		List<Pizza> pizzas = pedido.getPizza();
		pizzas.forEach(pizza -> {
			//o valor das pizzas é dado pelo tamanho idependente do sabor ou de qnts metades tem
		 	total = total + pizza.getTamanho().getValor();
		 	// para adicionar borda custa R$5 independente do sabor da borda
		 	if(pizza.getComOuSemBorda()) total = total + 5.00;
		 	
		 	List<Acompanhamento> acompanhamentos = pedido.getAcompanhamento();
		 	acompanhamentos.forEach(acompanhamento ->{
		 		total = total + acompanhamento.getValor();
		 	});
		});
		pedido.setDataPedido(new Date());
		pedido.setTotal(total);
		total = 0.00;
		return pedido;
	}
	
}
