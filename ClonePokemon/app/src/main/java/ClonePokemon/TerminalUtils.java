/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClonePokemon;
import java.util.Scanner;
/**
 *
 * @author NATANGABRIELWILDNERD
 */
public abstract class TerminalUtils {
	public static void sleep(int temp) {
		try {
			Thread.sleep(temp);
		} catch (InterruptedException e) {
			System.out.println("O diálogo foi interrompido.");
		}
	}
	
	public static void block(Scanner sc) {
		System.out.print("Aperte ENTER para prosseguir! ");
		sc.nextLine();
	}
}
