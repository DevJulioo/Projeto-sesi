package com.sesi.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.projeto.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
