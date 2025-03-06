/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhosSQLite;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class User {
	private int id;
	private String nome;
	private String email;

	public User(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	
	public String getNome() {
		return nome;
	}



	public String getEmail() {
		return email;
	}
	
	
}
