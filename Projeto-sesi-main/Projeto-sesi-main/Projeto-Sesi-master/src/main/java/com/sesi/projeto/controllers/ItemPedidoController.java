package com.sesi.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.projeto.dto.ItemPedidoDTO;
import com.sesi.projeto.entities.ItemPedido;
import com.sesi.projeto.repositories.ItemPedidoRepository;

@RestController
@RequestMapping("ItemPedido")
public class ItemPedidoController {

	@Autowired
	ItemPedidoRepository repo;

	@GetMapping
	public ResponseEntity<List<Long>> mostrarTodos() {
		List<Long> item = repo.findAll();
		return ResponseEntity.ok(item);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> mostrarPorId(@PathVariable ItemPedido id) {
		Long item = repo.getById(id);
		return ResponseEntity.ok(item);
	}
	
	@PostMapping
	public ResponseEntity<ItemPedido> criar(@RequestBody ItemPedidoDTO dto){
		ItemPedido item = new ItemPedido(dto);
		return ResponseEntity.ok(item);
	}

}

	

