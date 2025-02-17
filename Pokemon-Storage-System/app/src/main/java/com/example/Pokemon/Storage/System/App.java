package com.example.Pokemon.Storage.System;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				Trainner user = new Trainner("UserDefault");
				new BoxJForm(new Pokedex(), user).setVisible(true);
				JOptionPane.showMessageDialog(null, "Controles: \nTab: Alterar o foco entre elementos; \nEspaço: Adicionar pokémon a equipe; \nEsc: Sair da tela summary para a box; \nDel: Remover pokémon da equipe. \nEm Ambas as Listas, pode-ser usado as setas para navegar entre os elementos!", "Controles", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
}
