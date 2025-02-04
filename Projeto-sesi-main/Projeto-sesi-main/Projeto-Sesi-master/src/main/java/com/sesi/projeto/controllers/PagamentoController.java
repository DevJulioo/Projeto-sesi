package com.sesi.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sesi.projeto.dto.PagamentoDTO;
import com.sesi.projeto.entities.Pagamento;
import com.sesi.projeto.repositories.PagamentoRepository;

public class PagamentoController {

	@Autowired
	PagamentoRepository repo;

	@GetMapping
	public ResponseEntity<List<Long>> mostrarTodos() {
		List<Long> pagamento = repo.findAll();
		return ResponseEntity.ok(pagamento);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> mostrarPorId(@PathVariable Pagamento id) {
		Long pagamento = repo.getById(id);
		return ResponseEntity.ok(pagamento);
	}
	
	@PostMapping
	public ResponseEntity<Pagamento> criar(@RequestBody PagamentoDTO dto){
		Pagamento pagamento = new Pagamento(dto);
		return ResponseEntity.ok(pagamento);
	}

}

	



