/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JvaEmail.dao;

import com.example.JvaEmail.database.Database;
import com.example.JvaEmail.model.Email;
import com.example.JvaEmail.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class EmailDAO {

	private final Database db = new Database();
	private String errorDAO = null;

	public String getError() {
		return this.errorDAO;
	}

	public boolean hasError() {
		return this.errorDAO != null;
	}

	public boolean saveEmail(Email email) {
		this.errorDAO = null;

		String sql = """
                          INSERT INTO emails (id_rementente, id_destinatario, title, body) VALUES (?, ?, ?, ?);
				""";

		try (PreparedStatement pstmt = this.db.getConnection().prepareStatement(sql)) {
			pstmt.setInt(1, email.getRemetente().getId());
			pstmt.setInt(2, email.getDestinatario().getId());
			pstmt.setString(3, email.getTitulo());
			pstmt.setString(4, email.getConteudo());

			return pstmt.executeUpdate() > 0;
		} catch (SQLException e) {
			this.errorDAO = e.getLocalizedMessage();
			return false;
		}
	}

	public ArrayList<Email> getEmails(Email email) {
		this.errorDAO = null;
		String sql = """
                                     SELECT * FROM emails WHERE id_destinatario = ?
				""";

		try (PreparedStatement pstmt = this.db.getConnection().prepareStatement(sql)) {
			pstmt.setInt(1, email.getDestinatario().getId());
			ResultSet rs = pstmt.executeQuery();

			ArrayList<Email> list = new ArrayList();

			while (rs.next()) {
				Email emaildb = new Email();
				emaildb.setId(rs.getInt("id"));
				emaildb.setTitulo(rs.getString("title"));
				emaildb.setConteudo(rs.getString("body"));

				Usuario rem = new Usuario();
				rem.setId(rs.getInt("id_remetente"));
				emaildb.setRemetente(rem);

				Usuario dest = new Usuario();
				dest.setId(rs.getInt("id_destinatario"));
				emaildb.setDestinatario(dest);

				list.add(emaildb);
			}
			return list;
		} catch (SQLException e) {
			this.errorDAO = e.getLocalizedMessage();
			return null;
		}
	}

}
