/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dotenv.model;

import java.time.LocalDateTime;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class Message {
	private String remetente;
	private String conteudo;
	private String timestamp;
	
	public void Message(String remetente, String conteudo){
		this.remetente = remetente;
		this.conteudo = conteudo;
		
		LocalDateTime ld = LocalDateTime.now();
		this.timestamp = String.format("%d/%d/%d %d:%d:%d", ld.getDayOfMonth(),ld.getMonthValue(), ld.getYear(), ld.getHour(), ld.getMinute(), ld.getSecond());
	}
}
