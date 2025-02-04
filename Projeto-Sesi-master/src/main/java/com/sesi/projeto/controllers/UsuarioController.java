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

import com.sesi.projeto.dto.ProdutoDTO;
import com.sesi.projeto.entities.Produto;
import com.sesi.projeto.repositories.ProdutoRepository;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	ProdutoRepository repo;

	@GetMapping
	public ResponseEntity<List<Produto>> mostrarTodos() {
		List<Produto> user = repo.findAll();
		return ResponseEntity.ok(user);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> mostrarPorId(@PathVariable Long id) {
		Produto user = repo.getById(id);
		return ResponseEntity.ok(user);
	}
	
	@PostMapping
	public ResponseEntity<Produto> criar(@RequestBody ProdutoDTO dto){
		Produto user = new Produto(dto);
		return ResponseEntity.ok(user);
	}

}

}
