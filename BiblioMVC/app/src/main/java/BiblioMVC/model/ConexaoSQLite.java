/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BiblioMVC.model;
//Usada para criar Statement e PreparedStatement para executar consultas SQL

//Responsável por estabelecer a conexão com o banco de dados usando getConnection()

import java.sql.DriverManager;

/*Representa erros que ocorrem durante operações com o banco de dados.
Útil para tratar falhas de conexão ou comandos SQL inválidos.*/
import java.sql.SQLException;

import java.sql.Connection; // Importa a classe Connection para gerenciar a conexão com o banco de dados
import java.sql.Statement; // Importa a classe Statement para executar comandos SQL



public class ConexaoSQLite {

	// Método para conectar ao banco de dados
	public static Connection conectar() {
		Connection conexao = null; // Declara uma variável para armazenar a conexão
		String url = "jdbc:sqlite:Database.db"; // Define o caminho do banco de dados SQLite

		try {
			// Tenta estabelecer a conexão com o banco de dados usando a URL fornecida
			conexao = DriverManager.getConnection(url);
			System.out.println("Conexão com SQLite estabelecida!"); // Mensagem de sucesso
		} catch (SQLException e) {
			// Caso ocorra um erro, ele será capturado e exibido
			System.out.println("Erro ao conectar ao banco: " + e.getMessage());
		}

		return conexao; // Retorna a conexão estabelecida (ou null se falhou)
	}

	// Método para fechar a conexão com o banco de dados
	public static void desconectar(Connection conexao) {
		try {
			// Verifica se a conexão não é nula (ou seja, se está aberta)
			if (conexao != null) {
				conexao.close(); // Fecha a conexão
				System.out.println("Conexão fechada."); // Mensagem de sucesso
			}
		} catch (SQLException e) {
			// Captura e exibe qualquer erro ao tentar fechar a conexão
			System.out.println("Erro ao fechar a conexão: " + e.getMessage());
		}
	}

	// Método que cria a tabela 'usuarios' no banco de dados
	public static void criarTabela(Connection conexao) {
		// Cria uma string contendo o comando SQL para criar a tabela, se não existir
		String sql = "CREATE TABLE IF NOT EXISTS livros ("
				+ "id INTEGER PRIMARY KEY AUTOINCREMENT, " // Coluna 'id' como chave primária com autoincremento
				+ "titulo TEXT NOT NULL, " // Coluna 'nome' do tipo TEXT, obrigatório (NOT NULL)
				+ "autor TEXT  NOT NULL," // Coluna 'email' do tipo TEXT, obrigatório (NOT NULL)
				+ "anoPublicacao INT NOT NULL)";

		// Bloco try and catch para garantir o fechamento do Statement após a execução
		/*Create Statement cria um objeto do tipo Statement, que permite executar comandos 
        SQL no banco de dados.*/
		try (Statement stmt = conexao.createStatement()) {
			stmt.execute(sql); // Executa o comando SQL para criar a tabela
			System.out.println("Tabela criada ou já existente."); // Exibe mensagem de sucesso
		} catch (Exception e) { // Captura exceções que possam ocorrer durante a execução
			System.out.println("Erro ao criar tabela: " + e.getMessage()); // Exibe mensagem de erro
		}
	}
}
