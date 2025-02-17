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
		ataques.add(new Ataque("Tackle", "Normal", 40, 100));
		ataques.add(new Ataque("Scratch", "Normal", 40, 100));
		ataques.add(new Ataque("Ember", "Fogo", 40, 100));
		ataques.add(new Ataque("Water Gun", "Água", 40, 100));
		ataques.add(new Ataque("Vine Whip", "Grama", 45, 100));
		ataques.add(new Ataque("Thunder Shock", "Elétrico", 40, 100));
		ataques.add(new Ataque("Quick Attack", "Normal", 40, 100));
		ataques.add(new Ataque("Bite", "Dark", 60, 100));
		ataques.add(new Ataque("Flamethrower", "Fogo", 90, 100));
		ataques.add(new Ataque("Hydro Pump", "Água", 110, 80));
		ataques.add(new Ataque("Solar Beam", "Grama", 120, 100));
		ataques.add(new Ataque("Thunderbolt", "Elétrico", 90, 100));
		ataques.add(new Ataque("Psychic", "Psíquico", 90, 100));
		ataques.add(new Ataque("Ice Beam", "Gelo", 90, 100));
		ataques.add(new Ataque("Body Slam", "Normal", 85, 100));
		ataques.add(new Ataque("Hyper Beam", "Normal", 150, 90));
		ataques.add(new Ataque("Slash", "Normal", 70, 100));
		ataques.add(new Ataque("Rock Slide", "Pedra", 75, 90));
		ataques.add(new Ataque("Earthquake", "Terra", 100, 100));
		ataques.add(new Ataque("Fire Blast", "Fogo", 110, 85));
		ataques.add(new Ataque("Bubble Beam", "Água", 65, 100));
		ataques.add(new Ataque("Razor Leaf", "Grama", 55, 95));
		ataques.add(new Ataque("Thunder Wave", "Elétrico", 0, 90)); // Ataque de status
		ataques.add(new Ataque("Poison Sting", "Veneno", 15, 100));
		ataques.add(new Ataque("Confusion", "Psíquico", 50, 100));
		ataques.add(new Ataque("Leech Seed", "Grama", 0, 90)); // Ataque de status
		ataques.add(new Ataque("Fire Spin", "Fogo", 35, 85));
		ataques.add(new Ataque("Surf", "Água", 90, 100));
		ataques.add(new Ataque("Ice Punch", "Gelo", 75, 100));
		ataques.add(new Ataque("Thunder Punch", "Elétrico", 75, 100));
		ataques.add(new Ataque("Fire Punch", "Fogo", 75, 100));
		ataques.add(new Ataque("Drill Peck", "Voador", 80, 100));
		ataques.add(new Ataque("Mega Drain", "Grama", 40, 100));
		ataques.add(new Ataque("Pin Missile", "Inseto", 25, 95));
		ataques.add(new Ataque("Bone Club", "Terra", 65, 85));
		ataques.add(new Ataque("Wing Attack", "Voador", 60, 100));
		ataques.add(new Ataque("Swords Dance", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Double Kick", "Lutador", 30, 100));
		ataques.add(new Ataque("Horn Attack", "Normal", 65, 100));
		ataques.add(new Ataque("Stomp", "Normal", 65, 100));
		ataques.add(new Ataque("Fury Attack", "Normal", 15, 85));
		ataques.add(new Ataque("Horn Drill", "Normal", 0, 30)); // Ataque de um golpe
		ataques.add(new Ataque("Toxic", "Veneno", 0, 85)); // Ataque de status
		ataques.add(new Ataque("Agility", "Psíquico", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Teleport", "Psíquico", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Night Shade", "Fantasma", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Mimic", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Screech", "Normal", 0, 85)); // Ataque de status
		ataques.add(new Ataque("Double Team", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Recover", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Harden", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Minimize", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Smokescreen", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Confuse Ray", "Fantasma", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Withdraw", "Água", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Defense Curl", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Barrier", "Psíquico", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Light Screen", "Psíquico", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Haze", "Gelo", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Reflect", "Psíquico", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Focus Energy", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Bide", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Metronome", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Mirror Move", "Voador", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Self-Destruct", "Normal", 200, 100)); // Ataque de auto-destruição
		ataques.add(new Ataque("Egg Bomb", "Normal", 100, 75));
		ataques.add(new Ataque("Lick", "Fantasma", 30, 100));
		ataques.add(new Ataque("Smog", "Veneno", 30, 70));
		ataques.add(new Ataque("Sludge", "Veneno", 65, 100));
		ataques.add(new Ataque("Bone Rush", "Terra", 25, 90));
		ataques.add(new Ataque("Fire Spin", "Fogo", 35, 85));
		ataques.add(new Ataque("Waterfall", "Água", 80, 100));
		ataques.add(new Ataque("Clamp", "Água", 35, 85));
		ataques.add(new Ataque("Swift", "Normal", 60, 100));
		ataques.add(new Ataque("Skull Bash", "Normal", 130, 100));
		ataques.add(new Ataque("Spike Cannon", "Normal", 20, 100));
		ataques.add(new Ataque("Constrict", "Normal", 10, 100));
		ataques.add(new Ataque("Amnesia", "Psíquico", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Kinesis", "Psíquico", 0, 80)); // Ataque de status
		ataques.add(new Ataque("Soft-Boiled", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("High Jump Kick", "Lutador", 130, 90));
		ataques.add(new Ataque("Glare", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Dream Eater", "Psíquico", 100, 100));
		ataques.add(new Ataque("Poison Gas", "Veneno", 0, 90)); // Ataque de status
		ataques.add(new Ataque("Barrage", "Normal", 15, 85));
		ataques.add(new Ataque("Leech Life", "Inseto", 20, 100));
		ataques.add(new Ataque("Lovely Kiss", "Normal", 0, 75)); // Ataque de status
		ataques.add(new Ataque("Sky Attack", "Voador", 140, 90));
		ataques.add(new Ataque("Transform", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Bubble", "Água", 40, 100));
		ataques.add(new Ataque("Dizzy Punch", "Normal", 70, 100));
		ataques.add(new Ataque("Spore", "Grama", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Flash", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Psywave", "Psíquico", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Splash", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Acid Armor", "Veneno", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Crabhammer", "Água", 100, 90));
		ataques.add(new Ataque("Explosion", "Normal", 250, 100)); // Ataque de auto-destruição
		ataques.add(new Ataque("Fury Swipes", "Normal", 18, 80));
		ataques.add(new Ataque("Bonemerang", "Terra", 50, 90));
		ataques.add(new Ataque("Rest", "Psíquico", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Rock Throw", "Pedra", 50, 90));
		ataques.add(new Ataque("Sharpen", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Conversion", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Tri Attack", "Normal", 80, 100));
		ataques.add(new Ataque("Super Fang", "Normal", 0, 90)); // Ataque de status
		ataques.add(new Ataque("Slash", "Normal", 70, 100));
		ataques.add(new Ataque("Substitute", "Normal", 0, 100)); // Ataque de status
		ataques.add(new Ataque("Struggle", "Normal", 50, 100)); // Ataque de último recurso
	}

	public void addPokemons() {
		// Adicionando todos os 151 Pokémon da primeira geração com seus ataques
		pokemonDisponiveis.add(new Pokemon(1, "Bulbasaur", "Grama/Veneno", 5, new Ataque[]{ataques.get(0), ataques.get(4), ataques.get(25), ataques.get(21)})); // Tackle, Vine Whip, Leech Seed, Razor Leaf
		pokemonDisponiveis.add(new Pokemon(2, "Ivysaur", "Grama/Veneno", 16, new Ataque[]{ataques.get(0), ataques.get(4), ataques.get(25), ataques.get(21)})); // Tackle, Vine Whip, Leech Seed, Razor Leaf
		pokemonDisponiveis.add(new Pokemon(3, "Venusaur", "Grama/Veneno", 32, new Ataque[]{ataques.get(0), ataques.get(4), ataques.get(25), ataques.get(10)})); // Tackle, Vine Whip, Leech Seed, Solar Beam

		pokemonDisponiveis.add(new Pokemon(4, "Charmander", "Fogo", 5, new Ataque[]{ataques.get(0), ataques.get(2), ataques.get(27), ataques.get(8)})); // Tackle, Ember, Fire Spin, Flamethrower
		pokemonDisponiveis.add(new Pokemon(5, "Charmeleon", "Fogo", 16, new Ataque[]{ataques.get(0), ataques.get(2), ataques.get(27), ataques.get(8)})); // Tackle, Ember, Fire Spin, Flamethrower
		pokemonDisponiveis.add(new Pokemon(6, "Charizard", "Fogo/Voador", 36, new Ataque[]{ataques.get(0), ataques.get(2), ataques.get(27), ataques.get(19)})); // Tackle, Ember, Fire Spin, Fire Blast

		pokemonDisponiveis.add(new Pokemon(7, "Squirtle", "Água", 5, new Ataque[]{ataques.get(0), ataques.get(3), ataques.get(20), ataques.get(9)})); // Tackle, Water Gun, Bubble Beam, Hydro Pump
		pokemonDisponiveis.add(new Pokemon(8, "Wartortle", "Água", 16, new Ataque[]{ataques.get(0), ataques.get(3), ataques.get(20), ataques.get(9)})); // Tackle, Water Gun, Bubble Beam, Hydro Pump
		pokemonDisponiveis.add(new Pokemon(9, "Blastoise", "Água", 36, new Ataque[]{ataques.get(0), ataques.get(3), ataques.get(20), ataques.get(9)})); // Tackle, Water Gun, Bubble Beam, Hydro Pump

		pokemonDisponiveis.add(new Pokemon(10, "Caterpie", "Inseto", 3, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, String Shot, Bug Bite, Harden
		pokemonDisponiveis.add(new Pokemon(11, "Metapod", "Inseto", 7, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, String Shot, Bug Bite, Harden
		pokemonDisponiveis.add(new Pokemon(12, "Butterfree", "Inseto/Voador", 10, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, String Shot, Bug Bite, Harden

		pokemonDisponiveis.add(new Pokemon(13, "Weedle", "Inseto/Veneno", 3, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, String Shot, Bug Bite, Harden
		pokemonDisponiveis.add(new Pokemon(14, "Kakuna", "Inseto/Veneno", 7, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, String Shot, Bug Bite, Harden
		pokemonDisponiveis.add(new Pokemon(15, "Beedrill", "Inseto/Veneno", 10, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, String Shot, Bug Bite, Harden

		pokemonDisponiveis.add(new Pokemon(16, "Pidgey", "Normal/Voador", 3, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Gust, Quick Attack, Sand Attack
		pokemonDisponiveis.add(new Pokemon(17, "Pidgeotto", "Normal/Voador", 18, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Gust, Quick Attack, Sand Attack
		pokemonDisponiveis.add(new Pokemon(18, "Pidgeot", "Normal/Voador", 36, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Gust, Quick Attack, Sand Attack

		pokemonDisponiveis.add(new Pokemon(19, "Rattata", "Normal", 3, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Tail Whip, Quick Attack, Hyper Fang
		pokemonDisponiveis.add(new Pokemon(20, "Raticate", "Normal", 20, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Tail Whip, Quick Attack, Hyper Fang

		pokemonDisponiveis.add(new Pokemon(21, "Spearow", "Normal/Voador", 4, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Peck, Leer, Fury Attack
		pokemonDisponiveis.add(new Pokemon(22, "Fearow", "Normal/Voador", 20, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Peck, Leer, Fury Attack

		pokemonDisponiveis.add(new Pokemon(23, "Ekans", "Veneno", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Wrap, Poison Sting, Bite
		pokemonDisponiveis.add(new Pokemon(24, "Arbok", "Veneno", 22, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Wrap, Poison Sting, Bite

		pokemonDisponiveis.add(new Pokemon(25, "Pikachu", "Elétrico", 8, new Ataque[]{ataques.get(0), ataques.get(5), ataques.get(11), ataques.get(6)})); // Tackle, Thunder Shock, Thunderbolt, Quick Attack
		pokemonDisponiveis.add(new Pokemon(26, "Raichu", "Elétrico", 30, new Ataque[]{ataques.get(0), ataques.get(5), ataques.get(11), ataques.get(6)})); // Tackle, Thunder Shock, Thunderbolt, Quick Attack

		pokemonDisponiveis.add(new Pokemon(27, "Sandshrew", "Terra", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Sand Attack, Slash
		pokemonDisponiveis.add(new Pokemon(28, "Sandslash", "Terra", 22, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Sand Attack, Slash

		pokemonDisponiveis.add(new Pokemon(29, "Nidoran♀", "Veneno", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Tail Whip, Double Kick
		pokemonDisponiveis.add(new Pokemon(30, "Nidorina", "Veneno", 16, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Tail Whip, Double Kick
		pokemonDisponiveis.add(new Pokemon(31, "Nidoqueen", "Veneno/Terra", 36, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Tail Whip, Double Kick

		pokemonDisponiveis.add(new Pokemon(32, "Nidoran♂", "Veneno", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Peck, Focus Energy, Double Kick
		pokemonDisponiveis.add(new Pokemon(33, "Nidorino", "Veneno", 16, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Peck, Focus Energy, Double Kick
		pokemonDisponiveis.add(new Pokemon(34, "Nidoking", "Veneno/Terra", 36, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Peck, Focus Energy, Double Kick

		pokemonDisponiveis.add(new Pokemon(35, "Clefairy", "Normal", 10, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Growl, Pound, Sing
		pokemonDisponiveis.add(new Pokemon(36, "Clefable", "Normal", 30, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Growl, Pound, Sing

		pokemonDisponiveis.add(new Pokemon(37, "Vulpix", "Fogo", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Tail Whip, Ember, Quick Attack
		pokemonDisponiveis.add(new Pokemon(38, "Ninetales", "Fogo", 30, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Tail Whip, Ember, Quick Attack

		pokemonDisponiveis.add(new Pokemon(39, "Jigglypuff", "Normal", 7, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Sing, Pound, Disable
		pokemonDisponiveis.add(new Pokemon(40, "Wigglytuff", "Normal", 30, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Sing, Pound, Disable

		pokemonDisponiveis.add(new Pokemon(41, "Zubat", "Veneno/Voador", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Leech Life, Supersonic, Astonish
		pokemonDisponiveis.add(new Pokemon(42, "Golbat", "Veneno/Voador", 22, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Leech Life, Supersonic, Astonish

		pokemonDisponiveis.add(new Pokemon(43, "Oddish", "Grama/Veneno", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Absorb, Sweet Scent, Acid
		pokemonDisponiveis.add(new Pokemon(44, "Gloom", "Grama/Veneno", 21, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Absorb, Sweet Scent, Acid
		pokemonDisponiveis.add(new Pokemon(45, "Vileplume", "Grama/Veneno", 36, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Absorb, Sweet Scent, Acid

		pokemonDisponiveis.add(new Pokemon(46, "Paras", "Inseto/Grama", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Stun Spore, Leech Life
		pokemonDisponiveis.add(new Pokemon(47, "Parasect", "Inseto/Grama", 24, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Stun Spore, Leech Life

		pokemonDisponiveis.add(new Pokemon(48, "Venonat", "Inseto/Veneno", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Disable, Supersonic, Confusion
		pokemonDisponiveis.add(new Pokemon(49, "Venomoth", "Inseto/Veneno", 22, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Disable, Supersonic, Confusion

		pokemonDisponiveis.add(new Pokemon(50, "Diglett", "Terra", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Sand Attack, Dig
		pokemonDisponiveis.add(new Pokemon(51, "Dugtrio", "Terra", 26, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Sand Attack, Dig

		pokemonDisponiveis.add(new Pokemon(52, "Meowth", "Normal", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Growl, Bite
		pokemonDisponiveis.add(new Pokemon(53, "Persian", "Normal", 28, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Growl, Bite

		pokemonDisponiveis.add(new Pokemon(54, "Psyduck", "Água", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Tail Whip, Water Gun
		pokemonDisponiveis.add(new Pokemon(55, "Golduck", "Água", 33, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Scratch, Tail Whip, Water Gun

		pokemonDisponiveis.add(new Pokemon(56, "Mankey", "Lutador", 5, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Low Kick, Karate Chop, Fury Swipes
		pokemonDisponiveis.add(new Pokemon(57, "Primeape", "Lutador", 28, new Ataque[]{ataques.get(0), ataques.get(1), ataques.get(34), ataques.get(33)})); // Tackle, Low Kick, Karate Chop, Fury Swipes
		Collections.shuffle(pokemonDisponiveis);
	}
}
