package com.example.JvaEmail.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author gabri
 */
public class Usuario {
	private int id;
	private String email;
	private String nome;
	private String senha;

	
	
	public boolean userHasInicialized(){
		return this.getId() != -1;
	}
	
	public void encriptarSenha(){
		this.setSenha(BCrypt.hashpw(this.getSenha(), BCrypt.gensalt()));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
