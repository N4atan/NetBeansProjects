/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhosSQLite;
//Usada para criar Statement e PreparedStatement para executar consultas SQL

//Responsável por estabelecer a conexão com o banco de dados usando getConnection()
import TrabalhosSQLite.User;
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
import static org.sqlite.SQLiteErrorCode.SQLITE_CONSTRAINT_UNIQUE;

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
				+ "email TEXT  UNIQUE NOT NULL," // Coluna 'email' do tipo TEXT, obrigatório (NOT NULL)
				+ "senha VARCHAR(255) NOT NULL)";

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

	public static String inserirUsuario(Connection conexao, String nome, String senha, String email) {

		// A string sql contém o comando SQL que será executado no banco de dados. 
		// O comando INSERT INTO vai inserir um novo registro na tabela "usuarios" com os valores de "nome" e "email".
		String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?,?, ?)";

		// O bloco try é utilizado para garantir que o recurso (PreparedStatement) 
		// seja fechado automaticamente após o uso.
		try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {

			// O método setString substitui os "?" no comando SQL pelos valores passados como parâmetros para o método.
			// O primeiro parâmetro é a posição do "?", e o segundo é o valor a ser atribuído.
			pstmt.setString(1, nome); // Substitui o primeiro ? por 'nome'
			pstmt.setString(2, email);
			pstmt.setString(3, senha); // Substitui o segundo ? por 'email'

			// O método executeUpdate executa o comando SQL no banco de dados. 
			// No caso, ele insere o usuário na tabela.
			pstmt.executeUpdate();

			System.out.println("Usuário inserido com sucesso!");

			// O bloco catch captura qualquer exceção que ocorra durante a execução do código dentro do try.
			// Se algo der errado (por exemplo, erro de conexão ou comando SQL inválido), a mensagem de erro será exibida.
			return "201";
		} catch (SQLException e) {
			if (e.getErrorCode() == 2067) { //códgio para unique email
				return "email"; // Código específico para email duplicado
			}
			return e.getMessage();
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

	public static User getUsuario(Connection conexao, String email, String senha) {
		// Define a query SQL para buscar um usuário pelo ID
		String sql = "SELECT * FROM usuarios WHERE email = ?";

		try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
			// Define o parâmetro da query (idUsuario)
			pstmt.setString(1, email);

			// Executa a query e obtém o ResultSet
			try (ResultSet rs = pstmt.executeQuery()) {
				// Verifica se há resultados
				if (rs.next()) {
					// Cria e retorna um objeto User com os dados do ResultSet
					if (rs.getString("senha").equals(senha)) {
						return new User(
								rs.getInt("id"),
								rs.getString("nome"),
								rs.getString("email")
						);
					} else {
						System.out.println("Credenciais invalidas!");
						return new User(0, "Senha Invalida", "");
					}
				} else {
					// Se não houver resultados, retorna null
					System.out.println("Nenhum usuário encontrado com o email" + email);
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
			pstmt.setString(1, usuario.getNome()); // Substitui o primeiro ? pelo nome
			pstmt.setString(2, usuario.getEmail()); // Substitui o segundo ? pelo email
			//pstmt.setInt(3, usuario.getId()); // Substitui o terceiro ? pelo id

			// Executa a query e verifica se alguma linha foi afetada
			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected > 0; // Retorna true se pelo menos uma linha foi atualizada
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar usuário: " + e.getMessage());
			return false;
		}
	}
}
