/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotenv.database;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class Database {
	
	private static final Logger Log = Logger.getLogger(Database.class.getName());
	
	private static final Dotenv dotenv = Dotenv.load();
	private Connection connection = null;
	private boolean initialized = false;

	private final String DB_URL = dotenv.get("DB_URL");
	private final String DB_USER = dotenv.get("DB_USER");
	private final String DB_PASSWORD = dotenv.get("DB_PASSWORD");
	

	public boolean isInitialized() {
		return this.initialized;
	}

	public Connection getConnection() {
		return this.connection;
	}

	private boolean connect() throws RuntimeException {
		try {
			if (this.connection != null && !this.connection.isClosed()) return true;
			this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			Log.config("Conexão estabelecida.");
			return true;
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao conectar o banco de dados: ", e);
		}
	}

	private boolean createTable() throws RuntimeException {
		if (this.initialized) {
			return false;
		}
		
		if (this.connection == null) {
			return false;
		}

		String sql = """
				CREATE TABLE IF NOT EXISTS usuarios (
					id INT AUTO_INCREMENT PRIMARY KEY,
					user_name VARCHAR(100),
					user_email VARCHAR(100) UNIQUE,
					user_password VARCHAR(255)
				)
				""";

		try (Statement stmt = this.connection.createStatement()) {
			stmt.execute(sql);
			Log.config("Tabela criada com sucesso ou ja existe no banco de dados..");
			return true;
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao criar a tabela: ", e);
		}
	}

	private void initialize() {
		if (this.initialized) {
			Log.warning("Database já inicializado!");
			return;
		}
				
		try  {
			this.initialized = this.connect() && this.createTable();			
			Log.info("Banco de dados inicializado com sucesso, e pronto para o uso!");
		} catch(RuntimeException e){
			Log.severe(e.getLocalizedMessage());
			
			//Para o código:
			//System.exit(1);
		}
	}
	
	public Database(){
		this.initialize();
	}
}
