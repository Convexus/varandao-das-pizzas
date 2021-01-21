package com.dev.pizzaria.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tamanho implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Tamanho;
	private Double valor;
	@ManyToMany
	private List<Acompanhamento> acompanhamentos;
	
	public Tamanho() {}

	public Tamanho(Integer id, String tamanho, Double valor, List<Acompanhamento> acompanhamentos) {
		super();
		this.id = id;
		Tamanho = tamanho;
		this.valor = valor;
		this.acompanhamentos = acompanhamentos;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTamanho() {
		return Tamanho;
	}
	public void setTamanho(String tamanho) {
		Tamanho = tamanho;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public List<Acompanhamento> getAcompanhamentos() {
		return acompanhamentos;
	}
	public void setAcompanhamentos(List<Acompanhamento> acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Tamanho == null) ? 0 : Tamanho.hashCode());
		result = prime * result + ((acompanhamentos == null) ? 0 : acompanhamentos.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		Tamanho other = (Tamanho) obj;
		if (Tamanho == null) {
			if (other.Tamanho != null)
				return false;
		} else if (!Tamanho.equals(other.Tamanho))
			return false;
		if (acompanhamentos == null) {
			if (other.acompanhamentos != null)
				return false;
		} else if (!acompanhamentos.equals(other.acompanhamentos))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tamanho [id=" + id + ", Tamanho=" + Tamanho + ", valor=" + valor + ", acompanhamentos="
				+ acompanhamentos + "]";
	}	
}
