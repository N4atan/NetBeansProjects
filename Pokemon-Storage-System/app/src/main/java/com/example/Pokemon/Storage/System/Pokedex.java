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
public class Pokedex {

	public ArrayList<Pokemon> pokemonDisponiveis = new ArrayList<>();

	public Pokedex() {
		// Adicionando os 151 Pokémon da primeira geração
		pokemonDisponiveis.add(new Pokemon(1, "Bulbasaur", "Grama/Veneno", 5));
		pokemonDisponiveis.add(new Pokemon(2, "Ivysaur", "Grama/Veneno", 16));
		pokemonDisponiveis.add(new Pokemon(3, "Venusaur", "Grama/Veneno", 32));
		pokemonDisponiveis.add(new Pokemon(4, "Charmander", "Fogo", 5));
		pokemonDisponiveis.add(new Pokemon(5, "Charmeleon", "Fogo", 16));
		pokemonDisponiveis.add(new Pokemon(6, "Charizard", "Fogo/Voador", 36));
		pokemonDisponiveis.add(new Pokemon(7, "Squirtle", "Água", 5));
		pokemonDisponiveis.add(new Pokemon(8, "Wartortle", "Água", 16));
		pokemonDisponiveis.add(new Pokemon(9, "Blastoise", "Água", 36));
		pokemonDisponiveis.add(new Pokemon(10, "Caterpie", "Inseto", 3));
		pokemonDisponiveis.add(new Pokemon(11, "Metapod", "Inseto", 7));
		pokemonDisponiveis.add(new Pokemon(12, "Butterfree", "Inseto/Voador", 10));
		pokemonDisponiveis.add(new Pokemon(13, "Weedle", "Inseto/Veneno", 3));
		pokemonDisponiveis.add(new Pokemon(14, "Kakuna", "Inseto/Veneno", 7));
		pokemonDisponiveis.add(new Pokemon(15, "Beedrill", "Inseto/Veneno", 10));
		pokemonDisponiveis.add(new Pokemon(16, "Pidgey", "Normal/Voador", 3));
		pokemonDisponiveis.add(new Pokemon(17, "Pidgeotto", "Normal/Voador", 18));
		pokemonDisponiveis.add(new Pokemon(18, "Pidgeot", "Normal/Voador", 36));
		pokemonDisponiveis.add(new Pokemon(19, "Rattata", "Normal", 3));
		pokemonDisponiveis.add(new Pokemon(20, "Raticate", "Normal", 20));
		pokemonDisponiveis.add(new Pokemon(21, "Spearow", "Normal/Voador", 4));
		pokemonDisponiveis.add(new Pokemon(22, "Fearow", "Normal/Voador", 20));
		pokemonDisponiveis.add(new Pokemon(23, "Ekans", "Veneno", 5));
		pokemonDisponiveis.add(new Pokemon(24, "Arbok", "Veneno", 22));
		pokemonDisponiveis.add(new Pokemon(25, "Pikachu", "Elétrico", 8));
		pokemonDisponiveis.add(new Pokemon(26, "Raichu", "Elétrico", 30));
		pokemonDisponiveis.add(new Pokemon(27, "Sandshrew", "Terra", 5));
		pokemonDisponiveis.add(new Pokemon(28, "Sandslash", "Terra", 22));
		pokemonDisponiveis.add(new Pokemon(29, "Nidoran♀", "Veneno", 5));
		pokemonDisponiveis.add(new Pokemon(30, "Nidorina", "Veneno", 16));
		pokemonDisponiveis.add(new Pokemon(31, "Nidoqueen", "Veneno/Terra", 36));
		pokemonDisponiveis.add(new Pokemon(32, "Nidoran♂", "Veneno", 5));
		pokemonDisponiveis.add(new Pokemon(33, "Nidorino", "Veneno", 16));
		pokemonDisponiveis.add(new Pokemon(34, "Nidoking", "Veneno/Terra", 36));
		pokemonDisponiveis.add(new Pokemon(35, "Clefairy", "Normal", 10));
		pokemonDisponiveis.add(new Pokemon(36, "Clefable", "Normal", 30));
		pokemonDisponiveis.add(new Pokemon(37, "Vulpix", "Fogo", 5));
		pokemonDisponiveis.add(new Pokemon(38, "Ninetales", "Fogo", 30));
		pokemonDisponiveis.add(new Pokemon(39, "Jigglypuff", "Normal", 7));
		pokemonDisponiveis.add(new Pokemon(40, "Wigglytuff", "Normal", 30));
		pokemonDisponiveis.add(new Pokemon(41, "Zubat", "Veneno/Voador", 5));
		pokemonDisponiveis.add(new Pokemon(42, "Golbat", "Veneno/Voador", 22));
		pokemonDisponiveis.add(new Pokemon(43, "Oddish", "Grama/Veneno", 5));
		pokemonDisponiveis.add(new Pokemon(44, "Gloom", "Grama/Veneno", 21));
		pokemonDisponiveis.add(new Pokemon(45, "Vileplume", "Grama/Veneno", 36));
		pokemonDisponiveis.add(new Pokemon(46, "Paras", "Inseto/Grama", 5));
		pokemonDisponiveis.add(new Pokemon(47, "Parasect", "Inseto/Grama", 24));
		pokemonDisponiveis.add(new Pokemon(48, "Venonat", "Inseto/Veneno", 5));
		pokemonDisponiveis.add(new Pokemon(49, "Venomoth", "Inseto/Veneno", 22));
		pokemonDisponiveis.add(new Pokemon(50, "Diglett", "Terra", 5));
		pokemonDisponiveis.add(new Pokemon(51, "Dugtrio", "Terra", 26));
		pokemonDisponiveis.add(new Pokemon(52, "Meowth", "Normal", 5));
		pokemonDisponiveis.add(new Pokemon(53, "Persian", "Normal", 28));
		pokemonDisponiveis.add(new Pokemon(54, "Psyduck", "Água", 5));
		pokemonDisponiveis.add(new Pokemon(55, "Golduck", "Água", 33));
		pokemonDisponiveis.add(new Pokemon(56, "Mankey", "Lutador", 5));
		pokemonDisponiveis.add(new Pokemon(57, "Primeape", "Lutador", 28));
		pokemonDisponiveis.add(new Pokemon(58, "Growlithe", "Fogo", 10));
		pokemonDisponiveis.add(new Pokemon(59, "Arcanine", "Fogo", 40));
		pokemonDisponiveis.add(new Pokemon(60, "Poliwag", "Água", 5));
		pokemonDisponiveis.add(new Pokemon(61, "Poliwhirl", "Água", 25));
		pokemonDisponiveis.add(new Pokemon(62, "Poliwrath", "Água/Lutador", 40));
		pokemonDisponiveis.add(new Pokemon(63, "Abra", "Psíquico", 5));
		pokemonDisponiveis.add(new Pokemon(64, "Kadabra", "Psíquico", 16));
		pokemonDisponiveis.add(new Pokemon(65, "Alakazam", "Psíquico", 36));
		pokemonDisponiveis.add(new Pokemon(66, "Machop", "Lutador", 5));
		pokemonDisponiveis.add(new Pokemon(67, "Machoke", "Lutador", 28));
		pokemonDisponiveis.add(new Pokemon(68, "Machamp", "Lutador", 40));
		pokemonDisponiveis.add(new Pokemon(69, "Bellsprout", "Grama/Veneno", 5));
		pokemonDisponiveis.add(new Pokemon(70, "Weepinbell", "Grama/Veneno", 21));
		pokemonDisponiveis.add(new Pokemon(71, "Victreebel", "Grama/Veneno", 36));
		pokemonDisponiveis.add(new Pokemon(72, "Tentacool", "Água/Veneno", 5));
		pokemonDisponiveis.add(new Pokemon(73, "Tentacruel", "Água/Veneno", 30));
		pokemonDisponiveis.add(new Pokemon(74, "Geodude", "Pedra/Terra", 6));
		pokemonDisponiveis.add(new Pokemon(75, "Graveler", "Pedra/Terra", 25));
		pokemonDisponiveis.add(new Pokemon(76, "Golem", "Pedra/Terra", 40));
		pokemonDisponiveis.add(new Pokemon(77, "Ponyta", "Fogo", 5));
		pokemonDisponiveis.add(new Pokemon(78, "Rapidash", "Fogo", 40));
		pokemonDisponiveis.add(new Pokemon(79, "Slowpoke", "Água/Psíquico", 5));
		pokemonDisponiveis.add(new Pokemon(80, "Slowbro", "Água/Psíquico", 37));
		pokemonDisponiveis.add(new Pokemon(81, "Magnemite", "Elétrico", 5));
		pokemonDisponiveis.add(new Pokemon(82, "Magneton", "Elétrico", 30));
		pokemonDisponiveis.add(new Pokemon(83, "Farfetch'd", "Normal/Voador", 5));
		pokemonDisponiveis.add(new Pokemon(84, "Doduo", "Normal/Voador", 5));
		pokemonDisponiveis.add(new Pokemon(85, "Dodrio", "Normal/Voador", 31));
		pokemonDisponiveis.add(new Pokemon(86, "Seel", "Água", 5));
		pokemonDisponiveis.add(new Pokemon(87, "Dewgong", "Água/Gelo", 34));
		pokemonDisponiveis.add(new Pokemon(88, "Grimer", "Veneno", 5));
		pokemonDisponiveis.add(new Pokemon(89, "Muk", "Veneno", 38));
		pokemonDisponiveis.add(new Pokemon(90, "Shellder", "Água", 5));
		pokemonDisponiveis.add(new Pokemon(91, "Cloyster", "Água/Gelo", 40));
		pokemonDisponiveis.add(new Pokemon(92, "Gastly", "Fantasma/Veneno", 9));
		pokemonDisponiveis.add(new Pokemon(93, "Haunter", "Fantasma/Veneno", 25));
		pokemonDisponiveis.add(new Pokemon(94, "Gengar", "Fantasma/Veneno", 40));
		pokemonDisponiveis.add(new Pokemon(95, "Onix", "Pedra/Terra", 15));
		pokemonDisponiveis.add(new Pokemon(96, "Drowzee", "Psíquico", 10));
		pokemonDisponiveis.add(new Pokemon(97, "Hypno", "Psíquico", 30));
		pokemonDisponiveis.add(new Pokemon(98, "Krabby", "Água", 5));
		pokemonDisponiveis.add(new Pokemon(99, "Kingler", "Água", 28));
		pokemonDisponiveis.add(new Pokemon(100, "Voltorb", "Elétrico", 5));
		pokemonDisponiveis.add(new Pokemon(101, "Electrode", "Elétrico", 30));
		pokemonDisponiveis.add(new Pokemon(102, "Exeggcute", "Grama/Psíquico", 5));
		pokemonDisponiveis.add(new Pokemon(103, "Exeggutor", "Grama/Psíquico", 40));
		pokemonDisponiveis.add(new Pokemon(104, "Cubone", "Terra", 5));
		pokemonDisponiveis.add(new Pokemon(105, "Marowak", "Terra", 28));
		pokemonDisponiveis.add(new Pokemon(106, "Hitmonlee", "Lutador", 20));
		pokemonDisponiveis.add(new Pokemon(107, "Hitmonchan", "Lutador", 20));
		pokemonDisponiveis.add(new Pokemon(108, "Lickitung", "Normal", 5));
		pokemonDisponiveis.add(new Pokemon(109, "Koffing", "Veneno", 5));
		pokemonDisponiveis.add(new Pokemon(110, "Weezing", "Veneno", 35));
		pokemonDisponiveis.add(new Pokemon(111, "Rhyhorn", "Pedra/Terra", 5));
		pokemonDisponiveis.add(new Pokemon(112, "Rhydon", "Pedra/Terra", 42));
		pokemonDisponiveis.add(new Pokemon(113, "Chansey", "Normal", 5));
		pokemonDisponiveis.add(new Pokemon(114, "Tangela", "Grama", 5));
		pokemonDisponiveis.add(new Pokemon(115, "Kangaskhan", "Normal", 5));
		pokemonDisponiveis.add(new Pokemon(116, "Horsea", "Água", 5));
		pokemonDisponiveis.add(new Pokemon(117, "Seadra", "Água", 32));
		pokemonDisponiveis.add(new Pokemon(118, "Goldeen", "Água", 5));
		pokemonDisponiveis.add(new Pokemon(119, "Seaking", "Água", 33));
		pokemonDisponiveis.add(new Pokemon(120, "Staryu", "Água", 5));
		pokemonDisponiveis.add(new Pokemon(121, "Starmie", "Água/Psíquico", 30));
		pokemonDisponiveis.add(new Pokemon(122, "Mr. Mime", "Psíquico", 5));
		pokemonDisponiveis.add(new Pokemon(123, "Scyther", "Inseto/Voador", 5));
		pokemonDisponiveis.add(new Pokemon(124, "Jynx", "Gelo/Psíquico", 5));
		pokemonDisponiveis.add(new Pokemon(125, "Electabuzz", "Elétrico", 5));
		pokemonDisponiveis.add(new Pokemon(126, "Magmar", "Fogo", 5));
		pokemonDisponiveis.add(new Pokemon(127, "Pinsir", "Inseto", 5));
		pokemonDisponiveis.add(new Pokemon(128, "Tauros", "Normal", 5));
		pokemonDisponiveis.add(new Pokemon(129, "Magikarp", "Água", 3));
		pokemonDisponiveis.add(new Pokemon(130, "Gyarados", "Água/Voador", 20));
		pokemonDisponiveis.add(new Pokemon(131, "Lapras", "Água/Gelo", 5));
		pokemonDisponiveis.add(new Pokemon(132, "Ditto", "Normal", 5));
		pokemonDisponiveis.add(new Pokemon(133, "Eevee", "Normal", 5));
		pokemonDisponiveis.add(new Pokemon(134, "Vaporeon", "Água", 5));
		pokemonDisponiveis.add(new Pokemon(135, "Jolteon", "Elétrico", 5));
		pokemonDisponiveis.add(new Pokemon(136, "Flareon", "Fogo", 5));
		pokemonDisponiveis.add(new Pokemon(137, "Porygon", "Normal", 5));
		pokemonDisponiveis.add(new Pokemon(138, "Omanyte", "Pedra/Água", 5));
		pokemonDisponiveis.add(new Pokemon(139, "Omastar", "Pedra/Água", 40));
		pokemonDisponiveis.add(new Pokemon(140, "Kabuto", "Pedra/Água", 5));
		pokemonDisponiveis.add(new Pokemon(141, "Kabutops", "Pedra/Água", 40));
		pokemonDisponiveis.add(new Pokemon(142, "Aerodactyl", "Pedra/Voador", 5));
		pokemonDisponiveis.add(new Pokemon(143, "Snorlax", "Normal", 20));
		pokemonDisponiveis.add(new Pokemon(144, "Articuno", "Gelo/Voador", 50));
		pokemonDisponiveis.add(new Pokemon(145, "Zapdos", "Elétrico/Voador", 50));
		pokemonDisponiveis.add(new Pokemon(146, "Moltres", "Fogo/Voador", 50));
		pokemonDisponiveis.add(new Pokemon(147, "Dratini", "Dragão", 5));
		pokemonDisponiveis.add(new Pokemon(148, "Dragonair", "Dragão", 30));
		pokemonDisponiveis.add(new Pokemon(149, "Dragonite", "Dragão/Voador", 55));
		pokemonDisponiveis.add(new Pokemon(150, "Mewtwo", "Psíquico", 70));
		pokemonDisponiveis.add(new Pokemon(151, "Mew", "Psíquico", 50));
		
		Collections.shuffle(pokemonDisponiveis); 
	}

	public void listarPokemons() {
		for (Pokemon p : pokemonDisponiveis) {
			System.out.println(p);
		}
	}
}
