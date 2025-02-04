package com.sesi.projeto.entities;

import java.time.Instant;

import com.sesi.projeto.dto.PagamentoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_pagamento")
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private Instant momento;
	
	public Pagamento() {
		
	}
	
	public Pagamento(PagamentoDTO p) {
		this.momento = p.momento();
	}
	
	public Pagamento(Instant momento, Long id) {
		this.id = id;
		this.momento = momento;
	}
}
