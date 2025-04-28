package com.example.JvaEmail.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.example.JvaEmail.database.Database;
import com.example.JvaEmail.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author gabri
 */
public class UsuarioDAO {

	private final Database database = new Database();
	public String errorDAO = null;

	public String getError() {
		return errorDAO;
	}

	public boolean saveUser(Usuario usuario) {
		this.errorDAO = null;
		if (usuario.userHasInicialized()) {
			this.errorDAO = "Usuário já cadastrado";
			return false;
		}

		String sql = """
                                     INSERT INTO usuarios (user_email, user_name, user_password) VALUES (?, ?, ?)
				""";

		try (
				PreparedStatement pstmt = this.database.getConnection().prepareStatement(sql);) {

			pstmt.setString(1, usuario.getEmail());
			pstmt.setString(2, usuario.getNome());
			pstmt.setString(3, usuario.getSenha());

			return pstmt.executeUpdate() > 0;
		} catch (SQLException e) {
			this.errorDAO = e.getLocalizedMessage();
			return false;
		}
	}

	public boolean hasError() {
		return this.errorDAO != null;
	}

	public Usuario getUser(Usuario usuario) {
		this.errorDAO = null;
		String sql = """
                          SELECT * FROM usuarios WHERE user_email = ?
				""";

		try (PreparedStatement pstmt = this.database.getConnection().prepareStatement(sql)) {
			pstmt.setString(1, usuario.getEmail());

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				Usuario userDb = new Usuario();
				userDb.setId(rs.getInt("id"));
				userDb.setEmail(rs.getString("user_email"));
				userDb.setNome(rs.getString("user_name"));
				userDb.setSenha(rs.getString("user_password"));
				
				return userDb;
			}
			
			this.errorDAO = "Usuario não encontrado";
			return null;
		} catch (SQLException e) {
			this.errorDAO = e.getLocalizedMessage();
			return null;
		}
	}
	
	public boolean checkExists(Usuario usuario) {
		this.errorDAO = null;
		String sql = """
                          SELECT * FROM usuarios WHERE user_email = ?
				""";

		try (PreparedStatement pstmt = this.database.getConnection().prepareStatement(sql)) {
			pstmt.setString(1, usuario.getEmail());
			
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				return true;
			}
			
			this.errorDAO = "Usuario não encontrado";
			return false;
		} catch (SQLException e) {
			this.errorDAO = e.getLocalizedMessage();
			return false;
		}
	}
	
	public boolean updateUser(Usuario usuario){
		this.errorDAO = "";
		String sql = """
			UPDATE usuarios
			SET user_email = ?, user_name = ?, user_password = ?
			WHERE id = ?
				""";
		
		try(PreparedStatement pstmt = this.database.getConnection().prepareCall(sql)){
			pstmt.setString(1, usuario.getEmail());
			pstmt.setString(2, usuario.getNome());
			pstmt.setString(3, usuario.getSenha());
			pstmt.setInt(4, usuario.getId());
			
			return pstmt.executeUpdate() > 0;
		} catch (Exception e){
			this.errorDAO = e.getLocalizedMessage();
			return false;
		}
	}
}
