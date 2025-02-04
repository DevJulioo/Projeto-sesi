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

import com.sesi.projeto.dto.CategoriaDTO;
import com.sesi.projeto.entities.Categoria;
import com.sesi.projeto.repositories.CategoriaRepository;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

	
	@Autowired
	CategoriaRepository repo;

	@GetMapping
	public <Categoria> ResponseEntity<List<Long>> mostrarTodos() {
		List<Long> categoria = repo.findAll();
		return ResponseEntity.ok(categoria);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> mostrarPorId(@PathVariable Categoria id) {
		Long categoria = repo.getById(id);
		return ResponseEntity.ok(categoria);
	}
	
	@PostMapping
	public ResponseEntity<Categoria> criar(@RequestBody CategoriaDTO dto){
		Categoria categoria = new Categoria(dto);
		return ResponseEntity.ok(categoria);
	}

}


