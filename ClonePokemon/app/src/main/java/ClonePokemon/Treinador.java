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
	public String name;
	public ArrayList<Pokemon> time;
	
	
	public Treinador(String name){
		this.name = name;
		this.time = new ArrayList<>();
	}
	
	public void adicionarAoTime(Pokemon pokemon) {
		time.add(pokemon);
		System.out.println("| -  O pokemon " + pokemon.getName() + " foi adicionado a equipe! ");
	}
	
	public void adicionarAoTime2(Pokemon pokemon) {
		time.add(pokemon);
	}
	
	public void exibirTime() {
		for(Pokemon pokemon : time) {
			System.out.println(pokemon.toString());
		}
	}
	
	public String getName() { return this.name; }

	
	
}
