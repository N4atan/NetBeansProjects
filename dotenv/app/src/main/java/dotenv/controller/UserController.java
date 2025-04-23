/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotenv.controller;

import dotenv.DAO.UserDAO;
import dotenv.model.User;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.Random;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class UserController {
	private final UserDAO UserDao = new UserDAO();
	private String errorController;
	
	public String getErrController(){
		return this.errorController;
	}
	
	public boolean registerUser(String name, String lastName, String email, String password){
		String fullName = String.format("%s %s", name, lastName);
		var encryptedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
		
		User user = new User(email);
		user.setUser_name(fullName);
		user.setUser_passwordEncrypted(encryptedPassword);
		
		boolean resultOp = UserDao.userPost(user);
		
		if(resultOp){
			return true;
		} else {
			this.errorController = this.UserDao.getErrorDAO();
			return false;
		}
	}
	
	public User loginUser(String email, String password){
		User user = new User(email);
		
		User userLogged = UserDao.userGet(user);
		
		user.setUser_password(password);
		
		if(userLogged == null){
			this.errorController = this.UserDao.getErrorDAO();
			return null;
		} else {
			if(BCrypt.checkpw(user.getUser_password(), userLogged.getUser_passwordEncrypted())){
				return new User(userLogged.getUser_name(), userLogged.getUser_email());
			} else {
				this.errorController = "Senhas Não Coincidem!";
				return null;
			}
		}
	}
	
	public String enviarCodigo(String emailDestino) {
		final String remetente = "gabrielnathan2912@gmail.com";
		final String senha = "bulf cyrj pzar rrer"; //Senha de app google
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true"); // ativa autenticação SMTP (usuário/senha)
		props.put("mail.smtp.starttls.enable", "true"); // ativa criptografia TLS (segurança)
		props.put("mail.smtp.host", "smtp.gmail.com"); // servidor SMTP do Gmail
		props.put("mail.smtp.port", "587"); // porta TLS padrão do Gmail

		//Isso diz: "usa essas configurações e autentica com esse e-mail e senha (senha de app)".
		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(remetente, senha);
			}
		});

		try {
			//Geração do código:
			Random random = new Random();
			int codigoInt = 100000 + random.nextInt(900000); // Gera número entre 100000 e 999999
			String codigo = String.valueOf(codigoInt);
			
			
			
			//Configuração da mensagem:
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(remetente)); // remetente
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailDestino)); // destinatário
			message.setSubject("Seu código de verificação"); // título do e-mail
			message.setText("Seu código é: " + codigo); // corpo do e-mail

			Transport.send(message);
			return codigo;
		} catch (MessagingException e) {
			this.errorController = e.getLocalizedMessage();
			return null;
		}
	}
}
