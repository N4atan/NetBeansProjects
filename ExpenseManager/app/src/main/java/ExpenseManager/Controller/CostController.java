/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpenseManager.Controller;

import ExpenseManager.model.*;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class CostController {
	private Connection conexao = ConexaoSQLite.conectar();
	
	public void saveCost(Cost cost){
		try{
			boolean  tentativa = CostDAO.addCost(conexao, cost);
			
			if(tentativa){
				System.out.println("Sucesso!");
			} else {
				System.out.println("Algo falhou!");
			}
			
			ConexaoSQLite.desconectar(conexao);
		} catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
}
