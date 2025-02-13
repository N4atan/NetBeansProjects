package com.example.Pokemon.Storage.System;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				Trainner user = new Trainner("UserDefault");
				new BoxJForm(new Pokedex(), user).setVisible(true);
			}
		});
	}
}
