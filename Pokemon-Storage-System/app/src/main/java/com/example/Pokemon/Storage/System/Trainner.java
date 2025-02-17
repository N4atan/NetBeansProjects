/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Pokemon.Storage.System;

import java.util.ArrayList;


public class Trainner {
	//Atributo
	private String name;
	public ArrayList<Pokemon> partyPokemon;
	
	//Construtor
	public Trainner(String name){
		this.name = name;
		partyPokemon = new ArrayList<>();
	}
	
	//Adiciona membro na equipe, caso tenha menos de 6 na equipe.
	public boolean addPokemonInParty(Pokemon pokemon) {
		if(partyPokemon.size() < 6){
			partyPokemon.add(pokemon);
			return true;
		} else {
			return false;
		}
	}
	
	public int getSizePartPokemon(){
		return partyPokemon.size();
	}
}
