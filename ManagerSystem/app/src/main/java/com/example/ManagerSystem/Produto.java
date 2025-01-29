/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ManagerSystem;

/**
 *
 * @author gabri
 */
public class Produto {
	public String nome;
	public String categoria;
	public double valor;
	
	public Produto(String nome, String categoria, double valor){
		this.nome = nome;
		this.categoria = categoria;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return nome + " - R$ " + String.format("%.2f", valor);
	}
}
