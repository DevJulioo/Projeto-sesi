package com.sesi.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sesi.projeto.dto.PedidoDTO;
import com.sesi.projeto.entities.Pedido;
import com.sesi.projeto.repositories.PedidoRepository;

public class PedidoController {
	
	@Autowired
	PedidoRepository repo;

	@GetMapping
	public ResponseEntity<List<Long>> mostrarTodos() {
		List<Long> pedido = repo.findAll();
		return ResponseEntity.ok(pedido);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> mostrarPorId(@PathVariable Pedido id) {
		Long pedido = repo.getById(id);
		return ResponseEntity.ok(pedido);
	}
	
	@PostMapping
	public ResponseEntity<Pedido> criar(@RequestBody PedidoDTO dto){
		Pedido pedido = new Pedido (dto);
		return ResponseEntity.ok(pedido);
	}

}


