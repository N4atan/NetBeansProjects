/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BCrypt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class Database {

	private static final String URL = "jdbc:mysql://localhost:3306/241nbcrypto";
	private static final String USUARIO = "root";
	private static final String SENHA = "root";
	private static Connection connection;
	private boolean inicialized = false;

	private void conectar() {
		try {
			if (connection != null && !connection.isClosed()) {
				return;
			}
			connection = DriverManager.getConnection(URL, USUARIO, SENHA);
			System.out.println("Conexao estabelecida.");
		} catch (SQLException e) {
			throw new RuntimeException("Erro na conexao com o banco de dados:" + e.getLocalizedMessage());
		}
	}

	private void createTable(String nameTable) {
		try {
			if (this.isInicialized()) return;
			if (this.connection == null || this.connection.isClosed()) return;
			if(nameTable.equals("") || nameTable.isEmpty()) return;

			String sql = String.format("""
                                 CREATE TABLE IF NOT EXISTS %s (
				id INT AUTO_INCREMENT  PRIMARY KEY,
				user_name VARCHAR(100),
				user_email VARCHAR(100) UNIQUE,
				user_password VARCHAR(255)
                                 )
                                 """, nameTable);

			Statement stmt = this.connection.createStatement();

			stmt.execute(sql);
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao criar tabela: " + e.getLocalizedMessage());
		}

	}

	public boolean isInicialized() {
		return this.inicialized;
	}
	public Connection getConnection(){
		return this.connection;
	}

	public Database() {
		if (isInicialized()) return;

		this.conectar();
		this.createTable("users");
		inicialized = true;
	}
}
