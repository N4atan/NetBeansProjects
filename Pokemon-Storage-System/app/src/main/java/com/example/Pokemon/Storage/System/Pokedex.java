/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Pokemon.Storage.System;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Pokedex {

	public ArrayList<Pokemon> pokemonDisponiveis = new ArrayList<>();

	public Pokedex() {
		pokemonDisponiveis.add(new Pokemon(1, "Bulbasaur", "Grama/Veneno", 5));
		pokemonDisponiveis.add(new Pokemon(4, "Charmander", "Fogo", 5));
		pokemonDisponiveis.add(new Pokemon(7, "Squirtle", "Agua", 5));
		pokemonDisponiveis.add(new Pokemon(25, "Pikachu", "Eletrico", 8));
		pokemonDisponiveis.add(new Pokemon(39, "Jigglypuff", "Normal/Fada", 7));
		pokemonDisponiveis.add(new Pokemon(58, "Growlithe", "Fogo", 10));
		pokemonDisponiveis.add(new Pokemon(74, "Geodude", "Pedra/Terra", 6));
		pokemonDisponiveis.add(new Pokemon(92, "Gastly", "Fantasma/Veneno", 9));
		pokemonDisponiveis.add(new Pokemon(129, "Magikarp", "Agua", 3));
		pokemonDisponiveis.add(new Pokemon(133, "Eevee", "Normal", 5));
	}

	public void listarPokemons() {
		for (Pokemon p : pokemonDisponiveis) {
			System.out.println(p);
		}
	}
}
