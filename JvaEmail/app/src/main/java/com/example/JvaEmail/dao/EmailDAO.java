/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JvaEmail.dao;

import com.example.JvaEmail.database.Database;
import com.example.JvaEmail.model.Email;

/**
 *
 * @author gabri
 */
public class EmailDAO {
	private final Database db = new Database();
	private String errorDAO = null;
	
	public String getError(){
		return this.errorDAO;
	}
	
	public boolean saveEmail(Email email){
		this.errorDAO = null;
		
		String sql = """
                          INSERT INTO emails () VALUES ();
				""";
	}
}
