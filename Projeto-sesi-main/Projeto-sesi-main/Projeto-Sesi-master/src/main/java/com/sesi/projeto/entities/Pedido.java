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
	
	private Long id;
	private Instant momento;
	public String status;
	
	public Pedido() {
		
	}
	
	public Pedido(PedidoDTO d) {
		this.momento = d.momento();
	}
	
	public Pedido(Long id, Instant momento, String status) {
		this.momento = momento;
		this.id = id;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	

}
