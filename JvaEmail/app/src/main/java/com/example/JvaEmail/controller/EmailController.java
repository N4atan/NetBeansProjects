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
	private String errorController = null;
	
	public String getError(){
		return this.errorController;
	}
	
	public boolean hasError() {
		return this.errorController != null;
	}
	
	public ArrayList<Email> listarEmailsRecebidos(Usuario	usuarioLocal){
		this.errorController = null;
		
		Email email = new Email();
		email.setDestinatario(usuarioLocal);
		
		ArrayList<Email> listaEmails = this.emailDAO.getEmails(email);
		
		if(this.emailDAO.hasError()){
			this.errorController = this.emailDAO.getError();
			return null;
		}
		
		for(Email e : listaEmails){
			e.setDestinatario(usuarioLocal);
			
			Usuario remDb = this.usuarioDAO.getUserById(e.getRemetente());
			
			e.setRemetente(remDb);
		}
		
		return listaEmails;
	}
	
	
	
}
