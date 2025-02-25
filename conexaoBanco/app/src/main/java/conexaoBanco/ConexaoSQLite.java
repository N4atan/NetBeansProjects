/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoBanco;
//Usada para criar Statement e PreparedStatement para executar consultas SQL

//Responsável por estabelecer a conexão com o banco de dados usando getConnection()
import java.sql.DriverManager;

/*Representa erros que ocorrem durante operações com o banco de dados.
Útil para tratar falhas de conexão ou comandos SQL inválidos.*/
import java.sql.SQLException;

import java.sql.Connection; // Importa a classe Connection para gerenciar a conexão com o banco de dados
import java.sql.Statement; // Importa a classe Statement para executar comandos SQL
import java.sql.PreparedStatement; // A classe PreparedStatement é usada para executar uma consulta SQL com parâmetros substituíveis.
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoSQLite {

	// Método para conectar ao banco de dados
	public static Connection conectar() {
		Connection conexao = null; // Declara uma variável para armazenar a conexão
		String url = "jdbc:sqlite:usuariosNovo.db"; // Define o caminho do banco de dados SQLite

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
	public static void criarTabelaUsuarios(Connection conexao) {
		// Cria uma string contendo o comando SQL para criar a tabela, se não existir
		String sql = "CREATE TABLE IF NOT EXISTS usuarios ("
				+ "id INTEGER PRIMARY KEY AUTOINCREMENT, " // Coluna 'id' como chave primária com autoincremento
				+ "nome TEXT NOT NULL, " // Coluna 'nome' do tipo TEXT, obrigatório (NOT NULL)
				+ "email TEXT NOT NULL)"; // Coluna 'email' do tipo TEXT, obrigatório (NOT NULL)

		// Bloco try and catch para garantir o fechamento do Statement após a execução
		/*Create Statement cria um objeto do tipo Statement, que permite executar comandos 
        SQL no banco de dados.*/
		try (Statement stmt = conexao.createStatement()) {
			stmt.execute(sql); // Executa o comando SQL para criar a tabela
			System.out.println("Tabela 'usuarios' criada ou já existente."); // Exibe mensagem de sucesso
		} catch (Exception e) { // Captura exceções que possam ocorrer durante a execução
			System.out.println("Erro ao criar tabela: " + e.getMessage()); // Exibe mensagem de erro
		}
	}

	// Definimos o método inserirUsuario, que recebe uma conexão com o banco de dados (conexao),
	// um nome de usuário (nome) e um email de usuário (email).
	public static void inserirUsuario2(Connection conexao, String nome, String email) {
		
	}
	
	public static void inserirUsuario(Connection conexao, String nome, String email) {

		// A string sql contém o comando SQL que será executado no banco de dados. 
		// O comando INSERT INTO vai inserir um novo registro na tabela "usuarios" com os valores de "nome" e "email".
		String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";

		// O bloco try é utilizado para garantir que o recurso (PreparedStatement) 
		// seja fechado automaticamente após o uso.
		try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {

			// O método setString substitui os "?" no comando SQL pelos valores passados como parâmetros para o método.
			// O primeiro parâmetro é a posição do "?", e o segundo é o valor a ser atribuído.
			pstmt.setString(1, nome); // Substitui o primeiro ? por 'nome'
			pstmt.setString(2, email); // Substitui o segundo ? por 'email'

			// O método executeUpdate executa o comando SQL no banco de dados. 
			// No caso, ele insere o usuário na tabela.
			pstmt.executeUpdate();

			System.out.println("Usuário inserido com sucesso!");

			// O bloco catch captura qualquer exceção que ocorra durante a execução do código dentro do try.
			// Se algo der errado (por exemplo, erro de conexão ou comando SQL inválido), a mensagem de erro será exibida.
		} catch (Exception e) {
			System.out.println("Erro ao inserir usuário: " + e.getMessage());  // Exibe a mensagem de erro.
		}
	}

	public static boolean deletarUsuario(Connection conexao, int idUsuario) {
		// Define o comando SQL para deletar um usuário com base no ID
		String sql = "DELETE FROM usuarios WHERE id = ?";

		try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
			// Define o valor do parâmetro (idUsuario) no comando SQL
			pstmt.setInt(1, idUsuario); // Usamos setInt porque idUsuario é um int

			// Executa o comando SQL
			pstmt.executeUpdate();

			System.out.println("Usuário deletado com sucesso!");
			return true;
		} catch (Exception e) {
			System.out.println("Erro ao deletar usuário: " + e.getMessage());  // Exibe a mensagem de erro.
			return false;
		}
	}

	public static ArrayList<User> listarUsuarios(Connection conexao) {

		// Criação de uma String para armazenar os resultados
		ArrayList<User> listaUsers = new ArrayList();

		// SQL para selecionar todos os registros
		String sql = "SELECT * FROM usuarios";

		// Tentando executar a consulta SQL
		try (Statement stmt = conexao.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

			// Loop para percorrer todos os registros retornados
			while (rs.next()) {
				// Pega os dados de cada usuário do banco e coloca 
				listaUsers.add(new User(rs.getInt("id"), rs.getString("nome"), rs.getString("email")));
			}
		} catch (Exception e) {
			// Caso ocorra algum erro, adiciona a mensagem de erro na String
			System.out.println("Erro ao listar usuários: " + e.getMessage());
		}

		// Retorna o texto com os dados dos usuários
		return listaUsers;
	}

	public static User getUsuario(Connection conexao, int idUsuario) {
		// Define a query SQL para buscar um usuário pelo ID
		String sql = "SELECT id, nome, email FROM usuarios WHERE id = ?";

		try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
			// Define o parâmetro da query (idUsuario)
			pstmt.setInt(1, idUsuario);

			// Executa a query e obtém o ResultSet
			try (ResultSet rs = pstmt.executeQuery()) {
				// Verifica se há resultados
				if (rs.next()) {
					// Cria e retorna um objeto User com os dados do ResultSet
					return new User(
							rs.getInt("id"),
							rs.getString("nome"),
							rs.getString("email")
					);
				} else {
					// Se não houver resultados, retorna null
					System.out.println("Nenhum usuário encontrado com o ID: " + idUsuario);
					return null;
				}
			}
		} catch (SQLException e) {
			// Trata erros de SQL
			System.out.println("Erro ao buscar usuário: " + e.getMessage());
			return null;
		}
	}

	public static boolean atualizarUsuario(Connection conexao, User usuario) {
		// Query SQL com placeholders (?)
		String sql = "UPDATE usuarios SET nome = ?, email = ? WHERE id = ?";

		try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
			// Define os valores dos placeholders
			pstmt.setString(1, usuario.nome); // Substitui o primeiro ? pelo nome
			pstmt.setString(2, usuario.email); // Substitui o segundo ? pelo email
			pstmt.setInt(3, usuario.id); // Substitui o terceiro ? pelo id

			// Executa a query e verifica se alguma linha foi afetada
			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0; // Retorna true se pelo menos uma linha foi atualizada
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar usuário: " + e.getMessage());
			return false;
		}
	}
}
