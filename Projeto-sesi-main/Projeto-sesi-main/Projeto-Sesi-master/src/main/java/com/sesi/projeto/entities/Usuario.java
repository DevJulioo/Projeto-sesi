package com.sesi.projeto.entities;

import com.sesi.projeto.dto.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_user")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private String roles;
	
	public Usuario() {
		
	}
	
	public Usuario(UsuarioDTO u) {
		this.email = u.email();
		this.nome = u.nome();
		this.roles = u.roles();
		this.senha = u.senha();
		this.telefone = u.telefone();
	}
	
	public Usuario(Long id, String nome, String email, String telefone, String senha, String roles) {
		this.email = email;
		this.id = id;
		this.nome = nome;
		this.roles = roles;
		this.senha = senha;
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	
}
