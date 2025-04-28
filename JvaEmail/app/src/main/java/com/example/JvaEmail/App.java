package com.example.JvaEmail;

import com.example.JvaEmail.database.Database;
import com.example.JvaEmail.view.Autenticacao;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

public class App {


	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel(new FlatDarkLaf());
		} catch (Exception e) {
			System.err.println("Erro ao setar tema: "  + e.getMessage());
		}
		
		new Autenticacao().setVisible(true);
	}
}
