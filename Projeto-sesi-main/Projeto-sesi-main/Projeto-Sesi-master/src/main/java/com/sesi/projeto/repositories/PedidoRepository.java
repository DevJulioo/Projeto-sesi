package com.sesi.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.projeto.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Long, Pedido>{

}
