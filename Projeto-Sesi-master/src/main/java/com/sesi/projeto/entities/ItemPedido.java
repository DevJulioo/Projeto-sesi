package com.sesi.projeto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_item")
public class ItemPedido {

	private Integer quantidade;
	private double preco;
	
	public ItemPedido() {
		
	}
	
	public ItemPedido(ItemPedido i) {
		this.quantidade = i.quantidade;
		this.preco = i.preco;
	}
	
	public ItemPedido(Integer quantidade, double preco) {
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}


