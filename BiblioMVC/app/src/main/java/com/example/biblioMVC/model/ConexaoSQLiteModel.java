package com.example.biblioMVC.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
/**
 *
 * @author emanu
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoSQLiteModel {

	private static final String URL = "jdbc:sqlite:biblioteca.db";
	private static Connection conexao = null;

	public static Connection conectar() {
		try {
			// Se a conexão não existir ainda
			if (conexao == null || conexao.isClosed()) {
				// Então ele inicia a conexão
				conexao = DriverManager.getConnection(URL);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco: " + e.getMessage());
		}
		return conexao;
	}
	public static void desconectar() {
		try {
			if (conexao != null && !conexao.isClosed()) {
				conexao.close();
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao desconectar do banco: " + e.getMessage());
		}
	}
	
	public static void criarTabelaLivros(Connection conexao) {
		String sql = "CREATE TABLE IF NOT EXISTS livros ("
				+ "id INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "titulo TEXT NOT NULL,"
				+ "autor TEXT NOT NULL,"
				+ "ano INTEGER NOT NULL);";

		try (Statement stmt = conexao.createStatement()) {
			stmt.execute(sql);
			System.out.println("Tabela 'livros' verificada/criada com sucesso.");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao criar a tabela: " + e.getMessage());
		}
	}
}
