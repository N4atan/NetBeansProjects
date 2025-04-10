/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotenv.DAO;

import com.mysql.cj.log.Log;
import dotenv.database.Database;
import dotenv.model.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class UserDAO {
	private final Database db = new Database();
	private String errorDAO;
	
	public String getErrorDAO(){
		return this.errorDAO;
	}
	
	private boolean userPost(User user){
		if(user.getUser_id() != -1){
			this.errorDAO = "Usuário já consta no banco!";
			return false;
		}
		
		String sql = """
                                     INSERT INTO users (user_name, user_email, user_password) VALUES (?,?,?)
				""";
		
		try(PreparedStatement pstmt = this.db.getConnection().prepareStatement(sql))
		{
			user.setUser_passwordEncrypted(BCrypt.hashpw(user.getUser_password(), BCrypt.gensalt()));
			
			pstmt.setString(1, user.getUser_name());
			pstmt.setString(2, user.getUser_email());
			pstmt.setString(3, user.getUser_passwordEncrypted());
			
			pstmt.execute();
			return true;
		} catch(SQLException e){
			this.errorDAO = e.getLocalizedMessage();
			return false;
		}
	}
	
}
