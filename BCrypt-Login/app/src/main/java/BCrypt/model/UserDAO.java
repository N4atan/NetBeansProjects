/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BCrypt.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class UserDAO {
	private Database db;
	private String error;
	
	public UserDAO(){
		this.db = new Database();
	}
	
	public String getError(){
		return this.error;
	}
	
	public boolean insertUser(User user){
		if(user == null) {
			this.error = "Usuario nulo";
			return false;
		}
		
		String sql = """
                                     INSERT INTO users (user_email, user_password) VALUES(?,?)
				""";
		
		try{
			 // Gera um hash seguro para a senha usando BCrypt
			user.setUserPasswordCrypt(BCrypt.hashpw(user.getUserPassword(), BCrypt.gensalt()));
			
			
			PreparedStatement pstmt = this.db.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUserEmail());
			pstmt.setString(2, user.getUserPasswordCrypt());
			pstmt.execute();
			
			return true;
		} catch(SQLException e) {
			this.error = e.getLocalizedMessage();
			return false;
		}
	}
	
	public boolean deleteUser(User user) {
		if(user.getUserEmail() == null || user.getUserEmail().isEmpty()) {
			this.error = "email não informado";
			return false;
		}
		
		String sql ="""
	                          DELETE FROM users WHERE user_email = ?
				""";
		
		try{
			PreparedStatement pstmt = this.db.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUserEmail());
			
			return pstmt.executeUpdate() > 0;
		} catch(SQLException e){
			this.error = e.getLocalizedMessage();
			return false;
		}
	}
	
	public boolean updateUser(User user){
		if(user.getUserEmail() == null || user.getUserEmail().isEmpty()) {
			this.error = "email não informado";
			return false;
		}
		
		String sql = """
                                     UPDATE users SET user_name = ?, user_password = ? WHERE user_email = ?
				""";
		
		try{
			PreparedStatement pstmt = this.db.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getUserPasswordCrypt());
			pstmt.setString(3, user.getUserEmail());
			
			return pstmt.executeUpdate() > 0;
		} catch(SQLException e){
			this.error = e.getLocalizedMessage();
			return false;
		}
	}
	
	public User getSingleUserByEmail(User user){
		if(user.getUserEmail() == "" || user.getUserEmail().isEmpty() || user.getUserPassword() == "" || user.getUserPassword().isEmpty()) {
			this.error = "Email ou senhas não informado";
			return null;
		}
		
		
		String sql = """
                                  SELECT * FROM users WHERE user_email = ?
				""";
		
		try{
			PreparedStatement pstmt = this.db.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUserEmail());
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				//Checar senhas e retornar se true
				//checkpw
				
				if(BCrypt.checkpw(user.getUserPassword(), rs.getString("user_password"))){
					return new User(rs.getString("user_email"), "");
				}
				
				this.error = "Senhas nao coincidem.";
				return null;
			}
			
			this.error = "Usuario não encontrado.";
			return null;
		} catch(SQLException e){
			this.error = e.getLocalizedMessage();
			return null;
		}
	}
	
	public ArrayList<User> listUsers(){
		String sql = """
                                     SELECT * FROM users
				""";
		
		ArrayList<User> listUsers = new ArrayList();
		
		try{
			PreparedStatement pstmt = this.db.getConnection().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				User user = new User(
								rs.getString("user_email"),
								""
								);
				user.setUserPasswordCrypt(rs.getString("user_password"));
				listUsers.add(user);
			}
			return listUsers;
		} catch (SQLException e){
			return listUsers;
		}
	}
}
