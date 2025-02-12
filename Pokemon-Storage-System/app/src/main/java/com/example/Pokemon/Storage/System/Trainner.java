/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Pokemon.Storage.System;

import java.util.ArrayList;


public class Trainner {
	//Atributo
	private String name;
	private ArrayList<Pokemon> partyPokemon;
	
	//Construtor
	public Trainner(String name){
		this.name = name;
		partyPokemon = new ArrayList<>();
	}
	
	//Adiciona membro na equipe, caso tenha menos de 6 na equipe.
	public String addPokemonInParty(Pokemon pokemon) {
		if(partyPokemon.size() < 6){
			partyPokemon.add(pokemon);
			System.out.println(pokemon);
			return "";
		} else {
			return "Nao ha espaco disponivel!";
		}
	}
	
	public int getSizePartPokemon(){
		return partyPokemon.size();
	}
}
