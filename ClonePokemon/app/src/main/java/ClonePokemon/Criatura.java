/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ClonePokemon;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public interface Criatura {	
	void atacar(Pokemon oponentePokemon);
	boolean fugir(Pokemon oponentePokemon, int somaResultDados);
	void usarItem();
	boolean estaVivo();
}
