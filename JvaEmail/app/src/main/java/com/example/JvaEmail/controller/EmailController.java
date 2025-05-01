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
		
		Usuario usuarioDb = this.usuarioDAO.getUser(usuarioLocal);
		
		Email email = new Email();
		email.setDestinatario(usuarioDb);
		
		ArrayList<Email> listaEmails = this.emailDAO.getEmails(email);
		
		if(this.emailDAO.hasError()){
			this.errorController = this.emailDAO.getError();
			return;
		}
		
		//Precisa pois no banco salva só os IDs
		for(Email e : listaEmails){
			e.setDestinatario(usuarioLocal);
			
			Usuario remDb = this.usuarioDAO.getUserById(e.getRemetente());
			
			e.setRemetente(remDb);
		}
		
		this.emailRecebidos = listaEmails;	
	}
	
	public String enviarEmail(Usuario usuario, String emailDest, String titulo, String corpo ){
		this.errorController = null;
		Usuario dest = new Usuario();
		dest.setEmail(emailDest);
		Usuario destDb = this.usuarioDAO.getUser(dest);
		
		usuario = this.usuarioDAO.getUser(usuario);
			
		Email email = new Email();
		email.setRemetente(usuario);
		email.setDestinatario(destDb);
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
	
	public Email abrirDetalhes(String nomeRem, String tituloEmail){
		Email email = this.listarEmailsRecebidos().stream()
									.filter(e -> e.getRemetente().getNome().equals(nomeRem) && e.getTitulo().equals(tituloEmail))
									.findFirst()
									.orElse(null);
		
		return email;	
	}
	
	public ArrayList<Email> listarEmailsRecebidos(){
		return this.emailRecebidos;
	}
	
	public boolean haveAnyEmail(){
		return !this.emailRecebidos.isEmpty();
	}
	
	public int getSize(){
		return this.emailRecebidos.size();
	}
	
	public String deletarEmail(int index){
		Email email = new Email();
		email.setId(index);
		
		boolean respDAO = this.emailDAO.deleteById(email);
		
		if(this.emailDAO.hasError()){
			this.errorController = this.emailDAO.getError();
			return null;
		}
		
		if(respDAO){
			return "Email deletado com sucesso";
		} else {
			return "Erro inesperado";
		}
		
	}
}
