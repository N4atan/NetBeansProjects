/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BCrypt.model;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class User {
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String userPasswordCrypt;
	
	public User(String userEmail, String userPassword){
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userId = -1;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public String getUserPasswordCrypt(){
		return this.userPasswordCrypt;
	}
	
	public void setUserPasswordCrypt(String passwordCrypt){
		this.userPasswordCrypt = passwordCrypt;
	}
}
