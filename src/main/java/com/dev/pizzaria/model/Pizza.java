package com.dev.pizzaria.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.dev.pizzaria.model.enu.Tamanho;

@Entity
public class Pizza implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private Tamanho tamanho;
	private Integer qntSabores;
	private Boolean comOuSemBorda;

	public Pizza() {}

	public Pizza(Integer id, Tamanho tamanho, Integer qntSabores, Boolean comOuSemBorda) {
		super();
		this.id = id;
		this.tamanho = tamanho;
		this.qntSabores = qntSabores;
		this.comOuSemBorda = comOuSemBorda;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Tamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}
	public Integer getQntSabores() {
		return qntSabores;
	}
	public void setQntSabores(Integer qntSabores) {
		this.qntSabores = qntSabores;
	}
	public Boolean getComOuSemBorda() {
		return comOuSemBorda;
	}
	public void setComOuSemBorda(Boolean comOuSemBorda) {
		this.comOuSemBorda = comOuSemBorda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comOuSemBorda == null) ? 0 : comOuSemBorda.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((qntSabores == null) ? 0 : qntSabores.hashCode());
		result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
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
		Pizza other = (Pizza) obj;
		if (comOuSemBorda == null) {
			if (other.comOuSemBorda != null)
				return false;
		} else if (!comOuSemBorda.equals(other.comOuSemBorda))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (qntSabores == null) {
			if (other.qntSabores != null)
				return false;
		} else if (!qntSabores.equals(other.qntSabores))
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", tamanho=" + tamanho + ", qntSabores=" + qntSabores + ", comOuSemBorda=" + comOuSemBorda + "]";
	}		
}
