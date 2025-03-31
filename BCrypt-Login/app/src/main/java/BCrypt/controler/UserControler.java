/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BCrypt.controler;

import BCrypt.model.UserDAO;
import BCrypt.model.User;
import java.util.ArrayList;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class UserControler {
	private UserDAO userDAO = new UserDAO();
	private User userLogged;

	
	public String registerUser(String useremail, String userpassword){
		User user = new User(useremail, userpassword);
		boolean action = userDAO.insertUser(user);
		
		return action ? null : this.userDAO.getError();
	}
	
	public String login(String useremail, String userpassword){
		User user = new User(useremail, userpassword);
		
		userLogged = userDAO.getSingleUserByEmail(user);
		
		return userLogged != null ? null : this.userDAO.getError();
	}
	
	public ArrayList<User> getAllUsers(){
		return this.userDAO.listUsers();
	}
}
