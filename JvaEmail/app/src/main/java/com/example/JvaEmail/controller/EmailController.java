/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JvaEmail.controller;

import com.example.JvaEmail.dao.EmailDAO;
import com.example.JvaEmail.dao.UsuarioDAO;
import com.example.JvaEmail.model.Usuario;
import com.example.JvaEmail.model.Email;
import java.util.ArrayList;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class EmailController {
	private final EmailDAO emailDAO = new EmailDAO();
	private final UsuarioDAO usuarioDAO = new UsuarioDAO();
	private ArrayList<Email> emailRecebidos = new ArrayList();
	private String errorController = null;
	
	public String getError(){
		return this.errorController;
	}
	
	public boolean hasError() {
		return this.errorController != null;
	}
	
	public void attEmailsRecebidos(Usuario usuarioLocal){
		this.errorController = null;
		
		Email email = new Email();
		email.setDestinatario(usuarioLocal);
		
		ArrayList<Email> listaEmails = this.emailDAO.getEmails(email);
		
		if(this.emailDAO.hasError()){
			this.errorController = this.emailDAO.getError();
			return;
		}
		
		for(Email e : listaEmails){
			e.setDestinatario(usuarioLocal);
			
			Usuario remDb = this.usuarioDAO.getUserById(e.getRemetente());
			
			e.setRemetente(remDb);
		}
		
		this.emailRecebidos = listaEmails;
	}
	
	public String enviarEmail(Usuario usuario, String emailRem, String titulo, String corpo ){
		this.errorController = null;
		Usuario remetente = new Usuario();
		remetente.setEmail(emailRem);
		Usuario remetenteDb = this.usuarioDAO.getUser(remetente);
		
		Email email = new Email();
		email.setDestinatario(usuario);
		email.setRemetente(remetenteDb);
		email.setTitulo(titulo);
		email.setConteudo(corpo);
		
		boolean respDAO = this.emailDAO.saveEmail(email);
		
		if(this.emailDAO.hasError()){
			this.errorController = this.emailDAO.getError();
			return null;
		}
		
		if(respDAO){
			return "Email enviado";
		} else {
			return "Algo inesperado aconteceu...";
		}
	}
	
	public Email abrirDetalhes(int index){
		if(index == -1) return null;
		
		return emailRecebidos.get(index);
	}
	
	public ArrayList<Email> listarEmailsRecebidos(Usuario usuarioLocal){
		this.attEmailsRecebidos(usuarioLocal);
		return this.emailRecebidos;
	}
	
	public boolean haveAnyEmail(){
		return !this.emailRecebidos.isEmpty();
	}
}
