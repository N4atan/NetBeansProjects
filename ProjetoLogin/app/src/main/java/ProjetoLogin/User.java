/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoLogin;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
class User {
	private int id;
	private String email;
	private String nome;
	private String senha;

	public User(int id, String nome, String email,String senha) {
		this.id = id;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	
	
}
