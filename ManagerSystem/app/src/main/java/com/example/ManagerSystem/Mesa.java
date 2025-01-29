/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ManagerSystem;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Mesa {
	public int numeroDaMesa;
	public double valorTotal = 00.00;
	public ArrayList<Produto> itensConsumidos = new ArrayList<>();
	
	public Mesa(int numeroDaMesa){
		this.numeroDaMesa = numeroDaMesa;
	}
	
	public void addConsumo(Produto produto){
		this.itensConsumidos.add(produto);
		this.valorTotal+= produto.valor;
		// Arredonda valorTotal para 2 casas decimais
		this.valorTotal = Math.round(this.valorTotal * 100.0) / 100.0;
	}
	
	public void removerProduto(int index) {
		if (index >= 0 && index < itensConsumidos.size()) {
			Produto produtoRemovido = itensConsumidos.get(index); // Obtém o produto a ser removido
			valorTotal -= produtoRemovido.valor; // Subtrai o valor do produto do total
			
			// Verifica se o valor total não ficou negativo
			if (this.valorTotal < 0) {
				this.valorTotal = 0;
			}
			
			itensConsumidos.remove(index); // Remove o produto da lista
		}
	}
}
