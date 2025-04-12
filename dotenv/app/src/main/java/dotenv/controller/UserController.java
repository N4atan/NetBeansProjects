/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotenv.controller;

import dotenv.DAO.UserDAO;
import dotenv.model.User;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class UserController {
	private final UserDAO UserDao = new UserDAO();
	private String errorController;
	
	public String getErrController(){
		return this.errorController;
	}
	
	public boolean registerUser(String name, String lastName, String email, String password){
		String fullName = String.format("%s %s", name, lastName);
		var encryptedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
		
		User user = new User(email);
		user.setUser_name(fullName);
		user.setUser_passwordEncrypted(encryptedPassword);
		
		boolean resultOp = UserDao.userPost(user);
		
		if(resultOp){
			return true;
		} else {
			this.errorController = this.UserDao.getErrorDAO();
			return false;
		}
	}
	
	public User loginUser(String email, String password){
		User user = new User(email);
		
		User userLogged = UserDao.userGet(user);
		
		if(userLogged == null){
			this.errorController = this.UserDao.getErrorDAO();
			return null;
		} else {
			if(BCrypt.checkpw(user.getUser_password(), userLogged.getUser_passwordEncrypted())){
				return new User(userLogged.getUser_name(), userLogged.getUser_email());
			} else {
				this.errorController = "Senhas Não Coincidem!";
				return null;
			}
		}
	}
}
