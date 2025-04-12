/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotenv.DAO;

import com.mysql.cj.log.Log;
import dotenv.database.Database;
import dotenv.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class UserDAO {

	private final Database db = new Database();
	private String errorDAO;
	private static final Logger Log = Logger.getLogger(Database.class.getName());

	public String getErrorDAO() {
		return this.errorDAO;
	}

	public boolean userPost(User user) {
		if (user.getUser_id() != -1) {
			this.errorDAO = "Usuário já consta no banco!";
			return false;
		}

		String sql = """
                                     INSERT INTO usuarios (user_name, user_email, user_password) VALUES (?,?,?)
				""";

		try (PreparedStatement pstmt = this.db.getConnection().prepareStatement(sql)) {

			pstmt.setString(1, user.getUser_name());
			pstmt.setString(2, user.getUser_email());
			pstmt.setString(3, user.getUser_passwordEncrypted());

			pstmt.execute();
			return true;
		} catch (SQLException e) {
			this.errorDAO = e.getLocalizedMessage();
			Log.severe("" + e.getErrorCode());
			return false;
		}
	}

	public User userGet(User user) {
		if (user.getUser_email().isEmpty()) {
			this.errorDAO = "Email não informado";
			return null;
		}

		String sql = """
                                                 SELECT * FROM usuarios WHERE  user_email = ?
					""";

		try (PreparedStatement pstmt = this.db.getConnection().prepareStatement(sql)) {
			pstmt.setString(1, user.getUser_email());
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				User userDb = new User(
								rs.getInt("id"),
								rs.getString("user_name"),
								rs.getString("user_email"),
								rs.getString("user_password"));

				return userDb;
			}

			this.errorDAO = "Usuário não encontrado!";
			return null;
		} catch (SQLException e) {
			this.errorDAO = e.getLocalizedMessage();
			Log.severe("" + e.getErrorCode());
			return null;
		}
	}

}
