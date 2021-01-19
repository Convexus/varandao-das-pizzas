package com.dev.pizzaria.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.pizzaria.model.Pedido;
import com.dev.pizzaria.repository.PedidoRepository;
import com.dev.pizzaria.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Autowired PedidoRepository pedidoRepository;
	@Autowired PedidoService pedidoService;

	@GetMapping("/all")
	public List<Pedido> all() {
		return pedidoRepository.findAll();
	}

	@PostMapping("/new")
	public ResponseEntity<Pedido> newPedido(@RequestBody Pedido pedido) {
		Pedido pedidoSalvo = pedidoRepository.save(pedidoService.calcularTotal(pedido));
		return pedidoSalvo != null ? ResponseEntity.ok(pedidoSalvo)
				: ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

	}
}
