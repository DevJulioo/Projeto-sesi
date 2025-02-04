package com.sesi.projeto.entities;



import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Embeddable
@Entity
@Table(name="tb_item_item")
public class ItemDoPedidoPK {
	
	@EmbeddedId
	private ItemDoPedidoPK id = new ItemDoPedidoPK();
	
	private Integer quantidade;
	
	private double preco;
	
	@ManyToOne
	@JoinColumn(name="pedido_id")
	
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name="produto_id")
	private Produto produto;

	public ItemDoPedidoPK() {
		
	}

	public ItemDoPedidoPK(Pedido pedido, Produto produto, Integer quantidade, Double preco) {
		
	Id.setPedido(pedido);

	Id.setProduct(produto);

	this.quantidade = quantidade;

	this.preco = preco;}

	public ItemDoPedidoPK getId() {
		return id;
	}

	public void setId(ItemDoPedidoPK id) {
		this.id = id;
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}



