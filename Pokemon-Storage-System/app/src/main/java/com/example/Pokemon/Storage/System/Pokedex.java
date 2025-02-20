/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Pokemon.Storage.System;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author gabri
 */
public final class Pokedex {

	public ArrayList<Pokemon> pokemonDisponiveis = new ArrayList<>();
	public ArrayList<Ataque> ataques = new ArrayList<>();

	public Pokedex() {
		addAtaques();
		addPokemons();
	}

	public void listarPokemons() {
		for (Pokemon p : pokemonDisponiveis) {
			System.out.println(p);
		}
	}

	public void addAtaques() {
		// Ataques Normais
		ataques.add(new Ataque("Tackle", "Normal", 40, 100));
		ataques.add(new Ataque("Scratch", "Normal", 40, 100));
		ataques.add(new Ataque("Quick Attack", "Normal", 40, 100));
		ataques.add(new Ataque("Body Slam", "Normal", 85, 100));
		ataques.add(new Ataque("Slash", "Normal", 70, 100));
		ataques.add(new Ataque("Hyper Beam", "Normal", 150, 90));
		ataques.add(new Ataque("Double-Edge", "Normal", 120, 100));
		ataques.add(new Ataque("Take Down", "Normal", 90, 85));
		ataques.add(new Ataque("Swift", "Normal", 60, 100));
		ataques.add(new Ataque("Skull Bash", "Normal", 130, 100));

		// Ataques de Fogo
		ataques.add(new Ataque("Ember", "Fogo", 40, 100));
		ataques.add(new Ataque("Flamethrower", "Fogo", 90, 100));
		ataques.add(new Ataque("Fire Blast", "Fogo", 110, 85));
		ataques.add(new Ataque("Fire Spin", "Fogo", 35, 85));
		ataques.add(new Ataque("Fire Punch", "Fogo", 75, 100));
		ataques.add(new Ataque("Blaze Kick", "Fogo", 85, 90));
		ataques.add(new Ataque("Heat Wave", "Fogo", 95, 90));

		// Ataques de Água
		ataques.add(new Ataque("Water Gun", "Água", 40, 100));
		ataques.add(new Ataque("Hydro Pump", "Água", 110, 80));
		ataques.add(new Ataque("Bubble Beam", "Água", 65, 100));
		ataques.add(new Ataque("Surf", "Água", 90, 100));
		ataques.add(new Ataque("Aqua Tail", "Água", 90, 90));
		ataques.add(new Ataque("Waterfall", "Água", 80, 100));
		ataques.add(new Ataque("Whirlpool", "Água", 35, 85));

		// Ataques de Grama
		ataques.add(new Ataque("Vine Whip", "Grama", 45, 100));
		ataques.add(new Ataque("Razor Leaf", "Grama", 55, 95));
		ataques.add(new Ataque("Solar Beam", "Grama", 120, 100));
		ataques.add(new Ataque("Mega Drain", "Grama", 40, 100));
		ataques.add(new Ataque("Giga Drain", "Grama", 75, 100));
		ataques.add(new Ataque("Leaf Blade", "Grama", 90, 100));
		ataques.add(new Ataque("Seed Bomb", "Grama", 80, 100));

		// Ataques Elétricos
		ataques.add(new Ataque("Thunder Shock", "Elétrico", 40, 100));
		ataques.add(new Ataque("Thunderbolt", "Elétrico", 90, 100));
		ataques.add(new Ataque("Thunder", "Elétrico", 110, 70));
		ataques.add(new Ataque("Thunder Punch", "Elétrico", 75, 100));
		ataques.add(new Ataque("Spark", "Elétrico", 65, 100));
		ataques.add(new Ataque("Volt Tackle", "Elétrico", 120, 100));
		ataques.add(new Ataque("Discharge", "Elétrico", 80, 100));

		// Ataques de Gelo
		ataques.add(new Ataque("Ice Beam", "Gelo", 90, 100));
		ataques.add(new Ataque("Blizzard", "Gelo", 110, 70));
		ataques.add(new Ataque("Ice Punch", "Gelo", 75, 100));
		ataques.add(new Ataque("Aurora Beam", "Gelo", 65, 100));
		ataques.add(new Ataque("Icy Wind", "Gelo", 55, 95));
		ataques.add(new Ataque("Frost Breath", "Gelo", 60, 90));
		ataques.add(new Ataque("Avalanche", "Gelo", 60, 100));

		// Ataques de Lutador
		ataques.add(new Ataque("Double Kick", "Lutador", 30, 100));
		ataques.add(new Ataque("High Jump Kick", "Lutador", 130, 90));
		ataques.add(new Ataque("Brick Break", "Lutador", 75, 100));
		ataques.add(new Ataque("Cross Chop", "Lutador", 100, 80));
		ataques.add(new Ataque("Dynamic Punch", "Lutador", 100, 50));
		ataques.add(new Ataque("Focus Blast", "Lutador", 120, 70));
		ataques.add(new Ataque("Close Combat", "Lutador", 120, 100));

		// Ataques de Veneno
		ataques.add(new Ataque("Poison Sting", "Veneno", 15, 100));
		ataques.add(new Ataque("Sludge", "Veneno", 65, 100));
		ataques.add(new Ataque("Sludge Bomb", "Veneno", 90, 100));
		ataques.add(new Ataque("Acid", "Veneno", 40, 100));
		ataques.add(new Ataque("Toxic", "Veneno", 0, 90)); // Ataque de status
		ataques.add(new Ataque("Venoshock", "Veneno", 65, 100));
		ataques.add(new Ataque("Gunk Shot", "Veneno", 120, 80));

		// Ataques de Terra
		ataques.add(new Ataque("Earthquake", "Terra", 100, 100));
		ataques.add(new Ataque("Dig", "Terra", 80, 100));
		ataques.add(new Ataque("Bone Club", "Terra", 65, 85));
		ataques.add(new Ataque("Bulldoze", "Terra", 60, 100));
		ataques.add(new Ataque("Sand Tomb", "Terra", 35, 85));
		ataques.add(new Ataque("Drill Run", "Terra", 80, 95));
		ataques.add(new Ataque("Earth Power", "Terra", 90, 100));

		// Ataques de Pedra
		ataques.add(new Ataque("Rock Throw", "Pedra", 50, 90));
		ataques.add(new Ataque("Rock Slide", "Pedra", 75, 90));
		ataques.add(new Ataque("Stone Edge", "Pedra", 100, 80));
		ataques.add(new Ataque("Ancient Power", "Pedra", 60, 100));
		ataques.add(new Ataque("Power Gem", "Pedra", 80, 100));
		ataques.add(new Ataque("Rock Tomb", "Pedra", 60, 95));
		ataques.add(new Ataque("Head Smash", "Pedra", 150, 80));

		// Ataques de Psíquico
		ataques.add(new Ataque("Confusion", "Psíquico", 50, 100));
		ataques.add(new Ataque("Psychic", "Psíquico", 90, 100));
		ataques.add(new Ataque("Psybeam", "Psíquico", 65, 100));
		ataques.add(new Ataque("Future Sight", "Psíquico", 120, 100));
		ataques.add(new Ataque("Zen Headbutt", "Psíquico", 80, 90));
		ataques.add(new Ataque("Extrasensory", "Psíquico", 80, 100));
		ataques.add(new Ataque("Psycho Cut", "Psíquico", 70, 100));

		// Ataques de Inseto
		ataques.add(new Ataque("Bug Bite", "Inseto", 60, 100));
		ataques.add(new Ataque("Pin Missile", "Inseto", 25, 95));
		ataques.add(new Ataque("X-Scissor", "Inseto", 80, 100));
		ataques.add(new Ataque("Megahorn", "Inseto", 120, 85));
		ataques.add(new Ataque("Signal Beam", "Inseto", 75, 100));
		ataques.add(new Ataque("U-turn", "Inseto", 70, 100));
		ataques.add(new Ataque("Bug Buzz", "Inseto", 90, 100));

		// Ataques de Fantasma
		ataques.add(new Ataque("Lick", "Fantasma", 30, 100));
		ataques.add(new Ataque("Shadow Ball", "Fantasma", 80, 100));
		ataques.add(new Ataque("Shadow Claw", "Fantasma", 70, 100));
		ataques.add(new Ataque("Night Shade", "Fantasma", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Hex", "Fantasma", 65, 100));
		ataques.add(new Ataque("Phantom Force", "Fantasma", 90, 100));
		ataques.add(new Ataque("Shadow Sneak", "Fantasma", 40, 100));

		// Ataques de Dragão
		ataques.add(new Ataque("Dragon Claw", "Dragão", 80, 100));
		ataques.add(new Ataque("Dragon Breath", "Dragão", 60, 100));
		ataques.add(new Ataque("Dragon Pulse", "Dragão", 85, 100));
		ataques.add(new Ataque("Outrage", "Dragão", 120, 100));
		ataques.add(new Ataque("Dragon Tail", "Dragão", 60, 90));
		ataques.add(new Ataque("Draco Meteor", "Dragão", 130, 90));
		ataques.add(new Ataque("Dragon Rush", "Dragão", 100, 75));

		// Ataques de Dark
		ataques.add(new Ataque("Bite", "Dark", 60, 100));
		ataques.add(new Ataque("Crunch", "Dark", 80, 100));
		ataques.add(new Ataque("Dark Pulse", "Dark", 80, 100));
		ataques.add(new Ataque("Night Slash", "Dark", 70, 100));
		ataques.add(new Ataque("Sucker Punch", "Dark", 70, 100));
		ataques.add(new Ataque("Foul Play", "Dark", 95, 100));
		ataques.add(new Ataque("Knock Off", "Dark", 65, 100));

		// Ataques de Aço
		ataques.add(new Ataque("Iron Tail", "Aço", 100, 75));
		ataques.add(new Ataque("Metal Claw", "Aço", 50, 95));
		ataques.add(new Ataque("Flash Cannon", "Aço", 80, 100));
		ataques.add(new Ataque("Iron Head", "Aço", 80, 100));
		ataques.add(new Ataque("Steel Wing", "Aço", 70, 90));
		ataques.add(new Ataque("Meteor Mash", "Aço", 90, 90));
		ataques.add(new Ataque("Bullet Punch", "Aço", 40, 100));

		// Ataques de Fada
		ataques.add(new Ataque("Dazzling Gleam", "Fada", 80, 100));
		ataques.add(new Ataque("Moonblast", "Fada", 95, 100));
		ataques.add(new Ataque("Play Rough", "Fada", 90, 90));
		ataques.add(new Ataque("Fairy Wind", "Fada", 40, 100));
		ataques.add(new Ataque("Draining Kiss", "Fada", 50, 100));
		ataques.add(new Ataque("Misty Explosion", "Fada", 100, 100));
		ataques.add(new Ataque("Spirit Break", "Fada", 75, 100));

		// Ataques de Voador
		ataques.add(new Ataque("Wing Attack", "Voador", 60, 100));
		ataques.add(new Ataque("Drill Peck", "Voador", 80, 100));
		ataques.add(new Ataque("Aerial Ace", "Voador", 60, 100));
		ataques.add(new Ataque("Air Slash", "Voador", 75, 95));
		ataques.add(new Ataque("Brave Bird", "Voador", 120, 100));
		ataques.add(new Ataque("Hurricane", "Voador", 110, 70));
		ataques.add(new Ataque("Sky Attack", "Voador", 140, 90));
	}

	public void addPokemons() {
		// Adicionando Pokémon com ataques baseados no nível e tipo
		pokemonDisponiveis.add(new Pokemon(1, "Bulbasaur", "Grama/Veneno", 5, new Ataque[]{ataques.get(0), ataques.get(24)})); // Tackle, Vine Whip
		pokemonDisponiveis.add(new Pokemon(2, "Ivysaur", "Grama/Veneno", 16, new Ataque[]{ataques.get(24), ataques.get(25), ataques.get(26)})); // Vine Whip, Razor Leaf, Leech Seed
		pokemonDisponiveis.add(new Pokemon(3, "Venusaur", "Grama/Veneno", 32, new Ataque[]{ataques.get(25), ataques.get(26), ataques.get(27)})); // Razor Leaf, Solar Beam, Leech Seed

		pokemonDisponiveis.add(new Pokemon(4, "Charmander", "Fogo", 5, new Ataque[]{ataques.get(0), ataques.get(10)})); // Tackle, Ember
		pokemonDisponiveis.add(new Pokemon(5, "Charmeleon", "Fogo", 16, new Ataque[]{ataques.get(10), ataques.get(11), ataques.get(12)})); // Ember, Flamethrower, Fire Spin
		pokemonDisponiveis.add(new Pokemon(6, "Charizard", "Fogo/Voador", 36, new Ataque[]{ataques.get(11), ataques.get(12), ataques.get(13)})); // Flamethrower, Fire Blast, Heat Wave

		pokemonDisponiveis.add(new Pokemon(7, "Squirtle", "Água", 5, new Ataque[]{ataques.get(0), ataques.get(17)})); // Tackle, Water Gun
		pokemonDisponiveis.add(new Pokemon(8, "Wartortle", "Água", 16, new Ataque[]{ataques.get(17), ataques.get(18), ataques.get(19)})); // Water Gun, Bubble Beam, Hydro Pump
		pokemonDisponiveis.add(new Pokemon(9, "Blastoise", "Água", 36, new Ataque[]{ataques.get(18), ataques.get(19), ataques.get(20)})); // Bubble Beam, Hydro Pump, Waterfall

		pokemonDisponiveis.add(new Pokemon(25, "Pikachu", "Elétrico", 8, new Ataque[]{ataques.get(0), ataques.get(31), ataques.get(32)})); // Tackle, Thunder Shock, Thunderbolt
		pokemonDisponiveis.add(new Pokemon(26, "Raichu", "Elétrico", 30, new Ataque[]{ataques.get(32), ataques.get(33), ataques.get(34)})); // Thunderbolt, Thunder Punch, Volt Tackle

		// Jolteon e Zapdos com os mesmos ataques
		pokemonDisponiveis.add(new Pokemon(135, "Jolteon", "Elétrico", 5, new Ataque[]{ataques.get(31), ataques.get(32), ataques.get(34)})); // Thunder Shock, Thunderbolt, Volt Tackle
		pokemonDisponiveis.add(new Pokemon(145, "Zapdos", "Elétrico/Voador", 5, new Ataque[]{ataques.get(31), ataques.get(32), ataques.get(34)})); // Thunder Shock, Thunderbolt, Volt Tackle

		// Adicionando mais Pokémon com diversidade de ataques
		pokemonDisponiveis.add(new Pokemon(58, "Growlithe", "Fogo", 5, new Ataque[]{ataques.get(0), ataques.get(10)})); // Tackle, Ember
		pokemonDisponiveis.add(new Pokemon(59, "Arcanine", "Fogo", 30, new Ataque[]{ataques.get(11), ataques.get(12), ataques.get(13)})); // Flamethrower, Fire Blast, Heat Wave

		pokemonDisponiveis.add(new Pokemon(63, "Abra", "Psíquico", 5, new Ataque[]{ataques.get(0), ataques.get(50)})); // Tackle, Confusion
		pokemonDisponiveis.add(new Pokemon(64, "Kadabra", "Psíquico", 16, new Ataque[]{ataques.get(50), ataques.get(51), ataques.get(52)})); // Confusion, Psybeam, Psychic
		pokemonDisponiveis.add(new Pokemon(65, "Alakazam", "Psíquico", 36, new Ataque[]{ataques.get(51), ataques.get(52), ataques.get(53)})); // Psybeam, Psychic, Future Sight

		pokemonDisponiveis.add(new Pokemon(66, "Machop", "Lutador", 5, new Ataque[]{ataques.get(0), ataques.get(40)})); // Tackle, Double Kick
		pokemonDisponiveis.add(new Pokemon(67, "Machoke", "Lutador", 28, new Ataque[]{ataques.get(40), ataques.get(41), ataques.get(42)})); // Double Kick, Brick Break, Cross Chop
		pokemonDisponiveis.add(new Pokemon(68, "Machamp", "Lutador", 36, new Ataque[]{ataques.get(41), ataques.get(42), ataques.get(43)})); // Brick Break, Cross Chop, Dynamic Punch

		// Gengar corrigido (Fantasma/Veneno)
		pokemonDisponiveis.add(new Pokemon(92, "Gastly", "Fantasma/Veneno", 5, new Ataque[]{ataques.get(0), ataques.get(60)})); // Tackle, Lick
		pokemonDisponiveis.add(new Pokemon(93, "Haunter", "Fantasma/Veneno", 25, new Ataque[]{ataques.get(60), ataques.get(61), ataques.get(62)})); // Lick, Shadow Ball, Shadow Claw
		pokemonDisponiveis.add(new Pokemon(94, "Gengar", "Fantasma/Veneno", 36, new Ataque[]{ataques.get(61), ataques.get(62), ataques.get(63)})); // Shadow Ball, Shadow Claw, Night Shade

		pokemonDisponiveis.add(new Pokemon(147, "Dratini", "Dragão", 5, new Ataque[]{ataques.get(0), ataques.get(70)})); // Tackle, Dragon Breath
		pokemonDisponiveis.add(new Pokemon(148, "Dragonair", "Dragão", 30, new Ataque[]{ataques.get(70), ataques.get(71), ataques.get(72)})); // Dragon Breath, Dragon Pulse, Outrage
		pokemonDisponiveis.add(new Pokemon(149, "Dragonite", "Dragão/Voador", 55, new Ataque[]{ataques.get(71), ataques.get(72), ataques.get(73)})); // Dragon Pulse, Outrage, Dragon Rush

		// Adicionando mais Pokémon com ataques únicos
		pokemonDisponiveis.add(new Pokemon(150, "Mewtwo", "Psíquico", 5, new Ataque[]{ataques.get(50), ataques.get(51), ataques.get(52)})); // Confusion, Psybeam, Psychic
		pokemonDisponiveis.add(new Pokemon(151, "Mew", "Psíquico", 5, new Ataque[]{ataques.get(50), ataques.get(51), ataques.get(52)})); // Confusion, Psybeam, Psychic

		Collections.shuffle(pokemonDisponiveis);
	}

}
