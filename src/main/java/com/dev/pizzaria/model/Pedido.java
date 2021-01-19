package com.dev.pizzaria.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Boolean comAcompanhamento;
	@ManyToMany
	private List<Acompanhamento> acompanhamento;
	@ManyToMany
	private List<Pizza> pizza;
	private Double total;
	@OneToOne
	private Cliente cliente;
	private Date dataPedido;
	
	public Pedido() {}

	public Pedido(Integer id, Boolean comAcompanhamento, List<Acompanhamento> acompanhamento, List<Pizza> pizza,
			Double total, Cliente cliente, Date dataPedido) {
		super();
		this.id = id;
		this.comAcompanhamento = comAcompanhamento;
		this.acompanhamento = acompanhamento;
		this.pizza = pizza;
		this.total = total;
		this.cliente = cliente;
		this.dataPedido = dataPedido;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getComAcompanhamento() {
		return comAcompanhamento;
	}
	public void setComAcompanhamento(Boolean comAcompanhamento) {
		this.comAcompanhamento = comAcompanhamento;
	}
	public List<Acompanhamento> getAcompanhamento() {
		return acompanhamento;
	}
	public void setAcompanhamento(List<Acompanhamento> acompanhamento) {
		this.acompanhamento = acompanhamento;
	}
	public List<Pizza> getPizza() {
		return pizza;
	}
	public void setPizza(List<Pizza> pizza) {
		this.pizza = pizza;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acompanhamento == null) ? 0 : acompanhamento.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((comAcompanhamento == null) ? 0 : comAcompanhamento.hashCode());
		result = prime * result + ((dataPedido == null) ? 0 : dataPedido.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pizza == null) ? 0 : pizza.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (acompanhamento == null) {
			if (other.acompanhamento != null)
				return false;
		} else if (!acompanhamento.equals(other.acompanhamento))
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (comAcompanhamento == null) {
			if (other.comAcompanhamento != null)
				return false;
		} else if (!comAcompanhamento.equals(other.comAcompanhamento))
			return false;
		if (dataPedido == null) {
			if (other.dataPedido != null)
				return false;
		} else if (!dataPedido.equals(other.dataPedido))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pizza == null) {
			if (other.pizza != null)
				return false;
		} else if (!pizza.equals(other.pizza))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", comAcompanhamento=" + comAcompanhamento + ", acompanhamento=" + acompanhamento
				+ ", pizza=" + pizza + ", total=" + total + ", cliente=" + cliente + ", dataPedido=" + dataPedido + "]";
	}
}
