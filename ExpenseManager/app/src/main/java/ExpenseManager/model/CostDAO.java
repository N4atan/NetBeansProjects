/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExpenseManager.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class CostDAO {
	
	public static boolean  addCost(Connection conexao, Cost cost) throws SQLException{
		String sql = "INSERT INTO costs (titulo, descricao, categoria, preco, data) VALUES (?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, cost.getTitle());
		stmt.setString(2, cost.getDescription());
		stmt.setString(3, cost.getCategory());
		stmt.setDouble(4, cost.getPrice());
		stmt.setString(5, cost.getDate());
		
		int linhasAfetadas = stmt.executeUpdate();
		stmt.close();
		
		return linhasAfetadas > 0;
	}
}
