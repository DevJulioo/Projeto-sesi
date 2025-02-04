package com.sesi.projeto.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.projeto.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Long, Usuario> {

	List<Long> findAll();



	

	

}
