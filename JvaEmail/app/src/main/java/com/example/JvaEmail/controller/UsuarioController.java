/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JvaEmail.controller;

import com.example.JvaEmail.dao.UsuarioDAO;
import com.example.JvaEmail.model.Usuario;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author gabri
 */
public class UsuarioController {

	private final UsuarioDAO usuarioDAO = new UsuarioDAO();
	private String errorController = null;

	public String registar(String email, String nome, String senha) {
		this.errorController = null;
		Usuario usuario = new Usuario();
		usuario.setId(-1);
		usuario.setEmail(email);
		usuario.setNome(nome);
		usuario.setSenha(senha);
		usuario.encriptarSenha();

		boolean respDAO = this.usuarioDAO.saveUser(usuario);

		if (respDAO) {
			return "Parabéns! \nVocê faz parte da nossa comunidade agora!";
		}

		if (this.usuarioDAO.hasError()) {
			this.errorController = this.usuarioDAO.getError();
			return null;
		} else {
			this.errorController = "Algo não saiu como esperado...";
			return null;
		}

	}

	public Usuario login(String email, String senha) {
		this.errorController = null;
		Usuario usuariorLocal = new Usuario();
		usuariorLocal.setEmail(email);

		Usuario userDb = this.usuarioDAO.getUser(usuariorLocal);

		if (this.usuarioDAO.hasError()) {
			this.errorController = this.usuarioDAO.getError();
			return null;
		}

		//Checar senhas se coincidem, e retornar algo para a view
		boolean auth = BCrypt.checkpw(senha, userDb.getSenha());

		if (!auth) {
			this.errorController = "Senhas não coincidem!";
			return null;
		} else {
			usuariorLocal.setNome(userDb.getNome());
			return usuariorLocal;
		}

	}

	public boolean checkExists(String email) {
		this.errorController = null;
		Usuario usuariorLocal = new Usuario();
		usuariorLocal.setEmail(email);

		boolean respDAO = this.usuarioDAO.checkExists(usuariorLocal);

		if (this.usuarioDAO.hasError()) {
			this.errorController = this.usuarioDAO.getError();
			return false;
		}

		return respDAO;
	}

	public String atualizarSenha(String email, String senha) {
		this.errorController = null;
		Usuario usuariorLocal = new Usuario();
		usuariorLocal.setEmail(email);

		Usuario userDb = this.usuarioDAO.getUser(usuariorLocal);

		if (this.usuarioDAO.hasError()) {
			this.errorController = this.usuarioDAO.getError();
			return null;
		}
		
		userDb.setSenha(senha);
		userDb.encriptarSenha();
		
		boolean respDAO = this.usuarioDAO.updateUser(userDb);
		
		if (respDAO) {
			return "Pronto! \nSenha alterada com sucesso.";
		}

		if (this.usuarioDAO.hasError()) {
			this.errorController = this.usuarioDAO.getError();
			return null;
		} else {
			this.errorController = "Algo não saiu como esperado...";
			return null;
		}
	}

	public boolean hasError() {
		return this.errorController != null;
	}

	public String getError() {
		return this.errorController;
	}
}
