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
public class CentroPokemon {
	
	public void init(Scanner sc, Treinador player) {
		System.out.println("""
					Enfermeira Joy:
					Bem-vindo ao Centro Pokémon!
					Aqui sempre sera possivel curar seus pokemons! 
					Por favor, aguarde um momento.
                     """);
		
		TerminalUtils.sleep(10000);
		
		for (Pokemon pokemon : player.time) { 
			pokemon.setHp(pokemon.getHpMax());
			System.out.println("\nO pokemon " + pokemon.getName() + "foi curado! Hp: " + pokemon.getHp());
		}
		
		System.out.println("""
					\nEnfermeira Joy:
					Pronto!
					Volte sempre que precisar!
					Boa sorte em sua jornada!
                     """);
		
		TerminalUtils.block(sc);
	}

}
