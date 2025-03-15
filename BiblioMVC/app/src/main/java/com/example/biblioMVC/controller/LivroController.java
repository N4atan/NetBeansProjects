/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioMVC.controller;

import com.example.biblioMVC.model.Livro;
import com.example.biblioMVC.model.LivroDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emanu
 */
public class LivroController {

	private LivroDAO livroDAO;

	public LivroController() {
		this.livroDAO = new LivroDAO();
	}

	public String adicionarLivro(String titulo, String autor, String anoTexto) {
		try {
			int ano = Integer.parseInt(anoTexto);
			livroDAO.adicionarLivro(new Livro(titulo, autor, ano));
			return "Livro adicionado com sucesso";
		} catch (SQLException e) {
			return "Erro" + e.getMessage();
		}
	}

	public ArrayList<Livro> listarLivros() {
		return livroDAO.listarLivros();
	}

	public String removerLivro(String tituloLivro, String autorLivro) {
		ArrayList<Livro> listaLivros = livroDAO.listarLivros();
		
		System.out.println(listaLivros.size());
		
		for (Livro livro : listaLivros) {
			if (livro.getTitulo().equals(tituloLivro) && livro.getAutor().equals(autorLivro)) {
				return livroDAO.deletarLivro(livro.getId()); // Agora realmente deleta
			}
		}
		return "Livro não encontrado!";
	}
}
