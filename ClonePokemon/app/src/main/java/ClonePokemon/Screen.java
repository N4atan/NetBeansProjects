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
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
