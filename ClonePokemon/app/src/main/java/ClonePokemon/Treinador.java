/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClonePokemon;
import java.util.ArrayList;
/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class Treinador {
	private String name;
	private ArrayList<Pokemon> time;
	
	public Treinador(String name){
		this.name = name;
		this.time = new ArrayList<>();
	}
	
	public void adicionarAoTime(Pokemon pokemon) {
		time.add(pokemon);
		System.out.println("| -  O pokemon " + pokemon.getName() + " foi adicionado a equipe! ");
	}
	
	public void exibirTime() {
		for(Pokemon pokemon : time) {
			System.out.println(pokemon.toString());
		}
	}
	
	
}
