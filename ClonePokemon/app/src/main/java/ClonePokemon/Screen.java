/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClonePokemon;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public abstract class Screen {
	public static void clear() {
		System.out.print((char) 27 + "[H" + (char) 27 + "[2J");
		System.out.flush();
	}
	
	public static void clearSimple() {
		for(int i = 0; i < 50; i++) {
			System.out.println("\n");
		}
	}
}
