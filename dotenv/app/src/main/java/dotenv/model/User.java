/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotenv.model;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class User {
	private int user_id;
	private String user_name;
	private String user_email;
	private String user_password;
	private String user_passwordEncrypted;
	public String getUser_name;
	
	public User(String user_email){
		this.user_id = -1;
		this.user_email = user_email;
	}
	
	public User(int user_id, String user_name, String user_email, String user_passwordEncrypted){
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_passwordEncrypted = user_passwordEncrypted;
	}
	
	public User(String user_name, String user_email){
		this.user_name = user_name;
		this.user_email = user_email;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_passwordEncrypted() {
		return user_passwordEncrypted;
	}

	public void setUser_passwordEncrypted(String user_passwordEncrypted) {
		this.user_passwordEncrypted = user_passwordEncrypted;
	}
	
	
}
