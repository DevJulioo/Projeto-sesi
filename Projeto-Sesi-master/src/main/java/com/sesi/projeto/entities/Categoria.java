package com.sesi.projeto.entities;

import com.sesi.projeto.dto.CategoriaDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_categoria")
public class Categoria {
	
	private Long id;
	private String nome;
	
	public Categoria() {
		
	}
	
	public Categoria(CategoriaDTO c) {
		this.nome = c.nome();
	}
	
	public Categoria(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
