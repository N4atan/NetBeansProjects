/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Pokemon.Storage.System;

/**
 *
 * @author NATANGABRIELWILDNERD
 */
public class Ataque {

	public String nome;
	public String tipo;
	public int poder;
	public int precisao;

	// Construtor
	public Ataque(String nome, String tipo, int poder, int precisao) {
		this.nome = nome;
		this.tipo = tipo;
		this.poder = poder;
		this.precisao = precisao;
	}
}
