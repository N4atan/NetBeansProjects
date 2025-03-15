/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biblioMVC.model;

/**
 *
 * @author emanu
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;

public class LivroDAO {

	private Connection conexao;

	public LivroDAO() {
		this.conexao = ConexaoSQLiteModel.conectar();
		ConexaoSQLiteModel.criarTabelaLivros(this.conexao);
	}

	public void adicionarLivro(Livro livro) throws SQLException {
		String sql = "INSERT INTO livros (titulo, autor, ano) VALUES (?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, livro.getTitulo());
		stmt.setString(2, livro.getAutor());
		stmt.setInt(3, livro.getAnoPublicacao());
		stmt.executeUpdate();
		stmt.close();
	}

	public ArrayList<Livro> listarLivros() {
		ArrayList<Livro> listaLivros = new ArrayList<>();
		String sql = "SELECT * FROM livros";

		try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				Livro newLivro = new Livro(
						rs.getString("titulo"),
						rs.getString("autor"),
						rs.getInt("ano"));
				
				newLivro.setId(rs.getInt("id"));	
				
				listaLivros.add(newLivro);
			}

		} catch (SQLException e) {
			System.out.println("Erro ao listar livros: " + e.getMessage());
		}

		return listaLivros;
	}

	
	public String deletarLivro(int idLivro) {
		// Define o comando SQL para deletar um usuário com base no ID
		String sql = "DELETE FROM livros WHERE id = ?";

		try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
			// Define o valor do parâmetro (idUsuario) no comando SQL
			pstmt.setInt(1, idLivro); // Usamos setInt porque idUsuario é um int

			// Executa o comando SQL
			pstmt.executeUpdate();

			return "Livro deletado com sucesso!";
			
		} catch (SQLException e) {
			return "Erro ao deletar Livro: " + e.getMessage();  // Exibe a mensagem de erro.
		}
	}
}
