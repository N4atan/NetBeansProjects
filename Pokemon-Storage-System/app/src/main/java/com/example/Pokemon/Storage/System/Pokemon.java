/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Pokemon.Storage.System;

public class Pokemon {

	//Atributos
	private int numberPokedex;
	private String name;
	private String type;
	private int nivel;

	//Constructor
	public Pokemon(int numberPokedex, String name, String type, int nivel) {
		this.numberPokedex = numberPokedex;
		this.name = name;
		this.type = type;
		this.nivel = nivel;
	}

	public int getNumberPokedex() {
		return this.numberPokedex;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.type;
	}

	public int getNivel() {
		return this.nivel;
	}

	@Override
	public String toString() {
		return String.format("Nº: %d | Nome: %s | Tipo: %s | Nível: %d", numberPokedex, name, type, nivel);
	}
}
