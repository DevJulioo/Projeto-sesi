package com.sesi.projeto.entities;

import java.time.Instant;

import com.sesi.projeto.dto.PedidoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Instant momento;
	public String status;
	private Long id;
	
	public Pedido() {
		
	}
	
	public Pedido(PedidoDTO p) {
		this.momento = p.momento();
		
	}
	
	public Pedido(Long id, Instant momento, String status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	
}
