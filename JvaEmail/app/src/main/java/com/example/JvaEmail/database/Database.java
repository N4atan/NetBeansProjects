/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JvaEmail.database;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author gabri
 */
public class Database {

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
			if (this.getConnection() != null && !this.getConnection().isClosed()) {
				return true;
			}

			this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println("Conexao estabelecida");
			return true;
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao tentar conectar:" + e.getLocalizedMessage());
		}
	}

	private boolean createTableUsuario() throws RuntimeException {
		if (this.isInitialized()) {
			return false;
		}

		if (this.getConnection() == null) {
			this.connect();
		}

		String sql = """
			CREATE TABLE IF NOT EXISTS usuarios (
				id INT AUTO_INCREMENT PRIMARY KEY,
                                    user_email VARCHAR(150) UNIQUE NOT NULL,         
				user_name VARCHAR(255) NOT NULL,
                                    user_password VARCHAR(255) NOT NULL
			)
				""";

		try (
				Statement stmt = this.getConnection().createStatement()) {
			return stmt.execute(sql);
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao criar a tabela usuarios: " + e.getLocalizedMessage());
		}
	}

	private boolean createTableEmails() throws RuntimeException {
		if (this.isInitialized()) {
			return false;
		}

		if (this.getConnection() == null) {
			this.connect();
		}

		String sql = """
                          CREATE TABLE IF NOT EXISTS emails (
                                       id INT AUTO_INCREMENT PRIMARY KEY,
                                       id_remetente INT NOT NULL,
                                       id_destinatario INT NOT NULL,
                                       title VARCHAR(100) NOT NULL,
                                       body TEXT,
               
				   FOREIGN KEY (id_remetente) REFERENCES usuarios (id),
                                       FOREIGN KEY (id_destinatario) REFERENCES usuarios (id)
			)
				""";
		try(Statement stmt = this.getConnection().createStatement()){
			return stmt.execute(sql);
		} catch (Exception e){
			throw new RuntimeException("Erro ao criar a tabela emails: " + e.getLocalizedMessage());
		}
	}

	public Database() {
		if (this.isInitialized()) {
			System.out.println("Banco já configurado");
			return;
		}

		try {
			this.initialized = this.connect() && this.createTableUsuario() && this.createTableEmails();
			System.out.println("Banco configurado com sucesso");
		} catch (RuntimeException e) {
			System.err.println(e.getLocalizedMessage());
			System.exit(1);
		}
	}

}
